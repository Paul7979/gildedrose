package com.gildedrose;

public class ConjuredUpdater implements Updater{
    @Override
    public void updateItem(Item item) {
        item.sellIn -= 1;
        if (item.quality > 0) {
            if (item.sellIn > 0) {
                item.quality -= 2;
            } else {
                item.quality -= 4;
            }
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
