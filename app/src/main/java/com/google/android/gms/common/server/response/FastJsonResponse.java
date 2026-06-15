package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    @SafeParcelable.Class
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        @SafeParcelable.VersionField

        /* renamed from: a  reason: collision with root package name */
        private final int f12663a;
        @SafeParcelable.Field

        /* renamed from: b  reason: collision with root package name */
        protected final int f12664b;
        @SafeParcelable.Field

        /* renamed from: c  reason: collision with root package name */
        protected final boolean f12665c;
        @SafeParcelable.Field

        /* renamed from: d  reason: collision with root package name */
        protected final int f12666d;
        @SafeParcelable.Field

        /* renamed from: e  reason: collision with root package name */
        protected final boolean f12667e;
        @SafeParcelable.Field

        /* renamed from: f  reason: collision with root package name */
        protected final String f12668f;
        @SafeParcelable.Field

        /* renamed from: g  reason: collision with root package name */
        protected final int f12669g;

        /* renamed from: h  reason: collision with root package name */
        protected final Class<? extends FastJsonResponse> f12670h;
        @SafeParcelable.Field

        /* renamed from: i  reason: collision with root package name */
        protected final String f12671i;

        /* renamed from: j  reason: collision with root package name */
        private zan f12672j;
        @SafeParcelable.Field

        /* renamed from: k  reason: collision with root package name */
        private FieldConverter<I, O> f12673k;

        /* JADX INFO: Access modifiers changed from: package-private */
        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i12, @SafeParcelable.Param boolean z11, @SafeParcelable.Param String str, @SafeParcelable.Param int i13, @SafeParcelable.Param String str2, @SafeParcelable.Param zaa zaaVar) {
            this.f12663a = i10;
            this.f12664b = i11;
            this.f12665c = z10;
            this.f12666d = i12;
            this.f12667e = z11;
            this.f12668f = str;
            this.f12669g = i13;
            if (str2 == null) {
                this.f12670h = null;
                this.f12671i = null;
            } else {
                this.f12670h = SafeParcelResponse.class;
                this.f12671i = str2;
            }
            if (zaaVar == null) {
                this.f12673k = null;
            } else {
                this.f12673k = (FieldConverter<I, O>) zaaVar.n0();
            }
        }

        public final Map<String, Field<?, ?>> C0() {
            Preconditions.m(this.f12671i);
            Preconditions.m(this.f12672j);
            return (Map) Preconditions.m(this.f12672j.n0(this.f12671i));
        }

        public final void D0(zan zanVar) {
            this.f12672j = zanVar;
        }

        public final boolean G0() {
            return this.f12673k != null;
        }

        @KeepForSdk
        public int X() {
            return this.f12669g;
        }

        final zaa n0() {
            FieldConverter<I, O> fieldConverter = this.f12673k;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.X(fieldConverter);
        }

        public final String toString() {
            Objects.ToStringHelper a10 = Objects.c(this).a("versionCode", Integer.valueOf(this.f12663a)).a("typeIn", Integer.valueOf(this.f12664b)).a("typeInArray", Boolean.valueOf(this.f12665c)).a("typeOut", Integer.valueOf(this.f12666d)).a("typeOutArray", Boolean.valueOf(this.f12667e)).a("outputFieldName", this.f12668f).a("safeParcelFieldId", Integer.valueOf(this.f12669g)).a("concreteTypeName", z0());
            Class<? extends FastJsonResponse> cls = this.f12670h;
            if (cls != null) {
                a10.a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.f12673k;
            if (fieldConverter != null) {
                a10.a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return a10.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int a10 = SafeParcelWriter.a(parcel);
            SafeParcelWriter.k(parcel, 1, this.f12663a);
            SafeParcelWriter.k(parcel, 2, this.f12664b);
            SafeParcelWriter.c(parcel, 3, this.f12665c);
            SafeParcelWriter.k(parcel, 4, this.f12666d);
            SafeParcelWriter.c(parcel, 5, this.f12667e);
            SafeParcelWriter.r(parcel, 6, this.f12668f, false);
            SafeParcelWriter.k(parcel, 7, X());
            SafeParcelWriter.r(parcel, 8, z0(), false);
            SafeParcelWriter.q(parcel, 9, n0(), i10, false);
            SafeParcelWriter.b(parcel, a10);
        }

        public final I y0(O o10) {
            Preconditions.m(this.f12673k);
            return this.f12673k.b(o10);
        }

        final String z0() {
            String str = this.f12671i;
            if (str == null) {
                return null;
            }
            return str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @ShowFirstParty
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface FieldConverter<I, O> {
        I b(O o10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <O, I> I g(Field<I, O> field, Object obj) {
        return ((Field) field).f12673k != null ? field.y0(obj) : obj;
    }

    private static final void h(StringBuilder sb, Field field, Object obj) {
        int i10 = field.f12664b;
        if (i10 == 11) {
            Class<? extends FastJsonResponse> cls = field.f12670h;
            Preconditions.m(cls);
            sb.append(cls.cast(obj).toString());
        } else if (i10 == 7) {
            sb.append("\"");
            sb.append(JsonUtils.a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    @KeepForSdk
    public abstract Map<String, Field<?, ?>> a();

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public Object b(Field field) {
        String str = field.f12668f;
        if (field.f12670h != null) {
            Preconditions.r(c(str) == null, "Concrete field shouldn't be value object: %s", field.f12668f);
            try {
                char upperCase = Character.toUpperCase(str.charAt(0));
                String substring = str.substring(1);
                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
                sb.append("get");
                sb.append(upperCase);
                sb.append(substring);
                return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
        return c(str);
    }

    @KeepForSdk
    protected abstract Object c(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public boolean d(Field field) {
        if (field.f12666d == 11) {
            if (field.f12667e) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return e(field.f12668f);
    }

    @KeepForSdk
    protected abstract boolean e(String str);

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> a10 = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a10.keySet()) {
            Field<?, ?> field = a10.get(str);
            if (d(field)) {
                Object g10 = g(field, b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (g10 == null) {
                    sb.append("null");
                } else {
                    switch (field.f12666d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.a((byte[]) g10));
                            sb.append("\"");
                            continue;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.b((byte[]) g10));
                            sb.append("\"");
                            continue;
                        case 10:
                            MapUtils.a(sb, (HashMap) g10);
                            continue;
                        default:
                            if (field.f12665c) {
                                ArrayList arrayList = (ArrayList) g10;
                                sb.append(b9.i.f16696d);
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        h(sb, field, obj);
                                    }
                                }
                                sb.append(b9.i.f16698e);
                                break;
                            } else {
                                h(sb, field, g10);
                                continue;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append(com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON);
        }
        return sb.toString();
    }
}
