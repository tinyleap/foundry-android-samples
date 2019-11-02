package io.tinyleap.foundry.containers;

import io.tinyleap.foundry.ui.fragments.ItemDetailFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ComponentContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ComponentDetail> ITEMS = new ArrayList<ComponentDetail>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ComponentDetail> ITEM_MAP = new HashMap<String, ComponentDetail>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
            addItem(new ComponentDetail("1","Random Data Generation","Generating Random data", ItemDetailFragment.class));
        addItem(new ComponentDetail("2","Bitmap Filters","Generating Random data", ItemDetailFragment.class));
        addItem(new ComponentDetail("3","Barcode","Generating Random data", ItemDetailFragment.class));
        addItem(new ComponentDetail("4","Random Data Generation","Generating Random data", ItemDetailFragment.class));
        addItem(new ComponentDetail("5","Random Data Generation","Generating Random data", ItemDetailFragment.class));
        addItem(new ComponentDetail("5","Random Data Generation","Generating Random data", ItemDetailFragment.class));


    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

}