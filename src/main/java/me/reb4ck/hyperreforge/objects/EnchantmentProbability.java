package me.reb4ck.hyperreforge.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.reb4ck.hyperenchants.enchantments.HyperEnchant;

@AllArgsConstructor
@Getter
public class EnchantmentProbability {
    private final String id;
    private final HyperEnchant hyperEnchant;
    private final int level;
    private final int chance;
}
