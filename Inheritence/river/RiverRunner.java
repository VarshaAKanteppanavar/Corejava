package com.xworkz;



import com.xworkz.river.MalaprabhaRiver;
import com.xworkz.river.River;
import com.xworkz.river.SharavatiRiver;

public class RiverRunner {

	public static void main(String[] args) {
		River river = new River();

		System.out.println(river.name);
		System.out.println(river.length);
		System.out.println(river.destination);
		System.out.println(river.origin);
		System.out.println("*****************************************");

		SharavatiRiver sharavati = new SharavatiRiver();
		System.out.println(sharavati.westWordsFlowing);
		System.out.println(sharavati.name);
		System.out.println(sharavati.destination);
		System.out.println(sharavati.length);
		System.out.println(sharavati.origin);
		System.out.println("*****************************************");

		MalaprabhaRiver malaprabha = new MalaprabhaRiver();
		System.out.println(malaprabha.noofDams);
		System.out.println(malaprabha.destination);
		System.out.println(malaprabha.length);
		System.out.println(malaprabha.name);
		System.out.println(malaprabha.origin);
		System.out.println("*****************************************");

		River shara = new SharavatiRiver();
		if (shara instanceof SharavatiRiver) {
			SharavatiRiver sha = (SharavatiRiver) shara;
			System.out.println(sha.westWordsFlowing);
			System.out.println(sha.destination);
			System.out.println(sha.length);
			System.out.println(sha.name);
			System.out.println(sha.origin);
			System.out.println("*****************************************");

		}

		River mala = new MalaprabhaRiver();
		if (mala instanceof MalaprabhaRiver) {
			MalaprabhaRiver mal = (MalaprabhaRiver) mala;
			System.out.println(mal.noofDams);
			System.out.println(mal.destination);
			System.out.println(mal.length);
			System.out.println(mal.name);
			System.out.println(mal.origin);
			System.out.println("*****************************************");

		}

		Object object = new River();
		if (object instanceof River) {

			River obj = (River) object;
			// System.out.println(obj.noofDams);
			System.out.println(obj.destination);
			System.out.println(obj.length);
			System.out.println(obj.name);
			System.out.println(obj.origin);
			System.out.println("*****************************************");

		}
		Object objt = new SharavatiRiver();
		if (objt instanceof SharavatiRiver) {
			SharavatiRiver obt = (SharavatiRiver) objt;
			System.out.println(obt.destination);
			System.out.println(obt.length);
			System.out.println(obt.name);
			System.out.println(obt.origin);
			System.out.println(obt.westWordsFlowing);
			System.out.println("*****************************************");
		}

		Object obt = new MalaprabhaRiver();
		if (obt instanceof MalaprabhaRiver) {
			MalaprabhaRiver ob = (MalaprabhaRiver) obt;
			System.out.println(ob.destination);
			System.out.println(ob.length);
			System.out.println(ob.name);
			System.out.println(ob.noofDams);
			System.out.println(ob.origin);
			System.out.println("*****************************************");
		}
		// array

		River[] riverRef = new River[5];
		riverRef[0] = sharavati;
		riverRef[1] = malaprabha;

		for (int hot = 0; hot < riverRef.length; hot++) {
			if (riverRef[hot] instanceof SharavatiRiver) {
				SharavatiRiver sh = (SharavatiRiver) riverRef[hot];
				{
					System.out.println(sh.destination);
					System.out.println(sh.length);
					System.out.println(sh.name);
					System.out.println(sh.origin);
					System.out.println(sh.westWordsFlowing);
					System.out.println("**********************************************");

				}}
			if(riverRef[hot] instanceof MalaprabhaRiver) {
				
			
				
				MalaprabhaRiver ma=(MalaprabhaRiver)riverRef[hot];
				{
					System.out.println(ma.destination);
					System.out.println(ma.length);
					System.out.println(ma.name);
					System.out.println(ma.origin);
					System.out.println(ma.noofDams);
				}

			}

		}

	}

}
