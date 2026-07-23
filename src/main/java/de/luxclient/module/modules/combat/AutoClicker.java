package de.luxclient.module.modules.combat;

import de.luxclient.module.Category;
import de.luxclient.module.Module;
import de.luxclient.setting.BooleanSetting;
import de.luxclient.setting.ModeSetting;
import de.luxclient.setting.RangeSetting;

public class AutoClicker extends Module {

    private final ModeSetting clickType =
            new ModeSetting(
                    "Click Type",
                    "Left Click",
                    "Left Click",
                    "Right Click",
                    "Both"
            );


    private final BooleanSetting stopOnBlock =
            new BooleanSetting(
                    "Stop on Block",
                    true
            );


    private final BooleanSetting weaponOnly =
            new BooleanSetting(
                    "Weapon Only",
                    false
            );


    private final RangeSetting cps =
            new RangeSetting(
                    "CPS",
                    0,
                    20,
                    8,
                    12
            );


    public AutoClicker() {

        super(
                "AutoClicker",
                "Automatically clicks with a configurable CPS range",
                Category.COMBAT
        );


        addSettings(
                clickType,
                stopOnBlock,
                weaponOnly,
                cps
        );
    }


    @Override
    public void onEnable() {

        /*
         * Später:
         *
         * - Click Scheduler starten
         * - CPS Range verwenden
         * - Mouse Input Events verarbeiten
         */

    }


    @Override
    public void onDisable() {

        /*
         * Später:
         *
         * - aktive Click Tasks entfernen
         */

    }
}
