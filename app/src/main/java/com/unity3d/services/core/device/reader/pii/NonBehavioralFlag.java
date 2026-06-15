package com.unity3d.services.core.device.reader.pii;

import i8.o;
import i8.p;
import java.util.Locale;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: NonBehavioralFlag.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;
    
    public static final Companion Companion = new Companion(null);

    /* compiled from: NonBehavioralFlag.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final NonBehavioralFlag fromString(String value) {
            NonBehavioralFlag b10;
            n.f(value, "value");
            try {
                o.a aVar = o.f26626b;
                String upperCase = value.toUpperCase(Locale.ROOT);
                n.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                b10 = o.b(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th) {
                o.a aVar2 = o.f26626b;
                b10 = o.b(p.a(th));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            if (o.f(b10)) {
                b10 = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) b10;
        }
    }
}
