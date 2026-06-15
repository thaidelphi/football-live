package com.google.protobuf;

import com.google.protobuf.StringValue;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: StringValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class StringValueKt {
    public static final StringValueKt INSTANCE = new StringValueKt();

    /* compiled from: StringValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final StringValue.Builder _builder;

        /* compiled from: StringValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(StringValue.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(StringValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(StringValue.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ StringValue _build() {
            StringValue build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getValue() {
            String value = this._builder.getValue();
            kotlin.jvm.internal.n.e(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setValue(value);
        }
    }

    private StringValueKt() {
    }
}
