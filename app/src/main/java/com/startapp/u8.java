package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.startapp.sdk.adsbase.remoteconfig.LocationMetadata;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u8 extends o6<s8> {

    /* renamed from: j  reason: collision with root package name */
    public final t4<v1> f23446j;

    /* renamed from: k  reason: collision with root package name */
    public final j2<TelephonyMetadata> f23447k;

    /* renamed from: l  reason: collision with root package name */
    public final j2<LocationMetadata> f23448l;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Comparator<CellInfo> {
        @Override // java.util.Comparator
        public final int compare(CellInfo cellInfo, CellInfo cellInfo2) {
            CellInfo cellInfo3 = cellInfo;
            CellInfo cellInfo4 = cellInfo2;
            if (cellInfo3.isRegistered() == cellInfo4.isRegistered()) {
                return u8.a(cellInfo4) - u8.a(cellInfo3);
            }
            if (cellInfo3.isRegistered()) {
                return -1;
            }
            return cellInfo4.isRegistered() ? 1 : 0;
        }
    }

    public u8(Context context, t4 t4Var, t4 t4Var2, t4 t4Var3, j2 j2Var, com.startapp.sdk.components.c cVar) {
        super(context, t4Var, t4Var2, "c9c194d3e01bcf14", "086ea3852ae4e475");
        this.f23446j = t4Var3;
        this.f23447k = j2Var;
        this.f23448l = cVar;
    }

    @Override // com.startapp.o6
    public final s8 a(String str) {
        if (str != null) {
            try {
                return new s8(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public final void b(boolean z10) {
        TelephonyMetadata call;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f23531a.getSystemService("phone");
            s8 s8Var = new s8();
            s8Var.a(7, Integer.valueOf(telephonyManager.getSimState()));
            s8Var.a(8, telephonyManager.getSimOperator());
            s8Var.a(9, telephonyManager.getSimOperatorName());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                s8Var.a(15, String.valueOf(telephonyManager.getSimCarrierId()));
                s8Var.a(16, String.valueOf(telephonyManager.getSimCarrierIdName()));
            }
            s8Var.a(10, Integer.valueOf(telephonyManager.getPhoneType()));
            s8Var.a(11, com.startapp.a.b(telephonyManager.getNetworkOperator()));
            s8Var.a(12, com.startapp.a.b(telephonyManager.getNetworkOperatorName()));
            LocationMetadata call2 = this.f23448l.call();
            if ((call2 == null || !call2.a()) ? false : y.a(this.f23531a, "android.permission.ACCESS_FINE_LOCATION")) {
                if (i10 >= 29 && z10 && (call = this.f23447k.call()) != null && call.d()) {
                    t8 t8Var = i10 >= 29 ? new t8(this) : null;
                    if (t8Var != null) {
                        telephonyManager.requestCellInfoUpdate(this.f22349f.a(), t8Var);
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                    if (allCellInfo != null) {
                        a(s8Var, allCellInfo);
                    }
                } else {
                    a(s8Var, telephonyManager.getCellLocation());
                }
            }
            b((u8) s8Var);
        } catch (Throwable th) {
            if (a(128)) {
                l3.a(th);
            }
        }
    }

    @Override // com.startapp.o6
    public final String c(s8 s8Var) {
        s8 s8Var2 = s8Var;
        if (s8Var2 != null) {
            return s8Var2.f22520a.toString();
        }
        return null;
    }

    @Override // com.startapp.o6
    public final long d() {
        return 60000L;
    }

    @Override // com.startapp.o6
    public final boolean f() {
        Boolean b10 = this.f23446j.a().b();
        if (b10 != null && b10.booleanValue()) {
            TelephonyMetadata call = this.f23447k.call();
            return call != null && call.c();
        }
        return false;
    }

    @Override // com.startapp.o6
    public final void g() {
        b(true);
    }

    public final boolean a(int i10) {
        TelephonyMetadata call = this.f23447k.call();
        call = (call == null || !call.c()) ? null : null;
        return call != null && (call.a() & i10) == i10 && Math.random() < call.b();
    }

    @Override // com.startapp.x1
    public final Object c() {
        return s8.f22519b;
    }

    public static void a(s8 s8Var, CellLocation cellLocation) {
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            s8Var.a(4, com.startapp.a.b(String.valueOf(gsmCellLocation.getCid())));
            s8Var.a(3, com.startapp.a.b(String.valueOf(gsmCellLocation.getLac())));
        } else if (cellLocation instanceof CdmaCellLocation) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
            s8Var.a(1, com.startapp.a.b(String.valueOf(cdmaCellLocation.getBaseStationLatitude())));
            s8Var.a(2, com.startapp.a.b(String.valueOf(cdmaCellLocation.getBaseStationLongitude())));
        }
    }

    public static int a(CellInfo cellInfo) {
        CellSignalStrength cellSignalStrength;
        if (cellInfo instanceof CellInfoCdma) {
            cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoGsm) {
            cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoLte) {
            cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength();
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && (cellInfo instanceof CellInfoNr)) {
                cellSignalStrength = ((CellInfoNr) cellInfo).getCellSignalStrength();
            } else if (i10 >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                cellSignalStrength = ((CellInfoTdscdma) cellInfo).getCellSignalStrength();
            } else {
                cellSignalStrength = (i10 < 18 || !(cellInfo instanceof CellInfoWcdma)) ? null : ((CellInfoWcdma) cellInfo).getCellSignalStrength();
            }
        }
        if (cellSignalStrength != null) {
            return cellSignalStrength.getLevel();
        }
        return 0;
    }

    public static void a(s8 s8Var, List list) {
        CellIdentityWcdma cellIdentity;
        int tac;
        int timingAdvance;
        int tac2;
        CellSignalStrengthGsm cellSignalStrength;
        int timingAdvance2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new a());
        s8Var.a(6, com.startapp.a.b(arrayList.toString()));
        Iterator it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if (z10) {
                z10 = false;
                if (cellInfo instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                    if (cellIdentity2 != null) {
                        int latitude = cellIdentity2.getLatitude();
                        int longitude = cellIdentity2.getLongitude();
                        if (latitude != Integer.MAX_VALUE && longitude != Integer.MAX_VALUE) {
                            s8Var.a(1, com.startapp.a.b(String.valueOf(latitude)));
                            s8Var.a(2, com.startapp.a.b(String.valueOf(longitude)));
                        }
                    }
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity3 = cellInfoGsm.getCellIdentity();
                    if (cellIdentity3 != null) {
                        int lac = cellIdentity3.getLac();
                        if (lac != Integer.MAX_VALUE) {
                            s8Var.a(3, com.startapp.a.b(String.valueOf(lac)));
                        }
                        int cid = cellIdentity3.getCid();
                        if (cid != Integer.MAX_VALUE) {
                            s8Var.a(4, com.startapp.a.b(String.valueOf(cid)));
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26 && (cellSignalStrength = cellInfoGsm.getCellSignalStrength()) != null && (timingAdvance2 = cellSignalStrength.getTimingAdvance()) != Integer.MAX_VALUE) {
                        s8Var.a(13, String.valueOf(timingAdvance2));
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
                    if (cellIdentity4 != null && (tac2 = cellIdentity4.getTac()) != Integer.MAX_VALUE) {
                        s8Var.a(5, com.startapp.a.b(String.valueOf(tac2)));
                    }
                    CellSignalStrengthLte cellSignalStrength2 = cellInfoLte.getCellSignalStrength();
                    if (cellSignalStrength2 != null && (timingAdvance = cellSignalStrength2.getTimingAdvance()) != Integer.MAX_VALUE) {
                        s8Var.a(13, String.valueOf(timingAdvance));
                    }
                } else {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 29 && (cellInfo instanceof CellInfoNr)) {
                        CellIdentityNr cellIdentityNr = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                        if (cellIdentityNr != null && (tac = cellIdentityNr.getTac()) != Integer.MAX_VALUE) {
                            s8Var.a(5, com.startapp.a.b(String.valueOf(tac)));
                        }
                    } else if (i10 >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                        CellIdentityTdscdma cellIdentity5 = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                        if (cellIdentity5 != null) {
                            int lac2 = cellIdentity5.getLac();
                            if (lac2 != Integer.MAX_VALUE) {
                                s8Var.a(3, com.startapp.a.b(String.valueOf(lac2)));
                            }
                            int cid2 = cellIdentity5.getCid();
                            if (cid2 != Integer.MAX_VALUE) {
                                s8Var.a(4, com.startapp.a.b(String.valueOf(cid2)));
                            }
                        }
                    } else if (i10 >= 18 && (cellInfo instanceof CellInfoWcdma) && (cellIdentity = ((CellInfoWcdma) cellInfo).getCellIdentity()) != null) {
                        int lac3 = cellIdentity.getLac();
                        if (lac3 != Integer.MAX_VALUE) {
                            s8Var.a(3, com.startapp.a.b(String.valueOf(lac3)));
                        }
                        int cid3 = cellIdentity.getCid();
                        if (cid3 != Integer.MAX_VALUE) {
                            s8Var.a(4, com.startapp.a.b(String.valueOf(cid3)));
                        }
                    }
                }
            }
            if (!cellInfo.isRegistered()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29 && (cellInfo instanceof CellInfoNr)) {
                s8Var.a(14, 1);
            }
        }
    }
}
