package rocks.zipcode.io;

import com.sun.tools.javac.jvm.Items;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter{
    Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;

    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(items,comparator);
        return items;
    }
}
