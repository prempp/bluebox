package com.bluebox.search;

import com.bluebox.smtp.storage.BlueboxMessage;
import org.codehaus.jettison.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Writer;

/**
 * Solr-based search indexer stub.
 * The embedded Solr 8.x library is incompatible with Java 21.
 * This class is retained for source compatibility but is never instantiated at runtime
 * (SearchFactory uses StorageIndexer instead).
 * Upgrade to Solr 9.x or switch to LuceneIndexer to restore full Solr support.
 */
public class SolrIndexer implements SearchIf {
    private static final Logger log = LoggerFactory.getLogger(SolrIndexer.class);

    protected SolrIndexer() throws Exception {
        throw new UnsupportedOperationException(
                "EmbeddedSolrServer is incompatible with Java 21. Use StorageIndexer or LuceneIndexer instead.");
    }

    @Override public void stop() { throw new UnsupportedOperationException(); }
    @Override public Object[] search(String q, SearchUtils.SearchFields f, int s, int c, SearchUtils.SortFields o, boolean a) { throw new UnsupportedOperationException(); }
    @Override public long searchInboxes(String s, Writer w, int st, int c, SearchUtils.SearchFields f, SearchUtils.SortFields o, boolean a) { throw new UnsupportedOperationException(); }
    @Override public void indexMail(BlueboxMessage m, boolean commit) { throw new UnsupportedOperationException(); }
    @Override public void commit(boolean force) { throw new UnsupportedOperationException(); }
    @Override public void deleteDoc(String uid) { throw new UnsupportedOperationException(); }
    @Override public void deleteDoc(String value, SearchUtils.SearchFields field) { throw new UnsupportedOperationException(); }
    @Override public void addDoc(String uid, String inbox, String from, String subject, String text, String html, String recipients, long size, long received) { throw new UnsupportedOperationException(); }
    @Override public void addDoc(String uid, String inbox, String from, String subject, String text, String html, String recipients, long size, long received, boolean commit) { throw new UnsupportedOperationException(); }
    @Override public void deleteIndexes() { throw new UnsupportedOperationException(); }
    @Override public boolean containsUid(String uid) { throw new UnsupportedOperationException(); }
    @Override public JSONArray autoComplete(String hint, long start, long count) { throw new UnsupportedOperationException(); }
}
