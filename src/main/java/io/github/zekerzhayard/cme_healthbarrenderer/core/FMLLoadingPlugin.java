package io.github.zekerzhayard.cme_healthbarrenderer.core;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.Name("CME_HealthBarRenderer")
@IFMLLoadingPlugin.TransformerExclusions("io.github.zekerzhayard.cme_healthbarrenderer.core.")
public class FMLLoadingPlugin implements IFMLLoadingPlugin {
    @Override
    public String[] getASMTransformerClass() {
        return new String[] { "io.github.zekerzhayard.cme_healthbarrenderer.core.ClassTransformer" };
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
