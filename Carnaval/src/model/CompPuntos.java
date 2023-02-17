package model;

import java.util.Comparator;

public class CompPuntos implements Comparator<AgrupacionOficial> {

	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		int comp;
		if (o1 == null) {
			comp = -1;
		} else {
			if (o2 == null) {
				comp = 1;
			} else {
				comp = o1.getPuntos().compareTo(o2.getPuntos());
			}
		}
		return comp;

	}
}
