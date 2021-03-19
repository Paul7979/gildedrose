package com.gildedrose;

public class AgedBrieUpdater implements Updater{
    @Override
    public void updateItem(Item item) {
        item.sellIn -= 1;
        if (item.sellIn > 0) {
            addQuality(item, 1);
        } else {
            addQuality(item, 2);
        }
    }

    private void addQuality(Item item, int value) {
        if (item.quality < 50) {
            item.quality += value;
        }
    }
}
