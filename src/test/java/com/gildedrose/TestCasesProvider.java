package com.gildedrose;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TestCasesProvider {
    static Stream<Arguments> provideItemsAndExpectedResults() {
        int initialQuality0 = 0;
        int initialQuality10 = 10;
        int initialQuality50 = 50;
        int initialSellIn0 = 0;
        int initialSellIn10 = 10;
        int initialSellIn50 = 50;


        return Stream.of(
                Arguments.of("RandomItemIsReducedBy1",new Item("Test", initialSellIn10, initialQuality10), new Item("Test", initialSellIn10 - 1, initialQuality10 -1)),
                Arguments.of("RandomItemWith0QualityIsNotReduced",new Item("Test", initialSellIn10, initialQuality0), new Item("Test", initialSellIn10 - 1, initialQuality0)),
                Arguments.of("RandomItemWith10QualityAndNegativeSellInIsReducedBy2",new Item("Test", initialSellIn0, initialQuality10), new Item("Test", initialSellIn0 - 1, initialQuality10 - 2)),
                Arguments.of("BrieFrom10IncreasedBy1",new Item(GildedRose.AGED_BRIE, initialSellIn10, initialQuality10), new Item(GildedRose.AGED_BRIE, initialSellIn10 - 1, initialQuality10 + 1)),
                Arguments.of("BrieFrom10IncreasedBy1",new Item(GildedRose.AGED_BRIE, initialSellIn10, initialQuality50), new Item(GildedRose.AGED_BRIE, initialSellIn10 - 1, initialQuality50))
        );
    }
}
