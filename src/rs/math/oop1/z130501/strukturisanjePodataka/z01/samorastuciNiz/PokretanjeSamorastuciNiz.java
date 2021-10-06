package rs.math.oop1.z130501.strukturisanjePodataka.z01.samorastuciNiz;

public class PokretanjeSamorastuciNiz {

	public static void main(String[] args) {
		SamorastuciNiz<Integer> niz = new SamorastuciNiz<>();
		for (int i = 0; i < 50; i++) {
			niz.postaviNaPoziciju(3 * (i + 1), i);
			// System.out.println(niz);
			// System.out.println("---");
		}
		System.out.println(niz);
		System.out.println("---");

		niz.postaviNaPoziciju(-1, 1000);
		System.out.println(niz);
		System.out.println("---");

		niz.postaviNaPoziciju(-1, 500);
		System.out.println(niz);
		System.out.println("---");

		niz.postaviNaPoziciju(-1, -7);
		System.out.println(niz);
		System.out.println("---");
	}

}
