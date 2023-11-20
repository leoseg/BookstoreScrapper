package com.scrapper.main.priceScrapping;


import com.scrapper.main.dataTypes.Book;
import com.scrapper.main.dataTypes.BookStoreItem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {Thalia.class, StringHelper.class})
public class ThaliaTest {

    @MockBean
    private SeleniumContentFetcher contentFetcher;


    @Autowired
    private Thalia thalia;


    @Test
    public void testGetStoreSearchUrl() {
        // Test the getStoreSearchUrl method
        Book book = new Book("testtitle", "author, test");
        String expected = "https://www.thalia.de/suche?sq=testtitle+test+author";
        String result = thalia.getStoreSearchUrl(book);
        assertEquals(expected, result);
    }

    @Test
    public void testGetStoreBookUrl() {
        String storeSearchContent = TestHTML.thaliaStoreSearchResult;
        String title = "Die Haushälterin";
        String author = "Fielding, Joy";
        String expectedUrl = "https://www.thalia.de/shop/home/artikeldetails/A1063536722";

        String url = thalia.getStoreBookUrl(storeSearchContent, title, author);
        assertEquals(expectedUrl, url);
    }

    @Test
    public void testGetStoreBookUrl_NotFound() {
        String storeSearchContent = TestHTML.notFound;
        String title = "Nonexistent Book";
        String author = "Unknown Author";
        String expectedUrl = "";

        String url = thalia.getStoreBookUrl(storeSearchContent, title, author);
        assertEquals(expectedUrl, url);
    }

        @Test
    public void testGetStoreBookData() {
        String searchResponseData = TestHTML.thaliaBookPage;
        String url = "https://www.thalia.de/shop/home/artikeldetails/A1063536722";

        BookStoreItem expectedBookData = new BookStoreItem("22,00 €", "10,99 €", "13,00 €", "A1063536722", url, "Thalia", null);

        BookStoreItem bookData = thalia.getStoreBookData(searchResponseData, url);
        assertEquals(expectedBookData, bookData);
    }

      @Test
    public void testGetStoreBookUrl_SuessBookFound() {
        String suessPageContent = TestHTML.suessPage;
        String title = "Süss : Süss: eine feministische Kritik";
        String author = "Tlusty, Ann-Kristin";
        String expectedUrl = "https://www.thalia.de/shop/home/artikeldetails/A1060434456";


        String url = thalia.getStoreBookUrl(suessPageContent, title, author);
        assertEquals(expectedUrl, url);
    }

    @Test
    public void testGetStoreBookUrl_GrmBookFound() {
        String grmPageContent = TestHTML.grmPage;
        String title = "GRM: Brainfuck";
        String author = "Berg, Sibylle";
        String expectedUrl = "https://www.thalia.de/shop/home/artikeldetails/A1065393050";


        String url = thalia.getStoreBookUrl(grmPageContent, title, author);
        assertEquals(expectedUrl, url);
    }
}
