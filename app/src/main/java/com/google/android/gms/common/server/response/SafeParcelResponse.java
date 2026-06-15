package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@VisibleForTesting
@KeepForSdk
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    private final int f12694a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final Parcel f12695b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12696c = 2;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final zan f12697d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12698e;

    /* renamed from: f  reason: collision with root package name */
    private int f12699f;

    /* renamed from: g  reason: collision with root package name */
    private int f12700g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param int i10, @SafeParcelable.Param Parcel parcel, @SafeParcelable.Param zan zanVar) {
        this.f12694a = i10;
        this.f12695b = (Parcel) Preconditions.m(parcel);
        this.f12697d = zanVar;
        this.f12698e = zanVar == null ? null : zanVar.X();
        this.f12699f = 2;
    }

    private final void l(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().X(), entry);
        }
        sb.append('{');
        int J = SafeParcelReader.J(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.v(C));
            if (entry2 != null) {
                if (z10) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (field.G0()) {
                    int i10 = field.f12666d;
                    switch (i10) {
                        case 0:
                            n(sb, field, FastJsonResponse.g(field, Integer.valueOf(SafeParcelReader.E(parcel, C))));
                            break;
                        case 1:
                            n(sb, field, FastJsonResponse.g(field, SafeParcelReader.c(parcel, C)));
                            break;
                        case 2:
                            n(sb, field, FastJsonResponse.g(field, Long.valueOf(SafeParcelReader.F(parcel, C))));
                            break;
                        case 3:
                            n(sb, field, FastJsonResponse.g(field, Float.valueOf(SafeParcelReader.A(parcel, C))));
                            break;
                        case 4:
                            n(sb, field, FastJsonResponse.g(field, Double.valueOf(SafeParcelReader.y(parcel, C))));
                            break;
                        case 5:
                            n(sb, field, FastJsonResponse.g(field, SafeParcelReader.a(parcel, C)));
                            break;
                        case 6:
                            n(sb, field, FastJsonResponse.g(field, Boolean.valueOf(SafeParcelReader.w(parcel, C))));
                            break;
                        case 7:
                            n(sb, field, FastJsonResponse.g(field, SafeParcelReader.p(parcel, C)));
                            break;
                        case 8:
                        case 9:
                            n(sb, field, FastJsonResponse.g(field, SafeParcelReader.g(parcel, C)));
                            break;
                        case 10:
                            Bundle f10 = SafeParcelReader.f(parcel, C);
                            HashMap hashMap = new HashMap();
                            for (String str : f10.keySet()) {
                                hashMap.put(str, (String) Preconditions.m(f10.getString(str)));
                            }
                            n(sb, field, FastJsonResponse.g(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i10);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f12667e) {
                    sb.append(b9.i.f16696d);
                    switch (field.f12666d) {
                        case 0:
                            ArrayUtils.f(sb, SafeParcelReader.j(parcel, C));
                            break;
                        case 1:
                            ArrayUtils.h(sb, SafeParcelReader.d(parcel, C));
                            break;
                        case 2:
                            ArrayUtils.g(sb, SafeParcelReader.l(parcel, C));
                            break;
                        case 3:
                            ArrayUtils.e(sb, SafeParcelReader.i(parcel, C));
                            break;
                        case 4:
                            ArrayUtils.d(sb, SafeParcelReader.h(parcel, C));
                            break;
                        case 5:
                            ArrayUtils.h(sb, SafeParcelReader.b(parcel, C));
                            break;
                        case 6:
                            ArrayUtils.i(sb, SafeParcelReader.e(parcel, C));
                            break;
                        case 7:
                            ArrayUtils.j(sb, SafeParcelReader.q(parcel, C));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] n10 = SafeParcelReader.n(parcel, C);
                            int length = n10.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                if (i11 > 0) {
                                    sb.append(",");
                                }
                                n10[i11].setDataPosition(0);
                                l(sb, field.C0(), n10[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append(b9.i.f16698e);
                } else {
                    switch (field.f12666d) {
                        case 0:
                            sb.append(SafeParcelReader.E(parcel, C));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.c(parcel, C));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.F(parcel, C));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.A(parcel, C));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.y(parcel, C));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.a(parcel, C));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.w(parcel, C));
                            break;
                        case 7:
                            String p10 = SafeParcelReader.p(parcel, C);
                            sb.append("\"");
                            sb.append(JsonUtils.a(p10));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g10 = SafeParcelReader.g(parcel, C);
                            sb.append("\"");
                            sb.append(Base64Utils.a(g10));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g11 = SafeParcelReader.g(parcel, C);
                            sb.append("\"");
                            sb.append(Base64Utils.b(g11));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f11 = SafeParcelReader.f(parcel, C);
                            Set<String> keySet = f11.keySet();
                            sb.append("{");
                            boolean z11 = true;
                            for (String str2 : keySet) {
                                if (!z11) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\":\"");
                                sb.append(JsonUtils.a(f11.getString(str2)));
                                sb.append("\"");
                                z11 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m7 = SafeParcelReader.m(parcel, C);
                            m7.setDataPosition(0);
                            l(sb, field.C0(), m7);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == J) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(J);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    private static final void m(StringBuilder sb, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.a(Preconditions.m(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.a(sb, (HashMap) Preconditions.m(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i10);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static final void n(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.f12665c) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append(b9.i.f16696d);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 != 0) {
                    sb.append(",");
                }
                m(sb, field.f12664b, arrayList.get(i10));
            }
            sb.append(b9.i.f16698e);
            return;
        }
        m(sb, field.f12664b, obj);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> a() {
        zan zanVar = this.f12697d;
        if (zanVar == null) {
            return null;
        }
        return zanVar.n0((String) Preconditions.m(this.f12698e));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean e(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel i() {
        int i10 = this.f12699f;
        if (i10 == 0) {
            int a10 = SafeParcelWriter.a(this.f12695b);
            this.f12700g = a10;
            SafeParcelWriter.b(this.f12695b, a10);
            this.f12699f = 2;
        } else if (i10 == 1) {
            SafeParcelWriter.b(this.f12695b, this.f12700g);
            this.f12699f = 2;
        }
        return this.f12695b;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        Preconditions.n(this.f12697d, "Cannot convert to JSON on client side.");
        Parcel i10 = i();
        i10.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        l(sb, (Map) Preconditions.m(this.f12697d.n0((String) Preconditions.m(this.f12698e))), i10);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zan zanVar;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12694a);
        SafeParcelWriter.p(parcel, 2, i(), false);
        int i11 = this.f12696c;
        if (i11 != 0) {
            zanVar = i11 != 1 ? this.f12697d : this.f12697d;
        } else {
            zanVar = null;
        }
        SafeParcelWriter.q(parcel, 3, zanVar, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
