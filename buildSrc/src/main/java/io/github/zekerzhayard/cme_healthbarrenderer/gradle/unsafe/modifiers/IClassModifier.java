package io.github.zekerzhayard.cme_healthbarrenderer.gradle.unsafe.modifiers;

public interface IClassModifier {
    String getClassName();

    byte[] modify(byte[] classBytes);
}
