package me.reb4ck.hyperreforge.objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.reb4ck.hyperenchants.enchantments.HyperEnchant;

@NoArgsConstructor
@Getter
@Setter
public class NextCost {
    private HyperEnchant hyperEnchant;
    private int level;

    public void setValues(HyperEnchant hyperEnchant, int level){
        this.hyperEnchant = hyperEnchant;
        this.level = level;
    }
}
