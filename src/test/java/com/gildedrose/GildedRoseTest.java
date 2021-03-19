package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void given_randomItemInStock_whenUpdatedQuality_thenNameIsNotUpdated() {
        String name = "foo";
        Item[] items = new Item[] { new Item(name, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(name, app.items[0].name);
    }

    @Test
    void given_randomItemInStock_whenUpdatedQuality_thenSellinAndQualityAreUpdated() {
        int initialSellIn = 10;
        int initialQuality = 20;
        GildedRose app = createSingleItemApp("test", initialSellIn, initialQuality);
        app.updateQuality();
        assertEquals(initialSellIn - 1, app.items[0].sellIn);
        assertEquals(initialQuality -1, app.items[0].quality);
    }

    @Test
    void give_agedBrieInStockWithQuality50_whenUpdatedQuality_thenQualityNotIncreases() {
        int initialSellIn = 5;
        int initialQuality = 50;
        GildedRose singleItemApp = createSingleItemApp(GildedRose.AGED_BRIE, initialSellIn, initialQuality);

        singleItemApp.updateQuality();

        Item item = singleItemApp.items[0];
        assertEquals(initialSellIn - 1, item.sellIn);
        assertEquals(initialQuality, item.quality);
    }

    @Test
    void give_agedBrieInStock_whenUpdatedQuality_thenQualityIncreases() {
        int initialSellIn = 5;
        int initialQuality = 10;
        GildedRose singleItemApp = createSingleItemApp(GildedRose.AGED_BRIE, initialSellIn, initialQuality);
        singleItemApp.updateQuality();
        Item item = singleItemApp.items[0];
        assertEquals(initialSellIn - 1, item.sellIn);
        assertEquals(initialQuality +1, item.quality);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("com.gildedrose.TestCasesProvider#provideItemsAndExpectedResults")
    void test(String displayName, Item provided, Item expected) {
        GildedRose app = createSingleItemApp(provided);

        app.updateQuality();

        assertThat(app.items[0]).usingRecursiveComparison().isEqualTo(expected);
    }

    private GildedRose createSingleItemApp(Item item) {
        Item[] items = new Item[] {item};
        return new GildedRose(items);
    }

    private GildedRose createSingleItemApp(String name, int initialSellIn, int initialQuality) {
        Item[] items = new Item[] { new Item(name, initialSellIn, initialQuality)};
        return new GildedRose(items);
    }


}
