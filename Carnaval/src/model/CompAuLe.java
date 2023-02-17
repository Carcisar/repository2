package model;

import java.util.Comparator;

public class CompAuLe implements Comparator<Agrupaciones> {

	@Override
	public int compare(Agrupaciones o1, Agrupaciones o2) {
		int comp;
		if (o1 == null) {
			comp = -1;
		} else {
			if (o2 == null) {
				comp = 1;
			} else {
				comp = o1.getAutorLetra().compareTo(o2.getAutorLetra());
			}
		}
		return comp;

	}
}
