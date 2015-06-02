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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'{'", "'}'", "'='", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'cmap'", "'@skip_generation'", "'@test_paper'", "'skip_reverse_question'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=7;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:97:1: ruleProcessingHints : ( ( rule__ProcessingHints__SkipGenerationAssignment ) ) ;
    public final void ruleProcessingHints() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:101:2: ( ( ( rule__ProcessingHints__SkipGenerationAssignment ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:102:1: ( ( rule__ProcessingHints__SkipGenerationAssignment ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:102:1: ( ( rule__ProcessingHints__SkipGenerationAssignment ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:103:1: ( rule__ProcessingHints__SkipGenerationAssignment )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationAssignment()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:104:1: ( rule__ProcessingHints__SkipGenerationAssignment )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:104:2: rule__ProcessingHints__SkipGenerationAssignment
            {
            pushFollow(FOLLOW_rule__ProcessingHints__SkipGenerationAssignment_in_ruleProcessingHints154);
            rule__ProcessingHints__SkipGenerationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationAssignment()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:818:1: rule__JoveNotes__Group__0__Impl : ( ( rule__JoveNotes__ProcessingHintsAssignment_0 )? ) ;
    public final void rule__JoveNotes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:822:1: ( ( ( rule__JoveNotes__ProcessingHintsAssignment_0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:823:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:823:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:824:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )?
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:825:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:825:2: rule__JoveNotes__ProcessingHintsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JoveNotes__ProcessingHintsAssignment_0_in_rule__JoveNotes__Group__0__Impl1748);
                    rule__JoveNotes__ProcessingHintsAssignment_0();

                    state._fsp--;


                    }
                    break;

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
            pushFollow(FOLLOW_rule__JoveNotes__Group__1__Impl_in_rule__JoveNotes__Group__11779);
            rule__JoveNotes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoveNotes__Group__2_in_rule__JoveNotes__Group__11782);
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
            pushFollow(FOLLOW_rule__JoveNotes__ChapterDetailsAssignment_1_in_rule__JoveNotes__Group__1__Impl1809);
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
            pushFollow(FOLLOW_rule__JoveNotes__Group__2__Impl_in_rule__JoveNotes__Group__21839);
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
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=22)||(LA3_0>=26 && LA3_0<=28)||(LA3_0>=30 && LA3_0<=32)||LA3_0==35||LA3_0==37) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:882:2: rule__JoveNotes__NotesElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__JoveNotes__NotesElementsAssignment_2_in_rule__JoveNotes__Group__2__Impl1866);
            	    rule__JoveNotes__NotesElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "rule__ChapterDetails__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:898:1: rule__ChapterDetails__Group__0 : rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 ;
    public final void rule__ChapterDetails__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:902:1: ( rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:903:2: rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__0__Impl_in_rule__ChapterDetails__Group__01903);
            rule__ChapterDetails__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__1_in_rule__ChapterDetails__Group__01906);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:910:1: rule__ChapterDetails__Group__0__Impl : ( ( rule__ChapterDetails__TestPaperAssignment_0 )? ) ;
    public final void rule__ChapterDetails__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:914:1: ( ( ( rule__ChapterDetails__TestPaperAssignment_0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:915:1: ( ( rule__ChapterDetails__TestPaperAssignment_0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:915:1: ( ( rule__ChapterDetails__TestPaperAssignment_0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:916:1: ( rule__ChapterDetails__TestPaperAssignment_0 )?
            {
             before(grammarAccess.getChapterDetailsAccess().getTestPaperAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:917:1: ( rule__ChapterDetails__TestPaperAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:917:2: rule__ChapterDetails__TestPaperAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ChapterDetails__TestPaperAssignment_0_in_rule__ChapterDetails__Group__0__Impl1933);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:927:1: rule__ChapterDetails__Group__1 : rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 ;
    public final void rule__ChapterDetails__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:931:1: ( rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:932:2: rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__1__Impl_in_rule__ChapterDetails__Group__11964);
            rule__ChapterDetails__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__2_in_rule__ChapterDetails__Group__11967);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:939:1: rule__ChapterDetails__Group__1__Impl : ( 'subject' ) ;
    public final void rule__ChapterDetails__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:943:1: ( ( 'subject' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:944:1: ( 'subject' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:944:1: ( 'subject' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:945:1: 'subject'
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__ChapterDetails__Group__1__Impl1995); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:958:1: rule__ChapterDetails__Group__2 : rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 ;
    public final void rule__ChapterDetails__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:962:1: ( rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:963:2: rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__2__Impl_in_rule__ChapterDetails__Group__22026);
            rule__ChapterDetails__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__3_in_rule__ChapterDetails__Group__22029);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:970:1: rule__ChapterDetails__Group__2__Impl : ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) ;
    public final void rule__ChapterDetails__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:974:1: ( ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:975:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:975:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:976:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:977:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:977:2: rule__ChapterDetails__SubjectNameAssignment_2
            {
            pushFollow(FOLLOW_rule__ChapterDetails__SubjectNameAssignment_2_in_rule__ChapterDetails__Group__2__Impl2056);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:987:1: rule__ChapterDetails__Group__3 : rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 ;
    public final void rule__ChapterDetails__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:991:1: ( rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:992:2: rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__3__Impl_in_rule__ChapterDetails__Group__32086);
            rule__ChapterDetails__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__4_in_rule__ChapterDetails__Group__32089);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:999:1: rule__ChapterDetails__Group__3__Impl : ( 'chapterNumber' ) ;
    public final void rule__ChapterDetails__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1003:1: ( ( 'chapterNumber' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1004:1: ( 'chapterNumber' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1004:1: ( 'chapterNumber' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1005:1: 'chapterNumber'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__ChapterDetails__Group__3__Impl2117); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1018:1: rule__ChapterDetails__Group__4 : rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 ;
    public final void rule__ChapterDetails__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1022:1: ( rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1023:2: rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__4__Impl_in_rule__ChapterDetails__Group__42148);
            rule__ChapterDetails__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__5_in_rule__ChapterDetails__Group__42151);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1030:1: rule__ChapterDetails__Group__4__Impl : ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) ;
    public final void rule__ChapterDetails__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1034:1: ( ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1035:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1035:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1036:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1037:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1037:2: rule__ChapterDetails__ChapterNumberAssignment_4
            {
            pushFollow(FOLLOW_rule__ChapterDetails__ChapterNumberAssignment_4_in_rule__ChapterDetails__Group__4__Impl2178);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1047:1: rule__ChapterDetails__Group__5 : rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 ;
    public final void rule__ChapterDetails__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1051:1: ( rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1052:2: rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__5__Impl_in_rule__ChapterDetails__Group__52208);
            rule__ChapterDetails__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__6_in_rule__ChapterDetails__Group__52211);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1059:1: rule__ChapterDetails__Group__5__Impl : ( '.' ) ;
    public final void rule__ChapterDetails__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1063:1: ( ( '.' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1064:1: ( '.' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1064:1: ( '.' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1065:1: '.'
            {
             before(grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__ChapterDetails__Group__5__Impl2239); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1078:1: rule__ChapterDetails__Group__6 : rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 ;
    public final void rule__ChapterDetails__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1082:1: ( rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1083:2: rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__6__Impl_in_rule__ChapterDetails__Group__62270);
            rule__ChapterDetails__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__7_in_rule__ChapterDetails__Group__62273);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1090:1: rule__ChapterDetails__Group__6__Impl : ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) ;
    public final void rule__ChapterDetails__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1094:1: ( ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1095:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1095:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1096:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1097:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1097:2: rule__ChapterDetails__SubChapterNumberAssignment_6
            {
            pushFollow(FOLLOW_rule__ChapterDetails__SubChapterNumberAssignment_6_in_rule__ChapterDetails__Group__6__Impl2300);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1107:1: rule__ChapterDetails__Group__7 : rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 ;
    public final void rule__ChapterDetails__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1111:1: ( rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1112:2: rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__7__Impl_in_rule__ChapterDetails__Group__72330);
            rule__ChapterDetails__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__8_in_rule__ChapterDetails__Group__72333);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1119:1: rule__ChapterDetails__Group__7__Impl : ( 'chapterName' ) ;
    public final void rule__ChapterDetails__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1123:1: ( ( 'chapterName' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1124:1: ( 'chapterName' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1124:1: ( 'chapterName' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1125:1: 'chapterName'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__ChapterDetails__Group__7__Impl2361); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1138:1: rule__ChapterDetails__Group__8 : rule__ChapterDetails__Group__8__Impl ;
    public final void rule__ChapterDetails__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1142:1: ( rule__ChapterDetails__Group__8__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1143:2: rule__ChapterDetails__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__8__Impl_in_rule__ChapterDetails__Group__82392);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1149:1: rule__ChapterDetails__Group__8__Impl : ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) ;
    public final void rule__ChapterDetails__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1153:1: ( ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1154:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1154:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1155:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameAssignment_8()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1156:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1156:2: rule__ChapterDetails__ChapterNameAssignment_8
            {
            pushFollow(FOLLOW_rule__ChapterDetails__ChapterNameAssignment_8_in_rule__ChapterDetails__Group__8__Impl2419);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1184:1: rule__WordMeaning__Group__0 : rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 ;
    public final void rule__WordMeaning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1188:1: ( rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1189:2: rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__0__Impl_in_rule__WordMeaning__Group__02467);
            rule__WordMeaning__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordMeaning__Group__1_in_rule__WordMeaning__Group__02470);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1196:1: rule__WordMeaning__Group__0__Impl : ( '@wm' ) ;
    public final void rule__WordMeaning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1200:1: ( ( '@wm' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1201:1: ( '@wm' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1201:1: ( '@wm' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1202:1: '@wm'
            {
             before(grammarAccess.getWordMeaningAccess().getWmKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__WordMeaning__Group__0__Impl2498); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1215:1: rule__WordMeaning__Group__1 : rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 ;
    public final void rule__WordMeaning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1219:1: ( rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1220:2: rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__1__Impl_in_rule__WordMeaning__Group__12529);
            rule__WordMeaning__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordMeaning__Group__2_in_rule__WordMeaning__Group__12532);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1227:1: rule__WordMeaning__Group__1__Impl : ( ( rule__WordMeaning__WordAssignment_1 ) ) ;
    public final void rule__WordMeaning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1231:1: ( ( ( rule__WordMeaning__WordAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1232:1: ( ( rule__WordMeaning__WordAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1232:1: ( ( rule__WordMeaning__WordAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1233:1: ( rule__WordMeaning__WordAssignment_1 )
            {
             before(grammarAccess.getWordMeaningAccess().getWordAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1234:1: ( rule__WordMeaning__WordAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1234:2: rule__WordMeaning__WordAssignment_1
            {
            pushFollow(FOLLOW_rule__WordMeaning__WordAssignment_1_in_rule__WordMeaning__Group__1__Impl2559);
            rule__WordMeaning__WordAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWordMeaningAccess().getWordAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1244:1: rule__WordMeaning__Group__2 : rule__WordMeaning__Group__2__Impl ;
    public final void rule__WordMeaning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1248:1: ( rule__WordMeaning__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1249:2: rule__WordMeaning__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__2__Impl_in_rule__WordMeaning__Group__22589);
            rule__WordMeaning__Group__2__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1255:1: rule__WordMeaning__Group__2__Impl : ( ( rule__WordMeaning__MeaningAssignment_2 ) ) ;
    public final void rule__WordMeaning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1259:1: ( ( ( rule__WordMeaning__MeaningAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1260:1: ( ( rule__WordMeaning__MeaningAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1260:1: ( ( rule__WordMeaning__MeaningAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1261:1: ( rule__WordMeaning__MeaningAssignment_2 )
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1262:1: ( rule__WordMeaning__MeaningAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1262:2: rule__WordMeaning__MeaningAssignment_2
            {
            pushFollow(FOLLOW_rule__WordMeaning__MeaningAssignment_2_in_rule__WordMeaning__Group__2__Impl2616);
            rule__WordMeaning__MeaningAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWordMeaningAccess().getMeaningAssignment_2()); 

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


    // $ANTLR start "rule__QuestionAnswer__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1278:1: rule__QuestionAnswer__Group__0 : rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 ;
    public final void rule__QuestionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1282:1: ( rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1283:2: rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__0__Impl_in_rule__QuestionAnswer__Group__02652);
            rule__QuestionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__1_in_rule__QuestionAnswer__Group__02655);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1290:1: rule__QuestionAnswer__Group__0__Impl : ( '@qa' ) ;
    public final void rule__QuestionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1294:1: ( ( '@qa' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1295:1: ( '@qa' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1295:1: ( '@qa' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1296:1: '@qa'
            {
             before(grammarAccess.getQuestionAnswerAccess().getQaKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__QuestionAnswer__Group__0__Impl2683); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1309:1: rule__QuestionAnswer__Group__1 : rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 ;
    public final void rule__QuestionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1313:1: ( rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1314:2: rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__1__Impl_in_rule__QuestionAnswer__Group__12714);
            rule__QuestionAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__2_in_rule__QuestionAnswer__Group__12717);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1321:1: rule__QuestionAnswer__Group__1__Impl : ( ( rule__QuestionAnswer__QuestionAssignment_1 ) ) ;
    public final void rule__QuestionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1325:1: ( ( ( rule__QuestionAnswer__QuestionAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1326:1: ( ( rule__QuestionAnswer__QuestionAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1326:1: ( ( rule__QuestionAnswer__QuestionAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1327:1: ( rule__QuestionAnswer__QuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1328:1: ( rule__QuestionAnswer__QuestionAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1328:2: rule__QuestionAnswer__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__QuestionAssignment_1_in_rule__QuestionAnswer__Group__1__Impl2744);
            rule__QuestionAnswer__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getQuestionAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1338:1: rule__QuestionAnswer__Group__2 : rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 ;
    public final void rule__QuestionAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1342:1: ( rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1343:2: rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__2__Impl_in_rule__QuestionAnswer__Group__22774);
            rule__QuestionAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__3_in_rule__QuestionAnswer__Group__22777);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1350:1: rule__QuestionAnswer__Group__2__Impl : ( ( rule__QuestionAnswer__AnswerAssignment_2 ) ) ;
    public final void rule__QuestionAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1354:1: ( ( ( rule__QuestionAnswer__AnswerAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1355:1: ( ( rule__QuestionAnswer__AnswerAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1355:1: ( ( rule__QuestionAnswer__AnswerAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1356:1: ( rule__QuestionAnswer__AnswerAssignment_2 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1357:1: ( rule__QuestionAnswer__AnswerAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1357:2: rule__QuestionAnswer__AnswerAssignment_2
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__AnswerAssignment_2_in_rule__QuestionAnswer__Group__2__Impl2804);
            rule__QuestionAnswer__AnswerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getAnswerAssignment_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1367:1: rule__QuestionAnswer__Group__3 : rule__QuestionAnswer__Group__3__Impl ;
    public final void rule__QuestionAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1371:1: ( rule__QuestionAnswer__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1372:2: rule__QuestionAnswer__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__3__Impl_in_rule__QuestionAnswer__Group__32834);
            rule__QuestionAnswer__Group__3__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1378:1: rule__QuestionAnswer__Group__3__Impl : ( ( rule__QuestionAnswer__CmapAssignment_3 )? ) ;
    public final void rule__QuestionAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1382:1: ( ( ( rule__QuestionAnswer__CmapAssignment_3 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1383:1: ( ( rule__QuestionAnswer__CmapAssignment_3 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1383:1: ( ( rule__QuestionAnswer__CmapAssignment_3 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1384:1: ( rule__QuestionAnswer__CmapAssignment_3 )?
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1385:1: ( rule__QuestionAnswer__CmapAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1385:2: rule__QuestionAnswer__CmapAssignment_3
                    {
                    pushFollow(FOLLOW_rule__QuestionAnswer__CmapAssignment_3_in_rule__QuestionAnswer__Group__3__Impl2861);
                    rule__QuestionAnswer__CmapAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAnswerAccess().getCmapAssignment_3()); 

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


    // $ANTLR start "rule__FIB__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1403:1: rule__FIB__Group__0 : rule__FIB__Group__0__Impl rule__FIB__Group__1 ;
    public final void rule__FIB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1407:1: ( rule__FIB__Group__0__Impl rule__FIB__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1408:2: rule__FIB__Group__0__Impl rule__FIB__Group__1
            {
            pushFollow(FOLLOW_rule__FIB__Group__0__Impl_in_rule__FIB__Group__02900);
            rule__FIB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FIB__Group__1_in_rule__FIB__Group__02903);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1415:1: rule__FIB__Group__0__Impl : ( '@fib' ) ;
    public final void rule__FIB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1419:1: ( ( '@fib' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1420:1: ( '@fib' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1420:1: ( '@fib' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1421:1: '@fib'
            {
             before(grammarAccess.getFIBAccess().getFibKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__FIB__Group__0__Impl2931); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1434:1: rule__FIB__Group__1 : rule__FIB__Group__1__Impl rule__FIB__Group__2 ;
    public final void rule__FIB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1438:1: ( rule__FIB__Group__1__Impl rule__FIB__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1439:2: rule__FIB__Group__1__Impl rule__FIB__Group__2
            {
            pushFollow(FOLLOW_rule__FIB__Group__1__Impl_in_rule__FIB__Group__12962);
            rule__FIB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FIB__Group__2_in_rule__FIB__Group__12965);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1446:1: rule__FIB__Group__1__Impl : ( ( rule__FIB__QuestionAssignment_1 ) ) ;
    public final void rule__FIB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1450:1: ( ( ( rule__FIB__QuestionAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1451:1: ( ( rule__FIB__QuestionAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1451:1: ( ( rule__FIB__QuestionAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1452:1: ( rule__FIB__QuestionAssignment_1 )
            {
             before(grammarAccess.getFIBAccess().getQuestionAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1453:1: ( rule__FIB__QuestionAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1453:2: rule__FIB__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__FIB__QuestionAssignment_1_in_rule__FIB__Group__1__Impl2992);
            rule__FIB__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getQuestionAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1463:1: rule__FIB__Group__2 : rule__FIB__Group__2__Impl ;
    public final void rule__FIB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1467:1: ( rule__FIB__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1468:2: rule__FIB__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FIB__Group__2__Impl_in_rule__FIB__Group__23022);
            rule__FIB__Group__2__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1474:1: rule__FIB__Group__2__Impl : ( ( ( rule__FIB__AnswersAssignment_2 ) ) ( ( rule__FIB__AnswersAssignment_2 )* ) ) ;
    public final void rule__FIB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1478:1: ( ( ( ( rule__FIB__AnswersAssignment_2 ) ) ( ( rule__FIB__AnswersAssignment_2 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1479:1: ( ( ( rule__FIB__AnswersAssignment_2 ) ) ( ( rule__FIB__AnswersAssignment_2 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1479:1: ( ( ( rule__FIB__AnswersAssignment_2 ) ) ( ( rule__FIB__AnswersAssignment_2 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1480:1: ( ( rule__FIB__AnswersAssignment_2 ) ) ( ( rule__FIB__AnswersAssignment_2 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1480:1: ( ( rule__FIB__AnswersAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1481:1: ( rule__FIB__AnswersAssignment_2 )
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1482:1: ( rule__FIB__AnswersAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1482:2: rule__FIB__AnswersAssignment_2
            {
            pushFollow(FOLLOW_rule__FIB__AnswersAssignment_2_in_rule__FIB__Group__2__Impl3051);
            rule__FIB__AnswersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getAnswersAssignment_2()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1485:1: ( ( rule__FIB__AnswersAssignment_2 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1486:1: ( rule__FIB__AnswersAssignment_2 )*
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1487:1: ( rule__FIB__AnswersAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1487:2: rule__FIB__AnswersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__FIB__AnswersAssignment_2_in_rule__FIB__Group__2__Impl3063);
            	    rule__FIB__AnswersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFIBAccess().getAnswersAssignment_2()); 

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
    // $ANTLR end "rule__FIB__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1504:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1508:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1509:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03102);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03105);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1516:1: rule__Definition__Group__0__Impl : ( '@definition' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1520:1: ( ( '@definition' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1521:1: ( '@definition' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1521:1: ( '@definition' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1522:1: '@definition'
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Definition__Group__0__Impl3133); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1535:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1539:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1540:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13164);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13167);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1547:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__TermAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1551:1: ( ( ( rule__Definition__TermAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1552:1: ( ( rule__Definition__TermAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1552:1: ( ( rule__Definition__TermAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1553:1: ( rule__Definition__TermAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getTermAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1554:1: ( rule__Definition__TermAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1554:2: rule__Definition__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__TermAssignment_1_in_rule__Definition__Group__1__Impl3194);
            rule__Definition__TermAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTermAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1564:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1568:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1569:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23224);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__23227);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1576:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__DefinitionAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1580:1: ( ( ( rule__Definition__DefinitionAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1581:1: ( ( rule__Definition__DefinitionAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1581:1: ( ( rule__Definition__DefinitionAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1582:1: ( rule__Definition__DefinitionAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1583:1: ( rule__Definition__DefinitionAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1583:2: rule__Definition__DefinitionAssignment_2
            {
            pushFollow(FOLLOW_rule__Definition__DefinitionAssignment_2_in_rule__Definition__Group__2__Impl3254);
            rule__Definition__DefinitionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getDefinitionAssignment_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1593:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1597:1: ( rule__Definition__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1598:2: rule__Definition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__33284);
            rule__Definition__Group__3__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1604:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__CmapAssignment_3 )? ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1608:1: ( ( ( rule__Definition__CmapAssignment_3 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1609:1: ( ( rule__Definition__CmapAssignment_3 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1609:1: ( ( rule__Definition__CmapAssignment_3 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1610:1: ( rule__Definition__CmapAssignment_3 )?
            {
             before(grammarAccess.getDefinitionAccess().getCmapAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1611:1: ( rule__Definition__CmapAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1611:2: rule__Definition__CmapAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Definition__CmapAssignment_3_in_rule__Definition__Group__3__Impl3311);
                    rule__Definition__CmapAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getCmapAssignment_3()); 

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


    // $ANTLR start "rule__Character__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1629:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1633:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1634:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03350);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03353);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1641:1: rule__Character__Group__0__Impl : ( '@character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1645:1: ( ( '@character' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1646:1: ( '@character' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1646:1: ( '@character' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1647:1: '@character'
            {
             before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Character__Group__0__Impl3381); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1660:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1664:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1665:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13412);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13415);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1672:1: rule__Character__Group__1__Impl : ( ( rule__Character__CharacterAssignment_1 ) ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1676:1: ( ( ( rule__Character__CharacterAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1677:1: ( ( rule__Character__CharacterAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1677:1: ( ( rule__Character__CharacterAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1678:1: ( rule__Character__CharacterAssignment_1 )
            {
             before(grammarAccess.getCharacterAccess().getCharacterAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1679:1: ( rule__Character__CharacterAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1679:2: rule__Character__CharacterAssignment_1
            {
            pushFollow(FOLLOW_rule__Character__CharacterAssignment_1_in_rule__Character__Group__1__Impl3442);
            rule__Character__CharacterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getCharacterAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1689:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1693:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1694:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23472);
            rule__Character__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23475);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1701:1: rule__Character__Group__2__Impl : ( ( rule__Character__EstimateAssignment_2 ) ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1705:1: ( ( ( rule__Character__EstimateAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1706:1: ( ( rule__Character__EstimateAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1706:1: ( ( rule__Character__EstimateAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1707:1: ( rule__Character__EstimateAssignment_2 )
            {
             before(grammarAccess.getCharacterAccess().getEstimateAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1708:1: ( rule__Character__EstimateAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1708:2: rule__Character__EstimateAssignment_2
            {
            pushFollow(FOLLOW_rule__Character__EstimateAssignment_2_in_rule__Character__Group__2__Impl3502);
            rule__Character__EstimateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getEstimateAssignment_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1718:1: rule__Character__Group__3 : rule__Character__Group__3__Impl ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1722:1: ( rule__Character__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1723:2: rule__Character__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33532);
            rule__Character__Group__3__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1729:1: rule__Character__Group__3__Impl : ( ( rule__Character__CmapAssignment_3 )? ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1733:1: ( ( ( rule__Character__CmapAssignment_3 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1734:1: ( ( rule__Character__CmapAssignment_3 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1734:1: ( ( rule__Character__CmapAssignment_3 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1735:1: ( rule__Character__CmapAssignment_3 )?
            {
             before(grammarAccess.getCharacterAccess().getCmapAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1736:1: ( rule__Character__CmapAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1736:2: rule__Character__CmapAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Character__CmapAssignment_3_in_rule__Character__Group__3__Impl3559);
                    rule__Character__CmapAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getCmapAssignment_3()); 

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


    // $ANTLR start "rule__TeacherNote__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1754:1: rule__TeacherNote__Group__0 : rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 ;
    public final void rule__TeacherNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1758:1: ( rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1759:2: rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__0__Impl_in_rule__TeacherNote__Group__03598);
            rule__TeacherNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__1_in_rule__TeacherNote__Group__03601);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1766:1: rule__TeacherNote__Group__0__Impl : ( '@tn' ) ;
    public final void rule__TeacherNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1770:1: ( ( '@tn' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1771:1: ( '@tn' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1771:1: ( '@tn' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1772:1: '@tn'
            {
             before(grammarAccess.getTeacherNoteAccess().getTnKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__TeacherNote__Group__0__Impl3629); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1785:1: rule__TeacherNote__Group__1 : rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 ;
    public final void rule__TeacherNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1789:1: ( rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1790:2: rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__1__Impl_in_rule__TeacherNote__Group__13660);
            rule__TeacherNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__2_in_rule__TeacherNote__Group__13663);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1797:1: rule__TeacherNote__Group__1__Impl : ( ( rule__TeacherNote__NoteAssignment_1 ) ) ;
    public final void rule__TeacherNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1801:1: ( ( ( rule__TeacherNote__NoteAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1802:1: ( ( rule__TeacherNote__NoteAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1802:1: ( ( rule__TeacherNote__NoteAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1803:1: ( rule__TeacherNote__NoteAssignment_1 )
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1804:1: ( rule__TeacherNote__NoteAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1804:2: rule__TeacherNote__NoteAssignment_1
            {
            pushFollow(FOLLOW_rule__TeacherNote__NoteAssignment_1_in_rule__TeacherNote__Group__1__Impl3690);
            rule__TeacherNote__NoteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherNoteAccess().getNoteAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1814:1: rule__TeacherNote__Group__2 : rule__TeacherNote__Group__2__Impl ;
    public final void rule__TeacherNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1818:1: ( rule__TeacherNote__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1819:2: rule__TeacherNote__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__2__Impl_in_rule__TeacherNote__Group__23720);
            rule__TeacherNote__Group__2__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1825:1: rule__TeacherNote__Group__2__Impl : ( ( rule__TeacherNote__CmapAssignment_2 )? ) ;
    public final void rule__TeacherNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1829:1: ( ( ( rule__TeacherNote__CmapAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1830:1: ( ( rule__TeacherNote__CmapAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1830:1: ( ( rule__TeacherNote__CmapAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1831:1: ( rule__TeacherNote__CmapAssignment_2 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1832:1: ( rule__TeacherNote__CmapAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1832:2: rule__TeacherNote__CmapAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TeacherNote__CmapAssignment_2_in_rule__TeacherNote__Group__2__Impl3747);
                    rule__TeacherNote__CmapAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherNoteAccess().getCmapAssignment_2()); 

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


    // $ANTLR start "rule__Matching__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1848:1: rule__Matching__Group__0 : rule__Matching__Group__0__Impl rule__Matching__Group__1 ;
    public final void rule__Matching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1852:1: ( rule__Matching__Group__0__Impl rule__Matching__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1853:2: rule__Matching__Group__0__Impl rule__Matching__Group__1
            {
            pushFollow(FOLLOW_rule__Matching__Group__0__Impl_in_rule__Matching__Group__03784);
            rule__Matching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__1_in_rule__Matching__Group__03787);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1860:1: rule__Matching__Group__0__Impl : ( '@match' ) ;
    public final void rule__Matching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1864:1: ( ( '@match' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1865:1: ( '@match' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1865:1: ( '@match' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1866:1: '@match'
            {
             before(grammarAccess.getMatchingAccess().getMatchKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Matching__Group__0__Impl3815); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1879:1: rule__Matching__Group__1 : rule__Matching__Group__1__Impl rule__Matching__Group__2 ;
    public final void rule__Matching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1883:1: ( rule__Matching__Group__1__Impl rule__Matching__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1884:2: rule__Matching__Group__1__Impl rule__Matching__Group__2
            {
            pushFollow(FOLLOW_rule__Matching__Group__1__Impl_in_rule__Matching__Group__13846);
            rule__Matching__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__2_in_rule__Matching__Group__13849);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1891:1: rule__Matching__Group__1__Impl : ( ( rule__Matching__SkipReverseQuestionAssignment_1 )? ) ;
    public final void rule__Matching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1895:1: ( ( ( rule__Matching__SkipReverseQuestionAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1896:1: ( ( rule__Matching__SkipReverseQuestionAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1896:1: ( ( rule__Matching__SkipReverseQuestionAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1897:1: ( rule__Matching__SkipReverseQuestionAssignment_1 )?
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1898:1: ( rule__Matching__SkipReverseQuestionAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1898:2: rule__Matching__SkipReverseQuestionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Matching__SkipReverseQuestionAssignment_1_in_rule__Matching__Group__1__Impl3876);
                    rule__Matching__SkipReverseQuestionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getSkipReverseQuestionAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1908:1: rule__Matching__Group__2 : rule__Matching__Group__2__Impl rule__Matching__Group__3 ;
    public final void rule__Matching__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1912:1: ( rule__Matching__Group__2__Impl rule__Matching__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1913:2: rule__Matching__Group__2__Impl rule__Matching__Group__3
            {
            pushFollow(FOLLOW_rule__Matching__Group__2__Impl_in_rule__Matching__Group__23907);
            rule__Matching__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__3_in_rule__Matching__Group__23910);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1920:1: rule__Matching__Group__2__Impl : ( ( rule__Matching__QuestionAssignment_2 )? ) ;
    public final void rule__Matching__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1924:1: ( ( ( rule__Matching__QuestionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1925:1: ( ( rule__Matching__QuestionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1925:1: ( ( rule__Matching__QuestionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1926:1: ( rule__Matching__QuestionAssignment_2 )?
            {
             before(grammarAccess.getMatchingAccess().getQuestionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1927:1: ( rule__Matching__QuestionAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1927:2: rule__Matching__QuestionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Matching__QuestionAssignment_2_in_rule__Matching__Group__2__Impl3937);
                    rule__Matching__QuestionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getQuestionAssignment_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1937:1: rule__Matching__Group__3 : rule__Matching__Group__3__Impl rule__Matching__Group__4 ;
    public final void rule__Matching__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1941:1: ( rule__Matching__Group__3__Impl rule__Matching__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1942:2: rule__Matching__Group__3__Impl rule__Matching__Group__4
            {
            pushFollow(FOLLOW_rule__Matching__Group__3__Impl_in_rule__Matching__Group__33968);
            rule__Matching__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__4_in_rule__Matching__Group__33971);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1949:1: rule__Matching__Group__3__Impl : ( '{' ) ;
    public final void rule__Matching__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1953:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1954:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1954:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1955:1: '{'
            {
             before(grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Matching__Group__3__Impl3999); 
             after(grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1968:1: rule__Matching__Group__4 : rule__Matching__Group__4__Impl rule__Matching__Group__5 ;
    public final void rule__Matching__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1972:1: ( rule__Matching__Group__4__Impl rule__Matching__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1973:2: rule__Matching__Group__4__Impl rule__Matching__Group__5
            {
            pushFollow(FOLLOW_rule__Matching__Group__4__Impl_in_rule__Matching__Group__44030);
            rule__Matching__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__5_in_rule__Matching__Group__44033);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1980:1: rule__Matching__Group__4__Impl : ( ( ( rule__Matching__PairsAssignment_4 ) ) ( ( rule__Matching__PairsAssignment_4 )* ) ) ;
    public final void rule__Matching__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1984:1: ( ( ( ( rule__Matching__PairsAssignment_4 ) ) ( ( rule__Matching__PairsAssignment_4 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1985:1: ( ( ( rule__Matching__PairsAssignment_4 ) ) ( ( rule__Matching__PairsAssignment_4 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1985:1: ( ( ( rule__Matching__PairsAssignment_4 ) ) ( ( rule__Matching__PairsAssignment_4 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1986:1: ( ( rule__Matching__PairsAssignment_4 ) ) ( ( rule__Matching__PairsAssignment_4 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1986:1: ( ( rule__Matching__PairsAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1987:1: ( rule__Matching__PairsAssignment_4 )
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1988:1: ( rule__Matching__PairsAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1988:2: rule__Matching__PairsAssignment_4
            {
            pushFollow(FOLLOW_rule__Matching__PairsAssignment_4_in_rule__Matching__Group__4__Impl4062);
            rule__Matching__PairsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMatchingAccess().getPairsAssignment_4()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1991:1: ( ( rule__Matching__PairsAssignment_4 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1992:1: ( rule__Matching__PairsAssignment_4 )*
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1993:1: ( rule__Matching__PairsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1993:2: rule__Matching__PairsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Matching__PairsAssignment_4_in_rule__Matching__Group__4__Impl4074);
            	    rule__Matching__PairsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMatchingAccess().getPairsAssignment_4()); 

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
    // $ANTLR end "rule__Matching__Group__4__Impl"


    // $ANTLR start "rule__Matching__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2004:1: rule__Matching__Group__5 : rule__Matching__Group__5__Impl ;
    public final void rule__Matching__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2008:1: ( rule__Matching__Group__5__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2009:2: rule__Matching__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Matching__Group__5__Impl_in_rule__Matching__Group__54107);
            rule__Matching__Group__5__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2015:1: rule__Matching__Group__5__Impl : ( '}' ) ;
    public final void rule__Matching__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2019:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2020:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2020:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2021:1: '}'
            {
             before(grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Matching__Group__5__Impl4135); 
             after(grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__MatchPair__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2046:1: rule__MatchPair__Group__0 : rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 ;
    public final void rule__MatchPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2050:1: ( rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2051:2: rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__0__Impl_in_rule__MatchPair__Group__04178);
            rule__MatchPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchPair__Group__1_in_rule__MatchPair__Group__04181);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2058:1: rule__MatchPair__Group__0__Impl : ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) ;
    public final void rule__MatchPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2062:1: ( ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2063:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2063:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2064:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2065:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2065:2: rule__MatchPair__MatchQuestionAssignment_0
            {
            pushFollow(FOLLOW_rule__MatchPair__MatchQuestionAssignment_0_in_rule__MatchPair__Group__0__Impl4208);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2075:1: rule__MatchPair__Group__1 : rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 ;
    public final void rule__MatchPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2079:1: ( rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2080:2: rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__1__Impl_in_rule__MatchPair__Group__14238);
            rule__MatchPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchPair__Group__2_in_rule__MatchPair__Group__14241);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2087:1: rule__MatchPair__Group__1__Impl : ( '=' ) ;
    public final void rule__MatchPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2091:1: ( ( '=' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2092:1: ( '=' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2092:1: ( '=' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2093:1: '='
            {
             before(grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__MatchPair__Group__1__Impl4269); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2106:1: rule__MatchPair__Group__2 : rule__MatchPair__Group__2__Impl ;
    public final void rule__MatchPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2110:1: ( rule__MatchPair__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2111:2: rule__MatchPair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__2__Impl_in_rule__MatchPair__Group__24300);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2117:1: rule__MatchPair__Group__2__Impl : ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) ;
    public final void rule__MatchPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2121:1: ( ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2122:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2122:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2123:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2124:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2124:2: rule__MatchPair__MatchAnswerAssignment_2
            {
            pushFollow(FOLLOW_rule__MatchPair__MatchAnswerAssignment_2_in_rule__MatchPair__Group__2__Impl4327);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2140:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2144:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2145:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04363);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04366);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2152:1: rule__Event__Group__0__Impl : ( '@event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2156:1: ( ( '@event' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2157:1: ( '@event' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2157:1: ( '@event' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2158:1: '@event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Event__Group__0__Impl4394); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2171:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2175:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2176:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14425);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__14428);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2183:1: rule__Event__Group__1__Impl : ( ( rule__Event__EventAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2187:1: ( ( ( rule__Event__EventAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2188:1: ( ( rule__Event__EventAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2188:1: ( ( rule__Event__EventAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2189:1: ( rule__Event__EventAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getEventAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2190:1: ( rule__Event__EventAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2190:2: rule__Event__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__EventAssignment_1_in_rule__Event__Group__1__Impl4455);
            rule__Event__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2200:1: rule__Event__Group__2 : rule__Event__Group__2__Impl ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2204:1: ( rule__Event__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2205:2: rule__Event__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__24485);
            rule__Event__Group__2__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2211:1: rule__Event__Group__2__Impl : ( ( rule__Event__TimeAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2215:1: ( ( ( rule__Event__TimeAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2216:1: ( ( rule__Event__TimeAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2216:1: ( ( rule__Event__TimeAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2217:1: ( rule__Event__TimeAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getTimeAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2218:1: ( rule__Event__TimeAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2218:2: rule__Event__TimeAssignment_2
            {
            pushFollow(FOLLOW_rule__Event__TimeAssignment_2_in_rule__Event__Group__2__Impl4512);
            rule__Event__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTimeAssignment_2()); 

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


    // $ANTLR start "rule__TrueFalse__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2234:1: rule__TrueFalse__Group__0 : rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 ;
    public final void rule__TrueFalse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2238:1: ( rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2239:2: rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__0__Impl_in_rule__TrueFalse__Group__04548);
            rule__TrueFalse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__1_in_rule__TrueFalse__Group__04551);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2246:1: rule__TrueFalse__Group__0__Impl : ( '@true_false' ) ;
    public final void rule__TrueFalse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2250:1: ( ( '@true_false' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2251:1: ( '@true_false' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2251:1: ( '@true_false' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2252:1: '@true_false'
            {
             before(grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__TrueFalse__Group__0__Impl4579); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2265:1: rule__TrueFalse__Group__1 : rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 ;
    public final void rule__TrueFalse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2269:1: ( rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2270:2: rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__1__Impl_in_rule__TrueFalse__Group__14610);
            rule__TrueFalse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__2_in_rule__TrueFalse__Group__14613);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2277:1: rule__TrueFalse__Group__1__Impl : ( ( rule__TrueFalse__StatementAssignment_1 ) ) ;
    public final void rule__TrueFalse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2281:1: ( ( ( rule__TrueFalse__StatementAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2282:1: ( ( rule__TrueFalse__StatementAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2282:1: ( ( rule__TrueFalse__StatementAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2283:1: ( rule__TrueFalse__StatementAssignment_1 )
            {
             before(grammarAccess.getTrueFalseAccess().getStatementAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2284:1: ( rule__TrueFalse__StatementAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2284:2: rule__TrueFalse__StatementAssignment_1
            {
            pushFollow(FOLLOW_rule__TrueFalse__StatementAssignment_1_in_rule__TrueFalse__Group__1__Impl4640);
            rule__TrueFalse__StatementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrueFalseAccess().getStatementAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2294:1: rule__TrueFalse__Group__2 : rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 ;
    public final void rule__TrueFalse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2298:1: ( rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2299:2: rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__2__Impl_in_rule__TrueFalse__Group__24670);
            rule__TrueFalse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__3_in_rule__TrueFalse__Group__24673);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2306:1: rule__TrueFalse__Group__2__Impl : ( ( rule__TrueFalse__TruthValueAssignment_2 ) ) ;
    public final void rule__TrueFalse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2310:1: ( ( ( rule__TrueFalse__TruthValueAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2311:1: ( ( rule__TrueFalse__TruthValueAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2311:1: ( ( rule__TrueFalse__TruthValueAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2312:1: ( rule__TrueFalse__TruthValueAssignment_2 )
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2313:1: ( rule__TrueFalse__TruthValueAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2313:2: rule__TrueFalse__TruthValueAssignment_2
            {
            pushFollow(FOLLOW_rule__TrueFalse__TruthValueAssignment_2_in_rule__TrueFalse__Group__2__Impl4700);
            rule__TrueFalse__TruthValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrueFalseAccess().getTruthValueAssignment_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2323:1: rule__TrueFalse__Group__3 : rule__TrueFalse__Group__3__Impl ;
    public final void rule__TrueFalse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2327:1: ( rule__TrueFalse__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2328:2: rule__TrueFalse__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__3__Impl_in_rule__TrueFalse__Group__34730);
            rule__TrueFalse__Group__3__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2334:1: rule__TrueFalse__Group__3__Impl : ( ( rule__TrueFalse__JustificationAssignment_3 )? ) ;
    public final void rule__TrueFalse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2338:1: ( ( ( rule__TrueFalse__JustificationAssignment_3 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2339:1: ( ( rule__TrueFalse__JustificationAssignment_3 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2339:1: ( ( rule__TrueFalse__JustificationAssignment_3 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2340:1: ( rule__TrueFalse__JustificationAssignment_3 )?
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2341:1: ( rule__TrueFalse__JustificationAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2341:2: rule__TrueFalse__JustificationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TrueFalse__JustificationAssignment_3_in_rule__TrueFalse__Group__3__Impl4757);
                    rule__TrueFalse__JustificationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueFalseAccess().getJustificationAssignment_3()); 

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


    // $ANTLR start "rule__ChemEquation__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2359:1: rule__ChemEquation__Group__0 : rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 ;
    public final void rule__ChemEquation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2363:1: ( rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2364:2: rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__0__Impl_in_rule__ChemEquation__Group__04796);
            rule__ChemEquation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__1_in_rule__ChemEquation__Group__04799);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2371:1: rule__ChemEquation__Group__0__Impl : ( '@chem_equation' ) ;
    public final void rule__ChemEquation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2375:1: ( ( '@chem_equation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2376:1: ( '@chem_equation' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2376:1: ( '@chem_equation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2377:1: '@chem_equation'
            {
             before(grammarAccess.getChemEquationAccess().getChem_equationKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ChemEquation__Group__0__Impl4827); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2390:1: rule__ChemEquation__Group__1 : rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 ;
    public final void rule__ChemEquation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2394:1: ( rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2395:2: rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__1__Impl_in_rule__ChemEquation__Group__14858);
            rule__ChemEquation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__2_in_rule__ChemEquation__Group__14861);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2402:1: rule__ChemEquation__Group__1__Impl : ( ( rule__ChemEquation__DescriptionAssignment_1 )? ) ;
    public final void rule__ChemEquation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2406:1: ( ( ( rule__ChemEquation__DescriptionAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2407:1: ( ( rule__ChemEquation__DescriptionAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2407:1: ( ( rule__ChemEquation__DescriptionAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2408:1: ( rule__ChemEquation__DescriptionAssignment_1 )?
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2409:1: ( rule__ChemEquation__DescriptionAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2409:2: rule__ChemEquation__DescriptionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ChemEquation__DescriptionAssignment_1_in_rule__ChemEquation__Group__1__Impl4888);
                    rule__ChemEquation__DescriptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemEquationAccess().getDescriptionAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2419:1: rule__ChemEquation__Group__2 : rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 ;
    public final void rule__ChemEquation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2423:1: ( rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2424:2: rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__2__Impl_in_rule__ChemEquation__Group__24919);
            rule__ChemEquation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__3_in_rule__ChemEquation__Group__24922);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2431:1: rule__ChemEquation__Group__2__Impl : ( '{' ) ;
    public final void rule__ChemEquation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2435:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2436:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2436:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2437:1: '{'
            {
             before(grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__ChemEquation__Group__2__Impl4950); 
             after(grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2450:1: rule__ChemEquation__Group__3 : rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 ;
    public final void rule__ChemEquation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2454:1: ( rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2455:2: rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__3__Impl_in_rule__ChemEquation__Group__34981);
            rule__ChemEquation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__4_in_rule__ChemEquation__Group__34984);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2462:1: rule__ChemEquation__Group__3__Impl : ( ( rule__ChemEquation__ReactantsAssignment_3 ) ) ;
    public final void rule__ChemEquation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2466:1: ( ( ( rule__ChemEquation__ReactantsAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2467:1: ( ( rule__ChemEquation__ReactantsAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2467:1: ( ( rule__ChemEquation__ReactantsAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2468:1: ( rule__ChemEquation__ReactantsAssignment_3 )
            {
             before(grammarAccess.getChemEquationAccess().getReactantsAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2469:1: ( rule__ChemEquation__ReactantsAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2469:2: rule__ChemEquation__ReactantsAssignment_3
            {
            pushFollow(FOLLOW_rule__ChemEquation__ReactantsAssignment_3_in_rule__ChemEquation__Group__3__Impl5011);
            rule__ChemEquation__ReactantsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChemEquationAccess().getReactantsAssignment_3()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2479:1: rule__ChemEquation__Group__4 : rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 ;
    public final void rule__ChemEquation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2483:1: ( rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2484:2: rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__4__Impl_in_rule__ChemEquation__Group__45041);
            rule__ChemEquation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__5_in_rule__ChemEquation__Group__45044);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2491:1: rule__ChemEquation__Group__4__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2495:1: ( ( '>' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2496:1: ( '>' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2496:1: ( '>' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2497:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__ChemEquation__Group__4__Impl5072); 
             after(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_4()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2510:1: rule__ChemEquation__Group__5 : rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 ;
    public final void rule__ChemEquation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2514:1: ( rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2515:2: rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__5__Impl_in_rule__ChemEquation__Group__55103);
            rule__ChemEquation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__6_in_rule__ChemEquation__Group__55106);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2522:1: rule__ChemEquation__Group__5__Impl : ( ( rule__ChemEquation__ProducesAssignment_5 )? ) ;
    public final void rule__ChemEquation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2526:1: ( ( ( rule__ChemEquation__ProducesAssignment_5 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2527:1: ( ( rule__ChemEquation__ProducesAssignment_5 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2527:1: ( ( rule__ChemEquation__ProducesAssignment_5 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2528:1: ( rule__ChemEquation__ProducesAssignment_5 )?
            {
             before(grammarAccess.getChemEquationAccess().getProducesAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2529:1: ( rule__ChemEquation__ProducesAssignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2529:2: rule__ChemEquation__ProducesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ChemEquation__ProducesAssignment_5_in_rule__ChemEquation__Group__5__Impl5133);
                    rule__ChemEquation__ProducesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemEquationAccess().getProducesAssignment_5()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2539:1: rule__ChemEquation__Group__6 : rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 ;
    public final void rule__ChemEquation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2543:1: ( rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2544:2: rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__6__Impl_in_rule__ChemEquation__Group__65164);
            rule__ChemEquation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__7_in_rule__ChemEquation__Group__65167);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2551:1: rule__ChemEquation__Group__6__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2555:1: ( ( '>' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2556:1: ( '>' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2556:1: ( '>' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2557:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__ChemEquation__Group__6__Impl5195); 
             after(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_6()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2570:1: rule__ChemEquation__Group__7 : rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 ;
    public final void rule__ChemEquation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2574:1: ( rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2575:2: rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__7__Impl_in_rule__ChemEquation__Group__75226);
            rule__ChemEquation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__8_in_rule__ChemEquation__Group__75229);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2582:1: rule__ChemEquation__Group__7__Impl : ( ( rule__ChemEquation__ProductsAssignment_7 ) ) ;
    public final void rule__ChemEquation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2586:1: ( ( ( rule__ChemEquation__ProductsAssignment_7 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2587:1: ( ( rule__ChemEquation__ProductsAssignment_7 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2587:1: ( ( rule__ChemEquation__ProductsAssignment_7 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2588:1: ( rule__ChemEquation__ProductsAssignment_7 )
            {
             before(grammarAccess.getChemEquationAccess().getProductsAssignment_7()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2589:1: ( rule__ChemEquation__ProductsAssignment_7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2589:2: rule__ChemEquation__ProductsAssignment_7
            {
            pushFollow(FOLLOW_rule__ChemEquation__ProductsAssignment_7_in_rule__ChemEquation__Group__7__Impl5256);
            rule__ChemEquation__ProductsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getChemEquationAccess().getProductsAssignment_7()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2599:1: rule__ChemEquation__Group__8 : rule__ChemEquation__Group__8__Impl ;
    public final void rule__ChemEquation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2603:1: ( rule__ChemEquation__Group__8__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2604:2: rule__ChemEquation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__8__Impl_in_rule__ChemEquation__Group__85286);
            rule__ChemEquation__Group__8__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2610:1: rule__ChemEquation__Group__8__Impl : ( '}' ) ;
    public final void rule__ChemEquation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2614:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2615:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2615:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2616:1: '}'
            {
             before(grammarAccess.getChemEquationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__ChemEquation__Group__8__Impl5314); 
             after(grammarAccess.getChemEquationAccess().getRightCurlyBracketKeyword_8()); 

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


    // $ANTLR start "rule__ChemCompound__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2647:1: rule__ChemCompound__Group__0 : rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 ;
    public final void rule__ChemCompound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2651:1: ( rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2652:2: rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__0__Impl_in_rule__ChemCompound__Group__05363);
            rule__ChemCompound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__1_in_rule__ChemCompound__Group__05366);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2659:1: rule__ChemCompound__Group__0__Impl : ( '@chem_compound' ) ;
    public final void rule__ChemCompound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2663:1: ( ( '@chem_compound' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2664:1: ( '@chem_compound' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2664:1: ( '@chem_compound' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2665:1: '@chem_compound'
            {
             before(grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ChemCompound__Group__0__Impl5394); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2678:1: rule__ChemCompound__Group__1 : rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 ;
    public final void rule__ChemCompound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2682:1: ( rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2683:2: rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__1__Impl_in_rule__ChemCompound__Group__15425);
            rule__ChemCompound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__2_in_rule__ChemCompound__Group__15428);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2690:1: rule__ChemCompound__Group__1__Impl : ( ( rule__ChemCompound__SymbolAssignment_1 ) ) ;
    public final void rule__ChemCompound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2694:1: ( ( ( rule__ChemCompound__SymbolAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2695:1: ( ( rule__ChemCompound__SymbolAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2695:1: ( ( rule__ChemCompound__SymbolAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2696:1: ( rule__ChemCompound__SymbolAssignment_1 )
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2697:1: ( rule__ChemCompound__SymbolAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2697:2: rule__ChemCompound__SymbolAssignment_1
            {
            pushFollow(FOLLOW_rule__ChemCompound__SymbolAssignment_1_in_rule__ChemCompound__Group__1__Impl5455);
            rule__ChemCompound__SymbolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChemCompoundAccess().getSymbolAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2707:1: rule__ChemCompound__Group__2 : rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 ;
    public final void rule__ChemCompound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2711:1: ( rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2712:2: rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__2__Impl_in_rule__ChemCompound__Group__25485);
            rule__ChemCompound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__3_in_rule__ChemCompound__Group__25488);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2719:1: rule__ChemCompound__Group__2__Impl : ( ( rule__ChemCompound__ChemicalNameAssignment_2 ) ) ;
    public final void rule__ChemCompound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2723:1: ( ( ( rule__ChemCompound__ChemicalNameAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2724:1: ( ( rule__ChemCompound__ChemicalNameAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2724:1: ( ( rule__ChemCompound__ChemicalNameAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2725:1: ( rule__ChemCompound__ChemicalNameAssignment_2 )
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2726:1: ( rule__ChemCompound__ChemicalNameAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2726:2: rule__ChemCompound__ChemicalNameAssignment_2
            {
            pushFollow(FOLLOW_rule__ChemCompound__ChemicalNameAssignment_2_in_rule__ChemCompound__Group__2__Impl5515);
            rule__ChemCompound__ChemicalNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChemCompoundAccess().getChemicalNameAssignment_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2736:1: rule__ChemCompound__Group__3 : rule__ChemCompound__Group__3__Impl ;
    public final void rule__ChemCompound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2740:1: ( rule__ChemCompound__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2741:2: rule__ChemCompound__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__3__Impl_in_rule__ChemCompound__Group__35545);
            rule__ChemCompound__Group__3__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2747:1: rule__ChemCompound__Group__3__Impl : ( ( rule__ChemCompound__CommonNameAssignment_3 )? ) ;
    public final void rule__ChemCompound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2751:1: ( ( ( rule__ChemCompound__CommonNameAssignment_3 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2752:1: ( ( rule__ChemCompound__CommonNameAssignment_3 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2752:1: ( ( rule__ChemCompound__CommonNameAssignment_3 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2753:1: ( rule__ChemCompound__CommonNameAssignment_3 )?
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2754:1: ( rule__ChemCompound__CommonNameAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2754:2: rule__ChemCompound__CommonNameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ChemCompound__CommonNameAssignment_3_in_rule__ChemCompound__Group__3__Impl5572);
                    rule__ChemCompound__CommonNameAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChemCompoundAccess().getCommonNameAssignment_3()); 

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


    // $ANTLR start "rule__Spellbee__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2772:1: rule__Spellbee__Group__0 : rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 ;
    public final void rule__Spellbee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2776:1: ( rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2777:2: rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__0__Impl_in_rule__Spellbee__Group__05611);
            rule__Spellbee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spellbee__Group__1_in_rule__Spellbee__Group__05614);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2784:1: rule__Spellbee__Group__0__Impl : ( '@spellbee' ) ;
    public final void rule__Spellbee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2788:1: ( ( '@spellbee' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2789:1: ( '@spellbee' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2789:1: ( '@spellbee' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2790:1: '@spellbee'
            {
             before(grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Spellbee__Group__0__Impl5642); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2803:1: rule__Spellbee__Group__1 : rule__Spellbee__Group__1__Impl ;
    public final void rule__Spellbee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2807:1: ( rule__Spellbee__Group__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2808:2: rule__Spellbee__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__1__Impl_in_rule__Spellbee__Group__15673);
            rule__Spellbee__Group__1__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2814:1: rule__Spellbee__Group__1__Impl : ( ( rule__Spellbee__WordAssignment_1 ) ) ;
    public final void rule__Spellbee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2818:1: ( ( ( rule__Spellbee__WordAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2819:1: ( ( rule__Spellbee__WordAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2819:1: ( ( rule__Spellbee__WordAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2820:1: ( rule__Spellbee__WordAssignment_1 )
            {
             before(grammarAccess.getSpellbeeAccess().getWordAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2821:1: ( rule__Spellbee__WordAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2821:2: rule__Spellbee__WordAssignment_1
            {
            pushFollow(FOLLOW_rule__Spellbee__WordAssignment_1_in_rule__Spellbee__Group__1__Impl5700);
            rule__Spellbee__WordAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpellbeeAccess().getWordAssignment_1()); 

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


    // $ANTLR start "rule__ImageLabel__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2835:1: rule__ImageLabel__Group__0 : rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 ;
    public final void rule__ImageLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2839:1: ( rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2840:2: rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__0__Impl_in_rule__ImageLabel__Group__05734);
            rule__ImageLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__1_in_rule__ImageLabel__Group__05737);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2847:1: rule__ImageLabel__Group__0__Impl : ( '@image_label' ) ;
    public final void rule__ImageLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2851:1: ( ( '@image_label' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2852:1: ( '@image_label' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2852:1: ( '@image_label' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2853:1: '@image_label'
            {
             before(grammarAccess.getImageLabelAccess().getImage_labelKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ImageLabel__Group__0__Impl5765); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2866:1: rule__ImageLabel__Group__1 : rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 ;
    public final void rule__ImageLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2870:1: ( rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2871:2: rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__1__Impl_in_rule__ImageLabel__Group__15796);
            rule__ImageLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__2_in_rule__ImageLabel__Group__15799);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2878:1: rule__ImageLabel__Group__1__Impl : ( ( rule__ImageLabel__CaptionAssignment_1 )? ) ;
    public final void rule__ImageLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2882:1: ( ( ( rule__ImageLabel__CaptionAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2883:1: ( ( rule__ImageLabel__CaptionAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2883:1: ( ( rule__ImageLabel__CaptionAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2884:1: ( rule__ImageLabel__CaptionAssignment_1 )?
            {
             before(grammarAccess.getImageLabelAccess().getCaptionAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2885:1: ( rule__ImageLabel__CaptionAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2885:2: rule__ImageLabel__CaptionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ImageLabel__CaptionAssignment_1_in_rule__ImageLabel__Group__1__Impl5826);
                    rule__ImageLabel__CaptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageLabelAccess().getCaptionAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2895:1: rule__ImageLabel__Group__2 : rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 ;
    public final void rule__ImageLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2899:1: ( rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2900:2: rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__2__Impl_in_rule__ImageLabel__Group__25857);
            rule__ImageLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__3_in_rule__ImageLabel__Group__25860);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2907:1: rule__ImageLabel__Group__2__Impl : ( '{' ) ;
    public final void rule__ImageLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2911:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2912:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2912:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2913:1: '{'
            {
             before(grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__ImageLabel__Group__2__Impl5888); 
             after(grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2926:1: rule__ImageLabel__Group__3 : rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 ;
    public final void rule__ImageLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2930:1: ( rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2931:2: rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__3__Impl_in_rule__ImageLabel__Group__35919);
            rule__ImageLabel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__4_in_rule__ImageLabel__Group__35922);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2938:1: rule__ImageLabel__Group__3__Impl : ( 'imageName' ) ;
    public final void rule__ImageLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2942:1: ( ( 'imageName' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2943:1: ( 'imageName' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2943:1: ( 'imageName' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2944:1: 'imageName'
            {
             before(grammarAccess.getImageLabelAccess().getImageNameKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__ImageLabel__Group__3__Impl5950); 
             after(grammarAccess.getImageLabelAccess().getImageNameKeyword_3()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2957:1: rule__ImageLabel__Group__4 : rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 ;
    public final void rule__ImageLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2961:1: ( rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2962:2: rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__4__Impl_in_rule__ImageLabel__Group__45981);
            rule__ImageLabel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__5_in_rule__ImageLabel__Group__45984);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2969:1: rule__ImageLabel__Group__4__Impl : ( ( rule__ImageLabel__ImageNameAssignment_4 ) ) ;
    public final void rule__ImageLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2973:1: ( ( ( rule__ImageLabel__ImageNameAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2974:1: ( ( rule__ImageLabel__ImageNameAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2974:1: ( ( rule__ImageLabel__ImageNameAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2975:1: ( rule__ImageLabel__ImageNameAssignment_4 )
            {
             before(grammarAccess.getImageLabelAccess().getImageNameAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2976:1: ( rule__ImageLabel__ImageNameAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2976:2: rule__ImageLabel__ImageNameAssignment_4
            {
            pushFollow(FOLLOW_rule__ImageLabel__ImageNameAssignment_4_in_rule__ImageLabel__Group__4__Impl6011);
            rule__ImageLabel__ImageNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getImageNameAssignment_4()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2986:1: rule__ImageLabel__Group__5 : rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 ;
    public final void rule__ImageLabel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2990:1: ( rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2991:2: rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__5__Impl_in_rule__ImageLabel__Group__56041);
            rule__ImageLabel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__6_in_rule__ImageLabel__Group__56044);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2998:1: rule__ImageLabel__Group__5__Impl : ( ( rule__ImageLabel__HotspotsAssignment_5 ) ) ;
    public final void rule__ImageLabel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3002:1: ( ( ( rule__ImageLabel__HotspotsAssignment_5 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3003:1: ( ( rule__ImageLabel__HotspotsAssignment_5 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3003:1: ( ( rule__ImageLabel__HotspotsAssignment_5 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3004:1: ( rule__ImageLabel__HotspotsAssignment_5 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3005:1: ( rule__ImageLabel__HotspotsAssignment_5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3005:2: rule__ImageLabel__HotspotsAssignment_5
            {
            pushFollow(FOLLOW_rule__ImageLabel__HotspotsAssignment_5_in_rule__ImageLabel__Group__5__Impl6071);
            rule__ImageLabel__HotspotsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getHotspotsAssignment_5()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3015:1: rule__ImageLabel__Group__6 : rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 ;
    public final void rule__ImageLabel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3019:1: ( rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3020:2: rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__6__Impl_in_rule__ImageLabel__Group__66101);
            rule__ImageLabel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__7_in_rule__ImageLabel__Group__66104);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3027:1: rule__ImageLabel__Group__6__Impl : ( ( rule__ImageLabel__Group_6__0 )* ) ;
    public final void rule__ImageLabel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3031:1: ( ( ( rule__ImageLabel__Group_6__0 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3032:1: ( ( rule__ImageLabel__Group_6__0 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3032:1: ( ( rule__ImageLabel__Group_6__0 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3033:1: ( rule__ImageLabel__Group_6__0 )*
            {
             before(grammarAccess.getImageLabelAccess().getGroup_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3034:1: ( rule__ImageLabel__Group_6__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3034:2: rule__ImageLabel__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__ImageLabel__Group_6__0_in_rule__ImageLabel__Group__6__Impl6131);
            	    rule__ImageLabel__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getImageLabelAccess().getGroup_6()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3044:1: rule__ImageLabel__Group__7 : rule__ImageLabel__Group__7__Impl ;
    public final void rule__ImageLabel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3048:1: ( rule__ImageLabel__Group__7__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3049:2: rule__ImageLabel__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__7__Impl_in_rule__ImageLabel__Group__76162);
            rule__ImageLabel__Group__7__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3055:1: rule__ImageLabel__Group__7__Impl : ( '}' ) ;
    public final void rule__ImageLabel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3059:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3060:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3060:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3061:1: '}'
            {
             before(grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__ImageLabel__Group__7__Impl6190); 
             after(grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__ImageLabel__Group_6__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3090:1: rule__ImageLabel__Group_6__0 : rule__ImageLabel__Group_6__0__Impl rule__ImageLabel__Group_6__1 ;
    public final void rule__ImageLabel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3094:1: ( rule__ImageLabel__Group_6__0__Impl rule__ImageLabel__Group_6__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3095:2: rule__ImageLabel__Group_6__0__Impl rule__ImageLabel__Group_6__1
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group_6__0__Impl_in_rule__ImageLabel__Group_6__06237);
            rule__ImageLabel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group_6__1_in_rule__ImageLabel__Group_6__06240);
            rule__ImageLabel__Group_6__1();

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
    // $ANTLR end "rule__ImageLabel__Group_6__0"


    // $ANTLR start "rule__ImageLabel__Group_6__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3102:1: rule__ImageLabel__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ImageLabel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3106:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3107:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3107:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3108:1: ','
            {
             before(grammarAccess.getImageLabelAccess().getCommaKeyword_6_0()); 
            match(input,34,FOLLOW_34_in_rule__ImageLabel__Group_6__0__Impl6268); 
             after(grammarAccess.getImageLabelAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__ImageLabel__Group_6__0__Impl"


    // $ANTLR start "rule__ImageLabel__Group_6__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3121:1: rule__ImageLabel__Group_6__1 : rule__ImageLabel__Group_6__1__Impl ;
    public final void rule__ImageLabel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3125:1: ( rule__ImageLabel__Group_6__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3126:2: rule__ImageLabel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group_6__1__Impl_in_rule__ImageLabel__Group_6__16299);
            rule__ImageLabel__Group_6__1__Impl();

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
    // $ANTLR end "rule__ImageLabel__Group_6__1"


    // $ANTLR start "rule__ImageLabel__Group_6__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3132:1: rule__ImageLabel__Group_6__1__Impl : ( ( rule__ImageLabel__HotspotsAssignment_6_1 ) ) ;
    public final void rule__ImageLabel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3136:1: ( ( ( rule__ImageLabel__HotspotsAssignment_6_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3137:1: ( ( rule__ImageLabel__HotspotsAssignment_6_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3137:1: ( ( rule__ImageLabel__HotspotsAssignment_6_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3138:1: ( rule__ImageLabel__HotspotsAssignment_6_1 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_6_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3139:1: ( rule__ImageLabel__HotspotsAssignment_6_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3139:2: rule__ImageLabel__HotspotsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ImageLabel__HotspotsAssignment_6_1_in_rule__ImageLabel__Group_6__1__Impl6326);
            rule__ImageLabel__HotspotsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getImageLabelAccess().getHotspotsAssignment_6_1()); 

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
    // $ANTLR end "rule__ImageLabel__Group_6__1__Impl"


    // $ANTLR start "rule__HotSpot__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3153:1: rule__HotSpot__Group__0 : rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 ;
    public final void rule__HotSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3157:1: ( rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3158:2: rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__0__Impl_in_rule__HotSpot__Group__06360);
            rule__HotSpot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__1_in_rule__HotSpot__Group__06363);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3165:1: rule__HotSpot__Group__0__Impl : ( ( rule__HotSpot__XAssignment_0 ) ) ;
    public final void rule__HotSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3169:1: ( ( ( rule__HotSpot__XAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3170:1: ( ( rule__HotSpot__XAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3170:1: ( ( rule__HotSpot__XAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3171:1: ( rule__HotSpot__XAssignment_0 )
            {
             before(grammarAccess.getHotSpotAccess().getXAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3172:1: ( rule__HotSpot__XAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3172:2: rule__HotSpot__XAssignment_0
            {
            pushFollow(FOLLOW_rule__HotSpot__XAssignment_0_in_rule__HotSpot__Group__0__Impl6390);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3182:1: rule__HotSpot__Group__1 : rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 ;
    public final void rule__HotSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3186:1: ( rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3187:2: rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__1__Impl_in_rule__HotSpot__Group__16420);
            rule__HotSpot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__2_in_rule__HotSpot__Group__16423);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3194:1: rule__HotSpot__Group__1__Impl : ( ',' ) ;
    public final void rule__HotSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3198:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3199:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3199:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3200:1: ','
            {
             before(grammarAccess.getHotSpotAccess().getCommaKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__HotSpot__Group__1__Impl6451); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3213:1: rule__HotSpot__Group__2 : rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 ;
    public final void rule__HotSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3217:1: ( rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3218:2: rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__2__Impl_in_rule__HotSpot__Group__26482);
            rule__HotSpot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__3_in_rule__HotSpot__Group__26485);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3225:1: rule__HotSpot__Group__2__Impl : ( ( rule__HotSpot__YAssignment_2 ) ) ;
    public final void rule__HotSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3229:1: ( ( ( rule__HotSpot__YAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3230:1: ( ( rule__HotSpot__YAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3230:1: ( ( rule__HotSpot__YAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3231:1: ( rule__HotSpot__YAssignment_2 )
            {
             before(grammarAccess.getHotSpotAccess().getYAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3232:1: ( rule__HotSpot__YAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3232:2: rule__HotSpot__YAssignment_2
            {
            pushFollow(FOLLOW_rule__HotSpot__YAssignment_2_in_rule__HotSpot__Group__2__Impl6512);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3242:1: rule__HotSpot__Group__3 : rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 ;
    public final void rule__HotSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3246:1: ( rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3247:2: rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__3__Impl_in_rule__HotSpot__Group__36542);
            rule__HotSpot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__4_in_rule__HotSpot__Group__36545);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3254:1: rule__HotSpot__Group__3__Impl : ( '=' ) ;
    public final void rule__HotSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3258:1: ( ( '=' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3259:1: ( '=' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3259:1: ( '=' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3260:1: '='
            {
             before(grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__HotSpot__Group__3__Impl6573); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3273:1: rule__HotSpot__Group__4 : rule__HotSpot__Group__4__Impl ;
    public final void rule__HotSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3277:1: ( rule__HotSpot__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3278:2: rule__HotSpot__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__4__Impl_in_rule__HotSpot__Group__46604);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3284:1: rule__HotSpot__Group__4__Impl : ( ( rule__HotSpot__LabelAssignment_4 ) ) ;
    public final void rule__HotSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3288:1: ( ( ( rule__HotSpot__LabelAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3289:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3289:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3290:1: ( rule__HotSpot__LabelAssignment_4 )
            {
             before(grammarAccess.getHotSpotAccess().getLabelAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3291:1: ( rule__HotSpot__LabelAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3291:2: rule__HotSpot__LabelAssignment_4
            {
            pushFollow(FOLLOW_rule__HotSpot__LabelAssignment_4_in_rule__HotSpot__Group__4__Impl6631);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3311:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3315:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3316:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__06671);
            rule__Equation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__06674);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3323:1: rule__Equation__Group__0__Impl : ( '@equation' ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3327:1: ( ( '@equation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3328:1: ( '@equation' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3328:1: ( '@equation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3329:1: '@equation'
            {
             before(grammarAccess.getEquationAccess().getEquationKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Equation__Group__0__Impl6702); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3342:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3346:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3347:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__16733);
            rule__Equation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__16736);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3354:1: rule__Equation__Group__1__Impl : ( ( rule__Equation__EquationAssignment_1 ) ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3358:1: ( ( ( rule__Equation__EquationAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3359:1: ( ( rule__Equation__EquationAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3359:1: ( ( rule__Equation__EquationAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3360:1: ( rule__Equation__EquationAssignment_1 )
            {
             before(grammarAccess.getEquationAccess().getEquationAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3361:1: ( rule__Equation__EquationAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3361:2: rule__Equation__EquationAssignment_1
            {
            pushFollow(FOLLOW_rule__Equation__EquationAssignment_1_in_rule__Equation__Group__1__Impl6763);
            rule__Equation__EquationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getEquationAssignment_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3371:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl rule__Equation__Group__3 ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3375:1: ( rule__Equation__Group__2__Impl rule__Equation__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3376:2: rule__Equation__Group__2__Impl rule__Equation__Group__3
            {
            pushFollow(FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__26793);
            rule__Equation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__26796);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3383:1: rule__Equation__Group__2__Impl : ( '{' ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3387:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3388:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3388:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3389:1: '{'
            {
             before(grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Equation__Group__2__Impl6824); 
             after(grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3402:1: rule__Equation__Group__3 : rule__Equation__Group__3__Impl rule__Equation__Group__4 ;
    public final void rule__Equation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3406:1: ( rule__Equation__Group__3__Impl rule__Equation__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3407:2: rule__Equation__Group__3__Impl rule__Equation__Group__4
            {
            pushFollow(FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__36855);
            rule__Equation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__36858);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3414:1: rule__Equation__Group__3__Impl : ( ( rule__Equation__DescriptionAssignment_3 )? ) ;
    public final void rule__Equation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3418:1: ( ( ( rule__Equation__DescriptionAssignment_3 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3419:1: ( ( rule__Equation__DescriptionAssignment_3 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3419:1: ( ( rule__Equation__DescriptionAssignment_3 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3420:1: ( rule__Equation__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getEquationAccess().getDescriptionAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3421:1: ( rule__Equation__DescriptionAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3421:2: rule__Equation__DescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Equation__DescriptionAssignment_3_in_rule__Equation__Group__3__Impl6885);
                    rule__Equation__DescriptionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEquationAccess().getDescriptionAssignment_3()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3431:1: rule__Equation__Group__4 : rule__Equation__Group__4__Impl rule__Equation__Group__5 ;
    public final void rule__Equation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3435:1: ( rule__Equation__Group__4__Impl rule__Equation__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3436:2: rule__Equation__Group__4__Impl rule__Equation__Group__5
            {
            pushFollow(FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__46916);
            rule__Equation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__5_in_rule__Equation__Group__46919);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3443:1: rule__Equation__Group__4__Impl : ( 'where' ) ;
    public final void rule__Equation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3447:1: ( ( 'where' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3448:1: ( 'where' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3448:1: ( 'where' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3449:1: 'where'
            {
             before(grammarAccess.getEquationAccess().getWhereKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__Equation__Group__4__Impl6947); 
             after(grammarAccess.getEquationAccess().getWhereKeyword_4()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3462:1: rule__Equation__Group__5 : rule__Equation__Group__5__Impl rule__Equation__Group__6 ;
    public final void rule__Equation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3466:1: ( rule__Equation__Group__5__Impl rule__Equation__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3467:2: rule__Equation__Group__5__Impl rule__Equation__Group__6
            {
            pushFollow(FOLLOW_rule__Equation__Group__5__Impl_in_rule__Equation__Group__56978);
            rule__Equation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__6_in_rule__Equation__Group__56981);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3474:1: rule__Equation__Group__5__Impl : ( ( rule__Equation__SymbolsAssignment_5 ) ) ;
    public final void rule__Equation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3478:1: ( ( ( rule__Equation__SymbolsAssignment_5 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3479:1: ( ( rule__Equation__SymbolsAssignment_5 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3479:1: ( ( rule__Equation__SymbolsAssignment_5 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3480:1: ( rule__Equation__SymbolsAssignment_5 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3481:1: ( rule__Equation__SymbolsAssignment_5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3481:2: rule__Equation__SymbolsAssignment_5
            {
            pushFollow(FOLLOW_rule__Equation__SymbolsAssignment_5_in_rule__Equation__Group__5__Impl7008);
            rule__Equation__SymbolsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getSymbolsAssignment_5()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3491:1: rule__Equation__Group__6 : rule__Equation__Group__6__Impl rule__Equation__Group__7 ;
    public final void rule__Equation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3495:1: ( rule__Equation__Group__6__Impl rule__Equation__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3496:2: rule__Equation__Group__6__Impl rule__Equation__Group__7
            {
            pushFollow(FOLLOW_rule__Equation__Group__6__Impl_in_rule__Equation__Group__67038);
            rule__Equation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__7_in_rule__Equation__Group__67041);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3503:1: rule__Equation__Group__6__Impl : ( ( rule__Equation__Group_6__0 )* ) ;
    public final void rule__Equation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3507:1: ( ( ( rule__Equation__Group_6__0 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3508:1: ( ( rule__Equation__Group_6__0 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3508:1: ( ( rule__Equation__Group_6__0 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3509:1: ( rule__Equation__Group_6__0 )*
            {
             before(grammarAccess.getEquationAccess().getGroup_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3510:1: ( rule__Equation__Group_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3510:2: rule__Equation__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Equation__Group_6__0_in_rule__Equation__Group__6__Impl7068);
            	    rule__Equation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEquationAccess().getGroup_6()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3520:1: rule__Equation__Group__7 : rule__Equation__Group__7__Impl ;
    public final void rule__Equation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3524:1: ( rule__Equation__Group__7__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3525:2: rule__Equation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group__7__Impl_in_rule__Equation__Group__77099);
            rule__Equation__Group__7__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3531:1: rule__Equation__Group__7__Impl : ( '}' ) ;
    public final void rule__Equation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3535:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3536:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3536:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3537:1: '}'
            {
             before(grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__Equation__Group__7__Impl7127); 
             after(grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__Equation__Group_6__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3566:1: rule__Equation__Group_6__0 : rule__Equation__Group_6__0__Impl rule__Equation__Group_6__1 ;
    public final void rule__Equation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3570:1: ( rule__Equation__Group_6__0__Impl rule__Equation__Group_6__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3571:2: rule__Equation__Group_6__0__Impl rule__Equation__Group_6__1
            {
            pushFollow(FOLLOW_rule__Equation__Group_6__0__Impl_in_rule__Equation__Group_6__07174);
            rule__Equation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group_6__1_in_rule__Equation__Group_6__07177);
            rule__Equation__Group_6__1();

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
    // $ANTLR end "rule__Equation__Group_6__0"


    // $ANTLR start "rule__Equation__Group_6__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3578:1: rule__Equation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Equation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3582:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3583:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3583:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3584:1: ','
            {
             before(grammarAccess.getEquationAccess().getCommaKeyword_6_0()); 
            match(input,34,FOLLOW_34_in_rule__Equation__Group_6__0__Impl7205); 
             after(grammarAccess.getEquationAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Equation__Group_6__0__Impl"


    // $ANTLR start "rule__Equation__Group_6__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3597:1: rule__Equation__Group_6__1 : rule__Equation__Group_6__1__Impl ;
    public final void rule__Equation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3601:1: ( rule__Equation__Group_6__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3602:2: rule__Equation__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group_6__1__Impl_in_rule__Equation__Group_6__17236);
            rule__Equation__Group_6__1__Impl();

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
    // $ANTLR end "rule__Equation__Group_6__1"


    // $ANTLR start "rule__Equation__Group_6__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3608:1: rule__Equation__Group_6__1__Impl : ( ( rule__Equation__SymbolsAssignment_6_1 ) ) ;
    public final void rule__Equation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3612:1: ( ( ( rule__Equation__SymbolsAssignment_6_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3613:1: ( ( rule__Equation__SymbolsAssignment_6_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3613:1: ( ( rule__Equation__SymbolsAssignment_6_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3614:1: ( rule__Equation__SymbolsAssignment_6_1 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_6_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3615:1: ( rule__Equation__SymbolsAssignment_6_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3615:2: rule__Equation__SymbolsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Equation__SymbolsAssignment_6_1_in_rule__Equation__Group_6__1__Impl7263);
            rule__Equation__SymbolsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getSymbolsAssignment_6_1()); 

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
    // $ANTLR end "rule__Equation__Group_6__1__Impl"


    // $ANTLR start "rule__EqSymbol__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3629:1: rule__EqSymbol__Group__0 : rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 ;
    public final void rule__EqSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3633:1: ( rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3634:2: rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__0__Impl_in_rule__EqSymbol__Group__07297);
            rule__EqSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqSymbol__Group__1_in_rule__EqSymbol__Group__07300);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3641:1: rule__EqSymbol__Group__0__Impl : ( ( rule__EqSymbol__SymbolAssignment_0 ) ) ;
    public final void rule__EqSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3645:1: ( ( ( rule__EqSymbol__SymbolAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3646:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3646:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3647:1: ( rule__EqSymbol__SymbolAssignment_0 )
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3648:1: ( rule__EqSymbol__SymbolAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3648:2: rule__EqSymbol__SymbolAssignment_0
            {
            pushFollow(FOLLOW_rule__EqSymbol__SymbolAssignment_0_in_rule__EqSymbol__Group__0__Impl7327);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3658:1: rule__EqSymbol__Group__1 : rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 ;
    public final void rule__EqSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3662:1: ( rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3663:2: rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__1__Impl_in_rule__EqSymbol__Group__17357);
            rule__EqSymbol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqSymbol__Group__2_in_rule__EqSymbol__Group__17360);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3670:1: rule__EqSymbol__Group__1__Impl : ( '=' ) ;
    public final void rule__EqSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3674:1: ( ( '=' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3675:1: ( '=' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3675:1: ( '=' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3676:1: '='
            {
             before(grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__EqSymbol__Group__1__Impl7388); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3689:1: rule__EqSymbol__Group__2 : rule__EqSymbol__Group__2__Impl ;
    public final void rule__EqSymbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3693:1: ( rule__EqSymbol__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3694:2: rule__EqSymbol__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__2__Impl_in_rule__EqSymbol__Group__27419);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3700:1: rule__EqSymbol__Group__2__Impl : ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) ;
    public final void rule__EqSymbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3704:1: ( ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3705:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3705:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3706:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3707:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3707:2: rule__EqSymbol__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__EqSymbol__DescriptionAssignment_2_in_rule__EqSymbol__Group__2__Impl7446);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3723:1: rule__RefToContext__Group__0 : rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 ;
    public final void rule__RefToContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3727:1: ( rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3728:2: rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__0__Impl_in_rule__RefToContext__Group__07482);
            rule__RefToContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__1_in_rule__RefToContext__Group__07485);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3735:1: rule__RefToContext__Group__0__Impl : ( '@rtc' ) ;
    public final void rule__RefToContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3739:1: ( ( '@rtc' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3740:1: ( '@rtc' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3740:1: ( '@rtc' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3741:1: '@rtc'
            {
             before(grammarAccess.getRefToContextAccess().getRtcKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__RefToContext__Group__0__Impl7513); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3754:1: rule__RefToContext__Group__1 : rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 ;
    public final void rule__RefToContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3758:1: ( rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3759:2: rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__1__Impl_in_rule__RefToContext__Group__17544);
            rule__RefToContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__2_in_rule__RefToContext__Group__17547);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3766:1: rule__RefToContext__Group__1__Impl : ( '{' ) ;
    public final void rule__RefToContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3770:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3771:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3771:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3772:1: '{'
            {
             before(grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__RefToContext__Group__1__Impl7575); 
             after(grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3785:1: rule__RefToContext__Group__2 : rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 ;
    public final void rule__RefToContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3789:1: ( rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3790:2: rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__2__Impl_in_rule__RefToContext__Group__27606);
            rule__RefToContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__3_in_rule__RefToContext__Group__27609);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3797:1: rule__RefToContext__Group__2__Impl : ( 'context' ) ;
    public final void rule__RefToContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3801:1: ( ( 'context' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3802:1: ( 'context' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3802:1: ( 'context' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3803:1: 'context'
            {
             before(grammarAccess.getRefToContextAccess().getContextKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__RefToContext__Group__2__Impl7637); 
             after(grammarAccess.getRefToContextAccess().getContextKeyword_2()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3816:1: rule__RefToContext__Group__3 : rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 ;
    public final void rule__RefToContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3820:1: ( rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3821:2: rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__3__Impl_in_rule__RefToContext__Group__37668);
            rule__RefToContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__4_in_rule__RefToContext__Group__37671);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3828:1: rule__RefToContext__Group__3__Impl : ( ( rule__RefToContext__ContextAssignment_3 ) ) ;
    public final void rule__RefToContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3832:1: ( ( ( rule__RefToContext__ContextAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3833:1: ( ( rule__RefToContext__ContextAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3833:1: ( ( rule__RefToContext__ContextAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3834:1: ( rule__RefToContext__ContextAssignment_3 )
            {
             before(grammarAccess.getRefToContextAccess().getContextAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3835:1: ( rule__RefToContext__ContextAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3835:2: rule__RefToContext__ContextAssignment_3
            {
            pushFollow(FOLLOW_rule__RefToContext__ContextAssignment_3_in_rule__RefToContext__Group__3__Impl7698);
            rule__RefToContext__ContextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getContextAssignment_3()); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3845:1: rule__RefToContext__Group__4 : rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 ;
    public final void rule__RefToContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3849:1: ( rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3850:2: rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__4__Impl_in_rule__RefToContext__Group__47728);
            rule__RefToContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__5_in_rule__RefToContext__Group__47731);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3857:1: rule__RefToContext__Group__4__Impl : ( ( ( rule__RefToContext__QuestionsAssignment_4 ) ) ( ( rule__RefToContext__QuestionsAssignment_4 )* ) ) ;
    public final void rule__RefToContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3861:1: ( ( ( ( rule__RefToContext__QuestionsAssignment_4 ) ) ( ( rule__RefToContext__QuestionsAssignment_4 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3862:1: ( ( ( rule__RefToContext__QuestionsAssignment_4 ) ) ( ( rule__RefToContext__QuestionsAssignment_4 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3862:1: ( ( ( rule__RefToContext__QuestionsAssignment_4 ) ) ( ( rule__RefToContext__QuestionsAssignment_4 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3863:1: ( ( rule__RefToContext__QuestionsAssignment_4 ) ) ( ( rule__RefToContext__QuestionsAssignment_4 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3863:1: ( ( rule__RefToContext__QuestionsAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3864:1: ( rule__RefToContext__QuestionsAssignment_4 )
            {
             before(grammarAccess.getRefToContextAccess().getQuestionsAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3865:1: ( rule__RefToContext__QuestionsAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3865:2: rule__RefToContext__QuestionsAssignment_4
            {
            pushFollow(FOLLOW_rule__RefToContext__QuestionsAssignment_4_in_rule__RefToContext__Group__4__Impl7760);
            rule__RefToContext__QuestionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getQuestionsAssignment_4()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3868:1: ( ( rule__RefToContext__QuestionsAssignment_4 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3869:1: ( rule__RefToContext__QuestionsAssignment_4 )*
            {
             before(grammarAccess.getRefToContextAccess().getQuestionsAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3870:1: ( rule__RefToContext__QuestionsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3870:2: rule__RefToContext__QuestionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__RefToContext__QuestionsAssignment_4_in_rule__RefToContext__Group__4__Impl7772);
            	    rule__RefToContext__QuestionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRefToContextAccess().getQuestionsAssignment_4()); 

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
    // $ANTLR end "rule__RefToContext__Group__4__Impl"


    // $ANTLR start "rule__RefToContext__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3881:1: rule__RefToContext__Group__5 : rule__RefToContext__Group__5__Impl ;
    public final void rule__RefToContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3885:1: ( rule__RefToContext__Group__5__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3886:2: rule__RefToContext__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__5__Impl_in_rule__RefToContext__Group__57805);
            rule__RefToContext__Group__5__Impl();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3892:1: rule__RefToContext__Group__5__Impl : ( '}' ) ;
    public final void rule__RefToContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3896:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3897:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3897:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3898:1: '}'
            {
             before(grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__RefToContext__Group__5__Impl7833); 
             after(grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__CMap__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3923:1: rule__CMap__Group__0 : rule__CMap__Group__0__Impl rule__CMap__Group__1 ;
    public final void rule__CMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3927:1: ( rule__CMap__Group__0__Impl rule__CMap__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3928:2: rule__CMap__Group__0__Impl rule__CMap__Group__1
            {
            pushFollow(FOLLOW_rule__CMap__Group__0__Impl_in_rule__CMap__Group__07876);
            rule__CMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CMap__Group__1_in_rule__CMap__Group__07879);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3935:1: rule__CMap__Group__0__Impl : ( 'cmap' ) ;
    public final void rule__CMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3939:1: ( ( 'cmap' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3940:1: ( 'cmap' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3940:1: ( 'cmap' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3941:1: 'cmap'
            {
             before(grammarAccess.getCMapAccess().getCmapKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__CMap__Group__0__Impl7907); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3954:1: rule__CMap__Group__1 : rule__CMap__Group__1__Impl rule__CMap__Group__2 ;
    public final void rule__CMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3958:1: ( rule__CMap__Group__1__Impl rule__CMap__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3959:2: rule__CMap__Group__1__Impl rule__CMap__Group__2
            {
            pushFollow(FOLLOW_rule__CMap__Group__1__Impl_in_rule__CMap__Group__17938);
            rule__CMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CMap__Group__2_in_rule__CMap__Group__17941);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3966:1: rule__CMap__Group__1__Impl : ( '{' ) ;
    public final void rule__CMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3970:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3971:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3971:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3972:1: '{'
            {
             before(grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__CMap__Group__1__Impl7969); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3985:1: rule__CMap__Group__2 : rule__CMap__Group__2__Impl rule__CMap__Group__3 ;
    public final void rule__CMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3989:1: ( rule__CMap__Group__2__Impl rule__CMap__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3990:2: rule__CMap__Group__2__Impl rule__CMap__Group__3
            {
            pushFollow(FOLLOW_rule__CMap__Group__2__Impl_in_rule__CMap__Group__28000);
            rule__CMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CMap__Group__3_in_rule__CMap__Group__28003);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3997:1: rule__CMap__Group__2__Impl : ( ( rule__CMap__ContentAssignment_2 ) ) ;
    public final void rule__CMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4001:1: ( ( ( rule__CMap__ContentAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4002:1: ( ( rule__CMap__ContentAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4002:1: ( ( rule__CMap__ContentAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4003:1: ( rule__CMap__ContentAssignment_2 )
            {
             before(grammarAccess.getCMapAccess().getContentAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4004:1: ( rule__CMap__ContentAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4004:2: rule__CMap__ContentAssignment_2
            {
            pushFollow(FOLLOW_rule__CMap__ContentAssignment_2_in_rule__CMap__Group__2__Impl8030);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4014:1: rule__CMap__Group__3 : rule__CMap__Group__3__Impl ;
    public final void rule__CMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4018:1: ( rule__CMap__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4019:2: rule__CMap__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CMap__Group__3__Impl_in_rule__CMap__Group__38060);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4025:1: rule__CMap__Group__3__Impl : ( '}' ) ;
    public final void rule__CMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4029:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4030:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4030:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4031:1: '}'
            {
             before(grammarAccess.getCMapAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__CMap__Group__3__Impl8088); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4053:1: rule__JoveNotes__ProcessingHintsAssignment_0 : ( ruleProcessingHints ) ;
    public final void rule__JoveNotes__ProcessingHintsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4057:1: ( ( ruleProcessingHints ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4058:1: ( ruleProcessingHints )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4058:1: ( ruleProcessingHints )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4059:1: ruleProcessingHints
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsProcessingHintsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProcessingHints_in_rule__JoveNotes__ProcessingHintsAssignment_08132);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4068:1: rule__JoveNotes__ChapterDetailsAssignment_1 : ( ruleChapterDetails ) ;
    public final void rule__JoveNotes__ChapterDetailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4072:1: ( ( ruleChapterDetails ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4073:1: ( ruleChapterDetails )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4073:1: ( ruleChapterDetails )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4074:1: ruleChapterDetails
            {
             before(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleChapterDetails_in_rule__JoveNotes__ChapterDetailsAssignment_18163);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4083:1: rule__JoveNotes__NotesElementsAssignment_2 : ( ruleNotesElement ) ;
    public final void rule__JoveNotes__NotesElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4087:1: ( ( ruleNotesElement ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4088:1: ( ruleNotesElement )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4088:1: ( ruleNotesElement )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4089:1: ruleNotesElement
            {
             before(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNotesElement_in_rule__JoveNotes__NotesElementsAssignment_28194);
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


    // $ANTLR start "rule__ProcessingHints__SkipGenerationAssignment"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4098:1: rule__ProcessingHints__SkipGenerationAssignment : ( ( '@skip_generation' ) ) ;
    public final void rule__ProcessingHints__SkipGenerationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4102:1: ( ( ( '@skip_generation' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4103:1: ( ( '@skip_generation' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4103:1: ( ( '@skip_generation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4104:1: ( '@skip_generation' )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4105:1: ( '@skip_generation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4106:1: '@skip_generation'
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ProcessingHints__SkipGenerationAssignment8230); 
             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_0()); 

            }

             after(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_0()); 

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
    // $ANTLR end "rule__ProcessingHints__SkipGenerationAssignment"


    // $ANTLR start "rule__ChapterDetails__TestPaperAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4121:1: rule__ChapterDetails__TestPaperAssignment_0 : ( ( '@test_paper' ) ) ;
    public final void rule__ChapterDetails__TestPaperAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4125:1: ( ( ( '@test_paper' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4126:1: ( ( '@test_paper' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4126:1: ( ( '@test_paper' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4127:1: ( '@test_paper' )
            {
             before(grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4128:1: ( '@test_paper' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4129:1: '@test_paper'
            {
             before(grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0()); 
            match(input,41,FOLLOW_41_in_rule__ChapterDetails__TestPaperAssignment_08274); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4144:1: rule__ChapterDetails__SubjectNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__SubjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4148:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4149:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4149:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4150:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChapterDetails__SubjectNameAssignment_28313); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4159:1: rule__ChapterDetails__ChapterNumberAssignment_4 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__ChapterNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4163:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4164:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4164:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4165:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ChapterDetails__ChapterNumberAssignment_48344); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4174:1: rule__ChapterDetails__SubChapterNumberAssignment_6 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__SubChapterNumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4178:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4179:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4179:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4180:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ChapterDetails__SubChapterNumberAssignment_68375); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4189:1: rule__ChapterDetails__ChapterNameAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__ChapterNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4193:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4194:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4194:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4195:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChapterDetails__ChapterNameAssignment_88406); 
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


    // $ANTLR start "rule__WordMeaning__WordAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4204:1: rule__WordMeaning__WordAssignment_1 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__WordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4208:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4209:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4209:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4210:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WordMeaning__WordAssignment_18437); 
             after(grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WordMeaning__WordAssignment_1"


    // $ANTLR start "rule__WordMeaning__MeaningAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4219:1: rule__WordMeaning__MeaningAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__MeaningAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4223:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4224:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4224:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4225:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WordMeaning__MeaningAssignment_28468); 
             after(grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__WordMeaning__MeaningAssignment_2"


    // $ANTLR start "rule__QuestionAnswer__QuestionAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4234:1: rule__QuestionAnswer__QuestionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4238:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4239:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4239:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4240:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QuestionAnswer__QuestionAssignment_18499); 
             after(grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__QuestionAnswer__QuestionAssignment_1"


    // $ANTLR start "rule__QuestionAnswer__AnswerAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4249:1: rule__QuestionAnswer__AnswerAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__AnswerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4253:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4254:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4254:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4255:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QuestionAnswer__AnswerAssignment_28530); 
             after(grammarAccess.getQuestionAnswerAccess().getAnswerSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__QuestionAnswer__AnswerAssignment_2"


    // $ANTLR start "rule__QuestionAnswer__CmapAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4264:1: rule__QuestionAnswer__CmapAssignment_3 : ( ruleCMap ) ;
    public final void rule__QuestionAnswer__CmapAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4268:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4269:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4269:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4270:1: ruleCMap
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__QuestionAnswer__CmapAssignment_38561);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__QuestionAnswer__CmapAssignment_3"


    // $ANTLR start "rule__FIB__QuestionAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4279:1: rule__FIB__QuestionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FIB__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4283:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4284:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4284:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4285:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FIB__QuestionAssignment_18592); 
             after(grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FIB__QuestionAssignment_1"


    // $ANTLR start "rule__FIB__AnswersAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4294:1: rule__FIB__AnswersAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FIB__AnswersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4298:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4299:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4299:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4300:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FIB__AnswersAssignment_28623); 
             after(grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FIB__AnswersAssignment_2"


    // $ANTLR start "rule__Definition__TermAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4309:1: rule__Definition__TermAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Definition__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4313:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4314:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4314:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4315:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Definition__TermAssignment_18654); 
             after(grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Definition__TermAssignment_1"


    // $ANTLR start "rule__Definition__DefinitionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4324:1: rule__Definition__DefinitionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Definition__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4328:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4329:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4329:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4330:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Definition__DefinitionAssignment_28685); 
             after(grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Definition__DefinitionAssignment_2"


    // $ANTLR start "rule__Definition__CmapAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4339:1: rule__Definition__CmapAssignment_3 : ( ruleCMap ) ;
    public final void rule__Definition__CmapAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4343:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4344:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4344:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4345:1: ruleCMap
            {
             before(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__Definition__CmapAssignment_38716);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Definition__CmapAssignment_3"


    // $ANTLR start "rule__Character__CharacterAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4354:1: rule__Character__CharacterAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Character__CharacterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4358:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4359:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4359:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4360:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Character__CharacterAssignment_18747); 
             after(grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Character__CharacterAssignment_1"


    // $ANTLR start "rule__Character__EstimateAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4369:1: rule__Character__EstimateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Character__EstimateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4373:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4374:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4374:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4375:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Character__EstimateAssignment_28778); 
             after(grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Character__EstimateAssignment_2"


    // $ANTLR start "rule__Character__CmapAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4384:1: rule__Character__CmapAssignment_3 : ( ruleCMap ) ;
    public final void rule__Character__CmapAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4388:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4389:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4389:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4390:1: ruleCMap
            {
             before(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__Character__CmapAssignment_38809);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Character__CmapAssignment_3"


    // $ANTLR start "rule__TeacherNote__NoteAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4399:1: rule__TeacherNote__NoteAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TeacherNote__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4403:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4404:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4404:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4405:1: RULE_STRING
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TeacherNote__NoteAssignment_18840); 
             after(grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TeacherNote__NoteAssignment_1"


    // $ANTLR start "rule__TeacherNote__CmapAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4414:1: rule__TeacherNote__CmapAssignment_2 : ( ruleCMap ) ;
    public final void rule__TeacherNote__CmapAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4418:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4419:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4419:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4420:1: ruleCMap
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__TeacherNote__CmapAssignment_28871);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TeacherNote__CmapAssignment_2"


    // $ANTLR start "rule__Matching__SkipReverseQuestionAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4429:1: rule__Matching__SkipReverseQuestionAssignment_1 : ( ( 'skip_reverse_question' ) ) ;
    public final void rule__Matching__SkipReverseQuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4433:1: ( ( ( 'skip_reverse_question' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4434:1: ( ( 'skip_reverse_question' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4434:1: ( ( 'skip_reverse_question' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4435:1: ( 'skip_reverse_question' )
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4436:1: ( 'skip_reverse_question' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4437:1: 'skip_reverse_question'
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Matching__SkipReverseQuestionAssignment_18907); 
             after(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_1_0()); 

            }

             after(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_1_0()); 

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
    // $ANTLR end "rule__Matching__SkipReverseQuestionAssignment_1"


    // $ANTLR start "rule__Matching__QuestionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4452:1: rule__Matching__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Matching__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4456:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4457:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4457:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4458:1: RULE_STRING
            {
             before(grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Matching__QuestionAssignment_28946); 
             after(grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Matching__QuestionAssignment_2"


    // $ANTLR start "rule__Matching__PairsAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4467:1: rule__Matching__PairsAssignment_4 : ( ruleMatchPair ) ;
    public final void rule__Matching__PairsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4471:1: ( ( ruleMatchPair ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4472:1: ( ruleMatchPair )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4472:1: ( ruleMatchPair )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4473:1: ruleMatchPair
            {
             before(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMatchPair_in_rule__Matching__PairsAssignment_48977);
            ruleMatchPair();

            state._fsp--;

             after(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Matching__PairsAssignment_4"


    // $ANTLR start "rule__MatchPair__MatchQuestionAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4482:1: rule__MatchPair__MatchQuestionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchQuestionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4486:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4487:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4487:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4488:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatchPair__MatchQuestionAssignment_09008); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4497:1: rule__MatchPair__MatchAnswerAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchAnswerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4501:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4502:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4502:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4503:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatchPair__MatchAnswerAssignment_29039); 
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


    // $ANTLR start "rule__Event__EventAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4512:1: rule__Event__EventAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Event__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4516:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4517:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4517:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4518:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Event__EventAssignment_19070); 
             after(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Event__EventAssignment_1"


    // $ANTLR start "rule__Event__TimeAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4527:1: rule__Event__TimeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Event__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4531:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4532:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4532:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4533:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Event__TimeAssignment_29101); 
             after(grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Event__TimeAssignment_2"


    // $ANTLR start "rule__TrueFalse__StatementAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4542:1: rule__TrueFalse__StatementAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4546:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4547:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4547:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4548:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrueFalse__StatementAssignment_19132); 
             after(grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TrueFalse__StatementAssignment_1"


    // $ANTLR start "rule__TrueFalse__TruthValueAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4557:1: rule__TrueFalse__TruthValueAssignment_2 : ( RULE_BOOL ) ;
    public final void rule__TrueFalse__TruthValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4561:1: ( ( RULE_BOOL ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4562:1: ( RULE_BOOL )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4562:1: ( RULE_BOOL )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4563:1: RULE_BOOL
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_2_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__TrueFalse__TruthValueAssignment_29163); 
             after(grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TrueFalse__TruthValueAssignment_2"


    // $ANTLR start "rule__TrueFalse__JustificationAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4572:1: rule__TrueFalse__JustificationAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__JustificationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4576:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4577:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4577:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4578:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrueFalse__JustificationAssignment_39194); 
             after(grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__TrueFalse__JustificationAssignment_3"


    // $ANTLR start "rule__ChemEquation__DescriptionAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4587:1: rule__ChemEquation__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4591:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4592:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4592:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4593:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__DescriptionAssignment_19225); 
             after(grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ChemEquation__DescriptionAssignment_1"


    // $ANTLR start "rule__ChemEquation__ReactantsAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4602:1: rule__ChemEquation__ReactantsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ReactantsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4606:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4607:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4607:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4608:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__ReactantsAssignment_39256); 
             after(grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ChemEquation__ReactantsAssignment_3"


    // $ANTLR start "rule__ChemEquation__ProducesAssignment_5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4617:1: rule__ChemEquation__ProducesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProducesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4621:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4622:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4622:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4623:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__ProducesAssignment_59287); 
             after(grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ChemEquation__ProducesAssignment_5"


    // $ANTLR start "rule__ChemEquation__ProductsAssignment_7"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4632:1: rule__ChemEquation__ProductsAssignment_7 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProductsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4636:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4637:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4637:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4638:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__ProductsAssignment_79318); 
             after(grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__ChemEquation__ProductsAssignment_7"


    // $ANTLR start "rule__ChemCompound__SymbolAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4647:1: rule__ChemCompound__SymbolAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4651:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4652:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4652:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4653:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemCompound__SymbolAssignment_19349); 
             after(grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ChemCompound__SymbolAssignment_1"


    // $ANTLR start "rule__ChemCompound__ChemicalNameAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4662:1: rule__ChemCompound__ChemicalNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__ChemicalNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4666:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4667:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4667:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4668:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemCompound__ChemicalNameAssignment_29380); 
             after(grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ChemCompound__ChemicalNameAssignment_2"


    // $ANTLR start "rule__ChemCompound__CommonNameAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4677:1: rule__ChemCompound__CommonNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__CommonNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4681:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4682:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4682:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4683:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemCompound__CommonNameAssignment_39411); 
             after(grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ChemCompound__CommonNameAssignment_3"


    // $ANTLR start "rule__Spellbee__WordAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4692:1: rule__Spellbee__WordAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Spellbee__WordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4696:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4697:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4697:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4698:1: RULE_STRING
            {
             before(grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Spellbee__WordAssignment_19442); 
             after(grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Spellbee__WordAssignment_1"


    // $ANTLR start "rule__ImageLabel__CaptionAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4707:1: rule__ImageLabel__CaptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__CaptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4711:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4712:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4712:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4713:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImageLabel__CaptionAssignment_19473); 
             after(grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ImageLabel__CaptionAssignment_1"


    // $ANTLR start "rule__ImageLabel__ImageNameAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4722:1: rule__ImageLabel__ImageNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__ImageNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4726:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4727:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4727:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4728:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImageLabel__ImageNameAssignment_49504); 
             after(grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ImageLabel__ImageNameAssignment_4"


    // $ANTLR start "rule__ImageLabel__HotspotsAssignment_5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4737:1: rule__ImageLabel__HotspotsAssignment_5 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4741:1: ( ( ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4742:1: ( ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4742:1: ( ruleHotSpot )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4743:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_59535);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ImageLabel__HotspotsAssignment_5"


    // $ANTLR start "rule__ImageLabel__HotspotsAssignment_6_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4752:1: rule__ImageLabel__HotspotsAssignment_6_1 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4756:1: ( ( ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4757:1: ( ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4757:1: ( ruleHotSpot )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4758:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_6_19566);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__ImageLabel__HotspotsAssignment_6_1"


    // $ANTLR start "rule__HotSpot__XAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4767:1: rule__HotSpot__XAssignment_0 : ( RULE_INT ) ;
    public final void rule__HotSpot__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4771:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4772:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4772:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4773:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__HotSpot__XAssignment_09597); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4782:1: rule__HotSpot__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__HotSpot__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4786:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4787:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4787:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4788:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__HotSpot__YAssignment_29628); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4797:1: rule__HotSpot__LabelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__HotSpot__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4801:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4802:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4802:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4803:1: RULE_STRING
            {
             before(grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HotSpot__LabelAssignment_49659); 
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


    // $ANTLR start "rule__Equation__EquationAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4812:1: rule__Equation__EquationAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Equation__EquationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4816:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4817:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4817:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4818:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Equation__EquationAssignment_19690); 
             after(grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Equation__EquationAssignment_1"


    // $ANTLR start "rule__Equation__DescriptionAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4827:1: rule__Equation__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Equation__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4831:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4832:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4832:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4833:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Equation__DescriptionAssignment_39721); 
             after(grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Equation__DescriptionAssignment_3"


    // $ANTLR start "rule__Equation__SymbolsAssignment_5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4842:1: rule__Equation__SymbolsAssignment_5 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4846:1: ( ( ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4847:1: ( ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4847:1: ( ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4848:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_59752);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Equation__SymbolsAssignment_5"


    // $ANTLR start "rule__Equation__SymbolsAssignment_6_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4857:1: rule__Equation__SymbolsAssignment_6_1 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4861:1: ( ( ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4862:1: ( ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4862:1: ( ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4863:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_6_19783);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Equation__SymbolsAssignment_6_1"


    // $ANTLR start "rule__EqSymbol__SymbolAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4872:1: rule__EqSymbol__SymbolAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__SymbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4876:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4877:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4877:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4878:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqSymbol__SymbolAssignment_09814); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4887:1: rule__EqSymbol__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4891:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4892:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4892:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4893:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqSymbol__DescriptionAssignment_29845); 
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


    // $ANTLR start "rule__RefToContext__ContextAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4902:1: rule__RefToContext__ContextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__RefToContext__ContextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4906:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4907:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4907:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4908:1: RULE_STRING
            {
             before(grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RefToContext__ContextAssignment_39876); 
             after(grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__RefToContext__ContextAssignment_3"


    // $ANTLR start "rule__RefToContext__QuestionsAssignment_4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4917:1: rule__RefToContext__QuestionsAssignment_4 : ( ruleQuestionAnswer ) ;
    public final void rule__RefToContext__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4921:1: ( ( ruleQuestionAnswer ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4922:1: ( ruleQuestionAnswer )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4922:1: ( ruleQuestionAnswer )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4923:1: ruleQuestionAnswer
            {
             before(grammarAccess.getRefToContextAccess().getQuestionsQuestionAnswerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleQuestionAnswer_in_rule__RefToContext__QuestionsAssignment_49907);
            ruleQuestionAnswer();

            state._fsp--;

             after(grammarAccess.getRefToContextAccess().getQuestionsQuestionAnswerParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RefToContext__QuestionsAssignment_4"


    // $ANTLR start "rule__CMap__ContentAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4932:1: rule__CMap__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CMap__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4936:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4937:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4937:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4938:1: RULE_STRING
            {
             before(grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CMap__ContentAssignment_29938); 
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
    public static final BitSet FOLLOW_rule__ProcessingHints__SkipGenerationAssignment_in_ruleProcessingHints154 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__JoveNotes__Group__0__Impl_in_rule__JoveNotes__Group__01718 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__1_in_rule__JoveNotes__Group__01721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__ProcessingHintsAssignment_0_in_rule__JoveNotes__Group__0__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__1__Impl_in_rule__JoveNotes__Group__11779 = new BitSet(new long[]{0x00000029DC7F0000L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__2_in_rule__JoveNotes__Group__11782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__ChapterDetailsAssignment_1_in_rule__JoveNotes__Group__1__Impl1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__2__Impl_in_rule__JoveNotes__Group__21839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__NotesElementsAssignment_2_in_rule__JoveNotes__Group__2__Impl1866 = new BitSet(new long[]{0x00000029DC7F0002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__0__Impl_in_rule__ChapterDetails__Group__01903 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__1_in_rule__ChapterDetails__Group__01906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__TestPaperAssignment_0_in_rule__ChapterDetails__Group__0__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__1__Impl_in_rule__ChapterDetails__Group__11964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__2_in_rule__ChapterDetails__Group__11967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ChapterDetails__Group__1__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__2__Impl_in_rule__ChapterDetails__Group__22026 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__3_in_rule__ChapterDetails__Group__22029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__SubjectNameAssignment_2_in_rule__ChapterDetails__Group__2__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__3__Impl_in_rule__ChapterDetails__Group__32086 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__4_in_rule__ChapterDetails__Group__32089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ChapterDetails__Group__3__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__4__Impl_in_rule__ChapterDetails__Group__42148 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__5_in_rule__ChapterDetails__Group__42151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__ChapterNumberAssignment_4_in_rule__ChapterDetails__Group__4__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__5__Impl_in_rule__ChapterDetails__Group__52208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__6_in_rule__ChapterDetails__Group__52211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ChapterDetails__Group__5__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__6__Impl_in_rule__ChapterDetails__Group__62270 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__7_in_rule__ChapterDetails__Group__62273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__SubChapterNumberAssignment_6_in_rule__ChapterDetails__Group__6__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__7__Impl_in_rule__ChapterDetails__Group__72330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__8_in_rule__ChapterDetails__Group__72333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ChapterDetails__Group__7__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__8__Impl_in_rule__ChapterDetails__Group__82392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__ChapterNameAssignment_8_in_rule__ChapterDetails__Group__8__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__0__Impl_in_rule__WordMeaning__Group__02467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__1_in_rule__WordMeaning__Group__02470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WordMeaning__Group__0__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__1__Impl_in_rule__WordMeaning__Group__12529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__2_in_rule__WordMeaning__Group__12532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__WordAssignment_1_in_rule__WordMeaning__Group__1__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__2__Impl_in_rule__WordMeaning__Group__22589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__MeaningAssignment_2_in_rule__WordMeaning__Group__2__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__0__Impl_in_rule__QuestionAnswer__Group__02652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__1_in_rule__QuestionAnswer__Group__02655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QuestionAnswer__Group__0__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__1__Impl_in_rule__QuestionAnswer__Group__12714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__2_in_rule__QuestionAnswer__Group__12717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__QuestionAssignment_1_in_rule__QuestionAnswer__Group__1__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__2__Impl_in_rule__QuestionAnswer__Group__22774 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__3_in_rule__QuestionAnswer__Group__22777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__AnswerAssignment_2_in_rule__QuestionAnswer__Group__2__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__3__Impl_in_rule__QuestionAnswer__Group__32834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__CmapAssignment_3_in_rule__QuestionAnswer__Group__3__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__0__Impl_in_rule__FIB__Group__02900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FIB__Group__1_in_rule__FIB__Group__02903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FIB__Group__0__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__1__Impl_in_rule__FIB__Group__12962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FIB__Group__2_in_rule__FIB__Group__12965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__QuestionAssignment_1_in_rule__FIB__Group__1__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__2__Impl_in_rule__FIB__Group__23022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__AnswersAssignment_2_in_rule__FIB__Group__2__Impl3051 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FIB__AnswersAssignment_2_in_rule__FIB__Group__2__Impl3063 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__0__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__13167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__TermAssignment_1_in_rule__Definition__Group__1__Impl3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__23224 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__23227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__DefinitionAssignment_2_in_rule__Definition__Group__2__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__33284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__CmapAssignment_3_in_rule__Definition__Group__3__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Character__Group__0__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__CharacterAssignment_1_in_rule__Character__Group__1__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23472 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__EstimateAssignment_2_in_rule__Character__Group__2__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__CmapAssignment_3_in_rule__Character__Group__3__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__0__Impl_in_rule__TeacherNote__Group__03598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__1_in_rule__TeacherNote__Group__03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TeacherNote__Group__0__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__1__Impl_in_rule__TeacherNote__Group__13660 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__2_in_rule__TeacherNote__Group__13663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__NoteAssignment_1_in_rule__TeacherNote__Group__1__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__2__Impl_in_rule__TeacherNote__Group__23720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__CmapAssignment_2_in_rule__TeacherNote__Group__2__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__0__Impl_in_rule__Matching__Group__03784 = new BitSet(new long[]{0x0000040000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__1_in_rule__Matching__Group__03787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Matching__Group__0__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__1__Impl_in_rule__Matching__Group__13846 = new BitSet(new long[]{0x0000040000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__2_in_rule__Matching__Group__13849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__SkipReverseQuestionAssignment_1_in_rule__Matching__Group__1__Impl3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__2__Impl_in_rule__Matching__Group__23907 = new BitSet(new long[]{0x0000040000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__3_in_rule__Matching__Group__23910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__QuestionAssignment_2_in_rule__Matching__Group__2__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__3__Impl_in_rule__Matching__Group__33968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Matching__Group__4_in_rule__Matching__Group__33971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Matching__Group__3__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__4__Impl_in_rule__Matching__Group__44030 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Matching__Group__5_in_rule__Matching__Group__44033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__PairsAssignment_4_in_rule__Matching__Group__4__Impl4062 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Matching__PairsAssignment_4_in_rule__Matching__Group__4__Impl4074 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Matching__Group__5__Impl_in_rule__Matching__Group__54107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Matching__Group__5__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__0__Impl_in_rule__MatchPair__Group__04178 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__1_in_rule__MatchPair__Group__04181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__MatchQuestionAssignment_0_in_rule__MatchPair__Group__0__Impl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__1__Impl_in_rule__MatchPair__Group__14238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__2_in_rule__MatchPair__Group__14241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MatchPair__Group__1__Impl4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__2__Impl_in_rule__MatchPair__Group__24300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__MatchAnswerAssignment_2_in_rule__MatchPair__Group__2__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Event__Group__0__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__14428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventAssignment_1_in_rule__Event__Group__1__Impl4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__24485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__TimeAssignment_2_in_rule__Event__Group__2__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__0__Impl_in_rule__TrueFalse__Group__04548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__1_in_rule__TrueFalse__Group__04551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TrueFalse__Group__0__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__1__Impl_in_rule__TrueFalse__Group__14610 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__2_in_rule__TrueFalse__Group__14613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__StatementAssignment_1_in_rule__TrueFalse__Group__1__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__2__Impl_in_rule__TrueFalse__Group__24670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__3_in_rule__TrueFalse__Group__24673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__TruthValueAssignment_2_in_rule__TrueFalse__Group__2__Impl4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__3__Impl_in_rule__TrueFalse__Group__34730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__JustificationAssignment_3_in_rule__TrueFalse__Group__3__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__0__Impl_in_rule__ChemEquation__Group__04796 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__1_in_rule__ChemEquation__Group__04799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ChemEquation__Group__0__Impl4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__1__Impl_in_rule__ChemEquation__Group__14858 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__2_in_rule__ChemEquation__Group__14861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__DescriptionAssignment_1_in_rule__ChemEquation__Group__1__Impl4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__2__Impl_in_rule__ChemEquation__Group__24919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__3_in_rule__ChemEquation__Group__24922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ChemEquation__Group__2__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__3__Impl_in_rule__ChemEquation__Group__34981 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__4_in_rule__ChemEquation__Group__34984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__ReactantsAssignment_3_in_rule__ChemEquation__Group__3__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__4__Impl_in_rule__ChemEquation__Group__45041 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__5_in_rule__ChemEquation__Group__45044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ChemEquation__Group__4__Impl5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__5__Impl_in_rule__ChemEquation__Group__55103 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__6_in_rule__ChemEquation__Group__55106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__ProducesAssignment_5_in_rule__ChemEquation__Group__5__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__6__Impl_in_rule__ChemEquation__Group__65164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__7_in_rule__ChemEquation__Group__65167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ChemEquation__Group__6__Impl5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__7__Impl_in_rule__ChemEquation__Group__75226 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__8_in_rule__ChemEquation__Group__75229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__ProductsAssignment_7_in_rule__ChemEquation__Group__7__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__8__Impl_in_rule__ChemEquation__Group__85286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ChemEquation__Group__8__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__0__Impl_in_rule__ChemCompound__Group__05363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__1_in_rule__ChemCompound__Group__05366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ChemCompound__Group__0__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__1__Impl_in_rule__ChemCompound__Group__15425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__2_in_rule__ChemCompound__Group__15428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__SymbolAssignment_1_in_rule__ChemCompound__Group__1__Impl5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__2__Impl_in_rule__ChemCompound__Group__25485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__3_in_rule__ChemCompound__Group__25488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__ChemicalNameAssignment_2_in_rule__ChemCompound__Group__2__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__3__Impl_in_rule__ChemCompound__Group__35545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__CommonNameAssignment_3_in_rule__ChemCompound__Group__3__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__0__Impl_in_rule__Spellbee__Group__05611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__1_in_rule__Spellbee__Group__05614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Spellbee__Group__0__Impl5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__1__Impl_in_rule__Spellbee__Group__15673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__WordAssignment_1_in_rule__Spellbee__Group__1__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__0__Impl_in_rule__ImageLabel__Group__05734 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__1_in_rule__ImageLabel__Group__05737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ImageLabel__Group__0__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__1__Impl_in_rule__ImageLabel__Group__15796 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__2_in_rule__ImageLabel__Group__15799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__CaptionAssignment_1_in_rule__ImageLabel__Group__1__Impl5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__2__Impl_in_rule__ImageLabel__Group__25857 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__3_in_rule__ImageLabel__Group__25860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ImageLabel__Group__2__Impl5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__3__Impl_in_rule__ImageLabel__Group__35919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__4_in_rule__ImageLabel__Group__35922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ImageLabel__Group__3__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__4__Impl_in_rule__ImageLabel__Group__45981 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__5_in_rule__ImageLabel__Group__45984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__ImageNameAssignment_4_in_rule__ImageLabel__Group__4__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__5__Impl_in_rule__ImageLabel__Group__56041 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__6_in_rule__ImageLabel__Group__56044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__HotspotsAssignment_5_in_rule__ImageLabel__Group__5__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__6__Impl_in_rule__ImageLabel__Group__66101 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__7_in_rule__ImageLabel__Group__66104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_6__0_in_rule__ImageLabel__Group__6__Impl6131 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__7__Impl_in_rule__ImageLabel__Group__76162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ImageLabel__Group__7__Impl6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_6__0__Impl_in_rule__ImageLabel__Group_6__06237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_6__1_in_rule__ImageLabel__Group_6__06240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ImageLabel__Group_6__0__Impl6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_6__1__Impl_in_rule__ImageLabel__Group_6__16299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__HotspotsAssignment_6_1_in_rule__ImageLabel__Group_6__1__Impl6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__0__Impl_in_rule__HotSpot__Group__06360 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__1_in_rule__HotSpot__Group__06363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__XAssignment_0_in_rule__HotSpot__Group__0__Impl6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__1__Impl_in_rule__HotSpot__Group__16420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__2_in_rule__HotSpot__Group__16423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__HotSpot__Group__1__Impl6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__2__Impl_in_rule__HotSpot__Group__26482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__3_in_rule__HotSpot__Group__26485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__YAssignment_2_in_rule__HotSpot__Group__2__Impl6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__3__Impl_in_rule__HotSpot__Group__36542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__4_in_rule__HotSpot__Group__36545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__HotSpot__Group__3__Impl6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__4__Impl_in_rule__HotSpot__Group__46604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__LabelAssignment_4_in_rule__HotSpot__Group__4__Impl6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__06671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__06674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Equation__Group__0__Impl6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__16733 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__16736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__EquationAssignment_1_in_rule__Equation__Group__1__Impl6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__26793 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__26796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Equation__Group__2__Impl6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__36855 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__36858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__DescriptionAssignment_3_in_rule__Equation__Group__3__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__46916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__5_in_rule__Equation__Group__46919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Equation__Group__4__Impl6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__5__Impl_in_rule__Equation__Group__56978 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__Equation__Group__6_in_rule__Equation__Group__56981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__SymbolsAssignment_5_in_rule__Equation__Group__5__Impl7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__6__Impl_in_rule__Equation__Group__67038 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__Equation__Group__7_in_rule__Equation__Group__67041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_6__0_in_rule__Equation__Group__6__Impl7068 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__7__Impl_in_rule__Equation__Group__77099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Equation__Group__7__Impl7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_6__0__Impl_in_rule__Equation__Group_6__07174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group_6__1_in_rule__Equation__Group_6__07177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Equation__Group_6__0__Impl7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_6__1__Impl_in_rule__Equation__Group_6__17236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__SymbolsAssignment_6_1_in_rule__Equation__Group_6__1__Impl7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__0__Impl_in_rule__EqSymbol__Group__07297 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__1_in_rule__EqSymbol__Group__07300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__SymbolAssignment_0_in_rule__EqSymbol__Group__0__Impl7327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__1__Impl_in_rule__EqSymbol__Group__17357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__2_in_rule__EqSymbol__Group__17360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EqSymbol__Group__1__Impl7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__2__Impl_in_rule__EqSymbol__Group__27419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__DescriptionAssignment_2_in_rule__EqSymbol__Group__2__Impl7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__0__Impl_in_rule__RefToContext__Group__07482 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__1_in_rule__RefToContext__Group__07485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RefToContext__Group__0__Impl7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__1__Impl_in_rule__RefToContext__Group__17544 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__2_in_rule__RefToContext__Group__17547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RefToContext__Group__1__Impl7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__2__Impl_in_rule__RefToContext__Group__27606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__3_in_rule__RefToContext__Group__27609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RefToContext__Group__2__Impl7637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__3__Impl_in_rule__RefToContext__Group__37668 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__4_in_rule__RefToContext__Group__37671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__ContextAssignment_3_in_rule__RefToContext__Group__3__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__4__Impl_in_rule__RefToContext__Group__47728 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__5_in_rule__RefToContext__Group__47731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__QuestionsAssignment_4_in_rule__RefToContext__Group__4__Impl7760 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__RefToContext__QuestionsAssignment_4_in_rule__RefToContext__Group__4__Impl7772 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__5__Impl_in_rule__RefToContext__Group__57805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RefToContext__Group__5__Impl7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__0__Impl_in_rule__CMap__Group__07876 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CMap__Group__1_in_rule__CMap__Group__07879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CMap__Group__0__Impl7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__1__Impl_in_rule__CMap__Group__17938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CMap__Group__2_in_rule__CMap__Group__17941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CMap__Group__1__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__2__Impl_in_rule__CMap__Group__28000 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CMap__Group__3_in_rule__CMap__Group__28003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__ContentAssignment_2_in_rule__CMap__Group__2__Impl8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__3__Impl_in_rule__CMap__Group__38060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CMap__Group__3__Impl8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingHints_in_rule__JoveNotes__ProcessingHintsAssignment_08132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterDetails_in_rule__JoveNotes__ChapterDetailsAssignment_18163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_rule__JoveNotes__NotesElementsAssignment_28194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ProcessingHints__SkipGenerationAssignment8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ChapterDetails__TestPaperAssignment_08274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChapterDetails__SubjectNameAssignment_28313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ChapterDetails__ChapterNumberAssignment_48344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ChapterDetails__SubChapterNumberAssignment_68375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChapterDetails__ChapterNameAssignment_88406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WordMeaning__WordAssignment_18437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WordMeaning__MeaningAssignment_28468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QuestionAnswer__QuestionAssignment_18499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QuestionAnswer__AnswerAssignment_28530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__QuestionAnswer__CmapAssignment_38561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FIB__QuestionAssignment_18592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FIB__AnswersAssignment_28623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Definition__TermAssignment_18654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Definition__DefinitionAssignment_28685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__Definition__CmapAssignment_38716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Character__CharacterAssignment_18747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Character__EstimateAssignment_28778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__Character__CmapAssignment_38809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TeacherNote__NoteAssignment_18840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__TeacherNote__CmapAssignment_28871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Matching__SkipReverseQuestionAssignment_18907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Matching__QuestionAssignment_28946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPair_in_rule__Matching__PairsAssignment_48977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatchPair__MatchQuestionAssignment_09008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatchPair__MatchAnswerAssignment_29039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__EventAssignment_19070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__TimeAssignment_29101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrueFalse__StatementAssignment_19132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__TrueFalse__TruthValueAssignment_29163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrueFalse__JustificationAssignment_39194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__DescriptionAssignment_19225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__ReactantsAssignment_39256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__ProducesAssignment_59287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__ProductsAssignment_79318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemCompound__SymbolAssignment_19349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemCompound__ChemicalNameAssignment_29380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemCompound__CommonNameAssignment_39411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Spellbee__WordAssignment_19442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageLabel__CaptionAssignment_19473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageLabel__ImageNameAssignment_49504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_59535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_6_19566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__HotSpot__XAssignment_09597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__HotSpot__YAssignment_29628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HotSpot__LabelAssignment_49659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Equation__EquationAssignment_19690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Equation__DescriptionAssignment_39721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_59752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_6_19783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqSymbol__SymbolAssignment_09814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqSymbol__DescriptionAssignment_29845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RefToContext__ContextAssignment_39876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_rule__RefToContext__QuestionsAssignment_49907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CMap__ContentAssignment_29938 = new BitSet(new long[]{0x0000000000000002L});

}