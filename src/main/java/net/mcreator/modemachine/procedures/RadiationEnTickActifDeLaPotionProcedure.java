package net.mcreator.modemachine.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.modemachine.ModemachineModElements;

import java.util.Map;

@ModemachineModElements.ModElement.Tag
public class RadiationEnTickActifDeLaPotionProcedure extends ModemachineModElements.ModElement {
	public RadiationEnTickActifDeLaPotionProcedure(ModemachineModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure RadiationEnTickActifDeLaPotion!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1.5);
	}
}
