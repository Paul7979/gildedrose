package com.gildedrose;

public class AbstractUpdaterFactory {
    public Updater getUpdater(String name) {
        return switch (name) {
            case GildedRose.AGED_BRIE -> new AgedBrieUpdater();
            case GildedRose.BACKSTAGE_PASSES_FOR_CONCERT -> new BackstagePassesUpdater();
            case GildedRose.SULFURAS_HAND_OF_RAGNAROS -> new SulfasHandUpdater();
            case GildedRose.CONJURED_MANA_CAKE -> new ConjuredUpdater();
            default -> new DefaultUpdater();
        };
    }
}
