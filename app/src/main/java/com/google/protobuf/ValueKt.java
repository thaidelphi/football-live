package com.google.protobuf;

import com.google.protobuf.Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ValueKt {
    public static final ValueKt INSTANCE = new ValueKt();

    /* compiled from: ValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Value.Builder _builder;

        /* compiled from: ValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Value.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Value.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ Value _build() {
            Value build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearBoolValue() {
            this._builder.clearBoolValue();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearListValue() {
            this._builder.clearListValue();
        }

        public final void clearNullValue() {
            this._builder.clearNullValue();
        }

        public final void clearNumberValue() {
            this._builder.clearNumberValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final void clearStructValue() {
            this._builder.clearStructValue();
        }

        public final boolean getBoolValue() {
            return this._builder.getBoolValue();
        }

        public final Value.KindCase getKindCase() {
            Value.KindCase kindCase = this._builder.getKindCase();
            kotlin.jvm.internal.n.e(kindCase, "_builder.getKindCase()");
            return kindCase;
        }

        public final ListValue getListValue() {
            ListValue listValue = this._builder.getListValue();
            kotlin.jvm.internal.n.e(listValue, "_builder.getListValue()");
            return listValue;
        }

        public final NullValue getNullValue() {
            NullValue nullValue = this._builder.getNullValue();
            kotlin.jvm.internal.n.e(nullValue, "_builder.getNullValue()");
            return nullValue;
        }

        public final double getNumberValue() {
            return this._builder.getNumberValue();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            kotlin.jvm.internal.n.e(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final Struct getStructValue() {
            Struct structValue = this._builder.getStructValue();
            kotlin.jvm.internal.n.e(structValue, "_builder.getStructValue()");
            return structValue;
        }

        public final boolean hasBoolValue() {
            return this._builder.hasBoolValue();
        }

        public final boolean hasListValue() {
            return this._builder.hasListValue();
        }

        public final boolean hasNullValue() {
            return this._builder.hasNullValue();
        }

        public final boolean hasNumberValue() {
            return this._builder.hasNumberValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final boolean hasStructValue() {
            return this._builder.hasStructValue();
        }

        public final void setBoolValue(boolean z10) {
            this._builder.setBoolValue(z10);
        }

        public final void setListValue(ListValue value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setListValue(value);
        }

        public final void setNullValue(NullValue value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setNullValue(value);
        }

        public final void setNumberValue(double d10) {
            this._builder.setNumberValue(d10);
        }

        public final void setStringValue(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setStringValue(value);
        }

        public final void setStructValue(Struct value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setStructValue(value);
        }
    }

    private ValueKt() {
    }
}
