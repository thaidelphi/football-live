package com.google.android.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C1177Vk;
import com.facebook.ads.redexgen.X.C1179Vm;
import com.facebook.ads.redexgen.X.C1648fq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static String[] A01 = {"QtCZ3YM", "h34NOf9W6vgpobdLQ2oGlEh05TjGRd7m", "HvhGWd1zJYSEGXxl6D7A0DxUnFFCta", "DqPYtjv5NIQ4Rwx", "Z6grTdzpxvdSgrPYmiY2M1", "jLJejEC7jURSysz", "qxEadMmv1usOIAslWwQ5UJE1rpyJ7pzm", "kgSDNEp"};
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C1177Vk();
    public final List<C1179Vm> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(C1179Vm.A01(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C1177Vk c1177Vk) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<C1179Vm> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C1648fq c1648fq) {
        int A0I = c1648fq.A0I();
        ArrayList arrayList = new ArrayList(A0I);
        for (int i10 = 0; i10 < A0I; i10++) {
            arrayList.add(C1179Vm.A03(c1648fq));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            C1179Vm c1179Vm = this.A00.get(i11);
            int i12 = A01[1].charAt(17);
            if (i12 != 50) {
                throw new RuntimeException();
            }
            A01[1] = "yGcUZN1necDQ6oeU22cionB2weilnTqD";
            C1179Vm.A05(c1179Vm, parcel);
        }
    }
}
