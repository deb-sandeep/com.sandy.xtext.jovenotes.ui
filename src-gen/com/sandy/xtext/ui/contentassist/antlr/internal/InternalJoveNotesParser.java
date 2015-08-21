package com.sandy.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.sandy.xtext.services.JoveNotesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJoveNotesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'{'", "'}'", "'='", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'cmap'", "'@skip_generation'", "'@skip_generation_in_production'", "'@test_paper'", "'hide'", "'skip_reverse_question'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=6;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalJoveNotesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJoveNotesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJoveNotesParser.tokenNames; }
    public String getGrammarFileName() { return "../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g"; }


     
     	private JoveNotesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JoveNotesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleJoveNotes"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:60:1: entryRuleJoveNotes : ruleJoveNotes EOF ;
    public final void entryRuleJoveNotes() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:61:1: ( ruleJoveNotes EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:62:1: ruleJoveNotes EOF
            {
             before(grammarAccess.getJoveNotesRule()); 
            pushFollow(FOLLOW_ruleJoveNotes_in_entryRuleJoveNotes61);
            ruleJoveNotes();

            state._fsp--;

             after(grammarAccess.getJoveNotesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoveNotes68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoveNotes"


    // $ANTLR start "ruleJoveNotes"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:69:1: ruleJoveNotes : ( ( rule__JoveNotes__Group__0 ) ) ;
    public final void ruleJoveNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:73:2: ( ( ( rule__JoveNotes__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:74:1: ( ( rule__JoveNotes__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:74:1: ( ( rule__JoveNotes__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:75:1: ( rule__JoveNotes__Group__0 )
            {
             before(grammarAccess.getJoveNotesAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:76:1: ( rule__JoveNotes__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:76:2: rule__JoveNotes__Group__0
            {
            pushFollow(FOLLOW_rule__JoveNotes__Group__0_in_ruleJoveNotes94);
            rule__JoveNotes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoveNotesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoveNotes"


    // $ANTLR start "entryRuleProcessingHints"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:88:1: entryRuleProcessingHints : ruleProcessingHints EOF ;
    public final void entryRuleProcessingHints() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:89:1: ( ruleProcessingHints EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:90:1: ruleProcessingHints EOF
            {
             before(grammarAccess.getProcessingHintsRule()); 
            pushFollow(FOLLOW_ruleProcessingHints_in_entryRuleProcessingHints121);
            ruleProcessingHints();

            state._fsp--;

             after(grammarAccess.getProcessingHintsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessingHints128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessingHints"


    // $ANTLR start "ruleProcessingHints"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:97:1: ruleProcessingHints : ( ( rule__ProcessingHints__Group__0 ) ) ;
    public final void ruleProcessingHints() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:101:2: ( ( ( rule__ProcessingHints__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:102:1: ( ( rule__ProcessingHints__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:102:1: ( ( rule__ProcessingHints__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:103:1: ( rule__ProcessingHints__Group__0 )
            {
             before(grammarAccess.getProcessingHintsAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:104:1: ( rule__ProcessingHints__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:104:2: rule__ProcessingHints__Group__0
            {
            pushFollow(FOLLOW_rule__ProcessingHints__Group__0_in_ruleProcessingHints154);
            rule__ProcessingHints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessingHintsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessingHints"


    // $ANTLR start "entryRuleChapterDetails"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:116:1: entryRuleChapterDetails : ruleChapterDetails EOF ;
    public final void entryRuleChapterDetails() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:117:1: ( ruleChapterDetails EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:118:1: ruleChapterDetails EOF
            {
             before(grammarAccess.getChapterDetailsRule()); 
            pushFollow(FOLLOW_ruleChapterDetails_in_entryRuleChapterDetails181);
            ruleChapterDetails();

            state._fsp--;

             after(grammarAccess.getChapterDetailsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapterDetails188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChapterDetails"


    // $ANTLR start "ruleChapterDetails"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:125:1: ruleChapterDetails : ( ( rule__ChapterDetails__Group__0 ) ) ;
    public final void ruleChapterDetails() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:129:2: ( ( ( rule__ChapterDetails__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:130:1: ( ( rule__ChapterDetails__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:130:1: ( ( rule__ChapterDetails__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:131:1: ( rule__ChapterDetails__Group__0 )
            {
             before(grammarAccess.getChapterDetailsAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:132:1: ( rule__ChapterDetails__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:132:2: rule__ChapterDetails__Group__0
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__0_in_ruleChapterDetails214);
            rule__ChapterDetails__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChapterDetails"


    // $ANTLR start "entryRuleNotesElement"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:144:1: entryRuleNotesElement : ruleNotesElement EOF ;
    public final void entryRuleNotesElement() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:145:1: ( ruleNotesElement EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:146:1: ruleNotesElement EOF
            {
             before(grammarAccess.getNotesElementRule()); 
            pushFollow(FOLLOW_ruleNotesElement_in_entryRuleNotesElement241);
            ruleNotesElement();

            state._fsp--;

             after(grammarAccess.getNotesElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotesElement248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotesElement"


    // $ANTLR start "ruleNotesElement"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:153:1: ruleNotesElement : ( ( rule__NotesElement__Alternatives ) ) ;
    public final void ruleNotesElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:157:2: ( ( ( rule__NotesElement__Alternatives ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:158:1: ( ( rule__NotesElement__Alternatives ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:158:1: ( ( rule__NotesElement__Alternatives ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:159:1: ( rule__NotesElement__Alternatives )
            {
             before(grammarAccess.getNotesElementAccess().getAlternatives()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:160:1: ( rule__NotesElement__Alternatives )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:160:2: rule__NotesElement__Alternatives
            {
            pushFollow(FOLLOW_rule__NotesElement__Alternatives_in_ruleNotesElement274);
            rule__NotesElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotesElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotesElement"


    // $ANTLR start "entryRuleWordMeaning"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:172:1: entryRuleWordMeaning : ruleWordMeaning EOF ;
    public final void entryRuleWordMeaning() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:173:1: ( ruleWordMeaning EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:174:1: ruleWordMeaning EOF
            {
             before(grammarAccess.getWordMeaningRule()); 
            pushFollow(FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning301);
            ruleWordMeaning();

            state._fsp--;

             after(grammarAccess.getWordMeaningRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMeaning308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWordMeaning"


    // $ANTLR start "ruleWordMeaning"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:181:1: ruleWordMeaning : ( ( rule__WordMeaning__Group__0 ) ) ;
    public final void ruleWordMeaning() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:185:2: ( ( ( rule__WordMeaning__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:186:1: ( ( rule__WordMeaning__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:186:1: ( ( rule__WordMeaning__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:187:1: ( rule__WordMeaning__Group__0 )
            {
             before(grammarAccess.getWordMeaningAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:188:1: ( rule__WordMeaning__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:188:2: rule__WordMeaning__Group__0
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__0_in_ruleWordMeaning334);
            rule__WordMeaning__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWordMeaningAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWordMeaning"


    // $ANTLR start "entryRuleQuestionAnswer"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:200:1: entryRuleQuestionAnswer : ruleQuestionAnswer EOF ;
    public final void entryRuleQuestionAnswer() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:201:1: ( ruleQuestionAnswer EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:202:1: ruleQuestionAnswer EOF
            {
             before(grammarAccess.getQuestionAnswerRule()); 
            pushFollow(FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer361);
            ruleQuestionAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAnswerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionAnswer368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionAnswer"


    // $ANTLR start "ruleQuestionAnswer"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:209:1: ruleQuestionAnswer : ( ( rule__QuestionAnswer__Group__0 ) ) ;
    public final void ruleQuestionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:213:2: ( ( ( rule__QuestionAnswer__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:214:1: ( ( rule__QuestionAnswer__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:214:1: ( ( rule__QuestionAnswer__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:215:1: ( rule__QuestionAnswer__Group__0 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:216:1: ( rule__QuestionAnswer__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:216:2: rule__QuestionAnswer__Group__0
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__0_in_ruleQuestionAnswer394);
            rule__QuestionAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionAnswer"


    // $ANTLR start "entryRuleFIB"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:228:1: entryRuleFIB : ruleFIB EOF ;
    public final void entryRuleFIB() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:229:1: ( ruleFIB EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:230:1: ruleFIB EOF
            {
             before(grammarAccess.getFIBRule()); 
            pushFollow(FOLLOW_ruleFIB_in_entryRuleFIB421);
            ruleFIB();

            state._fsp--;

             after(grammarAccess.getFIBRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFIB428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFIB"


    // $ANTLR start "ruleFIB"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:237:1: ruleFIB : ( ( rule__FIB__Group__0 ) ) ;
    public final void ruleFIB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:241:2: ( ( ( rule__FIB__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:242:1: ( ( rule__FIB__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:242:1: ( ( rule__FIB__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:243:1: ( rule__FIB__Group__0 )
            {
             before(grammarAccess.getFIBAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:244:1: ( rule__FIB__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:244:2: rule__FIB__Group__0
            {
            pushFollow(FOLLOW_rule__FIB__Group__0_in_ruleFIB454);
            rule__FIB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFIB"


    // $ANTLR start "entryRuleDefinition"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:256:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:257:1: ( ruleDefinition EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:258:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition481);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:265:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:269:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:270:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:270:1: ( ( rule__Definition__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:271:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:272:1: ( rule__Definition__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:272:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition514);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleCharacter"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:284:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:285:1: ( ruleCharacter EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:286:1: ruleCharacter EOF
            {
             before(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter541);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getCharacterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:293:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:297:2: ( ( ( rule__Character__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:298:1: ( ( rule__Character__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:298:1: ( ( rule__Character__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:299:1: ( rule__Character__Group__0 )
            {
             before(grammarAccess.getCharacterAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:300:1: ( rule__Character__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:300:2: rule__Character__Group__0
            {
            pushFollow(FOLLOW_rule__Character__Group__0_in_ruleCharacter574);
            rule__Character__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleTeacherNote"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:312:1: entryRuleTeacherNote : ruleTeacherNote EOF ;
    public final void entryRuleTeacherNote() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:313:1: ( ruleTeacherNote EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:314:1: ruleTeacherNote EOF
            {
             before(grammarAccess.getTeacherNoteRule()); 
            pushFollow(FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote601);
            ruleTeacherNote();

            state._fsp--;

             after(grammarAccess.getTeacherNoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTeacherNote608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeacherNote"


    // $ANTLR start "ruleTeacherNote"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:321:1: ruleTeacherNote : ( ( rule__TeacherNote__Group__0 ) ) ;
    public final void ruleTeacherNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:325:2: ( ( ( rule__TeacherNote__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:326:1: ( ( rule__TeacherNote__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:326:1: ( ( rule__TeacherNote__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:327:1: ( rule__TeacherNote__Group__0 )
            {
             before(grammarAccess.getTeacherNoteAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:328:1: ( rule__TeacherNote__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:328:2: rule__TeacherNote__Group__0
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__0_in_ruleTeacherNote634);
            rule__TeacherNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeacherNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeacherNote"


    // $ANTLR start "entryRuleMatching"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:340:1: entryRuleMatching : ruleMatching EOF ;
    public final void entryRuleMatching() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:341:1: ( ruleMatching EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:342:1: ruleMatching EOF
            {
             before(grammarAccess.getMatchingRule()); 
            pushFollow(FOLLOW_ruleMatching_in_entryRuleMatching661);
            ruleMatching();

            state._fsp--;

             after(grammarAccess.getMatchingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatching668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatching"


    // $ANTLR start "ruleMatching"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:349:1: ruleMatching : ( ( rule__Matching__Group__0 ) ) ;
    public final void ruleMatching() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:353:2: ( ( ( rule__Matching__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:354:1: ( ( rule__Matching__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:354:1: ( ( rule__Matching__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:355:1: ( rule__Matching__Group__0 )
            {
             before(grammarAccess.getMatchingAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:356:1: ( rule__Matching__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:356:2: rule__Matching__Group__0
            {
            pushFollow(FOLLOW_rule__Matching__Group__0_in_ruleMatching694);
            rule__Matching__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatching"


    // $ANTLR start "entryRuleMatchPair"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:368:1: entryRuleMatchPair : ruleMatchPair EOF ;
    public final void entryRuleMatchPair() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:369:1: ( ruleMatchPair EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:370:1: ruleMatchPair EOF
            {
             before(grammarAccess.getMatchPairRule()); 
            pushFollow(FOLLOW_ruleMatchPair_in_entryRuleMatchPair721);
            ruleMatchPair();

            state._fsp--;

             after(grammarAccess.getMatchPairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchPair728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatchPair"


    // $ANTLR start "ruleMatchPair"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:377:1: ruleMatchPair : ( ( rule__MatchPair__Group__0 ) ) ;
    public final void ruleMatchPair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:381:2: ( ( ( rule__MatchPair__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:382:1: ( ( rule__MatchPair__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:382:1: ( ( rule__MatchPair__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:383:1: ( rule__MatchPair__Group__0 )
            {
             before(grammarAccess.getMatchPairAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:384:1: ( rule__MatchPair__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:384:2: rule__MatchPair__Group__0
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__0_in_ruleMatchPair754);
            rule__MatchPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchPair"


    // $ANTLR start "entryRuleEvent"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:396:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:397:1: ( ruleEvent EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:398:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent781);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:405:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:409:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:410:1: ( ( rule__Event__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:410:1: ( ( rule__Event__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:411:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:412:1: ( rule__Event__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:412:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent814);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTrueFalse"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:424:1: entryRuleTrueFalse : ruleTrueFalse EOF ;
    public final void entryRuleTrueFalse() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:425:1: ( ruleTrueFalse EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:426:1: ruleTrueFalse EOF
            {
             before(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse841);
            ruleTrueFalse();

            state._fsp--;

             after(grammarAccess.getTrueFalseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueFalse848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrueFalse"


    // $ANTLR start "ruleTrueFalse"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:433:1: ruleTrueFalse : ( ( rule__TrueFalse__Group__0 ) ) ;
    public final void ruleTrueFalse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:437:2: ( ( ( rule__TrueFalse__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:438:1: ( ( rule__TrueFalse__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:438:1: ( ( rule__TrueFalse__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:439:1: ( rule__TrueFalse__Group__0 )
            {
             before(grammarAccess.getTrueFalseAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:440:1: ( rule__TrueFalse__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:440:2: rule__TrueFalse__Group__0
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__0_in_ruleTrueFalse874);
            rule__TrueFalse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueFalseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueFalse"


    // $ANTLR start "entryRuleChemEquation"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:452:1: entryRuleChemEquation : ruleChemEquation EOF ;
    public final void entryRuleChemEquation() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:453:1: ( ruleChemEquation EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:454:1: ruleChemEquation EOF
            {
             before(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_ruleChemEquation_in_entryRuleChemEquation901);
            ruleChemEquation();

            state._fsp--;

             after(grammarAccess.getChemEquationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemEquation908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChemEquation"


    // $ANTLR start "ruleChemEquation"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:461:1: ruleChemEquation : ( ( rule__ChemEquation__Group__0 ) ) ;
    public final void ruleChemEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:465:2: ( ( ( rule__ChemEquation__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:466:1: ( ( rule__ChemEquation__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:466:1: ( ( rule__ChemEquation__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:467:1: ( rule__ChemEquation__Group__0 )
            {
             before(grammarAccess.getChemEquationAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:468:1: ( rule__ChemEquation__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:468:2: rule__ChemEquation__Group__0
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__0_in_ruleChemEquation934);
            rule__ChemEquation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChemEquationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemEquation"


    // $ANTLR start "entryRuleChemCompound"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:480:1: entryRuleChemCompound : ruleChemCompound EOF ;
    public final void entryRuleChemCompound() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:481:1: ( ruleChemCompound EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:482:1: ruleChemCompound EOF
            {
             before(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_ruleChemCompound_in_entryRuleChemCompound961);
            ruleChemCompound();

            state._fsp--;

             after(grammarAccess.getChemCompoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemCompound968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChemCompound"


    // $ANTLR start "ruleChemCompound"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:489:1: ruleChemCompound : ( ( rule__ChemCompound__Group__0 ) ) ;
    public final void ruleChemCompound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:493:2: ( ( ( rule__ChemCompound__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:494:1: ( ( rule__ChemCompound__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:494:1: ( ( rule__ChemCompound__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:495:1: ( rule__ChemCompound__Group__0 )
            {
             before(grammarAccess.getChemCompoundAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:496:1: ( rule__ChemCompound__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:496:2: rule__ChemCompound__Group__0
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__0_in_ruleChemCompound994);
            rule__ChemCompound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChemCompoundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemCompound"


    // $ANTLR start "entryRuleSpellbee"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:508:1: entryRuleSpellbee : ruleSpellbee EOF ;
    public final void entryRuleSpellbee() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:509:1: ( ruleSpellbee EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:510:1: ruleSpellbee EOF
            {
             before(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_ruleSpellbee_in_entryRuleSpellbee1021);
            ruleSpellbee();

            state._fsp--;

             after(grammarAccess.getSpellbeeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpellbee1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpellbee"


    // $ANTLR start "ruleSpellbee"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:517:1: ruleSpellbee : ( ( rule__Spellbee__Group__0 ) ) ;
    public final void ruleSpellbee() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:521:2: ( ( ( rule__Spellbee__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:522:1: ( ( rule__Spellbee__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:522:1: ( ( rule__Spellbee__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:523:1: ( rule__Spellbee__Group__0 )
            {
             before(grammarAccess.getSpellbeeAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:524:1: ( rule__Spellbee__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:524:2: rule__Spellbee__Group__0
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__0_in_ruleSpellbee1054);
            rule__Spellbee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpellbeeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpellbee"


    // $ANTLR start "entryRuleImageLabel"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:536:1: entryRuleImageLabel : ruleImageLabel EOF ;
    public final void entryRuleImageLabel() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:537:1: ( ruleImageLabel EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:538:1: ruleImageLabel EOF
            {
             before(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_ruleImageLabel_in_entryRuleImageLabel1081);
            ruleImageLabel();

            state._fsp--;

             after(grammarAccess.getImageLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageLabel1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImageLabel"


    // $ANTLR start "ruleImageLabel"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:545:1: ruleImageLabel : ( ( rule__ImageLabel__Group__0 ) ) ;
    public final void ruleImageLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:549:2: ( ( ( rule__ImageLabel__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:550:1: ( ( rule__ImageLabel__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:550:1: ( ( rule__ImageLabel__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:551:1: ( rule__ImageLabel__Group__0 )
            {
             before(grammarAccess.getImageLabelAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:552:1: ( rule__ImageLabel__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:552:2: rule__ImageLabel__Group__0
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__0_in_ruleImageLabel1114);
            rule__ImageLabel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageLabel"


    // $ANTLR start "entryRuleHotSpot"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:564:1: entryRuleHotSpot : ruleHotSpot EOF ;
    public final void entryRuleHotSpot() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:565:1: ( ruleHotSpot EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:566:1: ruleHotSpot EOF
            {
             before(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_ruleHotSpot_in_entryRuleHotSpot1141);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getHotSpotRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHotSpot1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHotSpot"


    // $ANTLR start "ruleHotSpot"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:573:1: ruleHotSpot : ( ( rule__HotSpot__Group__0 ) ) ;
    public final void ruleHotSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:577:2: ( ( ( rule__HotSpot__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:578:1: ( ( rule__HotSpot__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:578:1: ( ( rule__HotSpot__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:579:1: ( rule__HotSpot__Group__0 )
            {
             before(grammarAccess.getHotSpotAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:580:1: ( rule__HotSpot__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:580:2: rule__HotSpot__Group__0
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__0_in_ruleHotSpot1174);
            rule__HotSpot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHotSpotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHotSpot"


    // $ANTLR start "entryRuleEquation"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:592:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:593:1: ( ruleEquation EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:594:1: ruleEquation EOF
            {
             before(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation1201);
            ruleEquation();

            state._fsp--;

             after(grammarAccess.getEquationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:601:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:605:2: ( ( ( rule__Equation__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:606:1: ( ( rule__Equation__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:606:1: ( ( rule__Equation__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:607:1: ( rule__Equation__Group__0 )
            {
             before(grammarAccess.getEquationAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:608:1: ( rule__Equation__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:608:2: rule__Equation__Group__0
            {
            pushFollow(FOLLOW_rule__Equation__Group__0_in_ruleEquation1234);
            rule__Equation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleEqSymbol"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:620:1: entryRuleEqSymbol : ruleEqSymbol EOF ;
    public final void entryRuleEqSymbol() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:621:1: ( ruleEqSymbol EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:622:1: ruleEqSymbol EOF
            {
             before(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol1261);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEqSymbolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqSymbol1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqSymbol"


    // $ANTLR start "ruleEqSymbol"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:629:1: ruleEqSymbol : ( ( rule__EqSymbol__Group__0 ) ) ;
    public final void ruleEqSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:633:2: ( ( ( rule__EqSymbol__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:634:1: ( ( rule__EqSymbol__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:634:1: ( ( rule__EqSymbol__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:635:1: ( rule__EqSymbol__Group__0 )
            {
             before(grammarAccess.getEqSymbolAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:636:1: ( rule__EqSymbol__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:636:2: rule__EqSymbol__Group__0
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__0_in_ruleEqSymbol1294);
            rule__EqSymbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqSymbolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqSymbol"


    // $ANTLR start "entryRuleRefToContext"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:648:1: entryRuleRefToContext : ruleRefToContext EOF ;
    public final void entryRuleRefToContext() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:649:1: ( ruleRefToContext EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:650:1: ruleRefToContext EOF
            {
             before(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_ruleRefToContext_in_entryRuleRefToContext1321);
            ruleRefToContext();

            state._fsp--;

             after(grammarAccess.getRefToContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefToContext1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefToContext"


    // $ANTLR start "ruleRefToContext"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:657:1: ruleRefToContext : ( ( rule__RefToContext__Group__0 ) ) ;
    public final void ruleRefToContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:661:2: ( ( ( rule__RefToContext__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:662:1: ( ( rule__RefToContext__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:662:1: ( ( rule__RefToContext__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:663:1: ( rule__RefToContext__Group__0 )
            {
             before(grammarAccess.getRefToContextAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:664:1: ( rule__RefToContext__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:664:2: rule__RefToContext__Group__0
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__0_in_ruleRefToContext1354);
            rule__RefToContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefToContext"


    // $ANTLR start "entryRuleCMap"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:676:1: entryRuleCMap : ruleCMap EOF ;
    public final void entryRuleCMap() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:677:1: ( ruleCMap EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:678:1: ruleCMap EOF
            {
             before(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_ruleCMap_in_entryRuleCMap1381);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getCMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCMap1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCMap"


    // $ANTLR start "ruleCMap"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:685:1: ruleCMap : ( ( rule__CMap__Group__0 ) ) ;
    public final void ruleCMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:689:2: ( ( ( rule__CMap__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:690:1: ( ( rule__CMap__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:690:1: ( ( rule__CMap__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:691:1: ( rule__CMap__Group__0 )
            {
             before(grammarAccess.getCMapAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:692:1: ( rule__CMap__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:692:2: rule__CMap__Group__0
            {
            pushFollow(FOLLOW_rule__CMap__Group__0_in_ruleCMap1414);
            rule__CMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCMap"


    // $ANTLR start "rule__NotesElement__Alternatives"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:704:1: rule__NotesElement__Alternatives : ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleSpellbee ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleRefToContext ) );
    public final void rule__NotesElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:708:1: ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleSpellbee ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleRefToContext ) )
            int alt1=15;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            case 21:
                {
                alt1=6;
                }
                break;
            case 22:
                {
                alt1=7;
                }
                break;
            case 26:
                {
                alt1=8;
                }
                break;
            case 27:
                {
                alt1=9;
                }
                break;
            case 28:
                {
                alt1=10;
                }
                break;
            case 30:
                {
                alt1=11;
                }
                break;
            case 31:
                {
                alt1=12;
                }
                break;
            case 32:
                {
                alt1=13;
                }
                break;
            case 35:
                {
                alt1=14;
                }
                break;
            case 37:
                {
                alt1=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:709:1: ( ruleWordMeaning )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:709:1: ( ruleWordMeaning )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:710:1: ruleWordMeaning
                    {
                     before(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWordMeaning_in_rule__NotesElement__Alternatives1450);
                    ruleWordMeaning();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:715:6: ( ruleQuestionAnswer )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:715:6: ( ruleQuestionAnswer )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:716:1: ruleQuestionAnswer
                    {
                     before(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQuestionAnswer_in_rule__NotesElement__Alternatives1467);
                    ruleQuestionAnswer();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:721:6: ( ruleFIB )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:721:6: ( ruleFIB )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:722:1: ruleFIB
                    {
                     before(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFIB_in_rule__NotesElement__Alternatives1484);
                    ruleFIB();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:727:6: ( ruleDefinition )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:727:6: ( ruleDefinition )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:728:1: ruleDefinition
                    {
                     before(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDefinition_in_rule__NotesElement__Alternatives1501);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:733:6: ( ruleCharacter )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:733:6: ( ruleCharacter )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:734:1: ruleCharacter
                    {
                     before(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCharacter_in_rule__NotesElement__Alternatives1518);
                    ruleCharacter();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:739:6: ( ruleTeacherNote )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:739:6: ( ruleTeacherNote )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:740:1: ruleTeacherNote
                    {
                     before(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTeacherNote_in_rule__NotesElement__Alternatives1535);
                    ruleTeacherNote();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:745:6: ( ruleMatching )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:745:6: ( ruleMatching )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:746:1: ruleMatching
                    {
                     before(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleMatching_in_rule__NotesElement__Alternatives1552);
                    ruleMatching();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:751:6: ( ruleEvent )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:751:6: ( ruleEvent )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:752:1: ruleEvent
                    {
                     before(grammarAccess.getNotesElementAccess().getEventParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleEvent_in_rule__NotesElement__Alternatives1569);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getEventParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:757:6: ( ruleTrueFalse )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:757:6: ( ruleTrueFalse )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:758:1: ruleTrueFalse
                    {
                     before(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleTrueFalse_in_rule__NotesElement__Alternatives1586);
                    ruleTrueFalse();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:763:6: ( ruleChemEquation )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:763:6: ( ruleChemEquation )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:764:1: ruleChemEquation
                    {
                     before(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleChemEquation_in_rule__NotesElement__Alternatives1603);
                    ruleChemEquation();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:769:6: ( ruleChemCompound )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:769:6: ( ruleChemCompound )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:770:1: ruleChemCompound
                    {
                     before(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleChemCompound_in_rule__NotesElement__Alternatives1620);
                    ruleChemCompound();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:775:6: ( ruleSpellbee )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:775:6: ( ruleSpellbee )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:776:1: ruleSpellbee
                    {
                     before(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleSpellbee_in_rule__NotesElement__Alternatives1637);
                    ruleSpellbee();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:781:6: ( ruleImageLabel )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:781:6: ( ruleImageLabel )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:782:1: ruleImageLabel
                    {
                     before(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleImageLabel_in_rule__NotesElement__Alternatives1654);
                    ruleImageLabel();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:787:6: ( ruleEquation )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:787:6: ( ruleEquation )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:788:1: ruleEquation
                    {
                     before(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_13()); 
                    pushFollow(FOLLOW_ruleEquation_in_rule__NotesElement__Alternatives1671);
                    ruleEquation();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:793:6: ( ruleRefToContext )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:793:6: ( ruleRefToContext )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:794:1: ruleRefToContext
                    {
                     before(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_14()); 
                    pushFollow(FOLLOW_ruleRefToContext_in_rule__NotesElement__Alternatives1688);
                    ruleRefToContext();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_14()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__Alternatives"


    // $ANTLR start "rule__JoveNotes__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:806:1: rule__JoveNotes__Group__0 : rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1 ;
    public final void rule__JoveNotes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:810:1: ( rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:811:2: rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1
            {
            pushFollow(FOLLOW_rule__JoveNotes__Group__0__Impl_in_rule__JoveNotes__Group__01718);
            rule__JoveNotes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoveNotes__Group__1_in_rule__JoveNotes__Group__01721);
            rule__JoveNotes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__0"


    // $ANTLR start "rule__JoveNotes__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:818:1: rule__JoveNotes__Group__0__Impl : ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) ) ;
    public final void rule__JoveNotes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:822:1: ( ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:823:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:823:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:824:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:825:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:825:2: rule__JoveNotes__ProcessingHintsAssignment_0
            {
            pushFollow(FOLLOW_rule__JoveNotes__ProcessingHintsAssignment_0_in_rule__JoveNotes__Group__0__Impl1748);
            rule__JoveNotes__ProcessingHintsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoveNotesAccess().getProcessingHintsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__0__Impl"


    // $ANTLR start "rule__JoveNotes__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:835:1: rule__JoveNotes__Group__1 : rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2 ;
    public final void rule__JoveNotes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:839:1: ( rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:840:2: rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2
            {
            pushFollow(FOLLOW_rule__JoveNotes__Group__1__Impl_in_rule__JoveNotes__Group__11778);
            rule__JoveNotes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoveNotes__Group__2_in_rule__JoveNotes__Group__11781);
            rule__JoveNotes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__1"


    // $ANTLR start "rule__JoveNotes__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:847:1: rule__JoveNotes__Group__1__Impl : ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) ) ;
    public final void rule__JoveNotes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:851:1: ( ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:852:1: ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:852:1: ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:853:1: ( rule__JoveNotes__ChapterDetailsAssignment_1 )
            {
             before(grammarAccess.getJoveNotesAccess().getChapterDetailsAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:854:1: ( rule__JoveNotes__ChapterDetailsAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:854:2: rule__JoveNotes__ChapterDetailsAssignment_1
            {
            pushFollow(FOLLOW_rule__JoveNotes__ChapterDetailsAssignment_1_in_rule__JoveNotes__Group__1__Impl1808);
            rule__JoveNotes__ChapterDetailsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJoveNotesAccess().getChapterDetailsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__1__Impl"


    // $ANTLR start "rule__JoveNotes__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:864:1: rule__JoveNotes__Group__2 : rule__JoveNotes__Group__2__Impl ;
    public final void rule__JoveNotes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:868:1: ( rule__JoveNotes__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:869:2: rule__JoveNotes__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JoveNotes__Group__2__Impl_in_rule__JoveNotes__Group__21838);
            rule__JoveNotes__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__2"


    // $ANTLR start "rule__JoveNotes__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:875:1: rule__JoveNotes__Group__2__Impl : ( ( rule__JoveNotes__NotesElementsAssignment_2 )* ) ;
    public final void rule__JoveNotes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:879:1: ( ( ( rule__JoveNotes__NotesElementsAssignment_2 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:880:1: ( ( rule__JoveNotes__NotesElementsAssignment_2 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:880:1: ( ( rule__JoveNotes__NotesElementsAssignment_2 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:881:1: ( rule__JoveNotes__NotesElementsAssignment_2 )*
            {
             before(grammarAccess.getJoveNotesAccess().getNotesElementsAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:882:1: ( rule__JoveNotes__NotesElementsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=22)||(LA2_0>=26 && LA2_0<=28)||(LA2_0>=30 && LA2_0<=32)||LA2_0==35||LA2_0==37) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:882:2: rule__JoveNotes__NotesElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__JoveNotes__NotesElementsAssignment_2_in_rule__JoveNotes__Group__2__Impl1865);
            	    rule__JoveNotes__NotesElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getJoveNotesAccess().getNotesElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__Group__2__Impl"


    // $ANTLR start "rule__ProcessingHints__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:898:1: rule__ProcessingHints__Group__0 : rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1 ;
    public final void rule__ProcessingHints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:902:1: ( rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:903:2: rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1
            {
            pushFollow(FOLLOW_rule__ProcessingHints__Group__0__Impl_in_rule__ProcessingHints__Group__01902);
            rule__ProcessingHints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessingHints__Group__1_in_rule__ProcessingHints__Group__01905);
            rule__ProcessingHints__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__0"


    // $ANTLR start "rule__ProcessingHints__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:910:1: rule__ProcessingHints__Group__0__Impl : ( () ) ;
    public final void rule__ProcessingHints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:914:1: ( ( () ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:915:1: ( () )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:915:1: ( () )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:916:1: ()
            {
             before(grammarAccess.getProcessingHintsAccess().getProcessingHintsAction_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:917:1: ()
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:919:1: 
            {
            }

             after(grammarAccess.getProcessingHintsAccess().getProcessingHintsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__0__Impl"


    // $ANTLR start "rule__ProcessingHints__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:929:1: rule__ProcessingHints__Group__1 : rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2 ;
    public final void rule__ProcessingHints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:933:1: ( rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:934:2: rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2
            {
            pushFollow(FOLLOW_rule__ProcessingHints__Group__1__Impl_in_rule__ProcessingHints__Group__11963);
            rule__ProcessingHints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessingHints__Group__2_in_rule__ProcessingHints__Group__11966);
            rule__ProcessingHints__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__1"


    // $ANTLR start "rule__ProcessingHints__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:941:1: rule__ProcessingHints__Group__1__Impl : ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? ) ;
    public final void rule__ProcessingHints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:945:1: ( ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:946:1: ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:946:1: ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:947:1: ( rule__ProcessingHints__SkipGenerationAssignment_1 )?
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:948:1: ( rule__ProcessingHints__SkipGenerationAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:948:2: rule__ProcessingHints__SkipGenerationAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ProcessingHints__SkipGenerationAssignment_1_in_rule__ProcessingHints__Group__1__Impl1993);
                    rule__ProcessingHints__SkipGenerationAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__1__Impl"


    // $ANTLR start "rule__ProcessingHints__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:958:1: rule__ProcessingHints__Group__2 : rule__ProcessingHints__Group__2__Impl ;
    public final void rule__ProcessingHints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:962:1: ( rule__ProcessingHints__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:963:2: rule__ProcessingHints__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProcessingHints__Group__2__Impl_in_rule__ProcessingHints__Group__22024);
            rule__ProcessingHints__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__2"


    // $ANTLR start "rule__ProcessingHints__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:969:1: rule__ProcessingHints__Group__2__Impl : ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? ) ;
    public final void rule__ProcessingHints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:973:1: ( ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:974:1: ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:974:1: ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:975:1: ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )?
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:976:1: ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:976:2: rule__ProcessingHints__SkipGenerationInProductionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ProcessingHints__SkipGenerationInProductionAssignment_2_in_rule__ProcessingHints__Group__2__Impl2051);
                    rule__ProcessingHints__SkipGenerationInProductionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__Group__2__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:992:1: rule__ChapterDetails__Group__0 : rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 ;
    public final void rule__ChapterDetails__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:996:1: ( rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:997:2: rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__0__Impl_in_rule__ChapterDetails__Group__02088);
            rule__ChapterDetails__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__1_in_rule__ChapterDetails__Group__02091);
            rule__ChapterDetails__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__0"


    // $ANTLR start "rule__ChapterDetails__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1004:1: rule__ChapterDetails__Group__0__Impl : ( ( rule__ChapterDetails__TestPaperAssignment_0 )? ) ;
    public final void rule__ChapterDetails__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1008:1: ( ( ( rule__ChapterDetails__TestPaperAssignment_0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1009:1: ( ( rule__ChapterDetails__TestPaperAssignment_0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1009:1: ( ( rule__ChapterDetails__TestPaperAssignment_0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1010:1: ( rule__ChapterDetails__TestPaperAssignment_0 )?
            {
             before(grammarAccess.getChapterDetailsAccess().getTestPaperAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1011:1: ( rule__ChapterDetails__TestPaperAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1011:2: rule__ChapterDetails__TestPaperAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ChapterDetails__TestPaperAssignment_0_in_rule__ChapterDetails__Group__0__Impl2118);
                    rule__ChapterDetails__TestPaperAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterDetailsAccess().getTestPaperAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__0__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1021:1: rule__ChapterDetails__Group__1 : rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 ;
    public final void rule__ChapterDetails__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1025:1: ( rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1026:2: rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__1__Impl_in_rule__ChapterDetails__Group__12149);
            rule__ChapterDetails__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__2_in_rule__ChapterDetails__Group__12152);
            rule__ChapterDetails__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__1"


    // $ANTLR start "rule__ChapterDetails__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1033:1: rule__ChapterDetails__Group__1__Impl : ( 'subject' ) ;
    public final void rule__ChapterDetails__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1037:1: ( ( 'subject' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1038:1: ( 'subject' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1038:1: ( 'subject' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1039:1: 'subject'
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__ChapterDetails__Group__1__Impl2180); 
             after(grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__1__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1052:1: rule__ChapterDetails__Group__2 : rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 ;
    public final void rule__ChapterDetails__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1056:1: ( rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1057:2: rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__2__Impl_in_rule__ChapterDetails__Group__22211);
            rule__ChapterDetails__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__3_in_rule__ChapterDetails__Group__22214);
            rule__ChapterDetails__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__2"


    // $ANTLR start "rule__ChapterDetails__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1064:1: rule__ChapterDetails__Group__2__Impl : ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) ;
    public final void rule__ChapterDetails__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1068:1: ( ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1069:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1069:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1070:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1071:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1071:2: rule__ChapterDetails__SubjectNameAssignment_2
            {
            pushFollow(FOLLOW_rule__ChapterDetails__SubjectNameAssignment_2_in_rule__ChapterDetails__Group__2__Impl2241);
            rule__ChapterDetails__SubjectNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getSubjectNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__2__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1081:1: rule__ChapterDetails__Group__3 : rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 ;
    public final void rule__ChapterDetails__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1085:1: ( rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1086:2: rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__3__Impl_in_rule__ChapterDetails__Group__32271);
            rule__ChapterDetails__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__4_in_rule__ChapterDetails__Group__32274);
            rule__ChapterDetails__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__3"


    // $ANTLR start "rule__ChapterDetails__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1093:1: rule__ChapterDetails__Group__3__Impl : ( 'chapterNumber' ) ;
    public final void rule__ChapterDetails__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1097:1: ( ( 'chapterNumber' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1098:1: ( 'chapterNumber' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1098:1: ( 'chapterNumber' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1099:1: 'chapterNumber'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__ChapterDetails__Group__3__Impl2302); 
             after(grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__3__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1112:1: rule__ChapterDetails__Group__4 : rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 ;
    public final void rule__ChapterDetails__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1116:1: ( rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1117:2: rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__4__Impl_in_rule__ChapterDetails__Group__42333);
            rule__ChapterDetails__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__5_in_rule__ChapterDetails__Group__42336);
            rule__ChapterDetails__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__4"


    // $ANTLR start "rule__ChapterDetails__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1124:1: rule__ChapterDetails__Group__4__Impl : ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) ;
    public final void rule__ChapterDetails__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1128:1: ( ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1129:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1129:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1130:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1131:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1131:2: rule__ChapterDetails__ChapterNumberAssignment_4
            {
            pushFollow(FOLLOW_rule__ChapterDetails__ChapterNumberAssignment_4_in_rule__ChapterDetails__Group__4__Impl2363);
            rule__ChapterDetails__ChapterNumberAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getChapterNumberAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__4__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1141:1: rule__ChapterDetails__Group__5 : rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 ;
    public final void rule__ChapterDetails__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1145:1: ( rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1146:2: rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__5__Impl_in_rule__ChapterDetails__Group__52393);
            rule__ChapterDetails__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__6_in_rule__ChapterDetails__Group__52396);
            rule__ChapterDetails__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__5"


    // $ANTLR start "rule__ChapterDetails__Group__5__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1153:1: rule__ChapterDetails__Group__5__Impl : ( '.' ) ;
    public final void rule__ChapterDetails__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1157:1: ( ( '.' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1158:1: ( '.' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1158:1: ( '.' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1159:1: '.'
            {
             before(grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__ChapterDetails__Group__5__Impl2424); 
             after(grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__5__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1172:1: rule__ChapterDetails__Group__6 : rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 ;
    public final void rule__ChapterDetails__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1176:1: ( rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1177:2: rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__6__Impl_in_rule__ChapterDetails__Group__62455);
            rule__ChapterDetails__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__7_in_rule__ChapterDetails__Group__62458);
            rule__ChapterDetails__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__6"


    // $ANTLR start "rule__ChapterDetails__Group__6__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1184:1: rule__ChapterDetails__Group__6__Impl : ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) ;
    public final void rule__ChapterDetails__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1188:1: ( ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1189:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1189:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1190:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1191:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1191:2: rule__ChapterDetails__SubChapterNumberAssignment_6
            {
            pushFollow(FOLLOW_rule__ChapterDetails__SubChapterNumberAssignment_6_in_rule__ChapterDetails__Group__6__Impl2485);
            rule__ChapterDetails__SubChapterNumberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getSubChapterNumberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__6__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__7"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1201:1: rule__ChapterDetails__Group__7 : rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 ;
    public final void rule__ChapterDetails__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1205:1: ( rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1206:2: rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__7__Impl_in_rule__ChapterDetails__Group__72515);
            rule__ChapterDetails__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__8_in_rule__ChapterDetails__Group__72518);
            rule__ChapterDetails__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__7"


    // $ANTLR start "rule__ChapterDetails__Group__7__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1213:1: rule__ChapterDetails__Group__7__Impl : ( 'chapterName' ) ;
    public final void rule__ChapterDetails__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1217:1: ( ( 'chapterName' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1218:1: ( 'chapterName' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1218:1: ( 'chapterName' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1219:1: 'chapterName'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__ChapterDetails__Group__7__Impl2546); 
             after(grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__7__Impl"


    // $ANTLR start "rule__ChapterDetails__Group__8"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1232:1: rule__ChapterDetails__Group__8 : rule__ChapterDetails__Group__8__Impl ;
    public final void rule__ChapterDetails__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1236:1: ( rule__ChapterDetails__Group__8__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1237:2: rule__ChapterDetails__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__8__Impl_in_rule__ChapterDetails__Group__82577);
            rule__ChapterDetails__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__8"


    // $ANTLR start "rule__ChapterDetails__Group__8__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1243:1: rule__ChapterDetails__Group__8__Impl : ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) ;
    public final void rule__ChapterDetails__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1247:1: ( ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1248:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1248:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1249:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameAssignment_8()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1250:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1250:2: rule__ChapterDetails__ChapterNameAssignment_8
            {
            pushFollow(FOLLOW_rule__ChapterDetails__ChapterNameAssignment_8_in_rule__ChapterDetails__Group__8__Impl2604);
            rule__ChapterDetails__ChapterNameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getChapterDetailsAccess().getChapterNameAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__8__Impl"


    // $ANTLR start "rule__WordMeaning__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1278:1: rule__WordMeaning__Group__0 : rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 ;
    public final void rule__WordMeaning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1282:1: ( rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1283:2: rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__0__Impl_in_rule__WordMeaning__Group__02652);
            rule__WordMeaning__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordMeaning__Group__1_in_rule__WordMeaning__Group__02655);
            rule__WordMeaning__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__0"


    // $ANTLR start "rule__WordMeaning__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1290:1: rule__WordMeaning__Group__0__Impl : ( '@wm' ) ;
    public final void rule__WordMeaning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1294:1: ( ( '@wm' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1295:1: ( '@wm' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1295:1: ( '@wm' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1296:1: '@wm'
            {
             before(grammarAccess.getWordMeaningAccess().getWmKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__WordMeaning__Group__0__Impl2683); 
             after(grammarAccess.getWordMeaningAccess().getWmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__0__Impl"


    // $ANTLR start "rule__WordMeaning__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1309:1: rule__WordMeaning__Group__1 : rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 ;
    public final void rule__WordMeaning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1313:1: ( rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1314:2: rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__1__Impl_in_rule__WordMeaning__Group__12714);
            rule__WordMeaning__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordMeaning__Group__2_in_rule__WordMeaning__Group__12717);
            rule__WordMeaning__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__1"


    // $ANTLR start "rule__WordMeaning__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1321:1: rule__WordMeaning__Group__1__Impl : ( ( rule__WordMeaning__HideFromViewAssignment_1 )? ) ;
    public final void rule__WordMeaning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1325:1: ( ( ( rule__WordMeaning__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1326:1: ( ( rule__WordMeaning__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1326:1: ( ( rule__WordMeaning__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1327:1: ( rule__WordMeaning__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1328:1: ( rule__WordMeaning__HideFromViewAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1328:2: rule__WordMeaning__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__WordMeaning__HideFromViewAssignment_1_in_rule__WordMeaning__Group__1__Impl2744);
                    rule__WordMeaning__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWordMeaningAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__1__Impl"


    // $ANTLR start "rule__WordMeaning__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1338:1: rule__WordMeaning__Group__2 : rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3 ;
    public final void rule__WordMeaning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1342:1: ( rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1343:2: rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__2__Impl_in_rule__WordMeaning__Group__22775);
            rule__WordMeaning__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordMeaning__Group__3_in_rule__WordMeaning__Group__22778);
            rule__WordMeaning__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__2"


    // $ANTLR start "rule__WordMeaning__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1350:1: rule__WordMeaning__Group__2__Impl : ( ( rule__WordMeaning__WordAssignment_2 ) ) ;
    public final void rule__WordMeaning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1354:1: ( ( ( rule__WordMeaning__WordAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1355:1: ( ( rule__WordMeaning__WordAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1355:1: ( ( rule__WordMeaning__WordAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1356:1: ( rule__WordMeaning__WordAssignment_2 )
            {
             before(grammarAccess.getWordMeaningAccess().getWordAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1357:1: ( rule__WordMeaning__WordAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1357:2: rule__WordMeaning__WordAssignment_2
            {
            pushFollow(FOLLOW_rule__WordMeaning__WordAssignment_2_in_rule__WordMeaning__Group__2__Impl2805);
            rule__WordMeaning__WordAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWordMeaningAccess().getWordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__2__Impl"


    // $ANTLR start "rule__WordMeaning__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1367:1: rule__WordMeaning__Group__3 : rule__WordMeaning__Group__3__Impl ;
    public final void rule__WordMeaning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1371:1: ( rule__WordMeaning__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1372:2: rule__WordMeaning__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__3__Impl_in_rule__WordMeaning__Group__32835);
            rule__WordMeaning__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__3"


    // $ANTLR start "rule__WordMeaning__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1378:1: rule__WordMeaning__Group__3__Impl : ( ( rule__WordMeaning__MeaningAssignment_3 ) ) ;
    public final void rule__WordMeaning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1382:1: ( ( ( rule__WordMeaning__MeaningAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1383:1: ( ( rule__WordMeaning__MeaningAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1383:1: ( ( rule__WordMeaning__MeaningAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1384:1: ( rule__WordMeaning__MeaningAssignment_3 )
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1385:1: ( rule__WordMeaning__MeaningAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1385:2: rule__WordMeaning__MeaningAssignment_3
            {
            pushFollow(FOLLOW_rule__WordMeaning__MeaningAssignment_3_in_rule__WordMeaning__Group__3__Impl2862);
            rule__WordMeaning__MeaningAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWordMeaningAccess().getMeaningAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__Group__3__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1403:1: rule__QuestionAnswer__Group__0 : rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 ;
    public final void rule__QuestionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1407:1: ( rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1408:2: rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__0__Impl_in_rule__QuestionAnswer__Group__02900);
            rule__QuestionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__1_in_rule__QuestionAnswer__Group__02903);
            rule__QuestionAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__0"


    // $ANTLR start "rule__QuestionAnswer__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1415:1: rule__QuestionAnswer__Group__0__Impl : ( '@qa' ) ;
    public final void rule__QuestionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1419:1: ( ( '@qa' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1420:1: ( '@qa' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1420:1: ( '@qa' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1421:1: '@qa'
            {
             before(grammarAccess.getQuestionAnswerAccess().getQaKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__QuestionAnswer__Group__0__Impl2931); 
             after(grammarAccess.getQuestionAnswerAccess().getQaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__0__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1434:1: rule__QuestionAnswer__Group__1 : rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 ;
    public final void rule__QuestionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1438:1: ( rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1439:2: rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__1__Impl_in_rule__QuestionAnswer__Group__12962);
            rule__QuestionAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__2_in_rule__QuestionAnswer__Group__12965);
            rule__QuestionAnswer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__1"


    // $ANTLR start "rule__QuestionAnswer__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1446:1: rule__QuestionAnswer__Group__1__Impl : ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? ) ;
    public final void rule__QuestionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1450:1: ( ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1451:1: ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1451:1: ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1452:1: ( rule__QuestionAnswer__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1453:1: ( rule__QuestionAnswer__HideFromViewAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1453:2: rule__QuestionAnswer__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__QuestionAnswer__HideFromViewAssignment_1_in_rule__QuestionAnswer__Group__1__Impl2992);
                    rule__QuestionAnswer__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAnswerAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__1__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1463:1: rule__QuestionAnswer__Group__2 : rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 ;
    public final void rule__QuestionAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1467:1: ( rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1468:2: rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__2__Impl_in_rule__QuestionAnswer__Group__23023);
            rule__QuestionAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__3_in_rule__QuestionAnswer__Group__23026);
            rule__QuestionAnswer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__2"


    // $ANTLR start "rule__QuestionAnswer__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1475:1: rule__QuestionAnswer__Group__2__Impl : ( ( rule__QuestionAnswer__QuestionAssignment_2 ) ) ;
    public final void rule__QuestionAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1479:1: ( ( ( rule__QuestionAnswer__QuestionAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1480:1: ( ( rule__QuestionAnswer__QuestionAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1480:1: ( ( rule__QuestionAnswer__QuestionAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1481:1: ( rule__QuestionAnswer__QuestionAssignment_2 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1482:1: ( rule__QuestionAnswer__QuestionAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1482:2: rule__QuestionAnswer__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__QuestionAssignment_2_in_rule__QuestionAnswer__Group__2__Impl3053);
            rule__QuestionAnswer__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getQuestionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__2__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1492:1: rule__QuestionAnswer__Group__3 : rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4 ;
    public final void rule__QuestionAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1496:1: ( rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1497:2: rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__3__Impl_in_rule__QuestionAnswer__Group__33083);
            rule__QuestionAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__4_in_rule__QuestionAnswer__Group__33086);
            rule__QuestionAnswer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__3"


    // $ANTLR start "rule__QuestionAnswer__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1504:1: rule__QuestionAnswer__Group__3__Impl : ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) ) ;
    public final void rule__QuestionAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1508:1: ( ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1509:1: ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1509:1: ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1510:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1510:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1511:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1512:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1512:2: rule__QuestionAnswer__AnswerPartsAssignment_3
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__AnswerPartsAssignment_3_in_rule__QuestionAnswer__Group__3__Impl3115);
            rule__QuestionAnswer__AnswerPartsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1515:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1516:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )*
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1517:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1517:2: rule__QuestionAnswer__AnswerPartsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__QuestionAnswer__AnswerPartsAssignment_3_in_rule__QuestionAnswer__Group__3__Impl3127);
            	    rule__QuestionAnswer__AnswerPartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__3__Impl"


    // $ANTLR start "rule__QuestionAnswer__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1528:1: rule__QuestionAnswer__Group__4 : rule__QuestionAnswer__Group__4__Impl ;
    public final void rule__QuestionAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1532:1: ( rule__QuestionAnswer__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1533:2: rule__QuestionAnswer__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__4__Impl_in_rule__QuestionAnswer__Group__43160);
            rule__QuestionAnswer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__4"


    // $ANTLR start "rule__QuestionAnswer__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1539:1: rule__QuestionAnswer__Group__4__Impl : ( ( rule__QuestionAnswer__CmapAssignment_4 )? ) ;
    public final void rule__QuestionAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1543:1: ( ( ( rule__QuestionAnswer__CmapAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1544:1: ( ( rule__QuestionAnswer__CmapAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1544:1: ( ( rule__QuestionAnswer__CmapAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1545:1: ( rule__QuestionAnswer__CmapAssignment_4 )?
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1546:1: ( rule__QuestionAnswer__CmapAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1546:2: rule__QuestionAnswer__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_rule__QuestionAnswer__CmapAssignment_4_in_rule__QuestionAnswer__Group__4__Impl3187);
                    rule__QuestionAnswer__CmapAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAnswerAccess().getCmapAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__Group__4__Impl"


    // $ANTLR start "rule__FIB__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1566:1: rule__FIB__Group__0 : rule__FIB__Group__0__Impl rule__FIB__Group__1 ;
    public final void rule__FIB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1570:1: ( rule__FIB__Group__0__Impl rule__FIB__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1571:2: rule__FIB__Group__0__Impl rule__FIB__Group__1
            {
            pushFollow(FOLLOW_rule__FIB__Group__0__Impl_in_rule__FIB__Group__03228);
            rule__FIB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FIB__Group__1_in_rule__FIB__Group__03231);
            rule__FIB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__0"


    // $ANTLR start "rule__FIB__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1578:1: rule__FIB__Group__0__Impl : ( '@fib' ) ;
    public final void rule__FIB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1582:1: ( ( '@fib' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1583:1: ( '@fib' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1583:1: ( '@fib' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1584:1: '@fib'
            {
             before(grammarAccess.getFIBAccess().getFibKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__FIB__Group__0__Impl3259); 
             after(grammarAccess.getFIBAccess().getFibKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__0__Impl"


    // $ANTLR start "rule__FIB__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1597:1: rule__FIB__Group__1 : rule__FIB__Group__1__Impl rule__FIB__Group__2 ;
    public final void rule__FIB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1601:1: ( rule__FIB__Group__1__Impl rule__FIB__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1602:2: rule__FIB__Group__1__Impl rule__FIB__Group__2
            {
            pushFollow(FOLLOW_rule__FIB__Group__1__Impl_in_rule__FIB__Group__13290);
            rule__FIB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FIB__Group__2_in_rule__FIB__Group__13293);
            rule__FIB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__1"


    // $ANTLR start "rule__FIB__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1609:1: rule__FIB__Group__1__Impl : ( ( rule__FIB__HideFromViewAssignment_1 )? ) ;
    public final void rule__FIB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1613:1: ( ( ( rule__FIB__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1614:1: ( ( rule__FIB__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1614:1: ( ( rule__FIB__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1615:1: ( rule__FIB__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getFIBAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1616:1: ( rule__FIB__HideFromViewAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1616:2: rule__FIB__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FIB__HideFromViewAssignment_1_in_rule__FIB__Group__1__Impl3320);
                    rule__FIB__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFIBAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__1__Impl"


    // $ANTLR start "rule__FIB__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1626:1: rule__FIB__Group__2 : rule__FIB__Group__2__Impl rule__FIB__Group__3 ;
    public final void rule__FIB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1630:1: ( rule__FIB__Group__2__Impl rule__FIB__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1631:2: rule__FIB__Group__2__Impl rule__FIB__Group__3
            {
            pushFollow(FOLLOW_rule__FIB__Group__2__Impl_in_rule__FIB__Group__23351);
            rule__FIB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FIB__Group__3_in_rule__FIB__Group__23354);
            rule__FIB__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__2"


    // $ANTLR start "rule__FIB__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1638:1: rule__FIB__Group__2__Impl : ( ( rule__FIB__QuestionAssignment_2 ) ) ;
    public final void rule__FIB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1642:1: ( ( ( rule__FIB__QuestionAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1643:1: ( ( rule__FIB__QuestionAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1643:1: ( ( rule__FIB__QuestionAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1644:1: ( rule__FIB__QuestionAssignment_2 )
            {
             before(grammarAccess.getFIBAccess().getQuestionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1645:1: ( rule__FIB__QuestionAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1645:2: rule__FIB__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__FIB__QuestionAssignment_2_in_rule__FIB__Group__2__Impl3381);
            rule__FIB__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getQuestionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__2__Impl"


    // $ANTLR start "rule__FIB__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1655:1: rule__FIB__Group__3 : rule__FIB__Group__3__Impl ;
    public final void rule__FIB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1659:1: ( rule__FIB__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1660:2: rule__FIB__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FIB__Group__3__Impl_in_rule__FIB__Group__33411);
            rule__FIB__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__3"


    // $ANTLR start "rule__FIB__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1666:1: rule__FIB__Group__3__Impl : ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) ) ;
    public final void rule__FIB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1670:1: ( ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1671:1: ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1671:1: ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1672:1: ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1672:1: ( ( rule__FIB__AnswersAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1673:1: ( rule__FIB__AnswersAssignment_3 )
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1674:1: ( rule__FIB__AnswersAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1674:2: rule__FIB__AnswersAssignment_3
            {
            pushFollow(FOLLOW_rule__FIB__AnswersAssignment_3_in_rule__FIB__Group__3__Impl3440);
            rule__FIB__AnswersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1677:1: ( ( rule__FIB__AnswersAssignment_3 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1678:1: ( rule__FIB__AnswersAssignment_3 )*
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1679:1: ( rule__FIB__AnswersAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1679:2: rule__FIB__AnswersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__FIB__AnswersAssignment_3_in_rule__FIB__Group__3__Impl3452);
            	    rule__FIB__AnswersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1698:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1702:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1703:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03493);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03496);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1710:1: rule__Definition__Group__0__Impl : ( '@definition' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1714:1: ( ( '@definition' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1715:1: ( '@definition' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1715:1: ( '@definition' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1716:1: '@definition'
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Definition__Group__0__Impl3524); 
             after(grammarAccess.getDefinitionAccess().getDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1729:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1733:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1734:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13555);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13558);
            rule__Definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1741:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__HideFromViewAssignment_1 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1745:1: ( ( ( rule__Definition__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1746:1: ( ( rule__Definition__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1746:1: ( ( rule__Definition__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1747:1: ( rule__Definition__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1748:1: ( rule__Definition__HideFromViewAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1748:2: rule__Definition__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Definition__HideFromViewAssignment_1_in_rule__Definition__Group__1__Impl3585);
                    rule__Definition__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1758:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1762:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1763:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23616);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__23619);
            rule__Definition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1770:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__TermAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1774:1: ( ( ( rule__Definition__TermAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1775:1: ( ( rule__Definition__TermAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1775:1: ( ( rule__Definition__TermAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1776:1: ( rule__Definition__TermAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getTermAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1777:1: ( rule__Definition__TermAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1777:2: rule__Definition__TermAssignment_2
            {
            pushFollow(FOLLOW_rule__Definition__TermAssignment_2_in_rule__Definition__Group__2__Impl3646);
            rule__Definition__TermAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTermAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1787:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1791:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1792:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__33676);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__33679);
            rule__Definition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1799:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__DefinitionAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1803:1: ( ( ( rule__Definition__DefinitionAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1804:1: ( ( rule__Definition__DefinitionAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1804:1: ( ( rule__Definition__DefinitionAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1805:1: ( rule__Definition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1806:1: ( rule__Definition__DefinitionAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1806:2: rule__Definition__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__Definition__DefinitionAssignment_3_in_rule__Definition__Group__3__Impl3706);
            rule__Definition__DefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1816:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1820:1: ( rule__Definition__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1821:2: rule__Definition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__43736);
            rule__Definition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1827:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__CmapAssignment_4 )? ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1831:1: ( ( ( rule__Definition__CmapAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1832:1: ( ( rule__Definition__CmapAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1832:1: ( ( rule__Definition__CmapAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1833:1: ( rule__Definition__CmapAssignment_4 )?
            {
             before(grammarAccess.getDefinitionAccess().getCmapAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1834:1: ( rule__Definition__CmapAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1834:2: rule__Definition__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Definition__CmapAssignment_4_in_rule__Definition__Group__4__Impl3763);
                    rule__Definition__CmapAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getCmapAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Character__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1854:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1858:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1859:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03804);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03807);
            rule__Character__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0"


    // $ANTLR start "rule__Character__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1866:1: rule__Character__Group__0__Impl : ( '@character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1870:1: ( ( '@character' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1871:1: ( '@character' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1871:1: ( '@character' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1872:1: '@character'
            {
             before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Character__Group__0__Impl3835); 
             after(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0__Impl"


    // $ANTLR start "rule__Character__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1885:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1889:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1890:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13866);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13869);
            rule__Character__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1"


    // $ANTLR start "rule__Character__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1897:1: rule__Character__Group__1__Impl : ( ( rule__Character__HideFromViewAssignment_1 )? ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1901:1: ( ( ( rule__Character__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1902:1: ( ( rule__Character__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1902:1: ( ( rule__Character__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1903:1: ( rule__Character__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1904:1: ( rule__Character__HideFromViewAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1904:2: rule__Character__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Character__HideFromViewAssignment_1_in_rule__Character__Group__1__Impl3896);
                    rule__Character__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1__Impl"


    // $ANTLR start "rule__Character__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1914:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1918:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1919:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23927);
            rule__Character__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23930);
            rule__Character__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2"


    // $ANTLR start "rule__Character__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1926:1: rule__Character__Group__2__Impl : ( ( rule__Character__CharacterAssignment_2 ) ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1930:1: ( ( ( rule__Character__CharacterAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1931:1: ( ( rule__Character__CharacterAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1931:1: ( ( rule__Character__CharacterAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1932:1: ( rule__Character__CharacterAssignment_2 )
            {
             before(grammarAccess.getCharacterAccess().getCharacterAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1933:1: ( rule__Character__CharacterAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1933:2: rule__Character__CharacterAssignment_2
            {
            pushFollow(FOLLOW_rule__Character__CharacterAssignment_2_in_rule__Character__Group__2__Impl3957);
            rule__Character__CharacterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getCharacterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2__Impl"


    // $ANTLR start "rule__Character__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1943:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1947:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1948:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33987);
            rule__Character__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__4_in_rule__Character__Group__33990);
            rule__Character__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3"


    // $ANTLR start "rule__Character__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1955:1: rule__Character__Group__3__Impl : ( ( rule__Character__EstimateAssignment_3 ) ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1959:1: ( ( ( rule__Character__EstimateAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1960:1: ( ( rule__Character__EstimateAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1960:1: ( ( rule__Character__EstimateAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1961:1: ( rule__Character__EstimateAssignment_3 )
            {
             before(grammarAccess.getCharacterAccess().getEstimateAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1962:1: ( rule__Character__EstimateAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1962:2: rule__Character__EstimateAssignment_3
            {
            pushFollow(FOLLOW_rule__Character__EstimateAssignment_3_in_rule__Character__Group__3__Impl4017);
            rule__Character__EstimateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getEstimateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3__Impl"


    // $ANTLR start "rule__Character__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1972:1: rule__Character__Group__4 : rule__Character__Group__4__Impl ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1976:1: ( rule__Character__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1977:2: rule__Character__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__44047);
            rule__Character__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4"


    // $ANTLR start "rule__Character__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1983:1: rule__Character__Group__4__Impl : ( ( rule__Character__CmapAssignment_4 )? ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1987:1: ( ( ( rule__Character__CmapAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1988:1: ( ( rule__Character__CmapAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1988:1: ( ( rule__Character__CmapAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1989:1: ( rule__Character__CmapAssignment_4 )?
            {
             before(grammarAccess.getCharacterAccess().getCmapAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1990:1: ( rule__Character__CmapAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1990:2: rule__Character__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Character__CmapAssignment_4_in_rule__Character__Group__4__Impl4074);
                    rule__Character__CmapAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getCmapAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4__Impl"


    // $ANTLR start "rule__TeacherNote__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2010:1: rule__TeacherNote__Group__0 : rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 ;
    public final void rule__TeacherNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2014:1: ( rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2015:2: rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__0__Impl_in_rule__TeacherNote__Group__04115);
            rule__TeacherNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__1_in_rule__TeacherNote__Group__04118);
            rule__TeacherNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__0"


    // $ANTLR start "rule__TeacherNote__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2022:1: rule__TeacherNote__Group__0__Impl : ( '@tn' ) ;
    public final void rule__TeacherNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2026:1: ( ( '@tn' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2027:1: ( '@tn' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2027:1: ( '@tn' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2028:1: '@tn'
            {
             before(grammarAccess.getTeacherNoteAccess().getTnKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__TeacherNote__Group__0__Impl4146); 
             after(grammarAccess.getTeacherNoteAccess().getTnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__0__Impl"


    // $ANTLR start "rule__TeacherNote__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2041:1: rule__TeacherNote__Group__1 : rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 ;
    public final void rule__TeacherNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2045:1: ( rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2046:2: rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__1__Impl_in_rule__TeacherNote__Group__14177);
            rule__TeacherNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__2_in_rule__TeacherNote__Group__14180);
            rule__TeacherNote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__1"


    // $ANTLR start "rule__TeacherNote__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2053:1: rule__TeacherNote__Group__1__Impl : ( ( rule__TeacherNote__HideFromViewAssignment_1 )? ) ;
    public final void rule__TeacherNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2057:1: ( ( ( rule__TeacherNote__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2058:1: ( ( rule__TeacherNote__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2058:1: ( ( rule__TeacherNote__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2059:1: ( rule__TeacherNote__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2060:1: ( rule__TeacherNote__HideFromViewAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2060:2: rule__TeacherNote__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TeacherNote__HideFromViewAssignment_1_in_rule__TeacherNote__Group__1__Impl4207);
                    rule__TeacherNote__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherNoteAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__1__Impl"


    // $ANTLR start "rule__TeacherNote__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2070:1: rule__TeacherNote__Group__2 : rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3 ;
    public final void rule__TeacherNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2074:1: ( rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2075:2: rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__2__Impl_in_rule__TeacherNote__Group__24238);
            rule__TeacherNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__3_in_rule__TeacherNote__Group__24241);
            rule__TeacherNote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__2"


    // $ANTLR start "rule__TeacherNote__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2082:1: rule__TeacherNote__Group__2__Impl : ( ( rule__TeacherNote__CaptionAssignment_2 )? ) ;
    public final void rule__TeacherNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2086:1: ( ( ( rule__TeacherNote__CaptionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2087:1: ( ( rule__TeacherNote__CaptionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2087:1: ( ( rule__TeacherNote__CaptionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2088:1: ( rule__TeacherNote__CaptionAssignment_2 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getCaptionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2089:1: ( rule__TeacherNote__CaptionAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_STRING) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2089:2: rule__TeacherNote__CaptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TeacherNote__CaptionAssignment_2_in_rule__TeacherNote__Group__2__Impl4268);
                    rule__TeacherNote__CaptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherNoteAccess().getCaptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__2__Impl"


    // $ANTLR start "rule__TeacherNote__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2099:1: rule__TeacherNote__Group__3 : rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4 ;
    public final void rule__TeacherNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2103:1: ( rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2104:2: rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__3__Impl_in_rule__TeacherNote__Group__34299);
            rule__TeacherNote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__4_in_rule__TeacherNote__Group__34302);
            rule__TeacherNote__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__3"


    // $ANTLR start "rule__TeacherNote__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2111:1: rule__TeacherNote__Group__3__Impl : ( ( rule__TeacherNote__NoteAssignment_3 ) ) ;
    public final void rule__TeacherNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2115:1: ( ( ( rule__TeacherNote__NoteAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2116:1: ( ( rule__TeacherNote__NoteAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2116:1: ( ( rule__TeacherNote__NoteAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2117:1: ( rule__TeacherNote__NoteAssignment_3 )
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2118:1: ( rule__TeacherNote__NoteAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2118:2: rule__TeacherNote__NoteAssignment_3
            {
            pushFollow(FOLLOW_rule__TeacherNote__NoteAssignment_3_in_rule__TeacherNote__Group__3__Impl4329);
            rule__TeacherNote__NoteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTeacherNoteAccess().getNoteAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__3__Impl"


    // $ANTLR start "rule__TeacherNote__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2128:1: rule__TeacherNote__Group__4 : rule__TeacherNote__Group__4__Impl ;
    public final void rule__TeacherNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2132:1: ( rule__TeacherNote__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2133:2: rule__TeacherNote__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__4__Impl_in_rule__TeacherNote__Group__44359);
            rule__TeacherNote__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__4"


    // $ANTLR start "rule__TeacherNote__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2139:1: rule__TeacherNote__Group__4__Impl : ( ( rule__TeacherNote__CmapAssignment_4 )? ) ;
    public final void rule__TeacherNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2143:1: ( ( ( rule__TeacherNote__CmapAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2144:1: ( ( rule__TeacherNote__CmapAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2144:1: ( ( rule__TeacherNote__CmapAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2145:1: ( rule__TeacherNote__CmapAssignment_4 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2146:1: ( rule__TeacherNote__CmapAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2146:2: rule__TeacherNote__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TeacherNote__CmapAssignment_4_in_rule__TeacherNote__Group__4__Impl4386);
                    rule__TeacherNote__CmapAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherNoteAccess().getCmapAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__Group__4__Impl"


    // $ANTLR start "rule__Matching__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2166:1: rule__Matching__Group__0 : rule__Matching__Group__0__Impl rule__Matching__Group__1 ;
    public final void rule__Matching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2170:1: ( rule__Matching__Group__0__Impl rule__Matching__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2171:2: rule__Matching__Group__0__Impl rule__Matching__Group__1
            {
            pushFollow(FOLLOW_rule__Matching__Group__0__Impl_in_rule__Matching__Group__04427);
            rule__Matching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__1_in_rule__Matching__Group__04430);
            rule__Matching__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__0"


    // $ANTLR start "rule__Matching__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2178:1: rule__Matching__Group__0__Impl : ( '@match' ) ;
    public final void rule__Matching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2182:1: ( ( '@match' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2183:1: ( '@match' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2183:1: ( '@match' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2184:1: '@match'
            {
             before(grammarAccess.getMatchingAccess().getMatchKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Matching__Group__0__Impl4458); 
             after(grammarAccess.getMatchingAccess().getMatchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__0__Impl"


    // $ANTLR start "rule__Matching__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2197:1: rule__Matching__Group__1 : rule__Matching__Group__1__Impl rule__Matching__Group__2 ;
    public final void rule__Matching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2201:1: ( rule__Matching__Group__1__Impl rule__Matching__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2202:2: rule__Matching__Group__1__Impl rule__Matching__Group__2
            {
            pushFollow(FOLLOW_rule__Matching__Group__1__Impl_in_rule__Matching__Group__14489);
            rule__Matching__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__2_in_rule__Matching__Group__14492);
            rule__Matching__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__1"


    // $ANTLR start "rule__Matching__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2209:1: rule__Matching__Group__1__Impl : ( ( rule__Matching__HideFromViewAssignment_1 )? ) ;
    public final void rule__Matching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2213:1: ( ( ( rule__Matching__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2214:1: ( ( rule__Matching__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2214:1: ( ( rule__Matching__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2215:1: ( rule__Matching__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2216:1: ( rule__Matching__HideFromViewAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2216:2: rule__Matching__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Matching__HideFromViewAssignment_1_in_rule__Matching__Group__1__Impl4519);
                    rule__Matching__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__1__Impl"


    // $ANTLR start "rule__Matching__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2226:1: rule__Matching__Group__2 : rule__Matching__Group__2__Impl rule__Matching__Group__3 ;
    public final void rule__Matching__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2230:1: ( rule__Matching__Group__2__Impl rule__Matching__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2231:2: rule__Matching__Group__2__Impl rule__Matching__Group__3
            {
            pushFollow(FOLLOW_rule__Matching__Group__2__Impl_in_rule__Matching__Group__24550);
            rule__Matching__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__3_in_rule__Matching__Group__24553);
            rule__Matching__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__2"


    // $ANTLR start "rule__Matching__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2238:1: rule__Matching__Group__2__Impl : ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? ) ;
    public final void rule__Matching__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2242:1: ( ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2243:1: ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2243:1: ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2244:1: ( rule__Matching__SkipReverseQuestionAssignment_2 )?
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2245:1: ( rule__Matching__SkipReverseQuestionAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2245:2: rule__Matching__SkipReverseQuestionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Matching__SkipReverseQuestionAssignment_2_in_rule__Matching__Group__2__Impl4580);
                    rule__Matching__SkipReverseQuestionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getSkipReverseQuestionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__2__Impl"


    // $ANTLR start "rule__Matching__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2255:1: rule__Matching__Group__3 : rule__Matching__Group__3__Impl rule__Matching__Group__4 ;
    public final void rule__Matching__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2259:1: ( rule__Matching__Group__3__Impl rule__Matching__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2260:2: rule__Matching__Group__3__Impl rule__Matching__Group__4
            {
            pushFollow(FOLLOW_rule__Matching__Group__3__Impl_in_rule__Matching__Group__34611);
            rule__Matching__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__4_in_rule__Matching__Group__34614);
            rule__Matching__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__3"


    // $ANTLR start "rule__Matching__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2267:1: rule__Matching__Group__3__Impl : ( ( rule__Matching__QuestionAssignment_3 )? ) ;
    public final void rule__Matching__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2271:1: ( ( ( rule__Matching__QuestionAssignment_3 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2272:1: ( ( rule__Matching__QuestionAssignment_3 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2272:1: ( ( rule__Matching__QuestionAssignment_3 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2273:1: ( rule__Matching__QuestionAssignment_3 )?
            {
             before(grammarAccess.getMatchingAccess().getQuestionAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2274:1: ( rule__Matching__QuestionAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2274:2: rule__Matching__QuestionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Matching__QuestionAssignment_3_in_rule__Matching__Group__3__Impl4641);
                    rule__Matching__QuestionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getQuestionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__3__Impl"


    // $ANTLR start "rule__Matching__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2284:1: rule__Matching__Group__4 : rule__Matching__Group__4__Impl rule__Matching__Group__5 ;
    public final void rule__Matching__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2288:1: ( rule__Matching__Group__4__Impl rule__Matching__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2289:2: rule__Matching__Group__4__Impl rule__Matching__Group__5
            {
            pushFollow(FOLLOW_rule__Matching__Group__4__Impl_in_rule__Matching__Group__44672);
            rule__Matching__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__5_in_rule__Matching__Group__44675);
            rule__Matching__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__4"


    // $ANTLR start "rule__Matching__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2296:1: rule__Matching__Group__4__Impl : ( '{' ) ;
    public final void rule__Matching__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2300:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2301:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2301:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2302:1: '{'
            {
             before(grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Matching__Group__4__Impl4703); 
             after(grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__4__Impl"


    // $ANTLR start "rule__Matching__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2315:1: rule__Matching__Group__5 : rule__Matching__Group__5__Impl rule__Matching__Group__6 ;
    public final void rule__Matching__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2319:1: ( rule__Matching__Group__5__Impl rule__Matching__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2320:2: rule__Matching__Group__5__Impl rule__Matching__Group__6
            {
            pushFollow(FOLLOW_rule__Matching__Group__5__Impl_in_rule__Matching__Group__54734);
            rule__Matching__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__6_in_rule__Matching__Group__54737);
            rule__Matching__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__5"


    // $ANTLR start "rule__Matching__Group__5__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2327:1: rule__Matching__Group__5__Impl : ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) ) ;
    public final void rule__Matching__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2331:1: ( ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2332:1: ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2332:1: ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2333:1: ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2333:1: ( ( rule__Matching__PairsAssignment_5 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2334:1: ( rule__Matching__PairsAssignment_5 )
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2335:1: ( rule__Matching__PairsAssignment_5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2335:2: rule__Matching__PairsAssignment_5
            {
            pushFollow(FOLLOW_rule__Matching__PairsAssignment_5_in_rule__Matching__Group__5__Impl4766);
            rule__Matching__PairsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2338:1: ( ( rule__Matching__PairsAssignment_5 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2339:1: ( rule__Matching__PairsAssignment_5 )*
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2340:1: ( rule__Matching__PairsAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2340:2: rule__Matching__PairsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Matching__PairsAssignment_5_in_rule__Matching__Group__5__Impl4778);
            	    rule__Matching__PairsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__5__Impl"


    // $ANTLR start "rule__Matching__Group__6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2351:1: rule__Matching__Group__6 : rule__Matching__Group__6__Impl ;
    public final void rule__Matching__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2355:1: ( rule__Matching__Group__6__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2356:2: rule__Matching__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Matching__Group__6__Impl_in_rule__Matching__Group__64811);
            rule__Matching__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__6"


    // $ANTLR start "rule__Matching__Group__6__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2362:1: rule__Matching__Group__6__Impl : ( '}' ) ;
    public final void rule__Matching__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2366:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2367:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2367:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2368:1: '}'
            {
             before(grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__Matching__Group__6__Impl4839); 
             after(grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__6__Impl"


    // $ANTLR start "rule__MatchPair__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2395:1: rule__MatchPair__Group__0 : rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 ;
    public final void rule__MatchPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2399:1: ( rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2400:2: rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__0__Impl_in_rule__MatchPair__Group__04884);
            rule__MatchPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchPair__Group__1_in_rule__MatchPair__Group__04887);
            rule__MatchPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__0"


    // $ANTLR start "rule__MatchPair__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2407:1: rule__MatchPair__Group__0__Impl : ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) ;
    public final void rule__MatchPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2411:1: ( ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2412:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2412:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2413:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2414:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2414:2: rule__MatchPair__MatchQuestionAssignment_0
            {
            pushFollow(FOLLOW_rule__MatchPair__MatchQuestionAssignment_0_in_rule__MatchPair__Group__0__Impl4914);
            rule__MatchPair__MatchQuestionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairAccess().getMatchQuestionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__0__Impl"


    // $ANTLR start "rule__MatchPair__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2424:1: rule__MatchPair__Group__1 : rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 ;
    public final void rule__MatchPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2428:1: ( rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2429:2: rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__1__Impl_in_rule__MatchPair__Group__14944);
            rule__MatchPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchPair__Group__2_in_rule__MatchPair__Group__14947);
            rule__MatchPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__1"


    // $ANTLR start "rule__MatchPair__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2436:1: rule__MatchPair__Group__1__Impl : ( '=' ) ;
    public final void rule__MatchPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2440:1: ( ( '=' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2441:1: ( '=' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2441:1: ( '=' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2442:1: '='
            {
             before(grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__MatchPair__Group__1__Impl4975); 
             after(grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__1__Impl"


    // $ANTLR start "rule__MatchPair__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2455:1: rule__MatchPair__Group__2 : rule__MatchPair__Group__2__Impl ;
    public final void rule__MatchPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2459:1: ( rule__MatchPair__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2460:2: rule__MatchPair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__2__Impl_in_rule__MatchPair__Group__25006);
            rule__MatchPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__2"


    // $ANTLR start "rule__MatchPair__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2466:1: rule__MatchPair__Group__2__Impl : ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) ;
    public final void rule__MatchPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2470:1: ( ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2471:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2471:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2472:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2473:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2473:2: rule__MatchPair__MatchAnswerAssignment_2
            {
            pushFollow(FOLLOW_rule__MatchPair__MatchAnswerAssignment_2_in_rule__MatchPair__Group__2__Impl5033);
            rule__MatchPair__MatchAnswerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMatchPairAccess().getMatchAnswerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2489:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2493:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2494:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__05069);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__05072);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2501:1: rule__Event__Group__0__Impl : ( '@event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2505:1: ( ( '@event' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2506:1: ( '@event' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2506:1: ( '@event' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2507:1: '@event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Event__Group__0__Impl5100); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2520:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2524:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2525:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__15131);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__15134);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2532:1: rule__Event__Group__1__Impl : ( ( rule__Event__HideFromViewAssignment_1 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2536:1: ( ( ( rule__Event__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2537:1: ( ( rule__Event__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2537:1: ( ( rule__Event__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2538:1: ( rule__Event__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getEventAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2539:1: ( rule__Event__HideFromViewAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2539:2: rule__Event__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Event__HideFromViewAssignment_1_in_rule__Event__Group__1__Impl5161);
                    rule__Event__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2549:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2553:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2554:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__25192);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__3_in_rule__Event__Group__25195);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2561:1: rule__Event__Group__2__Impl : ( ( rule__Event__EventAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2565:1: ( ( ( rule__Event__EventAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2566:1: ( ( rule__Event__EventAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2566:1: ( ( rule__Event__EventAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2567:1: ( rule__Event__EventAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getEventAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2568:1: ( rule__Event__EventAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2568:2: rule__Event__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Event__EventAssignment_2_in_rule__Event__Group__2__Impl5222);
            rule__Event__EventAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2578:1: rule__Event__Group__3 : rule__Event__Group__3__Impl ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2582:1: ( rule__Event__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2583:2: rule__Event__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__35252);
            rule__Event__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2589:1: rule__Event__Group__3__Impl : ( ( rule__Event__TimeAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2593:1: ( ( ( rule__Event__TimeAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2594:1: ( ( rule__Event__TimeAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2594:1: ( ( rule__Event__TimeAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2595:1: ( rule__Event__TimeAssignment_3 )
            {
             before(grammarAccess.getEventAccess().getTimeAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2596:1: ( rule__Event__TimeAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2596:2: rule__Event__TimeAssignment_3
            {
            pushFollow(FOLLOW_rule__Event__TimeAssignment_3_in_rule__Event__Group__3__Impl5279);
            rule__Event__TimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__TrueFalse__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2614:1: rule__TrueFalse__Group__0 : rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 ;
    public final void rule__TrueFalse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2618:1: ( rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2619:2: rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__0__Impl_in_rule__TrueFalse__Group__05317);
            rule__TrueFalse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__1_in_rule__TrueFalse__Group__05320);
            rule__TrueFalse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__0"


    // $ANTLR start "rule__TrueFalse__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2626:1: rule__TrueFalse__Group__0__Impl : ( '@true_false' ) ;
    public final void rule__TrueFalse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2630:1: ( ( '@true_false' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2631:1: ( '@true_false' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2631:1: ( '@true_false' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2632:1: '@true_false'
            {
             before(grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__TrueFalse__Group__0__Impl5348); 
             after(grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__0__Impl"


    // $ANTLR start "rule__TrueFalse__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2645:1: rule__TrueFalse__Group__1 : rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 ;
    public final void rule__TrueFalse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2649:1: ( rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2650:2: rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__1__Impl_in_rule__TrueFalse__Group__15379);
            rule__TrueFalse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__2_in_rule__TrueFalse__Group__15382);
            rule__TrueFalse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__1"


    // $ANTLR start "rule__TrueFalse__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2657:1: rule__TrueFalse__Group__1__Impl : ( ( rule__TrueFalse__HideFromViewAssignment_1 )? ) ;
    public final void rule__TrueFalse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2661:1: ( ( ( rule__TrueFalse__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2662:1: ( ( rule__TrueFalse__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2662:1: ( ( rule__TrueFalse__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2663:1: ( rule__TrueFalse__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2664:1: ( rule__TrueFalse__HideFromViewAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2664:2: rule__TrueFalse__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TrueFalse__HideFromViewAssignment_1_in_rule__TrueFalse__Group__1__Impl5409);
                    rule__TrueFalse__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueFalseAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__1__Impl"


    // $ANTLR start "rule__TrueFalse__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2674:1: rule__TrueFalse__Group__2 : rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 ;
    public final void rule__TrueFalse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2678:1: ( rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2679:2: rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__2__Impl_in_rule__TrueFalse__Group__25440);
            rule__TrueFalse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__3_in_rule__TrueFalse__Group__25443);
            rule__TrueFalse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__2"


    // $ANTLR start "rule__TrueFalse__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2686:1: rule__TrueFalse__Group__2__Impl : ( ( rule__TrueFalse__StatementAssignment_2 ) ) ;
    public final void rule__TrueFalse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2690:1: ( ( ( rule__TrueFalse__StatementAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2691:1: ( ( rule__TrueFalse__StatementAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2691:1: ( ( rule__TrueFalse__StatementAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2692:1: ( rule__TrueFalse__StatementAssignment_2 )
            {
             before(grammarAccess.getTrueFalseAccess().getStatementAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2693:1: ( rule__TrueFalse__StatementAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2693:2: rule__TrueFalse__StatementAssignment_2
            {
            pushFollow(FOLLOW_rule__TrueFalse__StatementAssignment_2_in_rule__TrueFalse__Group__2__Impl5470);
            rule__TrueFalse__StatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrueFalseAccess().getStatementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__2__Impl"


    // $ANTLR start "rule__TrueFalse__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2703:1: rule__TrueFalse__Group__3 : rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4 ;
    public final void rule__TrueFalse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2707:1: ( rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2708:2: rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__3__Impl_in_rule__TrueFalse__Group__35500);
            rule__TrueFalse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__4_in_rule__TrueFalse__Group__35503);
            rule__TrueFalse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__3"


    // $ANTLR start "rule__TrueFalse__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2715:1: rule__TrueFalse__Group__3__Impl : ( ( rule__TrueFalse__TruthValueAssignment_3 ) ) ;
    public final void rule__TrueFalse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2719:1: ( ( ( rule__TrueFalse__TruthValueAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2720:1: ( ( rule__TrueFalse__TruthValueAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2720:1: ( ( rule__TrueFalse__TruthValueAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2721:1: ( rule__TrueFalse__TruthValueAssignment_3 )
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2722:1: ( rule__TrueFalse__TruthValueAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2722:2: rule__TrueFalse__TruthValueAssignment_3
            {
            pushFollow(FOLLOW_rule__TrueFalse__TruthValueAssignment_3_in_rule__TrueFalse__Group__3__Impl5530);
            rule__TrueFalse__TruthValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTrueFalseAccess().getTruthValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__3__Impl"


    // $ANTLR start "rule__TrueFalse__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2732:1: rule__TrueFalse__Group__4 : rule__TrueFalse__Group__4__Impl ;
    public final void rule__TrueFalse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2736:1: ( rule__TrueFalse__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2737:2: rule__TrueFalse__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__4__Impl_in_rule__TrueFalse__Group__45560);
            rule__TrueFalse__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__4"


    // $ANTLR start "rule__TrueFalse__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2743:1: rule__TrueFalse__Group__4__Impl : ( ( rule__TrueFalse__JustificationAssignment_4 )? ) ;
    public final void rule__TrueFalse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2747:1: ( ( ( rule__TrueFalse__JustificationAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2748:1: ( ( rule__TrueFalse__JustificationAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2748:1: ( ( rule__TrueFalse__JustificationAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2749:1: ( rule__TrueFalse__JustificationAssignment_4 )?
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2750:1: ( rule__TrueFalse__JustificationAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2750:2: rule__TrueFalse__JustificationAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TrueFalse__JustificationAssignment_4_in_rule__TrueFalse__Group__4__Impl5587);
                    rule__TrueFalse__JustificationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueFalseAccess().getJustificationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__Group__4__Impl"


    // $ANTLR start "rule__ChemEquation__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2770:1: rule__ChemEquation__Group__0 : rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 ;
    public final void rule__ChemEquation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2774:1: ( rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2775:2: rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__0__Impl_in_rule__ChemEquation__Group__05628);
            rule__ChemEquation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__1_in_rule__ChemEquation__Group__05631);
            rule__ChemEquation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__0"


    // $ANTLR start "rule__ChemEquation__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2782:1: rule__ChemEquation__Group__0__Impl : ( '@chem_equation' ) ;
    public final void rule__ChemEquation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2786:1: ( ( '@chem_equation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2787:1: ( '@chem_equation' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2787:1: ( '@chem_equation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2788:1: '@chem_equation'
            {
             before(grammarAccess.getChemEquationAccess().getChem_equationKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ChemEquation__Group__0__Impl5659); 
             after(grammarAccess.getChemEquationAccess().getChem_equationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__0__Impl"


    // $ANTLR start "rule__ChemEquation__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2801:1: rule__ChemEquation__Group__1 : rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 ;
    public final void rule__ChemEquation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2805:1: ( rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2806:2: rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__1__Impl_in_rule__ChemEquation__Group__15690);
            rule__ChemEquation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__2_in_rule__ChemEquation__Group__15693);
            rule__ChemEquation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__1"


    // $ANTLR start "rule__ChemEquation__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2813:1: rule__ChemEquation__Group__1__Impl : ( ( rule__ChemEquation__HideFromViewAssignment_1 )? ) ;
    public final void rule__ChemEquation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2817:1: ( ( ( rule__ChemEquation__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2818:1: ( ( rule__ChemEquation__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2818:1: ( ( rule__ChemEquation__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2819:1: ( rule__ChemEquation__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2820:1: ( rule__ChemEquation__HideFromViewAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2820:2: rule__ChemEquation__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ChemEquation__HideFromViewAssignment_1_in_rule__ChemEquation__Group__1__Impl5720);
                    rule__ChemEquation__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemEquationAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__1__Impl"


    // $ANTLR start "rule__ChemEquation__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2830:1: rule__ChemEquation__Group__2 : rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 ;
    public final void rule__ChemEquation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2834:1: ( rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2835:2: rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__2__Impl_in_rule__ChemEquation__Group__25751);
            rule__ChemEquation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__3_in_rule__ChemEquation__Group__25754);
            rule__ChemEquation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__2"


    // $ANTLR start "rule__ChemEquation__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2842:1: rule__ChemEquation__Group__2__Impl : ( ( rule__ChemEquation__DescriptionAssignment_2 )? ) ;
    public final void rule__ChemEquation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2846:1: ( ( ( rule__ChemEquation__DescriptionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2847:1: ( ( rule__ChemEquation__DescriptionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2847:1: ( ( rule__ChemEquation__DescriptionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2848:1: ( rule__ChemEquation__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2849:1: ( rule__ChemEquation__DescriptionAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2849:2: rule__ChemEquation__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ChemEquation__DescriptionAssignment_2_in_rule__ChemEquation__Group__2__Impl5781);
                    rule__ChemEquation__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemEquationAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__2__Impl"


    // $ANTLR start "rule__ChemEquation__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2859:1: rule__ChemEquation__Group__3 : rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 ;
    public final void rule__ChemEquation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2863:1: ( rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2864:2: rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__3__Impl_in_rule__ChemEquation__Group__35812);
            rule__ChemEquation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__4_in_rule__ChemEquation__Group__35815);
            rule__ChemEquation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__3"


    // $ANTLR start "rule__ChemEquation__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2871:1: rule__ChemEquation__Group__3__Impl : ( '{' ) ;
    public final void rule__ChemEquation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2875:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2876:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2876:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2877:1: '{'
            {
             before(grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ChemEquation__Group__3__Impl5843); 
             after(grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__3__Impl"


    // $ANTLR start "rule__ChemEquation__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2890:1: rule__ChemEquation__Group__4 : rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 ;
    public final void rule__ChemEquation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2894:1: ( rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2895:2: rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__4__Impl_in_rule__ChemEquation__Group__45874);
            rule__ChemEquation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__5_in_rule__ChemEquation__Group__45877);
            rule__ChemEquation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__4"


    // $ANTLR start "rule__ChemEquation__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2902:1: rule__ChemEquation__Group__4__Impl : ( ( rule__ChemEquation__ReactantsAssignment_4 ) ) ;
    public final void rule__ChemEquation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2906:1: ( ( ( rule__ChemEquation__ReactantsAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2907:1: ( ( rule__ChemEquation__ReactantsAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2907:1: ( ( rule__ChemEquation__ReactantsAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2908:1: ( rule__ChemEquation__ReactantsAssignment_4 )
            {
             before(grammarAccess.getChemEquationAccess().getReactantsAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2909:1: ( rule__ChemEquation__ReactantsAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2909:2: rule__ChemEquation__ReactantsAssignment_4
            {
            pushFollow(FOLLOW_rule__ChemEquation__ReactantsAssignment_4_in_rule__ChemEquation__Group__4__Impl5904);
            rule__ChemEquation__ReactantsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChemEquationAccess().getReactantsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__4__Impl"


    // $ANTLR start "rule__ChemEquation__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2919:1: rule__ChemEquation__Group__5 : rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 ;
    public final void rule__ChemEquation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2923:1: ( rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2924:2: rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__5__Impl_in_rule__ChemEquation__Group__55934);
            rule__ChemEquation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__6_in_rule__ChemEquation__Group__55937);
            rule__ChemEquation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__5"


    // $ANTLR start "rule__ChemEquation__Group__5__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2931:1: rule__ChemEquation__Group__5__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2935:1: ( ( '>' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2936:1: ( '>' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2936:1: ( '>' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2937:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__ChemEquation__Group__5__Impl5965); 
             after(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__5__Impl"


    // $ANTLR start "rule__ChemEquation__Group__6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2950:1: rule__ChemEquation__Group__6 : rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 ;
    public final void rule__ChemEquation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2954:1: ( rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2955:2: rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__6__Impl_in_rule__ChemEquation__Group__65996);
            rule__ChemEquation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__7_in_rule__ChemEquation__Group__65999);
            rule__ChemEquation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__6"


    // $ANTLR start "rule__ChemEquation__Group__6__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2962:1: rule__ChemEquation__Group__6__Impl : ( ( rule__ChemEquation__ProducesAssignment_6 )? ) ;
    public final void rule__ChemEquation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2966:1: ( ( ( rule__ChemEquation__ProducesAssignment_6 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2967:1: ( ( rule__ChemEquation__ProducesAssignment_6 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2967:1: ( ( rule__ChemEquation__ProducesAssignment_6 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2968:1: ( rule__ChemEquation__ProducesAssignment_6 )?
            {
             before(grammarAccess.getChemEquationAccess().getProducesAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2969:1: ( rule__ChemEquation__ProducesAssignment_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2969:2: rule__ChemEquation__ProducesAssignment_6
                    {
                    pushFollow(FOLLOW_rule__ChemEquation__ProducesAssignment_6_in_rule__ChemEquation__Group__6__Impl6026);
                    rule__ChemEquation__ProducesAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemEquationAccess().getProducesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__6__Impl"


    // $ANTLR start "rule__ChemEquation__Group__7"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2979:1: rule__ChemEquation__Group__7 : rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 ;
    public final void rule__ChemEquation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2983:1: ( rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2984:2: rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__7__Impl_in_rule__ChemEquation__Group__76057);
            rule__ChemEquation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__8_in_rule__ChemEquation__Group__76060);
            rule__ChemEquation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__7"


    // $ANTLR start "rule__ChemEquation__Group__7__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2991:1: rule__ChemEquation__Group__7__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2995:1: ( ( '>' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2996:1: ( '>' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2996:1: ( '>' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2997:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7()); 
            match(input,29,FOLLOW_29_in_rule__ChemEquation__Group__7__Impl6088); 
             after(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__7__Impl"


    // $ANTLR start "rule__ChemEquation__Group__8"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3010:1: rule__ChemEquation__Group__8 : rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9 ;
    public final void rule__ChemEquation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3014:1: ( rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3015:2: rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__8__Impl_in_rule__ChemEquation__Group__86119);
            rule__ChemEquation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__9_in_rule__ChemEquation__Group__86122);
            rule__ChemEquation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__8"


    // $ANTLR start "rule__ChemEquation__Group__8__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3022:1: rule__ChemEquation__Group__8__Impl : ( ( rule__ChemEquation__ProductsAssignment_8 ) ) ;
    public final void rule__ChemEquation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3026:1: ( ( ( rule__ChemEquation__ProductsAssignment_8 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3027:1: ( ( rule__ChemEquation__ProductsAssignment_8 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3027:1: ( ( rule__ChemEquation__ProductsAssignment_8 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3028:1: ( rule__ChemEquation__ProductsAssignment_8 )
            {
             before(grammarAccess.getChemEquationAccess().getProductsAssignment_8()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3029:1: ( rule__ChemEquation__ProductsAssignment_8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3029:2: rule__ChemEquation__ProductsAssignment_8
            {
            pushFollow(FOLLOW_rule__ChemEquation__ProductsAssignment_8_in_rule__ChemEquation__Group__8__Impl6149);
            rule__ChemEquation__ProductsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getChemEquationAccess().getProductsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__8__Impl"


    // $ANTLR start "rule__ChemEquation__Group__9"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3039:1: rule__ChemEquation__Group__9 : rule__ChemEquation__Group__9__Impl ;
    public final void rule__ChemEquation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3043:1: ( rule__ChemEquation__Group__9__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3044:2: rule__ChemEquation__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__9__Impl_in_rule__ChemEquation__Group__96179);
            rule__ChemEquation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__9"


    // $ANTLR start "rule__ChemEquation__Group__9__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3050:1: rule__ChemEquation__Group__9__Impl : ( '}' ) ;
    public final void rule__ChemEquation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3054:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3055:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3055:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3056:1: '}'
            {
             before(grammarAccess.getChemEquationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_24_in_rule__ChemEquation__Group__9__Impl6207); 
             after(grammarAccess.getChemEquationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__Group__9__Impl"


    // $ANTLR start "rule__ChemCompound__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3089:1: rule__ChemCompound__Group__0 : rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 ;
    public final void rule__ChemCompound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3093:1: ( rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3094:2: rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__0__Impl_in_rule__ChemCompound__Group__06258);
            rule__ChemCompound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__1_in_rule__ChemCompound__Group__06261);
            rule__ChemCompound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__0"


    // $ANTLR start "rule__ChemCompound__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3101:1: rule__ChemCompound__Group__0__Impl : ( '@chem_compound' ) ;
    public final void rule__ChemCompound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3105:1: ( ( '@chem_compound' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3106:1: ( '@chem_compound' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3106:1: ( '@chem_compound' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3107:1: '@chem_compound'
            {
             before(grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ChemCompound__Group__0__Impl6289); 
             after(grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__0__Impl"


    // $ANTLR start "rule__ChemCompound__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3120:1: rule__ChemCompound__Group__1 : rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 ;
    public final void rule__ChemCompound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3124:1: ( rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3125:2: rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__1__Impl_in_rule__ChemCompound__Group__16320);
            rule__ChemCompound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__2_in_rule__ChemCompound__Group__16323);
            rule__ChemCompound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__1"


    // $ANTLR start "rule__ChemCompound__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3132:1: rule__ChemCompound__Group__1__Impl : ( ( rule__ChemCompound__HideFromViewAssignment_1 )? ) ;
    public final void rule__ChemCompound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3136:1: ( ( ( rule__ChemCompound__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3137:1: ( ( rule__ChemCompound__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3137:1: ( ( rule__ChemCompound__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3138:1: ( rule__ChemCompound__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3139:1: ( rule__ChemCompound__HideFromViewAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3139:2: rule__ChemCompound__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ChemCompound__HideFromViewAssignment_1_in_rule__ChemCompound__Group__1__Impl6350);
                    rule__ChemCompound__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemCompoundAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__1__Impl"


    // $ANTLR start "rule__ChemCompound__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3149:1: rule__ChemCompound__Group__2 : rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 ;
    public final void rule__ChemCompound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3153:1: ( rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3154:2: rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__2__Impl_in_rule__ChemCompound__Group__26381);
            rule__ChemCompound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__3_in_rule__ChemCompound__Group__26384);
            rule__ChemCompound__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__2"


    // $ANTLR start "rule__ChemCompound__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3161:1: rule__ChemCompound__Group__2__Impl : ( ( rule__ChemCompound__SymbolAssignment_2 ) ) ;
    public final void rule__ChemCompound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3165:1: ( ( ( rule__ChemCompound__SymbolAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3166:1: ( ( rule__ChemCompound__SymbolAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3166:1: ( ( rule__ChemCompound__SymbolAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3167:1: ( rule__ChemCompound__SymbolAssignment_2 )
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3168:1: ( rule__ChemCompound__SymbolAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3168:2: rule__ChemCompound__SymbolAssignment_2
            {
            pushFollow(FOLLOW_rule__ChemCompound__SymbolAssignment_2_in_rule__ChemCompound__Group__2__Impl6411);
            rule__ChemCompound__SymbolAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChemCompoundAccess().getSymbolAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__2__Impl"


    // $ANTLR start "rule__ChemCompound__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3178:1: rule__ChemCompound__Group__3 : rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4 ;
    public final void rule__ChemCompound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3182:1: ( rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3183:2: rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__3__Impl_in_rule__ChemCompound__Group__36441);
            rule__ChemCompound__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__4_in_rule__ChemCompound__Group__36444);
            rule__ChemCompound__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__3"


    // $ANTLR start "rule__ChemCompound__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3190:1: rule__ChemCompound__Group__3__Impl : ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) ) ;
    public final void rule__ChemCompound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3194:1: ( ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3195:1: ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3195:1: ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3196:1: ( rule__ChemCompound__ChemicalNameAssignment_3 )
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3197:1: ( rule__ChemCompound__ChemicalNameAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3197:2: rule__ChemCompound__ChemicalNameAssignment_3
            {
            pushFollow(FOLLOW_rule__ChemCompound__ChemicalNameAssignment_3_in_rule__ChemCompound__Group__3__Impl6471);
            rule__ChemCompound__ChemicalNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChemCompoundAccess().getChemicalNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__3__Impl"


    // $ANTLR start "rule__ChemCompound__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3207:1: rule__ChemCompound__Group__4 : rule__ChemCompound__Group__4__Impl ;
    public final void rule__ChemCompound__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3211:1: ( rule__ChemCompound__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3212:2: rule__ChemCompound__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__4__Impl_in_rule__ChemCompound__Group__46501);
            rule__ChemCompound__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__4"


    // $ANTLR start "rule__ChemCompound__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3218:1: rule__ChemCompound__Group__4__Impl : ( ( rule__ChemCompound__CommonNameAssignment_4 )? ) ;
    public final void rule__ChemCompound__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3222:1: ( ( ( rule__ChemCompound__CommonNameAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3223:1: ( ( rule__ChemCompound__CommonNameAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3223:1: ( ( rule__ChemCompound__CommonNameAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3224:1: ( rule__ChemCompound__CommonNameAssignment_4 )?
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3225:1: ( rule__ChemCompound__CommonNameAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3225:2: rule__ChemCompound__CommonNameAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ChemCompound__CommonNameAssignment_4_in_rule__ChemCompound__Group__4__Impl6528);
                    rule__ChemCompound__CommonNameAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemCompoundAccess().getCommonNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__Group__4__Impl"


    // $ANTLR start "rule__Spellbee__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3245:1: rule__Spellbee__Group__0 : rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 ;
    public final void rule__Spellbee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3249:1: ( rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3250:2: rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__0__Impl_in_rule__Spellbee__Group__06569);
            rule__Spellbee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spellbee__Group__1_in_rule__Spellbee__Group__06572);
            rule__Spellbee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__0"


    // $ANTLR start "rule__Spellbee__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3257:1: rule__Spellbee__Group__0__Impl : ( '@spellbee' ) ;
    public final void rule__Spellbee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3261:1: ( ( '@spellbee' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3262:1: ( '@spellbee' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3262:1: ( '@spellbee' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3263:1: '@spellbee'
            {
             before(grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Spellbee__Group__0__Impl6600); 
             after(grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__0__Impl"


    // $ANTLR start "rule__Spellbee__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3276:1: rule__Spellbee__Group__1 : rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2 ;
    public final void rule__Spellbee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3280:1: ( rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3281:2: rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__1__Impl_in_rule__Spellbee__Group__16631);
            rule__Spellbee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spellbee__Group__2_in_rule__Spellbee__Group__16634);
            rule__Spellbee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__1"


    // $ANTLR start "rule__Spellbee__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3288:1: rule__Spellbee__Group__1__Impl : ( ( rule__Spellbee__HideFromViewAssignment_1 )? ) ;
    public final void rule__Spellbee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3292:1: ( ( ( rule__Spellbee__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3293:1: ( ( rule__Spellbee__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3293:1: ( ( rule__Spellbee__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3294:1: ( rule__Spellbee__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3295:1: ( rule__Spellbee__HideFromViewAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3295:2: rule__Spellbee__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Spellbee__HideFromViewAssignment_1_in_rule__Spellbee__Group__1__Impl6661);
                    rule__Spellbee__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpellbeeAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__1__Impl"


    // $ANTLR start "rule__Spellbee__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3305:1: rule__Spellbee__Group__2 : rule__Spellbee__Group__2__Impl ;
    public final void rule__Spellbee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3309:1: ( rule__Spellbee__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3310:2: rule__Spellbee__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__2__Impl_in_rule__Spellbee__Group__26692);
            rule__Spellbee__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__2"


    // $ANTLR start "rule__Spellbee__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3316:1: rule__Spellbee__Group__2__Impl : ( ( rule__Spellbee__WordAssignment_2 ) ) ;
    public final void rule__Spellbee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3320:1: ( ( ( rule__Spellbee__WordAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3321:1: ( ( rule__Spellbee__WordAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3321:1: ( ( rule__Spellbee__WordAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3322:1: ( rule__Spellbee__WordAssignment_2 )
            {
             before(grammarAccess.getSpellbeeAccess().getWordAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3323:1: ( rule__Spellbee__WordAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3323:2: rule__Spellbee__WordAssignment_2
            {
            pushFollow(FOLLOW_rule__Spellbee__WordAssignment_2_in_rule__Spellbee__Group__2__Impl6719);
            rule__Spellbee__WordAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpellbeeAccess().getWordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__Group__2__Impl"


    // $ANTLR start "rule__ImageLabel__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3339:1: rule__ImageLabel__Group__0 : rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 ;
    public final void rule__ImageLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3343:1: ( rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3344:2: rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__0__Impl_in_rule__ImageLabel__Group__06755);
            rule__ImageLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__1_in_rule__ImageLabel__Group__06758);
            rule__ImageLabel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__0"


    // $ANTLR start "rule__ImageLabel__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3351:1: rule__ImageLabel__Group__0__Impl : ( '@image_label' ) ;
    public final void rule__ImageLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3355:1: ( ( '@image_label' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3356:1: ( '@image_label' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3356:1: ( '@image_label' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3357:1: '@image_label'
            {
             before(grammarAccess.getImageLabelAccess().getImage_labelKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ImageLabel__Group__0__Impl6786); 
             after(grammarAccess.getImageLabelAccess().getImage_labelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__0__Impl"


    // $ANTLR start "rule__ImageLabel__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3370:1: rule__ImageLabel__Group__1 : rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 ;
    public final void rule__ImageLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3374:1: ( rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3375:2: rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__1__Impl_in_rule__ImageLabel__Group__16817);
            rule__ImageLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__2_in_rule__ImageLabel__Group__16820);
            rule__ImageLabel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__1"


    // $ANTLR start "rule__ImageLabel__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3382:1: rule__ImageLabel__Group__1__Impl : ( ( rule__ImageLabel__HideFromViewAssignment_1 )? ) ;
    public final void rule__ImageLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3386:1: ( ( ( rule__ImageLabel__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3387:1: ( ( rule__ImageLabel__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3387:1: ( ( rule__ImageLabel__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3388:1: ( rule__ImageLabel__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3389:1: ( rule__ImageLabel__HideFromViewAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3389:2: rule__ImageLabel__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ImageLabel__HideFromViewAssignment_1_in_rule__ImageLabel__Group__1__Impl6847);
                    rule__ImageLabel__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageLabelAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__1__Impl"


    // $ANTLR start "rule__ImageLabel__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3399:1: rule__ImageLabel__Group__2 : rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 ;
    public final void rule__ImageLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3403:1: ( rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3404:2: rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__2__Impl_in_rule__ImageLabel__Group__26878);
            rule__ImageLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__3_in_rule__ImageLabel__Group__26881);
            rule__ImageLabel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__2"


    // $ANTLR start "rule__ImageLabel__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3411:1: rule__ImageLabel__Group__2__Impl : ( ( rule__ImageLabel__CaptionAssignment_2 )? ) ;
    public final void rule__ImageLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3415:1: ( ( ( rule__ImageLabel__CaptionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3416:1: ( ( rule__ImageLabel__CaptionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3416:1: ( ( rule__ImageLabel__CaptionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3417:1: ( rule__ImageLabel__CaptionAssignment_2 )?
            {
             before(grammarAccess.getImageLabelAccess().getCaptionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3418:1: ( rule__ImageLabel__CaptionAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3418:2: rule__ImageLabel__CaptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ImageLabel__CaptionAssignment_2_in_rule__ImageLabel__Group__2__Impl6908);
                    rule__ImageLabel__CaptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageLabelAccess().getCaptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__2__Impl"


    // $ANTLR start "rule__ImageLabel__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3428:1: rule__ImageLabel__Group__3 : rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 ;
    public final void rule__ImageLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3432:1: ( rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3433:2: rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__3__Impl_in_rule__ImageLabel__Group__36939);
            rule__ImageLabel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__4_in_rule__ImageLabel__Group__36942);
            rule__ImageLabel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__3"


    // $ANTLR start "rule__ImageLabel__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3440:1: rule__ImageLabel__Group__3__Impl : ( '{' ) ;
    public final void rule__ImageLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3444:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3445:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3445:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3446:1: '{'
            {
             before(grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ImageLabel__Group__3__Impl6970); 
             after(grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__3__Impl"


    // $ANTLR start "rule__ImageLabel__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3459:1: rule__ImageLabel__Group__4 : rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 ;
    public final void rule__ImageLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3463:1: ( rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3464:2: rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__4__Impl_in_rule__ImageLabel__Group__47001);
            rule__ImageLabel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__5_in_rule__ImageLabel__Group__47004);
            rule__ImageLabel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__4"


    // $ANTLR start "rule__ImageLabel__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3471:1: rule__ImageLabel__Group__4__Impl : ( 'imageName' ) ;
    public final void rule__ImageLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3475:1: ( ( 'imageName' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3476:1: ( 'imageName' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3476:1: ( 'imageName' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3477:1: 'imageName'
            {
             before(grammarAccess.getImageLabelAccess().getImageNameKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__ImageLabel__Group__4__Impl7032); 
             after(grammarAccess.getImageLabelAccess().getImageNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__4__Impl"


    // $ANTLR start "rule__ImageLabel__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3490:1: rule__ImageLabel__Group__5 : rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 ;
    public final void rule__ImageLabel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3494:1: ( rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3495:2: rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__5__Impl_in_rule__ImageLabel__Group__57063);
            rule__ImageLabel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__6_in_rule__ImageLabel__Group__57066);
            rule__ImageLabel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__5"


    // $ANTLR start "rule__ImageLabel__Group__5__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3502:1: rule__ImageLabel__Group__5__Impl : ( ( rule__ImageLabel__ImageNameAssignment_5 ) ) ;
    public final void rule__ImageLabel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3506:1: ( ( ( rule__ImageLabel__ImageNameAssignment_5 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3507:1: ( ( rule__ImageLabel__ImageNameAssignment_5 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3507:1: ( ( rule__ImageLabel__ImageNameAssignment_5 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3508:1: ( rule__ImageLabel__ImageNameAssignment_5 )
            {
             before(grammarAccess.getImageLabelAccess().getImageNameAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3509:1: ( rule__ImageLabel__ImageNameAssignment_5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3509:2: rule__ImageLabel__ImageNameAssignment_5
            {
            pushFollow(FOLLOW_rule__ImageLabel__ImageNameAssignment_5_in_rule__ImageLabel__Group__5__Impl7093);
            rule__ImageLabel__ImageNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getImageNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__5__Impl"


    // $ANTLR start "rule__ImageLabel__Group__6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3519:1: rule__ImageLabel__Group__6 : rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 ;
    public final void rule__ImageLabel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3523:1: ( rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3524:2: rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__6__Impl_in_rule__ImageLabel__Group__67123);
            rule__ImageLabel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__7_in_rule__ImageLabel__Group__67126);
            rule__ImageLabel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__6"


    // $ANTLR start "rule__ImageLabel__Group__6__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3531:1: rule__ImageLabel__Group__6__Impl : ( ( rule__ImageLabel__HotspotsAssignment_6 ) ) ;
    public final void rule__ImageLabel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3535:1: ( ( ( rule__ImageLabel__HotspotsAssignment_6 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3536:1: ( ( rule__ImageLabel__HotspotsAssignment_6 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3536:1: ( ( rule__ImageLabel__HotspotsAssignment_6 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3537:1: ( rule__ImageLabel__HotspotsAssignment_6 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3538:1: ( rule__ImageLabel__HotspotsAssignment_6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3538:2: rule__ImageLabel__HotspotsAssignment_6
            {
            pushFollow(FOLLOW_rule__ImageLabel__HotspotsAssignment_6_in_rule__ImageLabel__Group__6__Impl7153);
            rule__ImageLabel__HotspotsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getHotspotsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__6__Impl"


    // $ANTLR start "rule__ImageLabel__Group__7"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3548:1: rule__ImageLabel__Group__7 : rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8 ;
    public final void rule__ImageLabel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3552:1: ( rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3553:2: rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__7__Impl_in_rule__ImageLabel__Group__77183);
            rule__ImageLabel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__8_in_rule__ImageLabel__Group__77186);
            rule__ImageLabel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__7"


    // $ANTLR start "rule__ImageLabel__Group__7__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3560:1: rule__ImageLabel__Group__7__Impl : ( ( rule__ImageLabel__Group_7__0 )* ) ;
    public final void rule__ImageLabel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3564:1: ( ( ( rule__ImageLabel__Group_7__0 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3565:1: ( ( rule__ImageLabel__Group_7__0 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3565:1: ( ( rule__ImageLabel__Group_7__0 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3566:1: ( rule__ImageLabel__Group_7__0 )*
            {
             before(grammarAccess.getImageLabelAccess().getGroup_7()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3567:1: ( rule__ImageLabel__Group_7__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3567:2: rule__ImageLabel__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__ImageLabel__Group_7__0_in_rule__ImageLabel__Group__7__Impl7213);
            	    rule__ImageLabel__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getImageLabelAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__7__Impl"


    // $ANTLR start "rule__ImageLabel__Group__8"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3577:1: rule__ImageLabel__Group__8 : rule__ImageLabel__Group__8__Impl ;
    public final void rule__ImageLabel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3581:1: ( rule__ImageLabel__Group__8__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3582:2: rule__ImageLabel__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__8__Impl_in_rule__ImageLabel__Group__87244);
            rule__ImageLabel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__8"


    // $ANTLR start "rule__ImageLabel__Group__8__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3588:1: rule__ImageLabel__Group__8__Impl : ( '}' ) ;
    public final void rule__ImageLabel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3592:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3593:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3593:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3594:1: '}'
            {
             before(grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__ImageLabel__Group__8__Impl7272); 
             after(grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group__8__Impl"


    // $ANTLR start "rule__ImageLabel__Group_7__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3625:1: rule__ImageLabel__Group_7__0 : rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1 ;
    public final void rule__ImageLabel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3629:1: ( rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3630:2: rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group_7__0__Impl_in_rule__ImageLabel__Group_7__07321);
            rule__ImageLabel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group_7__1_in_rule__ImageLabel__Group_7__07324);
            rule__ImageLabel__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group_7__0"


    // $ANTLR start "rule__ImageLabel__Group_7__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3637:1: rule__ImageLabel__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ImageLabel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3641:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3642:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3642:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3643:1: ','
            {
             before(grammarAccess.getImageLabelAccess().getCommaKeyword_7_0()); 
            match(input,34,FOLLOW_34_in_rule__ImageLabel__Group_7__0__Impl7352); 
             after(grammarAccess.getImageLabelAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group_7__0__Impl"


    // $ANTLR start "rule__ImageLabel__Group_7__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3656:1: rule__ImageLabel__Group_7__1 : rule__ImageLabel__Group_7__1__Impl ;
    public final void rule__ImageLabel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3660:1: ( rule__ImageLabel__Group_7__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3661:2: rule__ImageLabel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group_7__1__Impl_in_rule__ImageLabel__Group_7__17383);
            rule__ImageLabel__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group_7__1"


    // $ANTLR start "rule__ImageLabel__Group_7__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3667:1: rule__ImageLabel__Group_7__1__Impl : ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) ) ;
    public final void rule__ImageLabel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3671:1: ( ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3672:1: ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3672:1: ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3673:1: ( rule__ImageLabel__HotspotsAssignment_7_1 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_7_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3674:1: ( rule__ImageLabel__HotspotsAssignment_7_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3674:2: rule__ImageLabel__HotspotsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__ImageLabel__HotspotsAssignment_7_1_in_rule__ImageLabel__Group_7__1__Impl7410);
            rule__ImageLabel__HotspotsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getHotspotsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__Group_7__1__Impl"


    // $ANTLR start "rule__HotSpot__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3688:1: rule__HotSpot__Group__0 : rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 ;
    public final void rule__HotSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3692:1: ( rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3693:2: rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__0__Impl_in_rule__HotSpot__Group__07444);
            rule__HotSpot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__1_in_rule__HotSpot__Group__07447);
            rule__HotSpot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__0"


    // $ANTLR start "rule__HotSpot__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3700:1: rule__HotSpot__Group__0__Impl : ( ( rule__HotSpot__XAssignment_0 ) ) ;
    public final void rule__HotSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3704:1: ( ( ( rule__HotSpot__XAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3705:1: ( ( rule__HotSpot__XAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3705:1: ( ( rule__HotSpot__XAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3706:1: ( rule__HotSpot__XAssignment_0 )
            {
             before(grammarAccess.getHotSpotAccess().getXAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3707:1: ( rule__HotSpot__XAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3707:2: rule__HotSpot__XAssignment_0
            {
            pushFollow(FOLLOW_rule__HotSpot__XAssignment_0_in_rule__HotSpot__Group__0__Impl7474);
            rule__HotSpot__XAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHotSpotAccess().getXAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__0__Impl"


    // $ANTLR start "rule__HotSpot__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3717:1: rule__HotSpot__Group__1 : rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 ;
    public final void rule__HotSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3721:1: ( rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3722:2: rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__1__Impl_in_rule__HotSpot__Group__17504);
            rule__HotSpot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__2_in_rule__HotSpot__Group__17507);
            rule__HotSpot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__1"


    // $ANTLR start "rule__HotSpot__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3729:1: rule__HotSpot__Group__1__Impl : ( ',' ) ;
    public final void rule__HotSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3733:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3734:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3734:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3735:1: ','
            {
             before(grammarAccess.getHotSpotAccess().getCommaKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__HotSpot__Group__1__Impl7535); 
             after(grammarAccess.getHotSpotAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__1__Impl"


    // $ANTLR start "rule__HotSpot__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3748:1: rule__HotSpot__Group__2 : rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 ;
    public final void rule__HotSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3752:1: ( rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3753:2: rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__2__Impl_in_rule__HotSpot__Group__27566);
            rule__HotSpot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__3_in_rule__HotSpot__Group__27569);
            rule__HotSpot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__2"


    // $ANTLR start "rule__HotSpot__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3760:1: rule__HotSpot__Group__2__Impl : ( ( rule__HotSpot__YAssignment_2 ) ) ;
    public final void rule__HotSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3764:1: ( ( ( rule__HotSpot__YAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3765:1: ( ( rule__HotSpot__YAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3765:1: ( ( rule__HotSpot__YAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3766:1: ( rule__HotSpot__YAssignment_2 )
            {
             before(grammarAccess.getHotSpotAccess().getYAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3767:1: ( rule__HotSpot__YAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3767:2: rule__HotSpot__YAssignment_2
            {
            pushFollow(FOLLOW_rule__HotSpot__YAssignment_2_in_rule__HotSpot__Group__2__Impl7596);
            rule__HotSpot__YAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHotSpotAccess().getYAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__2__Impl"


    // $ANTLR start "rule__HotSpot__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3777:1: rule__HotSpot__Group__3 : rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 ;
    public final void rule__HotSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3781:1: ( rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3782:2: rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__3__Impl_in_rule__HotSpot__Group__37626);
            rule__HotSpot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__4_in_rule__HotSpot__Group__37629);
            rule__HotSpot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__3"


    // $ANTLR start "rule__HotSpot__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3789:1: rule__HotSpot__Group__3__Impl : ( '=' ) ;
    public final void rule__HotSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3793:1: ( ( '=' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3794:1: ( '=' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3794:1: ( '=' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3795:1: '='
            {
             before(grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__HotSpot__Group__3__Impl7657); 
             after(grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__3__Impl"


    // $ANTLR start "rule__HotSpot__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3808:1: rule__HotSpot__Group__4 : rule__HotSpot__Group__4__Impl ;
    public final void rule__HotSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3812:1: ( rule__HotSpot__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3813:2: rule__HotSpot__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__4__Impl_in_rule__HotSpot__Group__47688);
            rule__HotSpot__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__4"


    // $ANTLR start "rule__HotSpot__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3819:1: rule__HotSpot__Group__4__Impl : ( ( rule__HotSpot__LabelAssignment_4 ) ) ;
    public final void rule__HotSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3823:1: ( ( ( rule__HotSpot__LabelAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3824:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3824:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3825:1: ( rule__HotSpot__LabelAssignment_4 )
            {
             before(grammarAccess.getHotSpotAccess().getLabelAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3826:1: ( rule__HotSpot__LabelAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3826:2: rule__HotSpot__LabelAssignment_4
            {
            pushFollow(FOLLOW_rule__HotSpot__LabelAssignment_4_in_rule__HotSpot__Group__4__Impl7715);
            rule__HotSpot__LabelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHotSpotAccess().getLabelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__Group__4__Impl"


    // $ANTLR start "rule__Equation__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3846:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3850:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3851:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__07755);
            rule__Equation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__07758);
            rule__Equation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__0"


    // $ANTLR start "rule__Equation__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3858:1: rule__Equation__Group__0__Impl : ( '@equation' ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3862:1: ( ( '@equation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3863:1: ( '@equation' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3863:1: ( '@equation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3864:1: '@equation'
            {
             before(grammarAccess.getEquationAccess().getEquationKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Equation__Group__0__Impl7786); 
             after(grammarAccess.getEquationAccess().getEquationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__0__Impl"


    // $ANTLR start "rule__Equation__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3877:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3881:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3882:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__17817);
            rule__Equation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__17820);
            rule__Equation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__1"


    // $ANTLR start "rule__Equation__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3889:1: rule__Equation__Group__1__Impl : ( ( rule__Equation__HideFromViewAssignment_1 )? ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3893:1: ( ( ( rule__Equation__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3894:1: ( ( rule__Equation__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3894:1: ( ( rule__Equation__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3895:1: ( rule__Equation__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getEquationAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3896:1: ( rule__Equation__HideFromViewAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3896:2: rule__Equation__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Equation__HideFromViewAssignment_1_in_rule__Equation__Group__1__Impl7847);
                    rule__Equation__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEquationAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__1__Impl"


    // $ANTLR start "rule__Equation__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3906:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl rule__Equation__Group__3 ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3910:1: ( rule__Equation__Group__2__Impl rule__Equation__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3911:2: rule__Equation__Group__2__Impl rule__Equation__Group__3
            {
            pushFollow(FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__27878);
            rule__Equation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__27881);
            rule__Equation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__2"


    // $ANTLR start "rule__Equation__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3918:1: rule__Equation__Group__2__Impl : ( ( rule__Equation__EquationAssignment_2 ) ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3922:1: ( ( ( rule__Equation__EquationAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3923:1: ( ( rule__Equation__EquationAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3923:1: ( ( rule__Equation__EquationAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3924:1: ( rule__Equation__EquationAssignment_2 )
            {
             before(grammarAccess.getEquationAccess().getEquationAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3925:1: ( rule__Equation__EquationAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3925:2: rule__Equation__EquationAssignment_2
            {
            pushFollow(FOLLOW_rule__Equation__EquationAssignment_2_in_rule__Equation__Group__2__Impl7908);
            rule__Equation__EquationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getEquationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__2__Impl"


    // $ANTLR start "rule__Equation__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3935:1: rule__Equation__Group__3 : rule__Equation__Group__3__Impl rule__Equation__Group__4 ;
    public final void rule__Equation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3939:1: ( rule__Equation__Group__3__Impl rule__Equation__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3940:2: rule__Equation__Group__3__Impl rule__Equation__Group__4
            {
            pushFollow(FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__37938);
            rule__Equation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__37941);
            rule__Equation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__3"


    // $ANTLR start "rule__Equation__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3947:1: rule__Equation__Group__3__Impl : ( '{' ) ;
    public final void rule__Equation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3951:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3952:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3952:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3953:1: '{'
            {
             before(grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Equation__Group__3__Impl7969); 
             after(grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__3__Impl"


    // $ANTLR start "rule__Equation__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3966:1: rule__Equation__Group__4 : rule__Equation__Group__4__Impl rule__Equation__Group__5 ;
    public final void rule__Equation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3970:1: ( rule__Equation__Group__4__Impl rule__Equation__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3971:2: rule__Equation__Group__4__Impl rule__Equation__Group__5
            {
            pushFollow(FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__48000);
            rule__Equation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__5_in_rule__Equation__Group__48003);
            rule__Equation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__4"


    // $ANTLR start "rule__Equation__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3978:1: rule__Equation__Group__4__Impl : ( ( rule__Equation__DescriptionAssignment_4 )? ) ;
    public final void rule__Equation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3982:1: ( ( ( rule__Equation__DescriptionAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3983:1: ( ( rule__Equation__DescriptionAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3983:1: ( ( rule__Equation__DescriptionAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3984:1: ( rule__Equation__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getEquationAccess().getDescriptionAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3985:1: ( rule__Equation__DescriptionAssignment_4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3985:2: rule__Equation__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Equation__DescriptionAssignment_4_in_rule__Equation__Group__4__Impl8030);
                    rule__Equation__DescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEquationAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__4__Impl"


    // $ANTLR start "rule__Equation__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3995:1: rule__Equation__Group__5 : rule__Equation__Group__5__Impl rule__Equation__Group__6 ;
    public final void rule__Equation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3999:1: ( rule__Equation__Group__5__Impl rule__Equation__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4000:2: rule__Equation__Group__5__Impl rule__Equation__Group__6
            {
            pushFollow(FOLLOW_rule__Equation__Group__5__Impl_in_rule__Equation__Group__58061);
            rule__Equation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__6_in_rule__Equation__Group__58064);
            rule__Equation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__5"


    // $ANTLR start "rule__Equation__Group__5__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4007:1: rule__Equation__Group__5__Impl : ( 'where' ) ;
    public final void rule__Equation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4011:1: ( ( 'where' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4012:1: ( 'where' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4012:1: ( 'where' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4013:1: 'where'
            {
             before(grammarAccess.getEquationAccess().getWhereKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__Equation__Group__5__Impl8092); 
             after(grammarAccess.getEquationAccess().getWhereKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__5__Impl"


    // $ANTLR start "rule__Equation__Group__6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4026:1: rule__Equation__Group__6 : rule__Equation__Group__6__Impl rule__Equation__Group__7 ;
    public final void rule__Equation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4030:1: ( rule__Equation__Group__6__Impl rule__Equation__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4031:2: rule__Equation__Group__6__Impl rule__Equation__Group__7
            {
            pushFollow(FOLLOW_rule__Equation__Group__6__Impl_in_rule__Equation__Group__68123);
            rule__Equation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__7_in_rule__Equation__Group__68126);
            rule__Equation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__6"


    // $ANTLR start "rule__Equation__Group__6__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4038:1: rule__Equation__Group__6__Impl : ( ( rule__Equation__SymbolsAssignment_6 ) ) ;
    public final void rule__Equation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4042:1: ( ( ( rule__Equation__SymbolsAssignment_6 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4043:1: ( ( rule__Equation__SymbolsAssignment_6 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4043:1: ( ( rule__Equation__SymbolsAssignment_6 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4044:1: ( rule__Equation__SymbolsAssignment_6 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4045:1: ( rule__Equation__SymbolsAssignment_6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4045:2: rule__Equation__SymbolsAssignment_6
            {
            pushFollow(FOLLOW_rule__Equation__SymbolsAssignment_6_in_rule__Equation__Group__6__Impl8153);
            rule__Equation__SymbolsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getSymbolsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__6__Impl"


    // $ANTLR start "rule__Equation__Group__7"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4055:1: rule__Equation__Group__7 : rule__Equation__Group__7__Impl rule__Equation__Group__8 ;
    public final void rule__Equation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4059:1: ( rule__Equation__Group__7__Impl rule__Equation__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4060:2: rule__Equation__Group__7__Impl rule__Equation__Group__8
            {
            pushFollow(FOLLOW_rule__Equation__Group__7__Impl_in_rule__Equation__Group__78183);
            rule__Equation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__8_in_rule__Equation__Group__78186);
            rule__Equation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__7"


    // $ANTLR start "rule__Equation__Group__7__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4067:1: rule__Equation__Group__7__Impl : ( ( rule__Equation__Group_7__0 )* ) ;
    public final void rule__Equation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4071:1: ( ( ( rule__Equation__Group_7__0 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4072:1: ( ( rule__Equation__Group_7__0 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4072:1: ( ( rule__Equation__Group_7__0 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4073:1: ( rule__Equation__Group_7__0 )*
            {
             before(grammarAccess.getEquationAccess().getGroup_7()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4074:1: ( rule__Equation__Group_7__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4074:2: rule__Equation__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Equation__Group_7__0_in_rule__Equation__Group__7__Impl8213);
            	    rule__Equation__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getEquationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__7__Impl"


    // $ANTLR start "rule__Equation__Group__8"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4084:1: rule__Equation__Group__8 : rule__Equation__Group__8__Impl ;
    public final void rule__Equation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4088:1: ( rule__Equation__Group__8__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4089:2: rule__Equation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group__8__Impl_in_rule__Equation__Group__88244);
            rule__Equation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__8"


    // $ANTLR start "rule__Equation__Group__8__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4095:1: rule__Equation__Group__8__Impl : ( '}' ) ;
    public final void rule__Equation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4099:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4100:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4100:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4101:1: '}'
            {
             before(grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__Equation__Group__8__Impl8272); 
             after(grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__8__Impl"


    // $ANTLR start "rule__Equation__Group_7__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4132:1: rule__Equation__Group_7__0 : rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1 ;
    public final void rule__Equation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4136:1: ( rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4137:2: rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1
            {
            pushFollow(FOLLOW_rule__Equation__Group_7__0__Impl_in_rule__Equation__Group_7__08321);
            rule__Equation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group_7__1_in_rule__Equation__Group_7__08324);
            rule__Equation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_7__0"


    // $ANTLR start "rule__Equation__Group_7__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4144:1: rule__Equation__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Equation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4148:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4149:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4149:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4150:1: ','
            {
             before(grammarAccess.getEquationAccess().getCommaKeyword_7_0()); 
            match(input,34,FOLLOW_34_in_rule__Equation__Group_7__0__Impl8352); 
             after(grammarAccess.getEquationAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_7__0__Impl"


    // $ANTLR start "rule__Equation__Group_7__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4163:1: rule__Equation__Group_7__1 : rule__Equation__Group_7__1__Impl ;
    public final void rule__Equation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4167:1: ( rule__Equation__Group_7__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4168:2: rule__Equation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group_7__1__Impl_in_rule__Equation__Group_7__18383);
            rule__Equation__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_7__1"


    // $ANTLR start "rule__Equation__Group_7__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4174:1: rule__Equation__Group_7__1__Impl : ( ( rule__Equation__SymbolsAssignment_7_1 ) ) ;
    public final void rule__Equation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4178:1: ( ( ( rule__Equation__SymbolsAssignment_7_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4179:1: ( ( rule__Equation__SymbolsAssignment_7_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4179:1: ( ( rule__Equation__SymbolsAssignment_7_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4180:1: ( rule__Equation__SymbolsAssignment_7_1 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_7_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4181:1: ( rule__Equation__SymbolsAssignment_7_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4181:2: rule__Equation__SymbolsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Equation__SymbolsAssignment_7_1_in_rule__Equation__Group_7__1__Impl8410);
            rule__Equation__SymbolsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getSymbolsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group_7__1__Impl"


    // $ANTLR start "rule__EqSymbol__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4195:1: rule__EqSymbol__Group__0 : rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 ;
    public final void rule__EqSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4199:1: ( rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4200:2: rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__0__Impl_in_rule__EqSymbol__Group__08444);
            rule__EqSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqSymbol__Group__1_in_rule__EqSymbol__Group__08447);
            rule__EqSymbol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__0"


    // $ANTLR start "rule__EqSymbol__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4207:1: rule__EqSymbol__Group__0__Impl : ( ( rule__EqSymbol__SymbolAssignment_0 ) ) ;
    public final void rule__EqSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4211:1: ( ( ( rule__EqSymbol__SymbolAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4212:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4212:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4213:1: ( rule__EqSymbol__SymbolAssignment_0 )
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4214:1: ( rule__EqSymbol__SymbolAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4214:2: rule__EqSymbol__SymbolAssignment_0
            {
            pushFollow(FOLLOW_rule__EqSymbol__SymbolAssignment_0_in_rule__EqSymbol__Group__0__Impl8474);
            rule__EqSymbol__SymbolAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEqSymbolAccess().getSymbolAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__0__Impl"


    // $ANTLR start "rule__EqSymbol__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4224:1: rule__EqSymbol__Group__1 : rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 ;
    public final void rule__EqSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4228:1: ( rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4229:2: rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__1__Impl_in_rule__EqSymbol__Group__18504);
            rule__EqSymbol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqSymbol__Group__2_in_rule__EqSymbol__Group__18507);
            rule__EqSymbol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__1"


    // $ANTLR start "rule__EqSymbol__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4236:1: rule__EqSymbol__Group__1__Impl : ( '=' ) ;
    public final void rule__EqSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4240:1: ( ( '=' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4241:1: ( '=' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4241:1: ( '=' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4242:1: '='
            {
             before(grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__EqSymbol__Group__1__Impl8535); 
             after(grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__1__Impl"


    // $ANTLR start "rule__EqSymbol__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4255:1: rule__EqSymbol__Group__2 : rule__EqSymbol__Group__2__Impl ;
    public final void rule__EqSymbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4259:1: ( rule__EqSymbol__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4260:2: rule__EqSymbol__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__2__Impl_in_rule__EqSymbol__Group__28566);
            rule__EqSymbol__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__2"


    // $ANTLR start "rule__EqSymbol__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4266:1: rule__EqSymbol__Group__2__Impl : ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) ;
    public final void rule__EqSymbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4270:1: ( ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4271:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4271:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4272:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4273:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4273:2: rule__EqSymbol__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__EqSymbol__DescriptionAssignment_2_in_rule__EqSymbol__Group__2__Impl8593);
            rule__EqSymbol__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEqSymbolAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__Group__2__Impl"


    // $ANTLR start "rule__RefToContext__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4289:1: rule__RefToContext__Group__0 : rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 ;
    public final void rule__RefToContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4293:1: ( rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4294:2: rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__0__Impl_in_rule__RefToContext__Group__08629);
            rule__RefToContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__1_in_rule__RefToContext__Group__08632);
            rule__RefToContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__0"


    // $ANTLR start "rule__RefToContext__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4301:1: rule__RefToContext__Group__0__Impl : ( '@rtc' ) ;
    public final void rule__RefToContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4305:1: ( ( '@rtc' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4306:1: ( '@rtc' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4306:1: ( '@rtc' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4307:1: '@rtc'
            {
             before(grammarAccess.getRefToContextAccess().getRtcKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__RefToContext__Group__0__Impl8660); 
             after(grammarAccess.getRefToContextAccess().getRtcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__0__Impl"


    // $ANTLR start "rule__RefToContext__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4320:1: rule__RefToContext__Group__1 : rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 ;
    public final void rule__RefToContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4324:1: ( rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4325:2: rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__1__Impl_in_rule__RefToContext__Group__18691);
            rule__RefToContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__2_in_rule__RefToContext__Group__18694);
            rule__RefToContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__1"


    // $ANTLR start "rule__RefToContext__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4332:1: rule__RefToContext__Group__1__Impl : ( ( rule__RefToContext__HideFromViewAssignment_1 )? ) ;
    public final void rule__RefToContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4336:1: ( ( ( rule__RefToContext__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4337:1: ( ( rule__RefToContext__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4337:1: ( ( rule__RefToContext__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4338:1: ( rule__RefToContext__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4339:1: ( rule__RefToContext__HideFromViewAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4339:2: rule__RefToContext__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RefToContext__HideFromViewAssignment_1_in_rule__RefToContext__Group__1__Impl8721);
                    rule__RefToContext__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefToContextAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__1__Impl"


    // $ANTLR start "rule__RefToContext__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4349:1: rule__RefToContext__Group__2 : rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 ;
    public final void rule__RefToContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4353:1: ( rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4354:2: rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__2__Impl_in_rule__RefToContext__Group__28752);
            rule__RefToContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__3_in_rule__RefToContext__Group__28755);
            rule__RefToContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__2"


    // $ANTLR start "rule__RefToContext__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4361:1: rule__RefToContext__Group__2__Impl : ( '{' ) ;
    public final void rule__RefToContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4365:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4366:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4366:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4367:1: '{'
            {
             before(grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__RefToContext__Group__2__Impl8783); 
             after(grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__2__Impl"


    // $ANTLR start "rule__RefToContext__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4380:1: rule__RefToContext__Group__3 : rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 ;
    public final void rule__RefToContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4384:1: ( rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4385:2: rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__3__Impl_in_rule__RefToContext__Group__38814);
            rule__RefToContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__4_in_rule__RefToContext__Group__38817);
            rule__RefToContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__3"


    // $ANTLR start "rule__RefToContext__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4392:1: rule__RefToContext__Group__3__Impl : ( 'context' ) ;
    public final void rule__RefToContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4396:1: ( ( 'context' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4397:1: ( 'context' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4397:1: ( 'context' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4398:1: 'context'
            {
             before(grammarAccess.getRefToContextAccess().getContextKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__RefToContext__Group__3__Impl8845); 
             after(grammarAccess.getRefToContextAccess().getContextKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__3__Impl"


    // $ANTLR start "rule__RefToContext__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4411:1: rule__RefToContext__Group__4 : rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 ;
    public final void rule__RefToContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4415:1: ( rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4416:2: rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__4__Impl_in_rule__RefToContext__Group__48876);
            rule__RefToContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__5_in_rule__RefToContext__Group__48879);
            rule__RefToContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__4"


    // $ANTLR start "rule__RefToContext__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4423:1: rule__RefToContext__Group__4__Impl : ( ( rule__RefToContext__ContextAssignment_4 ) ) ;
    public final void rule__RefToContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4427:1: ( ( ( rule__RefToContext__ContextAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4428:1: ( ( rule__RefToContext__ContextAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4428:1: ( ( rule__RefToContext__ContextAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4429:1: ( rule__RefToContext__ContextAssignment_4 )
            {
             before(grammarAccess.getRefToContextAccess().getContextAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4430:1: ( rule__RefToContext__ContextAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4430:2: rule__RefToContext__ContextAssignment_4
            {
            pushFollow(FOLLOW_rule__RefToContext__ContextAssignment_4_in_rule__RefToContext__Group__4__Impl8906);
            rule__RefToContext__ContextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getContextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__4__Impl"


    // $ANTLR start "rule__RefToContext__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4440:1: rule__RefToContext__Group__5 : rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6 ;
    public final void rule__RefToContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4444:1: ( rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4445:2: rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__5__Impl_in_rule__RefToContext__Group__58936);
            rule__RefToContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__6_in_rule__RefToContext__Group__58939);
            rule__RefToContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__5"


    // $ANTLR start "rule__RefToContext__Group__5__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4452:1: rule__RefToContext__Group__5__Impl : ( ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* ) ) ;
    public final void rule__RefToContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4456:1: ( ( ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4457:1: ( ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4457:1: ( ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4458:1: ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4458:1: ( ( rule__RefToContext__QuestionsAssignment_5 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4459:1: ( rule__RefToContext__QuestionsAssignment_5 )
            {
             before(grammarAccess.getRefToContextAccess().getQuestionsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4460:1: ( rule__RefToContext__QuestionsAssignment_5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4460:2: rule__RefToContext__QuestionsAssignment_5
            {
            pushFollow(FOLLOW_rule__RefToContext__QuestionsAssignment_5_in_rule__RefToContext__Group__5__Impl8968);
            rule__RefToContext__QuestionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getQuestionsAssignment_5()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4463:1: ( ( rule__RefToContext__QuestionsAssignment_5 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4464:1: ( rule__RefToContext__QuestionsAssignment_5 )*
            {
             before(grammarAccess.getRefToContextAccess().getQuestionsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4465:1: ( rule__RefToContext__QuestionsAssignment_5 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==17) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4465:2: rule__RefToContext__QuestionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__RefToContext__QuestionsAssignment_5_in_rule__RefToContext__Group__5__Impl8980);
            	    rule__RefToContext__QuestionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getRefToContextAccess().getQuestionsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__5__Impl"


    // $ANTLR start "rule__RefToContext__Group__6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4476:1: rule__RefToContext__Group__6 : rule__RefToContext__Group__6__Impl ;
    public final void rule__RefToContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4480:1: ( rule__RefToContext__Group__6__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4481:2: rule__RefToContext__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__6__Impl_in_rule__RefToContext__Group__69013);
            rule__RefToContext__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__6"


    // $ANTLR start "rule__RefToContext__Group__6__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4487:1: rule__RefToContext__Group__6__Impl : ( '}' ) ;
    public final void rule__RefToContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4491:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4492:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4492:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4493:1: '}'
            {
             before(grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__RefToContext__Group__6__Impl9041); 
             after(grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__Group__6__Impl"


    // $ANTLR start "rule__CMap__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4520:1: rule__CMap__Group__0 : rule__CMap__Group__0__Impl rule__CMap__Group__1 ;
    public final void rule__CMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4524:1: ( rule__CMap__Group__0__Impl rule__CMap__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4525:2: rule__CMap__Group__0__Impl rule__CMap__Group__1
            {
            pushFollow(FOLLOW_rule__CMap__Group__0__Impl_in_rule__CMap__Group__09086);
            rule__CMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CMap__Group__1_in_rule__CMap__Group__09089);
            rule__CMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__0"


    // $ANTLR start "rule__CMap__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4532:1: rule__CMap__Group__0__Impl : ( 'cmap' ) ;
    public final void rule__CMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4536:1: ( ( 'cmap' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4537:1: ( 'cmap' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4537:1: ( 'cmap' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4538:1: 'cmap'
            {
             before(grammarAccess.getCMapAccess().getCmapKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__CMap__Group__0__Impl9117); 
             after(grammarAccess.getCMapAccess().getCmapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__0__Impl"


    // $ANTLR start "rule__CMap__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4551:1: rule__CMap__Group__1 : rule__CMap__Group__1__Impl rule__CMap__Group__2 ;
    public final void rule__CMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4555:1: ( rule__CMap__Group__1__Impl rule__CMap__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4556:2: rule__CMap__Group__1__Impl rule__CMap__Group__2
            {
            pushFollow(FOLLOW_rule__CMap__Group__1__Impl_in_rule__CMap__Group__19148);
            rule__CMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CMap__Group__2_in_rule__CMap__Group__19151);
            rule__CMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__1"


    // $ANTLR start "rule__CMap__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4563:1: rule__CMap__Group__1__Impl : ( '{' ) ;
    public final void rule__CMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4567:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4568:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4568:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4569:1: '{'
            {
             before(grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__CMap__Group__1__Impl9179); 
             after(grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__1__Impl"


    // $ANTLR start "rule__CMap__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4582:1: rule__CMap__Group__2 : rule__CMap__Group__2__Impl rule__CMap__Group__3 ;
    public final void rule__CMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4586:1: ( rule__CMap__Group__2__Impl rule__CMap__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4587:2: rule__CMap__Group__2__Impl rule__CMap__Group__3
            {
            pushFollow(FOLLOW_rule__CMap__Group__2__Impl_in_rule__CMap__Group__29210);
            rule__CMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CMap__Group__3_in_rule__CMap__Group__29213);
            rule__CMap__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__2"


    // $ANTLR start "rule__CMap__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4594:1: rule__CMap__Group__2__Impl : ( ( rule__CMap__ContentAssignment_2 ) ) ;
    public final void rule__CMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4598:1: ( ( ( rule__CMap__ContentAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4599:1: ( ( rule__CMap__ContentAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4599:1: ( ( rule__CMap__ContentAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4600:1: ( rule__CMap__ContentAssignment_2 )
            {
             before(grammarAccess.getCMapAccess().getContentAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4601:1: ( rule__CMap__ContentAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4601:2: rule__CMap__ContentAssignment_2
            {
            pushFollow(FOLLOW_rule__CMap__ContentAssignment_2_in_rule__CMap__Group__2__Impl9240);
            rule__CMap__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCMapAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__2__Impl"


    // $ANTLR start "rule__CMap__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4611:1: rule__CMap__Group__3 : rule__CMap__Group__3__Impl ;
    public final void rule__CMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4615:1: ( rule__CMap__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4616:2: rule__CMap__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CMap__Group__3__Impl_in_rule__CMap__Group__39270);
            rule__CMap__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__3"


    // $ANTLR start "rule__CMap__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4622:1: rule__CMap__Group__3__Impl : ( '}' ) ;
    public final void rule__CMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4626:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4627:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4627:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4628:1: '}'
            {
             before(grammarAccess.getCMapAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__CMap__Group__3__Impl9298); 
             after(grammarAccess.getCMapAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__Group__3__Impl"


    // $ANTLR start "rule__JoveNotes__ProcessingHintsAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4650:1: rule__JoveNotes__ProcessingHintsAssignment_0 : ( ruleProcessingHints ) ;
    public final void rule__JoveNotes__ProcessingHintsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4654:1: ( ( ruleProcessingHints ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4655:1: ( ruleProcessingHints )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4655:1: ( ruleProcessingHints )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4656:1: ruleProcessingHints
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsProcessingHintsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProcessingHints_in_rule__JoveNotes__ProcessingHintsAssignment_09342);
            ruleProcessingHints();

            state._fsp--;

             after(grammarAccess.getJoveNotesAccess().getProcessingHintsProcessingHintsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__ProcessingHintsAssignment_0"


    // $ANTLR start "rule__JoveNotes__ChapterDetailsAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4665:1: rule__JoveNotes__ChapterDetailsAssignment_1 : ( ruleChapterDetails ) ;
    public final void rule__JoveNotes__ChapterDetailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4669:1: ( ( ruleChapterDetails ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4670:1: ( ruleChapterDetails )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4670:1: ( ruleChapterDetails )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4671:1: ruleChapterDetails
            {
             before(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleChapterDetails_in_rule__JoveNotes__ChapterDetailsAssignment_19373);
            ruleChapterDetails();

            state._fsp--;

             after(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__ChapterDetailsAssignment_1"


    // $ANTLR start "rule__JoveNotes__NotesElementsAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4680:1: rule__JoveNotes__NotesElementsAssignment_2 : ( ruleNotesElement ) ;
    public final void rule__JoveNotes__NotesElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4684:1: ( ( ruleNotesElement ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4685:1: ( ruleNotesElement )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4685:1: ( ruleNotesElement )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4686:1: ruleNotesElement
            {
             before(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNotesElement_in_rule__JoveNotes__NotesElementsAssignment_29404);
            ruleNotesElement();

            state._fsp--;

             after(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoveNotes__NotesElementsAssignment_2"


    // $ANTLR start "rule__ProcessingHints__SkipGenerationAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4695:1: rule__ProcessingHints__SkipGenerationAssignment_1 : ( ( '@skip_generation' ) ) ;
    public final void rule__ProcessingHints__SkipGenerationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4699:1: ( ( ( '@skip_generation' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4700:1: ( ( '@skip_generation' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4700:1: ( ( '@skip_generation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4701:1: ( '@skip_generation' )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4702:1: ( '@skip_generation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4703:1: '@skip_generation'
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__ProcessingHints__SkipGenerationAssignment_19440); 
             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 

            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__SkipGenerationAssignment_1"


    // $ANTLR start "rule__ProcessingHints__SkipGenerationInProductionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4718:1: rule__ProcessingHints__SkipGenerationInProductionAssignment_2 : ( ( '@skip_generation_in_production' ) ) ;
    public final void rule__ProcessingHints__SkipGenerationInProductionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4722:1: ( ( ( '@skip_generation_in_production' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4723:1: ( ( '@skip_generation_in_production' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4723:1: ( ( '@skip_generation_in_production' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4724:1: ( '@skip_generation_in_production' )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4725:1: ( '@skip_generation_in_production' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4726:1: '@skip_generation_in_production'
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__ProcessingHints__SkipGenerationInProductionAssignment_29484); 
             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 

            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingHints__SkipGenerationInProductionAssignment_2"


    // $ANTLR start "rule__ChapterDetails__TestPaperAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4741:1: rule__ChapterDetails__TestPaperAssignment_0 : ( ( '@test_paper' ) ) ;
    public final void rule__ChapterDetails__TestPaperAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4745:1: ( ( ( '@test_paper' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4746:1: ( ( '@test_paper' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4746:1: ( ( '@test_paper' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4747:1: ( '@test_paper' )
            {
             before(grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4748:1: ( '@test_paper' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4749:1: '@test_paper'
            {
             before(grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__ChapterDetails__TestPaperAssignment_09528); 
             after(grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0()); 

            }

             after(grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__TestPaperAssignment_0"


    // $ANTLR start "rule__ChapterDetails__SubjectNameAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4764:1: rule__ChapterDetails__SubjectNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__SubjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4768:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4769:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4769:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4770:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChapterDetails__SubjectNameAssignment_29567); 
             after(grammarAccess.getChapterDetailsAccess().getSubjectNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__SubjectNameAssignment_2"


    // $ANTLR start "rule__ChapterDetails__ChapterNumberAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4779:1: rule__ChapterDetails__ChapterNumberAssignment_4 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__ChapterNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4783:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4784:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4784:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4785:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ChapterDetails__ChapterNumberAssignment_49598); 
             after(grammarAccess.getChapterDetailsAccess().getChapterNumberINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__ChapterNumberAssignment_4"


    // $ANTLR start "rule__ChapterDetails__SubChapterNumberAssignment_6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4794:1: rule__ChapterDetails__SubChapterNumberAssignment_6 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__SubChapterNumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4798:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4799:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4799:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4800:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ChapterDetails__SubChapterNumberAssignment_69629); 
             after(grammarAccess.getChapterDetailsAccess().getSubChapterNumberINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__SubChapterNumberAssignment_6"


    // $ANTLR start "rule__ChapterDetails__ChapterNameAssignment_8"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4809:1: rule__ChapterDetails__ChapterNameAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__ChapterNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4813:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4814:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4814:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4815:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChapterDetails__ChapterNameAssignment_89660); 
             after(grammarAccess.getChapterDetailsAccess().getChapterNameSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__ChapterNameAssignment_8"


    // $ANTLR start "rule__WordMeaning__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4824:1: rule__WordMeaning__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__WordMeaning__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4828:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4829:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4829:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4830:1: ( 'hide' )
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4831:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4832:1: 'hide'
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__WordMeaning__HideFromViewAssignment_19696); 
             after(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__HideFromViewAssignment_1"


    // $ANTLR start "rule__WordMeaning__WordAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4847:1: rule__WordMeaning__WordAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__WordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4851:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4852:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4852:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4853:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WordMeaning__WordAssignment_29735); 
             after(grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__WordAssignment_2"


    // $ANTLR start "rule__WordMeaning__MeaningAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4862:1: rule__WordMeaning__MeaningAssignment_3 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__MeaningAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4866:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4867:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4867:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4868:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WordMeaning__MeaningAssignment_39766); 
             after(grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMeaning__MeaningAssignment_3"


    // $ANTLR start "rule__QuestionAnswer__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4877:1: rule__QuestionAnswer__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__QuestionAnswer__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4881:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4882:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4882:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4883:1: ( 'hide' )
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4884:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4885:1: 'hide'
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__QuestionAnswer__HideFromViewAssignment_19802); 
             after(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__HideFromViewAssignment_1"


    // $ANTLR start "rule__QuestionAnswer__QuestionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4900:1: rule__QuestionAnswer__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4904:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4905:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4905:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4906:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QuestionAnswer__QuestionAssignment_29841); 
             after(grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__QuestionAssignment_2"


    // $ANTLR start "rule__QuestionAnswer__AnswerPartsAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4915:1: rule__QuestionAnswer__AnswerPartsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__AnswerPartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4919:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4920:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4920:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4921:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QuestionAnswer__AnswerPartsAssignment_39872); 
             after(grammarAccess.getQuestionAnswerAccess().getAnswerPartsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__AnswerPartsAssignment_3"


    // $ANTLR start "rule__QuestionAnswer__CmapAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4930:1: rule__QuestionAnswer__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__QuestionAnswer__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4934:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4935:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4935:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4936:1: ruleCMap
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__QuestionAnswer__CmapAssignment_49903);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionAnswer__CmapAssignment_4"


    // $ANTLR start "rule__FIB__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4945:1: rule__FIB__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__FIB__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4949:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4950:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4950:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4951:1: ( 'hide' )
            {
             before(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4952:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4953:1: 'hide'
            {
             before(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__FIB__HideFromViewAssignment_19939); 
             after(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__HideFromViewAssignment_1"


    // $ANTLR start "rule__FIB__QuestionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4968:1: rule__FIB__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FIB__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4972:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4973:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4973:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4974:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FIB__QuestionAssignment_29978); 
             after(grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__QuestionAssignment_2"


    // $ANTLR start "rule__FIB__AnswersAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4983:1: rule__FIB__AnswersAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FIB__AnswersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4987:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4988:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4988:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4989:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FIB__AnswersAssignment_310009); 
             after(grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIB__AnswersAssignment_3"


    // $ANTLR start "rule__Definition__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4998:1: rule__Definition__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Definition__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5002:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5003:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5003:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5004:1: ( 'hide' )
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5005:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5006:1: 'hide'
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Definition__HideFromViewAssignment_110045); 
             after(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__HideFromViewAssignment_1"


    // $ANTLR start "rule__Definition__TermAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5021:1: rule__Definition__TermAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Definition__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5025:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5026:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5026:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5027:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Definition__TermAssignment_210084); 
             after(grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TermAssignment_2"


    // $ANTLR start "rule__Definition__DefinitionAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5036:1: rule__Definition__DefinitionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Definition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5040:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5041:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5041:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5042:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Definition__DefinitionAssignment_310115); 
             after(grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__DefinitionAssignment_3"


    // $ANTLR start "rule__Definition__CmapAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5051:1: rule__Definition__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__Definition__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5055:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5056:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5056:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5057:1: ruleCMap
            {
             before(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__Definition__CmapAssignment_410146);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__CmapAssignment_4"


    // $ANTLR start "rule__Character__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5066:1: rule__Character__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Character__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5070:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5071:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5071:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5072:1: ( 'hide' )
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5073:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5074:1: 'hide'
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Character__HideFromViewAssignment_110182); 
             after(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__HideFromViewAssignment_1"


    // $ANTLR start "rule__Character__CharacterAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5089:1: rule__Character__CharacterAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Character__CharacterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5093:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5094:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5094:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5095:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Character__CharacterAssignment_210221); 
             after(grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__CharacterAssignment_2"


    // $ANTLR start "rule__Character__EstimateAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5104:1: rule__Character__EstimateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Character__EstimateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5108:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5109:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5109:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5110:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Character__EstimateAssignment_310252); 
             after(grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__EstimateAssignment_3"


    // $ANTLR start "rule__Character__CmapAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5119:1: rule__Character__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__Character__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5123:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5124:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5124:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5125:1: ruleCMap
            {
             before(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__Character__CmapAssignment_410283);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__CmapAssignment_4"


    // $ANTLR start "rule__TeacherNote__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5134:1: rule__TeacherNote__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__TeacherNote__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5138:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5139:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5139:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5140:1: ( 'hide' )
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5141:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5142:1: 'hide'
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__TeacherNote__HideFromViewAssignment_110319); 
             after(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__HideFromViewAssignment_1"


    // $ANTLR start "rule__TeacherNote__CaptionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5157:1: rule__TeacherNote__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TeacherNote__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5161:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5162:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5162:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5163:1: RULE_STRING
            {
             before(grammarAccess.getTeacherNoteAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TeacherNote__CaptionAssignment_210358); 
             after(grammarAccess.getTeacherNoteAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__CaptionAssignment_2"


    // $ANTLR start "rule__TeacherNote__NoteAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5172:1: rule__TeacherNote__NoteAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TeacherNote__NoteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5176:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5177:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5177:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5178:1: RULE_STRING
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TeacherNote__NoteAssignment_310389); 
             after(grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__NoteAssignment_3"


    // $ANTLR start "rule__TeacherNote__CmapAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5187:1: rule__TeacherNote__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__TeacherNote__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5191:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5192:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5192:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5193:1: ruleCMap
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__TeacherNote__CmapAssignment_410420);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TeacherNote__CmapAssignment_4"


    // $ANTLR start "rule__Matching__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5202:1: rule__Matching__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Matching__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5206:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5207:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5207:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5208:1: ( 'hide' )
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5209:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5210:1: 'hide'
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Matching__HideFromViewAssignment_110456); 
             after(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__HideFromViewAssignment_1"


    // $ANTLR start "rule__Matching__SkipReverseQuestionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5225:1: rule__Matching__SkipReverseQuestionAssignment_2 : ( ( 'skip_reverse_question' ) ) ;
    public final void rule__Matching__SkipReverseQuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5229:1: ( ( ( 'skip_reverse_question' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5230:1: ( ( 'skip_reverse_question' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5230:1: ( ( 'skip_reverse_question' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5231:1: ( 'skip_reverse_question' )
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5232:1: ( 'skip_reverse_question' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5233:1: 'skip_reverse_question'
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__Matching__SkipReverseQuestionAssignment_210500); 
             after(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 

            }

             after(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__SkipReverseQuestionAssignment_2"


    // $ANTLR start "rule__Matching__QuestionAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5248:1: rule__Matching__QuestionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Matching__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5252:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5253:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5253:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5254:1: RULE_STRING
            {
             before(grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Matching__QuestionAssignment_310539); 
             after(grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__QuestionAssignment_3"


    // $ANTLR start "rule__Matching__PairsAssignment_5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5263:1: rule__Matching__PairsAssignment_5 : ( ruleMatchPair ) ;
    public final void rule__Matching__PairsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5267:1: ( ( ruleMatchPair ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5268:1: ( ruleMatchPair )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5268:1: ( ruleMatchPair )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5269:1: ruleMatchPair
            {
             before(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMatchPair_in_rule__Matching__PairsAssignment_510570);
            ruleMatchPair();

            state._fsp--;

             after(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__PairsAssignment_5"


    // $ANTLR start "rule__MatchPair__MatchQuestionAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5278:1: rule__MatchPair__MatchQuestionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchQuestionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5282:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5283:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5283:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5284:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatchPair__MatchQuestionAssignment_010601); 
             after(grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__MatchQuestionAssignment_0"


    // $ANTLR start "rule__MatchPair__MatchAnswerAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5293:1: rule__MatchPair__MatchAnswerAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchAnswerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5297:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5298:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5298:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5299:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatchPair__MatchAnswerAssignment_210632); 
             after(grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchPair__MatchAnswerAssignment_2"


    // $ANTLR start "rule__Event__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5308:1: rule__Event__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Event__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5312:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5313:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5313:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5314:1: ( 'hide' )
            {
             before(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5315:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5316:1: 'hide'
            {
             before(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Event__HideFromViewAssignment_110668); 
             after(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__HideFromViewAssignment_1"


    // $ANTLR start "rule__Event__EventAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5331:1: rule__Event__EventAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Event__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5335:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5336:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5336:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5337:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Event__EventAssignment_210707); 
             after(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventAssignment_2"


    // $ANTLR start "rule__Event__TimeAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5346:1: rule__Event__TimeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Event__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5350:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5351:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5351:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5352:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Event__TimeAssignment_310738); 
             after(grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TimeAssignment_3"


    // $ANTLR start "rule__TrueFalse__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5361:1: rule__TrueFalse__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__TrueFalse__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5365:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5366:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5366:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5367:1: ( 'hide' )
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5368:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5369:1: 'hide'
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__TrueFalse__HideFromViewAssignment_110774); 
             after(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__HideFromViewAssignment_1"


    // $ANTLR start "rule__TrueFalse__StatementAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5384:1: rule__TrueFalse__StatementAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5388:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5389:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5389:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5390:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrueFalse__StatementAssignment_210813); 
             after(grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__StatementAssignment_2"


    // $ANTLR start "rule__TrueFalse__TruthValueAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5399:1: rule__TrueFalse__TruthValueAssignment_3 : ( RULE_BOOL ) ;
    public final void rule__TrueFalse__TruthValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5403:1: ( ( RULE_BOOL ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5404:1: ( RULE_BOOL )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5404:1: ( RULE_BOOL )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5405:1: RULE_BOOL
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_3_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__TrueFalse__TruthValueAssignment_310844); 
             after(grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__TruthValueAssignment_3"


    // $ANTLR start "rule__TrueFalse__JustificationAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5414:1: rule__TrueFalse__JustificationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__JustificationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5418:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5419:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5419:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5420:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrueFalse__JustificationAssignment_410875); 
             after(grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFalse__JustificationAssignment_4"


    // $ANTLR start "rule__ChemEquation__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5429:1: rule__ChemEquation__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ChemEquation__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5433:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5434:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5434:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5435:1: ( 'hide' )
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5436:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5437:1: 'hide'
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__ChemEquation__HideFromViewAssignment_110911); 
             after(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__HideFromViewAssignment_1"


    // $ANTLR start "rule__ChemEquation__DescriptionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5452:1: rule__ChemEquation__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5456:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5457:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5457:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5458:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__DescriptionAssignment_210950); 
             after(grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__DescriptionAssignment_2"


    // $ANTLR start "rule__ChemEquation__ReactantsAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5467:1: rule__ChemEquation__ReactantsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ReactantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5471:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5472:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5472:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5473:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__ReactantsAssignment_410981); 
             after(grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__ReactantsAssignment_4"


    // $ANTLR start "rule__ChemEquation__ProducesAssignment_6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5482:1: rule__ChemEquation__ProducesAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProducesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5486:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5487:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5487:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5488:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__ProducesAssignment_611012); 
             after(grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__ProducesAssignment_6"


    // $ANTLR start "rule__ChemEquation__ProductsAssignment_8"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5497:1: rule__ChemEquation__ProductsAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProductsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5501:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5502:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5502:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5503:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__ProductsAssignment_811043); 
             after(grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemEquation__ProductsAssignment_8"


    // $ANTLR start "rule__ChemCompound__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5512:1: rule__ChemCompound__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ChemCompound__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5516:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5517:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5517:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5518:1: ( 'hide' )
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5519:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5520:1: 'hide'
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__ChemCompound__HideFromViewAssignment_111079); 
             after(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__HideFromViewAssignment_1"


    // $ANTLR start "rule__ChemCompound__SymbolAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5535:1: rule__ChemCompound__SymbolAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5539:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5540:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5540:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5541:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemCompound__SymbolAssignment_211118); 
             after(grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__SymbolAssignment_2"


    // $ANTLR start "rule__ChemCompound__ChemicalNameAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5550:1: rule__ChemCompound__ChemicalNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__ChemicalNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5554:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5555:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5555:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5556:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemCompound__ChemicalNameAssignment_311149); 
             after(grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__ChemicalNameAssignment_3"


    // $ANTLR start "rule__ChemCompound__CommonNameAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5565:1: rule__ChemCompound__CommonNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__CommonNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5569:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5570:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5570:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5571:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemCompound__CommonNameAssignment_411180); 
             after(grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChemCompound__CommonNameAssignment_4"


    // $ANTLR start "rule__Spellbee__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5580:1: rule__Spellbee__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Spellbee__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5584:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5585:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5585:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5586:1: ( 'hide' )
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5587:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5588:1: 'hide'
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Spellbee__HideFromViewAssignment_111216); 
             after(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__HideFromViewAssignment_1"


    // $ANTLR start "rule__Spellbee__WordAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5603:1: rule__Spellbee__WordAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Spellbee__WordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5607:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5608:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5608:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5609:1: RULE_STRING
            {
             before(grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Spellbee__WordAssignment_211255); 
             after(grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spellbee__WordAssignment_2"


    // $ANTLR start "rule__ImageLabel__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5618:1: rule__ImageLabel__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ImageLabel__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5622:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5623:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5623:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5624:1: ( 'hide' )
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5625:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5626:1: 'hide'
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__ImageLabel__HideFromViewAssignment_111291); 
             after(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__HideFromViewAssignment_1"


    // $ANTLR start "rule__ImageLabel__CaptionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5641:1: rule__ImageLabel__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5645:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5646:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5646:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5647:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImageLabel__CaptionAssignment_211330); 
             after(grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__CaptionAssignment_2"


    // $ANTLR start "rule__ImageLabel__ImageNameAssignment_5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5656:1: rule__ImageLabel__ImageNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__ImageNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5660:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5661:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5661:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5662:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImageLabel__ImageNameAssignment_511361); 
             after(grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__ImageNameAssignment_5"


    // $ANTLR start "rule__ImageLabel__HotspotsAssignment_6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5671:1: rule__ImageLabel__HotspotsAssignment_6 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5675:1: ( ( ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5676:1: ( ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5676:1: ( ruleHotSpot )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5677:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_611392);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__HotspotsAssignment_6"


    // $ANTLR start "rule__ImageLabel__HotspotsAssignment_7_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5686:1: rule__ImageLabel__HotspotsAssignment_7_1 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5690:1: ( ( ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5691:1: ( ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5691:1: ( ruleHotSpot )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5692:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_7_111423);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageLabel__HotspotsAssignment_7_1"


    // $ANTLR start "rule__HotSpot__XAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5701:1: rule__HotSpot__XAssignment_0 : ( RULE_INT ) ;
    public final void rule__HotSpot__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5705:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5706:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5706:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5707:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__HotSpot__XAssignment_011454); 
             after(grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__XAssignment_0"


    // $ANTLR start "rule__HotSpot__YAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5716:1: rule__HotSpot__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__HotSpot__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5720:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5721:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5721:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5722:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__HotSpot__YAssignment_211485); 
             after(grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__YAssignment_2"


    // $ANTLR start "rule__HotSpot__LabelAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5731:1: rule__HotSpot__LabelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__HotSpot__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5735:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5736:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5736:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5737:1: RULE_STRING
            {
             before(grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HotSpot__LabelAssignment_411516); 
             after(grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HotSpot__LabelAssignment_4"


    // $ANTLR start "rule__Equation__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5746:1: rule__Equation__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Equation__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5750:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5751:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5751:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5752:1: ( 'hide' )
            {
             before(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5753:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5754:1: 'hide'
            {
             before(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Equation__HideFromViewAssignment_111552); 
             after(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__HideFromViewAssignment_1"


    // $ANTLR start "rule__Equation__EquationAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5769:1: rule__Equation__EquationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Equation__EquationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5773:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5774:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5774:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5775:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Equation__EquationAssignment_211591); 
             after(grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__EquationAssignment_2"


    // $ANTLR start "rule__Equation__DescriptionAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5784:1: rule__Equation__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Equation__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5788:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5789:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5789:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5790:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Equation__DescriptionAssignment_411622); 
             after(grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__DescriptionAssignment_4"


    // $ANTLR start "rule__Equation__SymbolsAssignment_6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5799:1: rule__Equation__SymbolsAssignment_6 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5803:1: ( ( ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5804:1: ( ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5804:1: ( ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5805:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_611653);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__SymbolsAssignment_6"


    // $ANTLR start "rule__Equation__SymbolsAssignment_7_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5814:1: rule__Equation__SymbolsAssignment_7_1 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5818:1: ( ( ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5819:1: ( ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5819:1: ( ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5820:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_7_111684);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__SymbolsAssignment_7_1"


    // $ANTLR start "rule__EqSymbol__SymbolAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5829:1: rule__EqSymbol__SymbolAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__SymbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5833:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5834:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5834:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5835:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqSymbol__SymbolAssignment_011715); 
             after(grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__SymbolAssignment_0"


    // $ANTLR start "rule__EqSymbol__DescriptionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5844:1: rule__EqSymbol__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5848:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5849:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5849:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5850:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqSymbol__DescriptionAssignment_211746); 
             after(grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqSymbol__DescriptionAssignment_2"


    // $ANTLR start "rule__RefToContext__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5859:1: rule__RefToContext__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__RefToContext__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5863:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5864:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5864:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5865:1: ( 'hide' )
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5866:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5867:1: 'hide'
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__RefToContext__HideFromViewAssignment_111782); 
             after(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__HideFromViewAssignment_1"


    // $ANTLR start "rule__RefToContext__ContextAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5882:1: rule__RefToContext__ContextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__RefToContext__ContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5886:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5887:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5887:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5888:1: RULE_STRING
            {
             before(grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RefToContext__ContextAssignment_411821); 
             after(grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__ContextAssignment_4"


    // $ANTLR start "rule__RefToContext__QuestionsAssignment_5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5897:1: rule__RefToContext__QuestionsAssignment_5 : ( ruleQuestionAnswer ) ;
    public final void rule__RefToContext__QuestionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5901:1: ( ( ruleQuestionAnswer ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5902:1: ( ruleQuestionAnswer )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5902:1: ( ruleQuestionAnswer )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5903:1: ruleQuestionAnswer
            {
             before(grammarAccess.getRefToContextAccess().getQuestionsQuestionAnswerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQuestionAnswer_in_rule__RefToContext__QuestionsAssignment_511852);
            ruleQuestionAnswer();

            state._fsp--;

             after(grammarAccess.getRefToContextAccess().getQuestionsQuestionAnswerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__QuestionsAssignment_5"


    // $ANTLR start "rule__CMap__ContentAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5912:1: rule__CMap__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CMap__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5916:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5917:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5917:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5918:1: RULE_STRING
            {
             before(grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CMap__ContentAssignment_211883); 
             after(grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMap__ContentAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJoveNotes_in_entryRuleJoveNotes61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoveNotes68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__0_in_ruleJoveNotes94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingHints_in_entryRuleProcessingHints121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessingHints128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__0_in_ruleProcessingHints154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterDetails_in_entryRuleChapterDetails181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapterDetails188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__0_in_ruleChapterDetails214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_entryRuleNotesElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotesElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotesElement__Alternatives_in_ruleNotesElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_entryRuleWordMeaning301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMeaning308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__0_in_ruleWordMeaning334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_entryRuleQuestionAnswer361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionAnswer368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__0_in_ruleQuestionAnswer394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_entryRuleFIB421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFIB428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__0_in_ruleFIB454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0_in_ruleCharacter574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_entryRuleTeacherNote601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeacherNote608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__0_in_ruleTeacherNote634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_entryRuleMatching661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatching668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__0_in_ruleMatching694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPair_in_entryRuleMatchPair721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchPair728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__0_in_ruleMatchPair754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueFalse848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__0_in_ruleTrueFalse874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_entryRuleChemEquation901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemEquation908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__0_in_ruleChemEquation934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_entryRuleChemCompound961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemCompound968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__0_in_ruleChemCompound994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_entryRuleSpellbee1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpellbee1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__0_in_ruleSpellbee1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_entryRuleImageLabel1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageLabel1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__0_in_ruleImageLabel1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_entryRuleHotSpot1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHotSpot1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__0_in_ruleHotSpot1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0_in_ruleEquation1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqSymbol1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__0_in_ruleEqSymbol1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_entryRuleRefToContext1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefToContext1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__0_in_ruleRefToContext1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_entryRuleCMap1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCMap1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__0_in_ruleCMap1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_rule__NotesElement__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_rule__NotesElement__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_rule__NotesElement__Alternatives1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__NotesElement__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_rule__NotesElement__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_rule__NotesElement__Alternatives1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_rule__NotesElement__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__NotesElement__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_rule__NotesElement__Alternatives1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_rule__NotesElement__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_rule__NotesElement__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_rule__NotesElement__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_rule__NotesElement__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_rule__NotesElement__Alternatives1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_rule__NotesElement__Alternatives1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__0__Impl_in_rule__JoveNotes__Group__01718 = new BitSet(new long[]{0x0000040000001000L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__1_in_rule__JoveNotes__Group__01721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__ProcessingHintsAssignment_0_in_rule__JoveNotes__Group__0__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__1__Impl_in_rule__JoveNotes__Group__11778 = new BitSet(new long[]{0x00000029DC7F0000L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__2_in_rule__JoveNotes__Group__11781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__ChapterDetailsAssignment_1_in_rule__JoveNotes__Group__1__Impl1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__2__Impl_in_rule__JoveNotes__Group__21838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__NotesElementsAssignment_2_in_rule__JoveNotes__Group__2__Impl1865 = new BitSet(new long[]{0x00000029DC7F0002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__0__Impl_in_rule__ProcessingHints__Group__01902 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__1_in_rule__ProcessingHints__Group__01905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__1__Impl_in_rule__ProcessingHints__Group__11963 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__2_in_rule__ProcessingHints__Group__11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__SkipGenerationAssignment_1_in_rule__ProcessingHints__Group__1__Impl1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__2__Impl_in_rule__ProcessingHints__Group__22024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__SkipGenerationInProductionAssignment_2_in_rule__ProcessingHints__Group__2__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__0__Impl_in_rule__ChapterDetails__Group__02088 = new BitSet(new long[]{0x0000040000001000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__1_in_rule__ChapterDetails__Group__02091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__TestPaperAssignment_0_in_rule__ChapterDetails__Group__0__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__1__Impl_in_rule__ChapterDetails__Group__12149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__2_in_rule__ChapterDetails__Group__12152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ChapterDetails__Group__1__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__2__Impl_in_rule__ChapterDetails__Group__22211 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__3_in_rule__ChapterDetails__Group__22214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__SubjectNameAssignment_2_in_rule__ChapterDetails__Group__2__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__3__Impl_in_rule__ChapterDetails__Group__32271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__4_in_rule__ChapterDetails__Group__32274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ChapterDetails__Group__3__Impl2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__4__Impl_in_rule__ChapterDetails__Group__42333 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__5_in_rule__ChapterDetails__Group__42336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__ChapterNumberAssignment_4_in_rule__ChapterDetails__Group__4__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__5__Impl_in_rule__ChapterDetails__Group__52393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__6_in_rule__ChapterDetails__Group__52396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ChapterDetails__Group__5__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__6__Impl_in_rule__ChapterDetails__Group__62455 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__7_in_rule__ChapterDetails__Group__62458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__SubChapterNumberAssignment_6_in_rule__ChapterDetails__Group__6__Impl2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__7__Impl_in_rule__ChapterDetails__Group__72515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__8_in_rule__ChapterDetails__Group__72518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ChapterDetails__Group__7__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__8__Impl_in_rule__ChapterDetails__Group__82577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__ChapterNameAssignment_8_in_rule__ChapterDetails__Group__8__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__0__Impl_in_rule__WordMeaning__Group__02652 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__1_in_rule__WordMeaning__Group__02655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WordMeaning__Group__0__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__1__Impl_in_rule__WordMeaning__Group__12714 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__2_in_rule__WordMeaning__Group__12717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__HideFromViewAssignment_1_in_rule__WordMeaning__Group__1__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__2__Impl_in_rule__WordMeaning__Group__22775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__3_in_rule__WordMeaning__Group__22778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__WordAssignment_2_in_rule__WordMeaning__Group__2__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__3__Impl_in_rule__WordMeaning__Group__32835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__MeaningAssignment_3_in_rule__WordMeaning__Group__3__Impl2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__0__Impl_in_rule__QuestionAnswer__Group__02900 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__1_in_rule__QuestionAnswer__Group__02903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QuestionAnswer__Group__0__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__1__Impl_in_rule__QuestionAnswer__Group__12962 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__2_in_rule__QuestionAnswer__Group__12965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__HideFromViewAssignment_1_in_rule__QuestionAnswer__Group__1__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__2__Impl_in_rule__QuestionAnswer__Group__23023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__3_in_rule__QuestionAnswer__Group__23026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__QuestionAssignment_2_in_rule__QuestionAnswer__Group__2__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__3__Impl_in_rule__QuestionAnswer__Group__33083 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__4_in_rule__QuestionAnswer__Group__33086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__AnswerPartsAssignment_3_in_rule__QuestionAnswer__Group__3__Impl3115 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__AnswerPartsAssignment_3_in_rule__QuestionAnswer__Group__3__Impl3127 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__4__Impl_in_rule__QuestionAnswer__Group__43160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__CmapAssignment_4_in_rule__QuestionAnswer__Group__4__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__0__Impl_in_rule__FIB__Group__03228 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__FIB__Group__1_in_rule__FIB__Group__03231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FIB__Group__0__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__1__Impl_in_rule__FIB__Group__13290 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__FIB__Group__2_in_rule__FIB__Group__13293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__HideFromViewAssignment_1_in_rule__FIB__Group__1__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__2__Impl_in_rule__FIB__Group__23351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FIB__Group__3_in_rule__FIB__Group__23354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__QuestionAssignment_2_in_rule__FIB__Group__2__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__3__Impl_in_rule__FIB__Group__33411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__AnswersAssignment_3_in_rule__FIB__Group__3__Impl3440 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FIB__AnswersAssignment_3_in_rule__FIB__Group__3__Impl3452 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03493 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__0__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13555 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__HideFromViewAssignment_1_in_rule__Definition__Group__1__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__23619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__TermAssignment_2_in_rule__Definition__Group__2__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__33676 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__33679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__DefinitionAssignment_3_in_rule__Definition__Group__3__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__43736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__CmapAssignment_4_in_rule__Definition__Group__4__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03804 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Character__Group__0__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13866 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__HideFromViewAssignment_1_in_rule__Character__Group__1__Impl3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__CharacterAssignment_2_in_rule__Character__Group__2__Impl3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33987 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Character__Group__4_in_rule__Character__Group__33990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__EstimateAssignment_3_in_rule__Character__Group__3__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__44047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__CmapAssignment_4_in_rule__Character__Group__4__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__0__Impl_in_rule__TeacherNote__Group__04115 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__1_in_rule__TeacherNote__Group__04118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TeacherNote__Group__0__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__1__Impl_in_rule__TeacherNote__Group__14177 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__2_in_rule__TeacherNote__Group__14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__HideFromViewAssignment_1_in_rule__TeacherNote__Group__1__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__2__Impl_in_rule__TeacherNote__Group__24238 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__3_in_rule__TeacherNote__Group__24241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__CaptionAssignment_2_in_rule__TeacherNote__Group__2__Impl4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__3__Impl_in_rule__TeacherNote__Group__34299 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__4_in_rule__TeacherNote__Group__34302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__NoteAssignment_3_in_rule__TeacherNote__Group__3__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__4__Impl_in_rule__TeacherNote__Group__44359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__CmapAssignment_4_in_rule__TeacherNote__Group__4__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__0__Impl_in_rule__Matching__Group__04427 = new BitSet(new long[]{0x0000180000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__1_in_rule__Matching__Group__04430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Matching__Group__0__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__1__Impl_in_rule__Matching__Group__14489 = new BitSet(new long[]{0x0000180000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__2_in_rule__Matching__Group__14492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__HideFromViewAssignment_1_in_rule__Matching__Group__1__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__2__Impl_in_rule__Matching__Group__24550 = new BitSet(new long[]{0x0000180000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__3_in_rule__Matching__Group__24553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__SkipReverseQuestionAssignment_2_in_rule__Matching__Group__2__Impl4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__3__Impl_in_rule__Matching__Group__34611 = new BitSet(new long[]{0x0000180000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__4_in_rule__Matching__Group__34614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__QuestionAssignment_3_in_rule__Matching__Group__3__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__4__Impl_in_rule__Matching__Group__44672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Matching__Group__5_in_rule__Matching__Group__44675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Matching__Group__4__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__5__Impl_in_rule__Matching__Group__54734 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Matching__Group__6_in_rule__Matching__Group__54737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__PairsAssignment_5_in_rule__Matching__Group__5__Impl4766 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Matching__PairsAssignment_5_in_rule__Matching__Group__5__Impl4778 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Matching__Group__6__Impl_in_rule__Matching__Group__64811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Matching__Group__6__Impl4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__0__Impl_in_rule__MatchPair__Group__04884 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__1_in_rule__MatchPair__Group__04887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__MatchQuestionAssignment_0_in_rule__MatchPair__Group__0__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__1__Impl_in_rule__MatchPair__Group__14944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__2_in_rule__MatchPair__Group__14947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MatchPair__Group__1__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__2__Impl_in_rule__MatchPair__Group__25006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__MatchAnswerAssignment_2_in_rule__MatchPair__Group__2__Impl5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__05069 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__05072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Event__Group__0__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__15131 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__15134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__HideFromViewAssignment_1_in_rule__Event__Group__1__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__25192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__3_in_rule__Event__Group__25195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventAssignment_2_in_rule__Event__Group__2__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__35252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__TimeAssignment_3_in_rule__Event__Group__3__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__0__Impl_in_rule__TrueFalse__Group__05317 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__1_in_rule__TrueFalse__Group__05320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TrueFalse__Group__0__Impl5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__1__Impl_in_rule__TrueFalse__Group__15379 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__2_in_rule__TrueFalse__Group__15382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__HideFromViewAssignment_1_in_rule__TrueFalse__Group__1__Impl5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__2__Impl_in_rule__TrueFalse__Group__25440 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__3_in_rule__TrueFalse__Group__25443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__StatementAssignment_2_in_rule__TrueFalse__Group__2__Impl5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__3__Impl_in_rule__TrueFalse__Group__35500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__4_in_rule__TrueFalse__Group__35503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__TruthValueAssignment_3_in_rule__TrueFalse__Group__3__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__4__Impl_in_rule__TrueFalse__Group__45560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__JustificationAssignment_4_in_rule__TrueFalse__Group__4__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__0__Impl_in_rule__ChemEquation__Group__05628 = new BitSet(new long[]{0x0000080000800010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__1_in_rule__ChemEquation__Group__05631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ChemEquation__Group__0__Impl5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__1__Impl_in_rule__ChemEquation__Group__15690 = new BitSet(new long[]{0x0000080000800010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__2_in_rule__ChemEquation__Group__15693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__HideFromViewAssignment_1_in_rule__ChemEquation__Group__1__Impl5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__2__Impl_in_rule__ChemEquation__Group__25751 = new BitSet(new long[]{0x0000080000800010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__3_in_rule__ChemEquation__Group__25754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__DescriptionAssignment_2_in_rule__ChemEquation__Group__2__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__3__Impl_in_rule__ChemEquation__Group__35812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__4_in_rule__ChemEquation__Group__35815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ChemEquation__Group__3__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__4__Impl_in_rule__ChemEquation__Group__45874 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__5_in_rule__ChemEquation__Group__45877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__ReactantsAssignment_4_in_rule__ChemEquation__Group__4__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__5__Impl_in_rule__ChemEquation__Group__55934 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__6_in_rule__ChemEquation__Group__55937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ChemEquation__Group__5__Impl5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__6__Impl_in_rule__ChemEquation__Group__65996 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__7_in_rule__ChemEquation__Group__65999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__ProducesAssignment_6_in_rule__ChemEquation__Group__6__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__7__Impl_in_rule__ChemEquation__Group__76057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__8_in_rule__ChemEquation__Group__76060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ChemEquation__Group__7__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__8__Impl_in_rule__ChemEquation__Group__86119 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__9_in_rule__ChemEquation__Group__86122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__ProductsAssignment_8_in_rule__ChemEquation__Group__8__Impl6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__9__Impl_in_rule__ChemEquation__Group__96179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ChemEquation__Group__9__Impl6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__0__Impl_in_rule__ChemCompound__Group__06258 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__1_in_rule__ChemCompound__Group__06261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ChemCompound__Group__0__Impl6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__1__Impl_in_rule__ChemCompound__Group__16320 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__2_in_rule__ChemCompound__Group__16323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__HideFromViewAssignment_1_in_rule__ChemCompound__Group__1__Impl6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__2__Impl_in_rule__ChemCompound__Group__26381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__3_in_rule__ChemCompound__Group__26384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__SymbolAssignment_2_in_rule__ChemCompound__Group__2__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__3__Impl_in_rule__ChemCompound__Group__36441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__4_in_rule__ChemCompound__Group__36444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__ChemicalNameAssignment_3_in_rule__ChemCompound__Group__3__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__4__Impl_in_rule__ChemCompound__Group__46501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__CommonNameAssignment_4_in_rule__ChemCompound__Group__4__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__0__Impl_in_rule__Spellbee__Group__06569 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__1_in_rule__Spellbee__Group__06572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Spellbee__Group__0__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__1__Impl_in_rule__Spellbee__Group__16631 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__2_in_rule__Spellbee__Group__16634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__HideFromViewAssignment_1_in_rule__Spellbee__Group__1__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__2__Impl_in_rule__Spellbee__Group__26692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__WordAssignment_2_in_rule__Spellbee__Group__2__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__0__Impl_in_rule__ImageLabel__Group__06755 = new BitSet(new long[]{0x0000080000800010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__1_in_rule__ImageLabel__Group__06758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ImageLabel__Group__0__Impl6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__1__Impl_in_rule__ImageLabel__Group__16817 = new BitSet(new long[]{0x0000080000800010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__2_in_rule__ImageLabel__Group__16820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__HideFromViewAssignment_1_in_rule__ImageLabel__Group__1__Impl6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__2__Impl_in_rule__ImageLabel__Group__26878 = new BitSet(new long[]{0x0000080000800010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__3_in_rule__ImageLabel__Group__26881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__CaptionAssignment_2_in_rule__ImageLabel__Group__2__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__3__Impl_in_rule__ImageLabel__Group__36939 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__4_in_rule__ImageLabel__Group__36942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ImageLabel__Group__3__Impl6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__4__Impl_in_rule__ImageLabel__Group__47001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__5_in_rule__ImageLabel__Group__47004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ImageLabel__Group__4__Impl7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__5__Impl_in_rule__ImageLabel__Group__57063 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__6_in_rule__ImageLabel__Group__57066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__ImageNameAssignment_5_in_rule__ImageLabel__Group__5__Impl7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__6__Impl_in_rule__ImageLabel__Group__67123 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__7_in_rule__ImageLabel__Group__67126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__HotspotsAssignment_6_in_rule__ImageLabel__Group__6__Impl7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__7__Impl_in_rule__ImageLabel__Group__77183 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__8_in_rule__ImageLabel__Group__77186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_7__0_in_rule__ImageLabel__Group__7__Impl7213 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__8__Impl_in_rule__ImageLabel__Group__87244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ImageLabel__Group__8__Impl7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_7__0__Impl_in_rule__ImageLabel__Group_7__07321 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_7__1_in_rule__ImageLabel__Group_7__07324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ImageLabel__Group_7__0__Impl7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_7__1__Impl_in_rule__ImageLabel__Group_7__17383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__HotspotsAssignment_7_1_in_rule__ImageLabel__Group_7__1__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__0__Impl_in_rule__HotSpot__Group__07444 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__1_in_rule__HotSpot__Group__07447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__XAssignment_0_in_rule__HotSpot__Group__0__Impl7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__1__Impl_in_rule__HotSpot__Group__17504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__2_in_rule__HotSpot__Group__17507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__HotSpot__Group__1__Impl7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__2__Impl_in_rule__HotSpot__Group__27566 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__3_in_rule__HotSpot__Group__27569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__YAssignment_2_in_rule__HotSpot__Group__2__Impl7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__3__Impl_in_rule__HotSpot__Group__37626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__4_in_rule__HotSpot__Group__37629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__HotSpot__Group__3__Impl7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__4__Impl_in_rule__HotSpot__Group__47688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__LabelAssignment_4_in_rule__HotSpot__Group__4__Impl7715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__07755 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__07758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Equation__Group__0__Impl7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__17817 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__17820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__HideFromViewAssignment_1_in_rule__Equation__Group__1__Impl7847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__27878 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__27881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__EquationAssignment_2_in_rule__Equation__Group__2__Impl7908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__37938 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__37941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Equation__Group__3__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__48000 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__5_in_rule__Equation__Group__48003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__DescriptionAssignment_4_in_rule__Equation__Group__4__Impl8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__5__Impl_in_rule__Equation__Group__58061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__6_in_rule__Equation__Group__58064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Equation__Group__5__Impl8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__6__Impl_in_rule__Equation__Group__68123 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__Equation__Group__7_in_rule__Equation__Group__68126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__SymbolsAssignment_6_in_rule__Equation__Group__6__Impl8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__7__Impl_in_rule__Equation__Group__78183 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__Equation__Group__8_in_rule__Equation__Group__78186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_7__0_in_rule__Equation__Group__7__Impl8213 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__8__Impl_in_rule__Equation__Group__88244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Equation__Group__8__Impl8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_7__0__Impl_in_rule__Equation__Group_7__08321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group_7__1_in_rule__Equation__Group_7__08324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Equation__Group_7__0__Impl8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_7__1__Impl_in_rule__Equation__Group_7__18383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__SymbolsAssignment_7_1_in_rule__Equation__Group_7__1__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__0__Impl_in_rule__EqSymbol__Group__08444 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__1_in_rule__EqSymbol__Group__08447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__SymbolAssignment_0_in_rule__EqSymbol__Group__0__Impl8474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__1__Impl_in_rule__EqSymbol__Group__18504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__2_in_rule__EqSymbol__Group__18507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EqSymbol__Group__1__Impl8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__2__Impl_in_rule__EqSymbol__Group__28566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__DescriptionAssignment_2_in_rule__EqSymbol__Group__2__Impl8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__0__Impl_in_rule__RefToContext__Group__08629 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__1_in_rule__RefToContext__Group__08632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RefToContext__Group__0__Impl8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__1__Impl_in_rule__RefToContext__Group__18691 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__2_in_rule__RefToContext__Group__18694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__HideFromViewAssignment_1_in_rule__RefToContext__Group__1__Impl8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__2__Impl_in_rule__RefToContext__Group__28752 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__3_in_rule__RefToContext__Group__28755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RefToContext__Group__2__Impl8783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__3__Impl_in_rule__RefToContext__Group__38814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__4_in_rule__RefToContext__Group__38817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RefToContext__Group__3__Impl8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__4__Impl_in_rule__RefToContext__Group__48876 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__5_in_rule__RefToContext__Group__48879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__ContextAssignment_4_in_rule__RefToContext__Group__4__Impl8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__5__Impl_in_rule__RefToContext__Group__58936 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__6_in_rule__RefToContext__Group__58939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__QuestionsAssignment_5_in_rule__RefToContext__Group__5__Impl8968 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__RefToContext__QuestionsAssignment_5_in_rule__RefToContext__Group__5__Impl8980 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__6__Impl_in_rule__RefToContext__Group__69013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RefToContext__Group__6__Impl9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__0__Impl_in_rule__CMap__Group__09086 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CMap__Group__1_in_rule__CMap__Group__09089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CMap__Group__0__Impl9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__1__Impl_in_rule__CMap__Group__19148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CMap__Group__2_in_rule__CMap__Group__19151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CMap__Group__1__Impl9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__2__Impl_in_rule__CMap__Group__29210 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CMap__Group__3_in_rule__CMap__Group__29213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__ContentAssignment_2_in_rule__CMap__Group__2__Impl9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__3__Impl_in_rule__CMap__Group__39270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CMap__Group__3__Impl9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingHints_in_rule__JoveNotes__ProcessingHintsAssignment_09342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterDetails_in_rule__JoveNotes__ChapterDetailsAssignment_19373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_rule__JoveNotes__NotesElementsAssignment_29404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ProcessingHints__SkipGenerationAssignment_19440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ProcessingHints__SkipGenerationInProductionAssignment_29484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ChapterDetails__TestPaperAssignment_09528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChapterDetails__SubjectNameAssignment_29567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ChapterDetails__ChapterNumberAssignment_49598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ChapterDetails__SubChapterNumberAssignment_69629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChapterDetails__ChapterNameAssignment_89660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__WordMeaning__HideFromViewAssignment_19696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WordMeaning__WordAssignment_29735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WordMeaning__MeaningAssignment_39766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__QuestionAnswer__HideFromViewAssignment_19802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QuestionAnswer__QuestionAssignment_29841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QuestionAnswer__AnswerPartsAssignment_39872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__QuestionAnswer__CmapAssignment_49903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FIB__HideFromViewAssignment_19939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FIB__QuestionAssignment_29978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FIB__AnswersAssignment_310009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Definition__HideFromViewAssignment_110045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Definition__TermAssignment_210084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Definition__DefinitionAssignment_310115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__Definition__CmapAssignment_410146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Character__HideFromViewAssignment_110182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Character__CharacterAssignment_210221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Character__EstimateAssignment_310252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__Character__CmapAssignment_410283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TeacherNote__HideFromViewAssignment_110319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TeacherNote__CaptionAssignment_210358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TeacherNote__NoteAssignment_310389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__TeacherNote__CmapAssignment_410420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Matching__HideFromViewAssignment_110456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Matching__SkipReverseQuestionAssignment_210500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Matching__QuestionAssignment_310539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPair_in_rule__Matching__PairsAssignment_510570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatchPair__MatchQuestionAssignment_010601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatchPair__MatchAnswerAssignment_210632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Event__HideFromViewAssignment_110668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__EventAssignment_210707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__TimeAssignment_310738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TrueFalse__HideFromViewAssignment_110774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrueFalse__StatementAssignment_210813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__TrueFalse__TruthValueAssignment_310844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrueFalse__JustificationAssignment_410875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ChemEquation__HideFromViewAssignment_110911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__DescriptionAssignment_210950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__ReactantsAssignment_410981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__ProducesAssignment_611012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__ProductsAssignment_811043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ChemCompound__HideFromViewAssignment_111079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemCompound__SymbolAssignment_211118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemCompound__ChemicalNameAssignment_311149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemCompound__CommonNameAssignment_411180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Spellbee__HideFromViewAssignment_111216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Spellbee__WordAssignment_211255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ImageLabel__HideFromViewAssignment_111291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageLabel__CaptionAssignment_211330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageLabel__ImageNameAssignment_511361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_611392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_7_111423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__HotSpot__XAssignment_011454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__HotSpot__YAssignment_211485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HotSpot__LabelAssignment_411516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Equation__HideFromViewAssignment_111552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Equation__EquationAssignment_211591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Equation__DescriptionAssignment_411622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_611653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_7_111684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqSymbol__SymbolAssignment_011715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqSymbol__DescriptionAssignment_211746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__RefToContext__HideFromViewAssignment_111782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RefToContext__ContextAssignment_411821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_rule__RefToContext__QuestionsAssignment_511852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CMap__ContentAssignment_211883 = new BitSet(new long[]{0x0000000000000002L});

}