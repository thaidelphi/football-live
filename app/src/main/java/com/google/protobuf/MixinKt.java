package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: MixinKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class MixinKt {
    public static final MixinKt INSTANCE = new MixinKt();

    /* compiled from: MixinKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Mixin.Builder _builder;

        /* compiled from: MixinKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ Mixin _build() {
            Mixin build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.n.e(name, "_builder.getName()");
            return name;
        }

        public final String getRoot() {
            String root = this._builder.getRoot();
            kotlin.jvm.internal.n.e(root, "_builder.getRoot()");
            return root;
        }

        public final void setName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setName(value);
        }

        public final void setRoot(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setRoot(value);
        }
    }

    private MixinKt() {
    }
}
