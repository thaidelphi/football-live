package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.extractor.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.extractor.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.extractor.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.extractor.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
/* renamed from: com.facebook.ads.redexgen.X.Av  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0670Av extends V4 {
    public static String[] A03 = {"19vB", "3X", "EIRRAej2pEV3OUg2Myb15fGgmDpSgQh5", "gj1tHcIkErwBAgCeuhOE7SbG4J7f6ERO", "aSF7AzokzDFszNe2ZtPe8WfXLNY5ZINi", "Sm4mXwWBzvBeJixiUGKIoDoEwOkS3Cdt", "7PbjfWVSdCpisRBjAgzd0S84WlXGN1Rp", "k88AwpLNrv74AAM"};
    public C1662g4 A00;
    public final C1648fq A02 = new C1648fq();
    public final C1647fp A01 = new C1647fp();

    @Override // com.facebook.ads.redexgen.X.V4
    public final Metadata A0R(Bi bi, ByteBuffer byteBuffer) {
        if (this.A00 == null || bi.A00 != this.A00.A04()) {
            this.A00 = new C1662g4(bi.A01);
            this.A00.A05(bi.A01 - bi.A00);
        }
        byte[] array = byteBuffer.array();
        int size = byteBuffer.limit();
        this.A02.A0j(array, size);
        this.A01.A0E(array, size);
        this.A01.A09(39);
        long ptsAdjustment = (this.A01.A04(1) << 32) | this.A01.A04(32);
        this.A01.A09(20);
        int A04 = this.A01.A04(12);
        int spliceCommandLength = this.A01.A04(8);
        Metadata.Entry entry = null;
        this.A02.A0g(14);
        switch (spliceCommandLength) {
            case 0:
                entry = new SpliceNullCommand();
                break;
            case 4:
                entry = SpliceScheduleCommand.A00(this.A02);
                break;
            case 5:
                entry = SpliceInsertCommand.A00(this.A02, ptsAdjustment, this.A00);
                break;
            case 6:
                entry = TimeSignalCommand.A01(this.A02, ptsAdjustment, this.A00);
                break;
            case 255:
                entry = PrivateCommand.A00(this.A02, A04, ptsAdjustment);
                break;
        }
        String[] strArr = A03;
        if (strArr[1].length() != strArr[0].length()) {
            String[] strArr2 = A03;
            strArr2[5] = "hexrkiKSzEY28p3DHKI338BcmoY5HlMe";
            strArr2[4] = "1VMPpg8ZzorUNeFpuNzYyuvTKk0wVrdW";
            return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
        }
        throw new RuntimeException();
    }
}
