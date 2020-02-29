package ua.lviv.lgs_min;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

		public class Application {
			public static void main(String[] args) {
				Set<Pupil> setOfPupil = new HashSet<>();

				setOfPupil.add(new Pupil("Sofia", 9));
				setOfPupil.add(new Pupil("Maria", 11));
				setOfPupil.add(new Pupil("Nadia", 8));
				setOfPupil.add(new Pupil("Andrij", 13));

				System.out.println("Before sorting: ");
				for (Pupil p : setOfPupil) {
					System.out.println(p);
				}

				List<Pupil> listOfPupil = new ArrayList<>(setOfPupil);

				Collections.sort(listOfPupil);

				System.out.println("After sorting:");

				for (Pupil p : listOfPupil) {
					System.out.println(p);
				}

				Collections.sort(listOfPupil, new PupilAllFieldComparator());

				System.out.println("After sorting : ");

				for (Pupil p : listOfPupil) {
					System.out.println(p);
				}
			}
	}


