package b4;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x5.b;
import y3.d;
import y3.f;
/* compiled from: IcyDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends f {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f5086c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f5087a = b.f32750c.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    private final CharsetDecoder f5088b = b.f32749b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f5087a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f5088b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f5088b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f5087a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // y3.f
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        String c10 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c10 == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f5086c.matcher(c10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e8 = x5.a.e(group);
                e8.hashCode();
                if (e8.equals("streamurl")) {
                    str2 = group2;
                } else if (e8.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
