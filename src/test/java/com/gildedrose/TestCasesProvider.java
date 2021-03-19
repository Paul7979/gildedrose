package com.gildedrose;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TestCasesProvider {
    static Stream<Arguments> provideItemsAndExpectedResults() {
        int initialQuality0 = 0;
        int initialQuality10 = 10;
        int initialQuality50 = 50;
        int initialSellInMinus10 = -10;
        int initialSellIn0 = 0;
        int initialSellIn5 = 5;
        int initialSellIn10 = 10;
        int initialSellIn50 = 50;


        return Stream.of(
                Arguments.of("RandomItemIsReducedBy1",new Item("Test", initialSellIn10, initialQuality10), new Item("Test", initialSellIn10 - 1, initialQuality10 -1)),
                Arguments.of("RandomItemWith0QualityIsNotReduced",new Item("Test", initialSellIn10, initialQuality0), new Item("Test", initialSellIn10 - 1, initialQuality0)),
                Arguments.of("RandomItemWith10Quality0SellInIsReducedBy2",new Item("Test", initialSellIn0, initialQuality10), new Item("Test", initialSellIn0 - 1, initialQuality10 - 2)),
                Arguments.of("RandomItemWith10QualityMinus10SellInIsReducedBy2",new Item("Test", initialSellInMinus10, initialQuality10), new Item("Test", initialSellInMinus10 - 1, initialQuality10 - 2)),
                Arguments.of("RandomItemWith0QualityMinus10SellInStaysUnchanged",new Item("Test", initialSellInMinus10, initialQuality0), new Item("Test", initialSellInMinus10 - 1, initialQuality0)),
                Arguments.of("BrieFrom10IncreasedBy1",new Item(GildedRose.AGED_BRIE, initialSellIn10, initialQuality10), new Item(GildedRose.AGED_BRIE, initialSellIn10 - 1, initialQuality10 + 1)),
                Arguments.of("BrieFrom10IncreasedBy1",new Item(GildedRose.AGED_BRIE, initialSellIn10, initialQuality50), new Item(GildedRose.AGED_BRIE, initialSellIn10 - 1, initialQuality50)),
                Arguments.of("BrieFrom10IncreasedBy1",new Item(GildedRose.AGED_BRIE, initialSellIn10, initialQuality50), new Item(GildedRose.AGED_BRIE, initialSellIn10 - 1, initialQuality50)),
                Arguments.of("Sulfuras10SellIn50QualityStaysUnchanged",new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellIn10, initialQuality50), new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellIn10, initialQuality50)),
                Arguments.of("Sulfuras50SellIn50QualityStaysUnchanged",new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellIn50, initialQuality50), new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellIn50, initialQuality50)),
                Arguments.of("Sulfuras0SellIn0QualityStaysUnchanged",new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellIn0, initialQuality0), new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellIn0, initialQuality0)),
                Arguments.of("Sulfuras0SellIn0QualityStaysUnchanged",new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellIn0, initialQuality0), new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellIn0, initialQuality0)),
                Arguments.of("SulfurasMinus10SellIn10QualityStaysUnchanged",new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellInMinus10, initialQuality0), new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, initialSellInMinus10, initialQuality0)),
                Arguments.of("Backstage10SellIn0QualityPlus2",new Item(GildedRose.BACKSTAGE_PASSES_FOR_CONCERT, initialSellIn10, initialQuality0), new Item(GildedRose.BACKSTAGE_PASSES_FOR_CONCERT, initialSellIn10 -1, initialQuality0 +2)),
                Arguments.of("Backstage5SellIn0QualityPlus3",new Item(GildedRose.BACKSTAGE_PASSES_FOR_CONCERT, initialSellIn5, initialQuality0), new Item(GildedRose.BACKSTAGE_PASSES_FOR_CONCERT, initialSellIn5 -1, initialQuality0 +3)),
                Arguments.of("Backstage0SellIn10QualityIsZero",new Item(GildedRose.BACKSTAGE_PASSES_FOR_CONCERT, initialSellIn0, initialQuality10), new Item(GildedRose.BACKSTAGE_PASSES_FOR_CONCERT, initialSellIn0 -1, 0))
                );
    }
}
