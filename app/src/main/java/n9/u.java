package n9;

import com.ironsource.cc;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: MediaType.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class u {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f28931e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f28932f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    private final String f28933a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28934b;

    /* renamed from: c  reason: collision with root package name */
    private final String f28935c;

    /* renamed from: d  reason: collision with root package name */
    private final String f28936d;

    private u(String str, String str2, String str3, String str4) {
        this.f28933a = str;
        this.f28934b = str2;
        this.f28935c = str3;
        this.f28936d = str4;
    }

    public static u c(String str) {
        Matcher matcher = f28931e.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f28932f.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase(cc.M)) {
                        String group3 = matcher2.group(2);
                        if (group3 != null) {
                            if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                                group3 = group3.substring(1, group3.length() - 1);
                            }
                        } else {
                            group3 = matcher2.group(3);
                        }
                        if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                        str2 = group3;
                    }
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new u(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    public static u d(String str) {
        try {
            return c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public Charset a() {
        return b(null);
    }

    public Charset b(Charset charset) {
        try {
            String str = this.f28936d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && ((u) obj).f28933a.equals(this.f28933a);
    }

    public int hashCode() {
        return this.f28933a.hashCode();
    }

    public String toString() {
        return this.f28933a;
    }
}
