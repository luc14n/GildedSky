
package net.mcreator.gildedsky.world.features.ores;

public class SkyMetalOreFeature extends OreFeature {

	public static SkyMetalOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SkyMetalOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("gildedsky:sky_metal_ore", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), GildedskyModBlocks.SKY_METAL_ORE.get().defaultBlockState())), 5));
		PLACED_FEATURE = PlacementUtils.register("gildedsky:sky_metal_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(9), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(53)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public SkyMetalOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
