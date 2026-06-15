package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import java.util.EnumSet;
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public enum CacheFlag {
    NONE,
    ICON,
    IMAGE,
    VIDEO;
    
    public static final EnumSet<CacheFlag> ALL = EnumSet.allOf(CacheFlag.class);
}
