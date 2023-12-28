package net.mochidsuki.medicalsystem.defibrillator;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mochidsuki.medicalsystem.MedicalSystem;

@Mod(MedicalSystem.MODID)
public class Blocks {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MedicalSystem.MODID);

    //医療機器
    public static final RegistryObject<Block> DEFIBRILLATOR = BLOCKS.register("defibrillator", () -> new Block(BlockBehaviour.Properties.of().lightLevel(value -> 1)));//除細動器
    public static final RegistryObject<Block> ECMO = BLOCKS.register("ecmo", () -> new Block(BlockBehaviour.Properties.of().lightLevel(value -> 1)));//ECMO
    public static final RegistryObject<Block> HEART_LUNG_MACHINE = BLOCKS.register("heart_lung_machine", () -> new Block(BlockBehaviour.Properties.of().lightLevel(value -> 1)));//人工心肺
    public static final RegistryObject<Block> VENTILATOR = BLOCKS.register("ventilator", () -> new Block(BlockBehaviour.Properties.of().lightLevel(value -> 1)));//人工呼吸器


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
