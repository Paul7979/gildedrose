package com.gildedrose;

public class BackstagePassesUpdater implements Updater{
    @Override
    public void updateItem(Item item) {
        item.sellIn -= 1;
        if (item.sellIn <= 0) {
            item.quality = 0;
            return;
        }
        if (item.sellIn > 10) {
            addQuality(item, 1);
            return;
        }
        if (item.sellIn > 5) {
            addQuality(item, 2);
            return;
        }
        addQuality(item, 3);
    }

    private void addQuality(Item item, int value) {
        item.quality += value;
        if (item.quality >= 50) {
            item.quality = 50;
        }
    }
}
