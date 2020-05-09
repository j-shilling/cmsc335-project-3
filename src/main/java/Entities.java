import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class Entities implements Iterable<Drawable> {

	private static final Entities INSTANCE = new Entities();

	public static Entities getInstance() {
		return INSTANCE;
	}

	private final Collection<Drawable> entities;

	private Entities() {
		entities = new ArrayList<Drawable>();
	}

	public boolean add(Drawable o) {
		return this.entities.add(o);
	}

	@Override
	public Iterator<Drawable> iterator() {
		return this.entities.iterator();
	}

	public double maxXLocation() {
		if (this.entities.isEmpty()) {
			return 0;
		} else {
			return this.entities.stream().max(Comparator.comparing(Drawable::getXLocation)).get().getXLocation();
		}
	}

	public double minXLocation() {
		if (this.entities.isEmpty()) {
			return 0;
		} else {
			return this.entities.stream().min(Comparator.comparing(Drawable::getXLocation)).get().getXLocation();
		}
	}

}
