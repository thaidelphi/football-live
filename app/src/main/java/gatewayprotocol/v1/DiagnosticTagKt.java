package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: DiagnosticTagKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DiagnosticTagKt {
    public static final DiagnosticTagKt INSTANCE = new DiagnosticTagKt();

    /* compiled from: DiagnosticTagKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticTag.Builder _builder;

        /* compiled from: DiagnosticTagKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* compiled from: DiagnosticTagKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class TagTypeProxy extends DslProxy {
            private TagTypeProxy() {
            }
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticTag _build() {
            DiagnosticEventRequestOuterClass.DiagnosticTag build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void addAllTagType(DslList dslList, Iterable values) {
            n.f(dslList, "<this>");
            n.f(values, "values");
            this._builder.addAllTagType(values);
        }

        public final /* synthetic */ void addTagType(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            this._builder.addTagType(value);
        }

        public final void clearCustomTagType() {
            this._builder.clearCustomTagType();
        }

        public final void clearIntValue() {
            this._builder.clearIntValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final /* synthetic */ void clearTagType(DslList dslList) {
            n.f(dslList, "<this>");
            this._builder.clearTagType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getCustomTagType() {
            String customTagType = this._builder.getCustomTagType();
            n.e(customTagType, "_builder.getCustomTagType()");
            return customTagType;
        }

        public final int getIntValue() {
            return this._builder.getIntValue();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            n.e(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final /* synthetic */ DslList getTagType() {
            List<DiagnosticEventRequestOuterClass.DiagnosticTagType> tagTypeList = this._builder.getTagTypeList();
            n.e(tagTypeList, "_builder.getTagTypeList()");
            return new DslList(tagTypeList);
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase getValueCase() {
            DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase valueCase = this._builder.getValueCase();
            n.e(valueCase, "_builder.getValueCase()");
            return valueCase;
        }

        public final boolean hasCustomTagType() {
            return this._builder.hasCustomTagType();
        }

        public final boolean hasIntValue() {
            return this._builder.hasIntValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final /* synthetic */ void plusAssignAllTagType(DslList<DiagnosticEventRequestOuterClass.DiagnosticTagType, TagTypeProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticTagType> values) {
            n.f(dslList, "<this>");
            n.f(values, "values");
            addAllTagType(dslList, values);
        }

        public final /* synthetic */ void plusAssignTagType(DslList<DiagnosticEventRequestOuterClass.DiagnosticTagType, TagTypeProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            addTagType(dslList, value);
        }

        public final void setCustomTagType(String value) {
            n.f(value, "value");
            this._builder.setCustomTagType(value);
        }

        public final void setIntValue(int i10) {
            this._builder.setIntValue(i10);
        }

        public final void setStringValue(String value) {
            n.f(value, "value");
            this._builder.setStringValue(value);
        }

        public final /* synthetic */ void setTagType(DslList dslList, int i10, DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            this._builder.setTagType(i10, value);
        }
    }

    private DiagnosticTagKt() {
    }
}
