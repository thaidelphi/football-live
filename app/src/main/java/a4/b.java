package a4;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* compiled from: EventMessageEncoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f395a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f396b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.f395a = byteArrayOutputStream;
        this.f396b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f395a.reset();
        try {
            b(this.f396b, eventMessage.f10565a);
            String str = eventMessage.f10566b;
            if (str == null) {
                str = "";
            }
            b(this.f396b, str);
            this.f396b.writeLong(eventMessage.f10567c);
            this.f396b.writeLong(eventMessage.f10568d);
            this.f396b.write(eventMessage.f10569e);
            this.f396b.flush();
            return this.f395a.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }
}
