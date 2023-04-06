
package net.mcreator.gildedsky.world.features.ores;

public class SkyStoneFeature extends OreFeature {

	public static SkyStoneFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SkyStoneFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("gildedsky:sky_stone", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), GildedskyModBlocks.SKY_STONE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DEEPSLATE.defaultBlockState()), GildedskyModBlocks.SKY_STONE.get().defaultBlockState())), 16));
		PLACED_FEATURE = PlacementUtils.register("gildedsky:sky_stone", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(2), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public SkyStoneFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
