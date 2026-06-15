package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.extractor.metadata.emsg.EventMessage;
import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class VB {
    public final ByteArrayOutputStream A00 = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
    public final DataOutputStream A01 = new DataOutputStream(this.A00);

    public static void A00(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] A01(EventMessage eventMessage) {
        this.A00.reset();
        try {
            A00(this.A01, eventMessage.A03);
            A00(this.A01, eventMessage.A04 != null ? eventMessage.A04 : "");
            this.A01.writeLong(eventMessage.A01);
            this.A01.writeLong(eventMessage.A02);
            this.A01.write(eventMessage.A05);
            this.A01.flush();
            return this.A00.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }
}
