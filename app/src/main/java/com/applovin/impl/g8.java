package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g8 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7044a;

    /* renamed from: b  reason: collision with root package name */
    private Stack f7045b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f7046c;

    /* renamed from: d  reason: collision with root package name */
    private long f7047d;

    /* renamed from: e  reason: collision with root package name */
    private b f7048e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements ContentHandler {
        a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            String trim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
            if (StringUtils.isValidString(trim)) {
                g8.this.f7046c.append(trim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - g8.this.f7047d;
            com.applovin.impl.sdk.n unused = g8.this.f7044a;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g8.this.f7044a;
                nVar.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            g8 g8Var = g8.this;
            g8Var.f7048e = (b) g8Var.f7045b.pop();
            g8.this.f7048e.d(g8.this.f7046c.toString().trim());
            g8.this.f7046c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.n unused = g8.this.f7044a;
            if (com.applovin.impl.sdk.n.a()) {
                g8.this.f7044a.a("XmlParser", "Begin parsing...");
            }
            g8.this.f7047d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            try {
                b bVar = !g8.this.f7045b.isEmpty() ? (b) g8.this.f7045b.peek() : null;
                b bVar2 = new b(str2, g8.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                g8.this.f7045b.push(bVar2);
            } catch (Exception e8) {
                com.applovin.impl.sdk.n unused = g8.this.f7044a;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = g8.this.f7044a;
                    nVar.a("XmlParser", "Unable to process element <" + str2 + ">", e8);
                }
                throw new SAXException("Failed to start element", e8);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends f8 {
        b(String str, Map map, f8 f8Var) {
            super(str, map, f8Var);
        }

        void a(f8 f8Var) {
            if (f8Var != null) {
                this.f6997e.add(f8Var);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        void d(String str) {
            this.f6996d = str;
        }
    }

    g8(com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            this.f7044a = jVar.I();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public static f8 a(String str, com.applovin.impl.sdk.j jVar) {
        return new g8(jVar).a(str);
    }

    public f8 a(String str) {
        if (str != null) {
            this.f7046c = new StringBuilder();
            this.f7045b = new Stack();
            this.f7048e = null;
            Xml.parse(str, new a());
            b bVar = this.f7048e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(attributes.getQName(i10), attributes.getValue(i10));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
