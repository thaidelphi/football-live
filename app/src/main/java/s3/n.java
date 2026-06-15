package s3;

import a5.p0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: GaplessInfoHolder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f30715c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f30716a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f30717b = -1;

    private boolean b(String str) {
        Matcher matcher = f30715c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) p0.j(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) p0.j(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f30716a = parseInt;
                    this.f30717b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public boolean a() {
        return (this.f30716a == -1 || this.f30717b == -1) ? false : true;
    }

    public boolean c(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            Metadata.Entry d10 = metadata.d(i10);
            if (d10 instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) d10;
                if ("iTunSMPB".equals(commentFrame.f10591c) && b(commentFrame.f10592d)) {
                    return true;
                }
            } else if (d10 instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) d10;
                if ("com.apple.iTunes".equals(internalFrame.f10598b) && "iTunSMPB".equals(internalFrame.f10599c) && b(internalFrame.f10600d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 > 0 || i12 > 0) {
            this.f30716a = i11;
            this.f30717b = i12;
            return true;
        }
        return false;
    }
}
