package net.mochidsuki.medicalsystem.defibrillator;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mochidsuki.medicalsystem.MedicalSystem;

@Mod(MedicalSystem.MODID)
public class DefibrillatorB {

    public static final String MOD_ID = "medicalsystem";

    public DefibrillatorB(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DefibrillatorI.register(modEventBus);
    }
}
