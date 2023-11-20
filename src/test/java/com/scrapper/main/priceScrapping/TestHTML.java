package com.scrapper.main.priceScrapping;

public class TestHTML {


    public static final String grmPage = """
                            <ul class="tm-produktliste">
                        <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="1">
                            <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1054208961" caption="suchergebnis-klick">
                                Zur Artikeldetailseite von Ein paar Leute suchen das Glück und lachen sich tot des Autors Sibylle Berg
                                    <dl-product product-id="A1054208961" product-price="10.00" product-avail="Sofort lieferbar" name="Ein paar Leute suchen das Glück und lachen sich tot" price="10.00" currency="EUR" category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Nach Ländern &amp; Kontinenten" merkur-event="suchergebnisartikelclicked" aktuelle-seite="1" product-position="1">
                                    </dl-product>
                            </a>
               \s
                            <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                    <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/c0129455b2f74ef6b8d13def45de289b/ein-paar-leute-suchen-das-glueck-und-lachen-sich-tot-taschenbuch-sibylle-berg.jpeg" width="200" height="317" alt="Bild vom Artikel Ein paar Leute suchen das Glück und lachen sich tot vom Autor Sibylle Berg" loading="lazy">
                            </picture>
               \s
                            <div class="tm-artikeldetails">
                                <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                            Sibylle Berg
                                </p>
                                <strong class="element-text-standard-black tm-artikeldetails__titel">Ein paar Leute suchen das Glück und lachen sich tot</strong>
               \s
                                <div class="tm-badges">
                                </div>
               \s
                                <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                    <span>Buch (Taschenbuch)</span>
                                        <span>+ weitere</span>
                                </p>
               \s
                                <div class="tm-preis-wrapper">
                                            <p class="element-text-large-black tm-preis-wrapper__preis">            10,00 €
            </p>
                                </div>
               \s
                                <div class="tm-versandart">
                                    <p class="element-text-small tm-versandart__lieferung">
                                            <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort lieferbar</span>
                                            Lieferung
                                    </p>
               \s
                                                    <button class="element-link-small tm-versandart__abholung" interaction="buchhandlung-overlay-oeffnen" data-matnr="A1054208961" clicklisteneradded="">
                                                        <span class="element-icon-ampel tm-versandart__ampel" data-status="">Bitte wählen Sie Ihre Buchhandlung</span>
                                                        Click &amp; Collect
                                                    </button>
                                </div>
               \s
                                            <div class="tm-bewertungsstatistik">
                                                <span class="element-rating-standard" rating="3,5" data-test="rating"></span>
                                                <span class="element-text-standard tm-bewertungsstatistik__bewertungssanzahl">(2)
                                                </span>
                                            </div>
                            </div>
               \s
                            <div class="tm-merken-herz-container">
                                    <artikel-merken-herz data-artikelnummer="A1054208961" data-type="list" data-pid="A1054208961" data-name="Ein paar Leute suchen das Glück und lachen sich tot" data-value="10.00" data-currency="EUR" data-category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Nach Ländern &amp; Kontinenten" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                            </div>
                        </li>
                        <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="2">
                            <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1052817730" caption="suchergebnis-klick">
                                Zur Artikeldetailseite von GRM des Autors Sibylle Berg
                                    <dl-product product-id="A1052817730" product-price="25.00" product-avail="Sofort lieferbar" name="GRM" price="25.00" currency="EUR" category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Nach Ländern &amp; Kontinenten/Europa/Großbritannien" merkur-event="suchergebnisartikelclicked" aktuelle-seite="1" product-position="2">
                                    </dl-product>
                            </a>
               \s
                            <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                    <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/b26c1a5a51684020b509c0059addee7a/grm-gebundene-ausgabe-sibylle-berg.jpeg" width="200" height="327" alt="Bild vom Artikel GRM vom Autor Sibylle Berg" loading="lazy">
                            </picture>
               \s
                            <div class="tm-artikeldetails">
                                <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                            Sibylle Berg
                                </p>
                                <strong class="element-text-standard-black tm-artikeldetails__titel">GRM</strong>
               \s
                                <div class="tm-badges">
                                </div>
               \s
                                <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                    <span>Buch (Gebundene Ausgabe)</span>
                                        <span>+ weitere</span>
                                </p>
               \s
                                <div class="tm-preis-wrapper">
                                            <p class="element-text-large-black tm-preis-wrapper__preis">            25,00 €
            </p>
                                </div>
               \s
                                <div class="tm-versandart">
                                    <p class="element-text-small tm-versandart__lieferung">
                                            <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort lieferbar</span>
                                            Lieferung
                                    </p>
               \s
                                                    <button class="element-link-small tm-versandart__abholung" interaction="buchhandlung-overlay-oeffnen" data-matnr="A1052817730" clicklisteneradded="">
                                                        <span class="element-icon-ampel tm-versandart__ampel" data-status="">Bitte wählen Sie Ihre Buchhandlung</span>
                                                        Click &amp; Collect
                                                    </button>
                                </div>
               \s
                                            <div class="tm-bewertungsstatistik">
                                                <span class="element-rating-standard" rating="4,5" data-test="rating"></span>
                                                <span class="element-text-standard tm-bewertungsstatistik__bewertungssanzahl">(25)
                                                </span>
                                            </div>
                            </div>
               \s
                            <div class="tm-merken-herz-container">
                                    <artikel-merken-herz data-artikelnummer="A1052817730" data-type="list" data-pid="A1052817730" data-name="GRM" data-value="25.00" data-currency="EUR" data-category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Nach Ländern &amp; Kontinenten/Europa/Großbritannien" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                            </div>
                        </li>
                        <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="3">
                            <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1061903661" caption="suchergebnis-klick">
                                Zur Artikeldetailseite von RCE des Autors Sibylle Berg
                                    <dl-product product-id="A1061903661" product-price="26.00" product-avail="Sofort lieferbar" name="RCE" price="26.00" currency="EUR" category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Romane &amp; Erzählungen" merkur-event="suchergebnisartikelclicked" aktuelle-seite="1" product-position="3">
                                    </dl-product>
                            </a>
               \s
                            <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                    <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/010f7bdfa95f481b909358ee78929da2/rce-gebundene-ausgabe-sibylle-berg.jpeg" width="200" height="325" alt="Bild vom Artikel RCE vom Autor Sibylle Berg" loading="lazy">
                            </picture>
               \s
                            <div class="tm-artikeldetails">
                                <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                            Sibylle Berg
                                </p>
                                <strong class="element-text-standard-black tm-artikeldetails__titel">RCE</strong>
               \s
                                <div class="tm-badges">
                                </div>
               \s
                                <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                    <span>Buch (Gebundene Ausgabe)</span>
                                        <span>+ weitere</span>
                                </p>
               \s
                                <div class="tm-preis-wrapper">
                                            <p class="element-text-large-black tm-preis-wrapper__preis">            26,00 €
            </p>
                                </div>
               \s
                                <div class="tm-versandart">
                                    <p class="element-text-small tm-versandart__lieferung">
                                            <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort lieferbar</span>
                                            Lieferung
                                    </p>
               \s
                                                    <button class="element-link-small tm-versandart__abholung" interaction="buchhandlung-overlay-oeffnen" data-matnr="A1061903661" clicklisteneradded="">
                                                        <span class="element-icon-ampel tm-versandart__ampel" data-status="">Bitte wählen Sie Ihre Buchhandlung</span>
                                                        Click &amp; Collect
                                                    </button>
                                </div>
               \s
                                            <div class="tm-bewertungsstatistik">
                                                <span class="element-rating-standard" rating="4" data-test="rating"></span>
                                                <span class="element-text-standard tm-bewertungsstatistik__bewertungssanzahl">(9)
                                                </span>
                                            </div>
                            </div>
               \s
                            <div class="tm-merken-herz-container">
                                    <artikel-merken-herz data-artikelnummer="A1061903661" data-type="list" data-pid="A1061903661" data-name="RCE" data-value="26.00" data-currency="EUR" data-category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Romane &amp; Erzählungen" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                            </div>
                        </li>
                        <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="4">
                            <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1056975502" caption="suchergebnis-klick">
                                Zur Artikeldetailseite von Sex 2 des Autors Sibylle Berg
                                    <dl-product product-id="A1056975502" product-price="10.00" product-avail="Sofort lieferbar" name="Sex 2" price="10.00" currency="EUR" category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Witz &amp; Unterhaltung" merkur-event="suchergebnisartikelclicked" aktuelle-seite="1" product-position="4">
                                    </dl-product>
                            </a>
               \s
                            <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                    <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/d7b6139cd26a4855b083740ae036e485/sex-2-taschenbuch-sibylle-berg.jpeg" width="200" height="317" alt="Bild vom Artikel Sex 2 vom Autor Sibylle Berg" loading="lazy">
                            </picture>
               \s
                            <div class="tm-artikeldetails">
                                <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                            Sibylle Berg
                                </p>
                                <strong class="element-text-standard-black tm-artikeldetails__titel">Sex 2</strong>
               \s
                                <div class="tm-badges">
                                </div>
               \s
                                <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                    <span>Buch (Taschenbuch)</span>
                                        <span>+ weitere</span>
                                </p>
               \s
                                <div class="tm-preis-wrapper">
                                            <p class="element-text-large-black tm-preis-wrapper__preis">            10,00 €
            </p>
                                </div>
               \s
                                <div class="tm-versandart">
                                    <p class="element-text-small tm-versandart__lieferung">
                                            <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort lieferbar</span>
                                            Lieferung
                                    </p>
               \s
                                                    <button class="element-link-small tm-versandart__abholung" interaction="buchhandlung-overlay-oeffnen" data-matnr="A1056975502" clicklisteneradded="">
                                                        <span class="element-icon-ampel tm-versandart__ampel" data-status="">Bitte wählen Sie Ihre Buchhandlung</span>
                                                        Click &amp; Collect
                                                    </button>
                                </div>
               \s
                            </div>
               \s
                            <div class="tm-merken-herz-container">
                                    <artikel-merken-herz data-artikelnummer="A1056975502" data-type="list" data-pid="A1056975502" data-name="Sex 2" data-value="10.00" data-currency="EUR" data-category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Witz &amp; Unterhaltung" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                            </div>
                        </li>
                        <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="5">
                            <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1065393050" caption="suchergebnis-klick">
                                Zur Artikeldetailseite von GRM brainfuck des Autors Sibylle Berg
                                    <dl-product product-id="A1065393050" product-price="28.99" product-avail="Lieferbar innerhalb von 3 Wochen" name="GRM brainfuck" price="28.99" currency="EUR" category="Buch (ling)/Bücher/Fremdsprachige Bücher/Spanische Bücher/Belletristik" merkur-event="suchergebnisartikelclicked" aktuelle-seite="1" product-position="5">
                                    </dl-product>
                            </a>
               \s
                            <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                    <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/8ba52cc6c7f143f9b81d1c0028816a7e/grm-brainfuck-taschenbuch-sibylle-berg-spanisch.jpeg" width="200" height="294" alt="Bild vom Artikel GRM brainfuck vom Autor Sibylle Berg" loading="lazy">
                            </picture>
               \s
                            <div class="tm-artikeldetails">
                                <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                            Sibylle Berg
                                </p>
                                <strong class="element-text-standard-black tm-artikeldetails__titel">GRM brainfuck</strong>
               \s
                                <div class="tm-badges">
                                </div>
               \s
                                <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                    <span>Buch (Taschenbuch)</span>
                                </p>
               \s
                                <div class="tm-preis-wrapper">
                                            <p class="element-text-large-black tm-preis-wrapper__preis">            28,99 €
            </p>
                                </div>
               \s
                                <div class="tm-versandart">
                                    <p class="element-text-small tm-versandart__lieferung">
                                            <span class="element-icon-ampel tm-versandart__ampel" data-status="gelb">Lieferbar innerhalb von 3 Wochen</span>
                                            Lieferung
                                    </p>
               \s
                                                    <button class="element-link-small tm-versandart__abholung" interaction="buchhandlung-overlay-oeffnen" data-matnr="A1065393050" clicklisteneradded="">
                                                        <span class="element-icon-ampel tm-versandart__ampel" data-status="">Bitte wählen Sie Ihre Buchhandlung</span>
                                                        Click &amp; Collect
                                                    </button>
                                </div>
               \s
                            </div>
               \s
                            <div class="tm-merken-herz-container">
                                    <artikel-merken-herz data-artikelnummer="A1065393050" data-type="list" data-pid="A1065393050" data-name="GRM brainfuck" data-value="28.99" data-currency="EUR" data-category="Buch (ling)/Bücher/Fremdsprachige Bücher/Spanische Bücher/Belletristik" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                            </div>
                        </li>
                        <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="6">
                            <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1062287815" caption="suchergebnis-klick">
                                Zur Artikeldetailseite von Marc-Uwe Klings "QualityLand" und Sybille Bergs "GRM-Brainfuck". Vergleich auf Sprache, Figuren und Handlung des Autors Insa Köller
                                    <dl-product product-id="A1062287815" product-price="15.99" product-avail="Sofort per Download lieferbar" name="Marc-Uwe Klings &quot;QualityLand&quot; und Sybille Bergs &quot;GRM-Brainfuck&quot;. Vergleich auf Sprache, Figuren und Handlung" price="15.99" currency="EUR" category="Ebooks/eBooks" merkur-event="suchergebnisartikelclicked" aktuelle-seite="1" product-position="6">
                                    </dl-product>
                            </a>
               \s
                            <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                    <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/ff265cd0379d45869917af0a274fc4ff/marc-uwe-klings-qualityland-und-sybille-bergs-grm-brainfuck-vergleich-auf-sprache-figuren-und-handlung-pdf-insa-koeller.jpeg" width="200" height="283" alt="Bild vom Artikel Marc-Uwe Klings &quot;QualityLand&quot; und Sybille Bergs &quot;GRM-Brainfuck&quot;. Vergleich auf Sprache, Figuren und Handlung vom Autor Insa Köller" loading="lazy">
                            </picture>
               \s
                            <div class="tm-artikeldetails">
                                <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                            Insa Köller
                                </p>
                                <strong class="element-text-standard-black tm-artikeldetails__titel">Marc-Uwe Klings "QualityLand" und Sybille Bergs "GRM-Brainfuck". Vergleich auf Sprache, Figuren und Handlung</strong>
               \s
                                <div class="tm-badges">
                                </div>
               \s
                                <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                    <span>eBook (PDF)</span>
                                        <span>+ weitere</span>
                                </p>
               \s
                                <div class="tm-preis-wrapper">
                                            <p class="element-text-large-black tm-preis-wrapper__preis">            15,99 €
            </p>
                                </div>
               \s
                                <div class="tm-versandart">
                                    <p class="element-text-small tm-versandart__lieferung">
                                            <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort per Download lieferbar</span>
                                            Lieferung
                                    </p>
               \s
                                </div>
               \s
                            </div>
               \s
                            <div class="tm-merken-herz-container">
                                    <artikel-merken-herz data-artikelnummer="A1062287815" data-type="list" data-pid="A1062287815" data-name="Marc-Uwe Klings &quot;QualityLand&quot; und Sybille Bergs &quot;GRM-Brainfuck&quot;. Vergleich auf Sprache, Figuren und Handlung" data-value="15.99" data-currency="EUR" data-category="Ebooks/eBooks" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                            </div>
                        </li>
                            </ul>
            """;

    public static final String suessPage = """
            <ul class="tm-produktliste">
                            <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="1">
                                <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1060434456" caption="suchergebnis-klick">
                                    Zur Artikeldetailseite von Süß des Autors Ann-Kristin Tlusty
                                        <dl-product product-id="A1060434456" product-price="18.00" product-avail="Sofort lieferbar" name="Süß" price="18.00" currency="EUR" category="Buch (dtsch)/Bücher/Sachbücher/Politik &amp; Geschichte/Gesellschaft/Feminismus" merkur-event="suchergebnisartikelclicked" aktuelle-seite="1" product-position="1">
                                        </dl-product>
                                </a>
                   \s
                                <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                        <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/ea883c9a4d4d4ed0b15957451fcf3795/suess-gebundene-ausgabe-ann-kristin-tlusty.jpeg" width="200" height="326" alt="Bild vom Artikel Süß vom Autor Ann-Kristin Tlusty" loading="lazy">
                                </picture>
                   \s
                                <div class="tm-artikeldetails">
                                    <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                                Ann-Kristin Tlusty
                                    </p>
                                    <strong class="element-text-standard-black tm-artikeldetails__titel">Süß</strong>
                   \s
                                    <div class="tm-badges">
                                    </div>
                   \s
                                    <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                        <span>Buch (Gebundene Ausgabe)</span>
                                            <span>+ weitere</span>
                                    </p>
                   \s
                                    <div class="tm-preis-wrapper">
                                                <p class="element-text-large-black tm-preis-wrapper__preis">                18,00 €
            </p>
                                    </div>
                   \s
                                    <div class="tm-versandart">
                                        <p class="element-text-small tm-versandart__lieferung">
                                                <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort lieferbar</span>
                                                Lieferung
                                        </p>
                   \s
                                                        <buchhandlung-bestandanzeige data-matnr="A1060434456" ampel-status-set="">
                <p class="element-text-small bestandanzeige">
                    <span class="element-icon-ampel bestandanzeige__ampel" data-status="gruen"></span>
                    <span class="bestandanzeige__label">Abholung</span>
                </p>
            </buchhandlung-bestandanzeige>
                                    </div>
                   \s
                                                <div class="tm-bewertungsstatistik">
                                                    <span class="element-rating-standard" rating="5" data-test="rating"></span>
                                                    <span class="element-text-standard tm-bewertungsstatistik__bewertungssanzahl">(8)
                                                    </span>
                                                </div>
                                </div>
                   \s
                                <div class="tm-merken-herz-container">
                                        <artikel-merken-herz data-artikelnummer="A1060434456" data-type="list" data-pid="A1060434456" data-name="Süß" data-value="18.00" data-currency="EUR" data-category="Buch (dtsch)/Bücher/Sachbücher/Politik &amp; Geschichte/Gesellschaft/Feminismus" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                                </div>
                            </li>
                                </ul>""";

    public static final String thaliaStoreSearchResult = """
            <ul class="tm-produktliste">
                            <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="1">
                                <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1063536722" caption="suchergebnis-klick">
                                    Zur Artikeldetailseite von Die Haushälterin des Autors Joy Fielding
                                                <dl-product product-id="A1063536722" product-price="22.00" product-avail="Sofort lieferbar" name="Die Haushälterin" price="22.00" currency="EUR" category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Nach Ländern &amp; Kontinenten/Nordamerika" product-position="1">
                                                </dl-product>
                                </a>
                   \s
                                <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                        <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/a666a84fb45f4539a81ab0670b2f34d2/die-haushaelterin-gebundene-ausgabe-joy-fielding.jpeg" width="200" height="319" alt="Bild vom Artikel Die Haushälterin vom Autor Joy Fielding" loading="lazy">
                                </picture>
                   \s
                                <div class="tm-artikeldetails">
                                    <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                                Joy Fielding
                                    </p>
                                    <strong class="element-text-standard-black tm-artikeldetails__titel">Die Haushälterin</strong>
                   \s
                                    <div class="tm-badges">
                                    </div>
                   \s
                                    <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                        <span>Buch (Gebundene Ausgabe)</span>
                                            <span>+ weitere</span>
                                    </p>
                   \s
                                    <div class="tm-preis-wrapper">
                                                <p class="element-text-large-black tm-preis-wrapper__preis">                22,00 €
            </p>
                                    </div>
                   \s
                                    <div class="tm-versandart">
                                        <p class="element-text-small tm-versandart__lieferung">
                                                <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort lieferbar</span>
                                                Lieferung
                                        </p>
                   \s
                                                        <buchhandlung-bestandanzeige data-matnr="A1063536722" ampel-status-set="">
                <p class="element-text-small bestandanzeige">
                    <span class="element-icon-ampel bestandanzeige__ampel" data-status="gruen"></span>
                    <span class="bestandanzeige__label">Abholung</span>
                </p>
            </buchhandlung-bestandanzeige>
                                    </div>
                   \s
                                                <div class="tm-bewertungsstatistik">
                                                    <span class="element-rating-standard" rating="4" data-test="rating"></span>
                                                    <span class="element-text-standard tm-bewertungsstatistik__bewertungssanzahl">(25)
                                                    </span>
                                                </div>
                                </div>
                   \s
                                <div class="tm-merken-herz-container">
                                        <artikel-merken-herz data-artikelnummer="A1063536722" data-type="list" data-pid="A1063536722" data-name="Die Haushälterin" data-value="22.00" data-currency="EUR" data-category="Buch (dtsch)/Bücher/Romane &amp; Erzählungen/Nach Ländern &amp; Kontinenten/Nordamerika" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                                </div>
                            </li>
                            <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="2">
                                <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1068358033" caption="suchergebnis-klick">
                                    Zur Artikeldetailseite von Die Witwe des Autors Gilly Macmillan
                                                <dl-product product-id="A1068358033" product-price="17.00" product-avail="Sofort lieferbar" name="Die Witwe" price="17.00" currency="EUR" category="Buch (dtsch)/Bücher/Krimis &amp; Thriller/Nach Ländern/Großbritannien" product-position="2">
                                                </dl-product>
                                </a>
                   \s
                                <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                        <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/f860711b449d4344ae38349850cc8b7c/die-witwe-taschenbuch-gilly-macmillan.jpeg" width="200" height="306" alt="Bild vom Artikel Die Witwe vom Autor Gilly Macmillan" loading="lazy">
                                </picture>
                   \s
                                <div class="tm-artikeldetails">
                                    <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                                Gilly Macmillan
                                    </p>
                                    <strong class="element-text-standard-black tm-artikeldetails__titel">Die Witwe</strong>
                   \s
                                    <div class="tm-badges">
                                                <span class="element-flag-info tm-badges__badge">Neu</span>
                                    </div>
                   \s
                                    <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                        <span>Buch (Taschenbuch)</span>
                                            <span>+ weitere</span>
                                    </p>
                   \s
                                    <div class="tm-preis-wrapper">
                                                <p class="element-text-large-black tm-preis-wrapper__preis">                17,00 €
            </p>
                                    </div>
                   \s
                                    <div class="tm-versandart">
                                        <p class="element-text-small tm-versandart__lieferung">
                                                <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort lieferbar</span>
                                                Lieferung
                                        </p>
                   \s
                                                        <buchhandlung-bestandanzeige data-matnr="A1068358033" ampel-status-set="">
                <p class="element-text-small bestandanzeige">
                    <span class="element-icon-ampel bestandanzeige__ampel" data-status="gruen"></span>
                    <span class="bestandanzeige__label">Abholung</span>
                </p>
            </buchhandlung-bestandanzeige>
                                    </div>
                   \s
                                                <div class="tm-bewertungsstatistik">
                                                    <span class="element-rating-standard" rating="4" data-test="rating"></span>
                                                    <span class="element-text-standard tm-bewertungsstatistik__bewertungssanzahl">(6)
                                                    </span>
                                                </div>
                                </div>
                   \s
                                <div class="tm-merken-herz-container">
                                        <artikel-merken-herz data-artikelnummer="A1068358033" data-type="list" data-pid="A1068358033" data-name="Die Witwe" data-value="17.00" data-currency="EUR" data-category="Buch (dtsch)/Bücher/Krimis &amp; Thriller/Nach Ländern/Großbritannien" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                                </div>
                            </li>
                            <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="3">
                                <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1066698237" caption="suchergebnis-klick">
                                    Zur Artikeldetailseite von Wenn sie wüsste des Autors Freida McFadden
                                                <dl-product product-id="A1066698237" product-price="16.00" product-avail="Sofort lieferbar" name="Wenn sie wüsste" price="16.00" currency="EUR" category="Buch (dtsch)/Bücher/Krimis &amp; Thriller/Nach Ländern/Amerika" product-position="3">
                                                </dl-product>
                                </a>
                   \s
                                <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                        <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/19ba2fb5b77f4f29b1644b5afcd7ae43/wenn-sie-wuesste-taschenbuch-freida-mcfadden.jpeg" width="200" height="305" alt="Bild vom Artikel Wenn sie wüsste vom Autor Freida McFadden" loading="lazy">
                                </picture>
                   \s
                                <div class="tm-artikeldetails">
                                    <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                                Freida McFadden
                                    </p>
                                    <strong class="element-text-standard-black tm-artikeldetails__titel">Wenn sie wüsste</strong>
                   \s
                                    <div class="tm-badges">
                                                <span class="element-flag-info tm-badges__badge">Band 1</span>
                                    </div>
                   \s
                                    <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                        <span>Buch (Taschenbuch)</span>
                                            <span>+ weitere</span>
                                    </p>
                   \s
                                    <div class="tm-preis-wrapper">
                                                <p class="element-text-large-black tm-preis-wrapper__preis">                16,00 €
            </p>
                                    </div>
                   \s
                                    <div class="tm-versandart">
                                        <p class="element-text-small tm-versandart__lieferung">
                                                <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort lieferbar</span>
                                                Lieferung
                                        </p>
                   \s
                                                        <buchhandlung-bestandanzeige data-matnr="A1066698237" ampel-status-set="">
                <p class="element-text-small bestandanzeige">
                    <span class="element-icon-ampel bestandanzeige__ampel" data-status="gruen"></span>
                    <span class="bestandanzeige__label">Abholung</span>
                </p>
            </buchhandlung-bestandanzeige>
                                    </div>
                   \s
                                                <div class="tm-bewertungsstatistik">
                                                    <span class="element-rating-standard" rating="4,5" data-test="rating"></span>
                                                    <span class="element-text-standard tm-bewertungsstatistik__bewertungssanzahl">(85)
                                                    </span>
                                                </div>
                                </div>
                   \s
                                <div class="tm-merken-herz-container">
                                        <artikel-merken-herz data-artikelnummer="A1066698237" data-type="list" data-pid="A1066698237" data-name="Wenn sie wüsste" data-value="16.00" data-currency="EUR" data-category="Buch (dtsch)/Bücher/Krimis &amp; Thriller/Nach Ländern/Amerika" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                                </div>
                            </li>
                            <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="4">
                                <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1069196290" caption="suchergebnis-klick">
                                    Zur Artikeldetailseite von Sie kann dich hören des Autors Freida McFadden
                                                <dl-product product-id="A1069196290" product-price="16.00" product-avail="Erscheint am 11.4.2024" name="Sie kann dich hören" price="16.00" currency="EUR" category="Buch (dtsch)/Bücher/Krimis &amp; Thriller/Nach Ländern/Amerika" product-position="4">
                                                </dl-product>
                                </a>
                   \s
                                <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                        <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/d93cbfed87184d189714ede0904db944/sie-kann-dich-hoeren-taschenbuch-freida-mcfadden.jpeg" width="200" height="279" alt="Bild vom Artikel Sie kann dich hören vom Autor Freida McFadden" loading="lazy">
                                </picture>
                   \s
                                <div class="tm-artikeldetails">
                                    <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                                Freida McFadden
                                    </p>
                                    <strong class="element-text-standard-black tm-artikeldetails__titel">Sie kann dich hören</strong>
                   \s
                                    <div class="tm-badges">
                                                <span class="element-flag-info tm-badges__badge">Band 2</span>
                                                <span class="element-flag-info tm-badges__badge">Vorbesteller</span>
                                    </div>
                   \s
                                    <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                        <span>Buch (Taschenbuch)</span>
                                            <span>+ weitere</span>
                                    </p>
                   \s
                                    <div class="tm-preis-wrapper">
                                                <p class="element-text-large-black tm-preis-wrapper__preis">                16,00 €
            </p>
                                    </div>
                   \s
                                    <div class="tm-versandart">
                                        <p class="element-text-small tm-versandart__lieferung">
                                                <span class="element-icon-ampel tm-versandart__ampel" data-status="gelb">Erscheint am 11.4.2024</span>
                                                Lieferung
                                        </p>
                   \s
                                                        <buchhandlung-bestandanzeige data-matnr="A1069196290" ampel-status-set="">
                <p class="element-text-small bestandanzeige">
                    <span class="element-icon-ampel bestandanzeige__ampel" data-status="rot"></span>
                    <span class="bestandanzeige__label">Abholung</span>
                </p>
            </buchhandlung-bestandanzeige>
                                    </div>
                   \s
                                </div>
                   \s
                                <div class="tm-merken-herz-container">
                                        <artikel-merken-herz data-artikelnummer="A1069196290" data-type="list" data-pid="A1069196290" data-name="Sie kann dich hören" data-value="16.00" data-currency="EUR" data-category="Buch (dtsch)/Bücher/Krimis &amp; Thriller/Nach Ländern/Amerika" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                                </div>
                            </li>
                                </ul>""";

    public static final String thaliaBookPage = """
            <div class="formatkacheln scrollbar-versteckt">
                                                            <button class="element-struktur-kachel-standard hauptformat" interaction="overlay-oeffnen" data-index="0">
                                        <span class="element-icon-kategorie" data-typ="Hörbuch">Hörbuch</span>
                                        <p class="element-text-small bezeichnung">
                                            Hörbuch
                                        </p>
                                        <strong class="element-text-small-strong">
                                                <abokaufoption-preisanzeige component="abokaufoption-preisanzeige" data-test="hoerbuch-kachel-preisanzeige">
                <link rel="stylesheet" href="/abokaufen/resources/abokaufoption-preisanzeige/style.d41d8cd98f00b204e980.thalia.css">
                <script type="module" src="/abokaufen/resources/abokaufoption-preisanzeige/main-module.567551860745a6d9fc4b.js"></script>
                <script defer="" nomodule="" src="/abokaufen/resources/abokaufoption-preisanzeige/main-nomodule.7b3b7f8338d689a68d57.js"></script>

               \s
                    <strong>
                       \s
                           \s
                                  ab 0,00 €
                           \s
                       \s
                    </strong>
                   \s
                       \s
                            <p>im Probeabo</p>
                       \s
                   \s
               \s
            </abokaufoption-preisanzeige>

                                        </strong>
                                   \s
                                                            </button>
                                                            <a href="https://www.thalia.de/shop/home/artikeldetails/A1063536722" class="element-struktur-kachel-standard hauptformat" interaction="zur-artikeldetailseite" caption="Gebundenes Buch" data-status="aktiv">
                                                                    <dl-product product-id="A1063536722" product-price="22.00" product-avail="Sofort lieferbar" name="Die Haushälterin" price="22.00" currency="EUR" category="/">
                                                                    </dl-product>
                                        <span class="element-icon-kategorie" data-typ="Gebundenes Buch">Gebundenes Buch</span>
                                        <p class="element-text-small bezeichnung">
                                            Gebundenes Buch
                                        </p>
                                        <strong class="element-text-small-strong">
                                               \s
                                           \s
                                            22,00
                                            €
                                        </strong>
                                   \s
                                                            </a>
                                                            <a href="https://www.thalia.de/shop/home/artikeldetails/A1068358243" class="element-struktur-kachel-standard hauptformat" interaction="zur-artikeldetailseite" caption="Taschenbuch">
                                                                    <dl-product product-id="A1068358243" product-price="13.00" product-avail="Sofort lieferbar" name="Die Haushälterin" price="13.00" currency="EUR" category="/">
                                                                    </dl-product>
                                        <span class="element-icon-kategorie" data-typ="Taschenbuch">Taschenbuch</span>
                                        <p class="element-text-small bezeichnung">
                                            Taschenbuch
                                        </p>
                                        <strong class="element-text-small-strong">
                                               \s
                                           \s
                                            13,00
                                            €
                                        </strong>
                                   \s
                                                            </a>
                                                            <a href="https://www.thalia.de/shop/home/artikeldetails/A1063544679" class="element-struktur-kachel-standard hauptformat" interaction="zur-artikeldetailseite" caption="eBook">
                                                                    <dl-product product-id="A1063544679" product-price="10.99" product-avail="Sofort per Download lieferbar" name="Die Haushälterin" price="10.99" currency="EUR" category="/">
                                                                    </dl-product>
                                        <span class="element-icon-kategorie" data-typ="eBook">eBook</span>
                                        <p class="element-text-small bezeichnung">
                                            eBook
                                        </p>
                                        <strong class="element-text-small-strong">
                                               \s
                                           \s
                                            10,99
                                            €
                                        </strong>
                                   \s
                                                            </a>
                                                </div>""";

    public static String notFound ="""
                         <suche-produktliste component="suchergebnis-liste" impression="product" cd-suchbegriff="salvar o fogo Itamar Vieira Junior">
                
                        <link rel="stylesheet" href="https://assets.thalia.media/ocsassets/suchocs/suche-produktliste/style.1d75b5d858f0a02ebcd4.thalia.css">
                            <script type="module" src="https://assets.thalia.media/ocsassets/suchocs/suche-produktliste/main-module.dc6ee07f0c33cf5a2ffa.js"></script>
                
                        <div>
                            <ul class="tm-produktliste">
                        <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="1">
                            <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1069087053" caption="suchergebnis-klick">
                                Zur Artikeldetailseite von O cozer das pedras, o roer dos ossos des Autors Patrick Torres
                        <dl-product product-id="A1069087053" product-price="2.99" product-avail="Sofort per Download lieferbar" name="O cozer das pedras, o roer dos ossos" price="2.99" currency="EUR" category="Ebooks/eBooks/Fremdsprachige eBooks/Portugiesische eBooks" merkur-event="suchergebnisartikelclicked" aktuelle-seite="1" product-position="1">
                        </dl-product>
                            </a>
                
                            <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                    <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/979b133090184ae0b0fcd429158b24be/o-cozer-das-pedras-o-roer-dos-ossos-epub-3-patrick-torres.jpeg" width="195" height="330" alt="Bild vom Artikel O cozer das pedras, o roer dos ossos vom Autor Patrick Torres" loading="lazy">
                            </picture>
                
                            <div class="tm-artikeldetails">
                                <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                            Patrick Torres
                                </p>
                                <strong class="element-text-standard-black tm-artikeldetails__titel">O cozer das pedras, o roer dos ossos</strong>
                
                                <div class="tm-badges">
                                            <span class="element-flag-sale tm-badges__badge">- 25%</span>
                                </div>
                
                                <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                    <span>eBook (ePUB 3)</span>
                                </p>
                
                                <div class="tm-preis-wrapper">
                                            <p class="element-text-large-sale tm-preis-wrapper__preis">
                                                <span class="tm-preis-wrapper__verkaufspreis">                        2,99 €
</span>
                                                <span class="tm-preis-wrapper__alter-preis">
                                                    <s class="tm-preis-wrapper__streichpreis">                        3,99 €
</s>
                                                    <sup class="element-text-small">*</sup>
                                                </span>
                                            </p>
                                </div>
                
                                <div class="tm-versandart">
                                    <p class="element-text-small tm-versandart__lieferung">
                                            <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort per Download lieferbar</span>
                                            Lieferung
                                    </p>
                
                                </div>
                
                            </div>
                
                            <div class="tm-merken-herz-container">
                        <artikel-merken-herz data-artikelnummer="A1069087053" data-type="list" data-pid="A1069087053" data-name="O cozer das pedras, o roer dos ossos" data-value="2.99" data-currency="EUR" data-category="Ebooks/eBooks/Fremdsprachige eBooks/Portugiesische eBooks" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                            </div>
                        </li>
                        <li class="tm-produktliste__eintrag artikel" data-productpage="1" product-position="2">
                            <a class="element-link-toplevel tm-produkt-link" href="/shop/home/artikeldetails/A1069007285" caption="suchergebnis-klick">
                                Zur Artikeldetailseite von Colhendo flores sob incêndios: Os diários de Alice Walker des Autors Alice Walker
                        <dl-product product-id="A1069007285" product-price="5.99" product-avail="Sofort per Download lieferbar" name="Colhendo flores sob incêndios: Os diários de Alice Walker" price="5.99" currency="EUR" category="Ebooks/eBooks/Fremdsprachige eBooks/Portugiesische eBooks" merkur-event="suchergebnisartikelclicked" aktuelle-seite="1" product-position="2">
                        </dl-product>
                            </a>
                
                            <picture class="element-struktur-schattenbox tm-artikelbild-wrapper" data-highlight="schattenbox">
                                    <img class="tm-artikelbild-wrapper__artikelbild" src="https://images.thalia.media/03/-/9c7842ebe21f4104bf96028481317e60/colhendo-flores-sob-incendios-os-diarios-de-alice-walker-epub-3-alice-walker.jpeg" width="200" height="290" alt="Bild vom Artikel Colhendo flores sob incêndios: Os diários de Alice Walker vom Autor Alice Walker" loading="lazy">
                            </picture>
                
                            <div class="tm-artikeldetails">
                                <p class="element-text-standard tm-artikeldetails__autor autoren-wrapper">
                                            <span class="autoren">
Alice Walker
                                            </span>
                                            <span class="weiter">+ weitere</span>
                                </p>
                                <strong class="element-text-standard-black tm-artikeldetails__titel">Colhendo flores sob incêndios: Os diários de Alice Walker</strong>
                
                                <div class="tm-badges">
                                            <span class="element-flag-sale tm-badges__badge">- 57%</span>
                                </div>
                
                                <p class="element-text-standard-strong tm-artikeldetails__formatbezeichnung">
                                    <span>eBook (ePUB 3)</span>
                                </p>
                
                                <div class="tm-preis-wrapper">
                                            <p class="element-text-large-sale tm-preis-wrapper__preis">
                                                <span class="tm-preis-wrapper__verkaufspreis">                        5,99 €
</span>
                                                <span class="tm-preis-wrapper__alter-preis">
                                                    <s class="tm-preis-wrapper__streichpreis">                        13,99 €
</s>
                                                    <sup class="element-text-small">*</sup>
                                                </span>
                                            </p>
                                </div>
                
                                <div class="tm-versandart">
                                    <p class="element-text-small tm-versandart__lieferung">
                                            <span class="element-icon-ampel tm-versandart__ampel" data-status="gruen">Sofort per Download lieferbar</span>
                                            Lieferung
                                    </p>
                
                                </div>
                
                            </div>
                
                            <div class="tm-merken-herz-container">
                        <artikel-merken-herz data-artikelnummer="A1069007285" data-type="list" data-pid="A1069007285" data-name="Colhendo flores sob incêndios: Os diários de Alice Walker" data-value="5.99" data-currency="EUR" data-category="Ebooks/eBooks/Fremdsprachige eBooks/Portugiesische eBooks" data-state="unmarked"><button class="element-button-bookmark" data-state="unmarked" data-type="list" interaction="merken">Auf meinen Merkzettel</button></artikel-merken-herz>
                            </div>
                        </li>
                            </ul>
                                <div class="tm-ladeindikator" hidden="">
                                    <span class="element-icon-loading" data-status="loading" data-size="large"></span>
                                </div>
                        </div>
                    </suche-produktliste>""";
}
