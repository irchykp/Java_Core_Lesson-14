package ua.lviv.lgs_min;

import java.util.Comparator;

public class PupilAllFieldComparator implements Comparator<Pupil> {
	@Override
	public int compare(Pupil o1, Pupil o2) {
		if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		} else if (o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		} else {
			if (o1.getAge() > o2.getAge()) {
				return 1;
			} else if (o1.getAge() < o2.getAge()) {
				return -1;
			}
		}
		return 0;
	}
}
