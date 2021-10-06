package rs.math.oop1.z160903.generickiMetodi.z02.osobePretragaPrikaz;

import java.util.List;

public class PokretanjeOsobePretraga02UgnjezdenaKlasa {

    public static void prikazi(List<Osoba> osobe, KriterijumPretrageOsoba kriterijum) {
        for (Osoba o : osobe) {
            if (kriterijum.proveri(o)) {
                o.prikazi();
            }
        }
    }

    static class ProveriOsobaStarijeOd implements KriterijumPretrageOsoba {
        private int god;

        ProveriOsobaStarijeOd(int god) {
            this.god = god;
        }

        public boolean proveri(Osoba o) {
            return o.getBrojGodina() >= god;
        }
    }

    static class ProveriOsobaUzrastaIzmedju implements KriterijumPretrageOsoba {
        private int godOd, godDo;

        ProveriOsobaUzrastaIzmedju(int godOd, int godDo) {
            this.godOd = godOd;
            this.godDo = godDo;
        }

        public boolean proveri(Osoba o) {
            return o.getBrojGodina() >= godOd && o.getBrojGodina() <= godDo;
        }
    }

    static class ProveriOsobaEmailAdresaSadrzi implements KriterijumPretrageOsoba {
        private String deoEmail;

        ProveriOsobaEmailAdresaSadrzi(String deoEmail) {
            this.deoEmail = deoEmail;
        }

        public boolean proveri(Osoba o) {
            return o.getEmailAdresa().indexOf(deoEmail) >= 0;
        }
    }

    static class ProveriOsobaDatogPolaSaEmailAdresomKojaSadrzi implements KriterijumPretrageOsoba {
        private Osoba.Pol pol;
        private String deoEmail;

        ProveriOsobaDatogPolaSaEmailAdresomKojaSadrzi(Osoba.Pol pol, String deoEmail) {
            this.pol = pol;
            this.deoEmail = deoEmail;
        }

        public boolean proveri(Osoba o) {
            return o.getPol() == pol && o.getEmailAdresa().indexOf(deoEmail) >= 0;
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new PokretanjeOsobePretraga02UgnjezdenaKlasa.ProveriOsobaStarijeOd(50));
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new PokretanjeOsobePretraga02UgnjezdenaKlasa.ProveriOsobaStarijeOd(80));
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, new PokretanjeOsobePretraga02UgnjezdenaKlasa.ProveriOsobaUzrastaIzmedju(80, 85));
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI,
                new PokretanjeOsobePretraga02UgnjezdenaKlasa.ProveriOsobaEmailAdresaSadrzi("disney"));
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI,
                new PokretanjeOsobePretraga02UgnjezdenaKlasa.ProveriOsobaDatogPolaSaEmailAdresomKojaSadrzi(Osoba.Pol.ZENA,
                        "disney"));
        System.out.println("---");
    }

}
