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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'{'", "'}'", "'='", "'@mcq_config'", "'@forwardCaption'", "'@reverseCaption'", "'@numOptionsToShow'", "'@numOptionsPerRow'", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'@multi_choice'", "'@options'", "'@explanation'", "'cmap'", "'script'", "'@skip_generation'", "'@skip_generation_in_production'", "'@test_paper'", "'hide'", "'skip_reverse_question'", "'correct'"
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:153:1: ruleNotesElement : ( ( rule__NotesElement__Group__0 ) ) ;
    public final void ruleNotesElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:157:2: ( ( ( rule__NotesElement__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:158:1: ( ( rule__NotesElement__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:158:1: ( ( rule__NotesElement__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:159:1: ( rule__NotesElement__Group__0 )
            {
             before(grammarAccess.getNotesElementAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:160:1: ( rule__NotesElement__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:160:2: rule__NotesElement__Group__0
            {
            pushFollow(FOLLOW_rule__NotesElement__Group__0_in_ruleNotesElement274);
            rule__NotesElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotesElementAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMatchMCQConfig"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:396:1: entryRuleMatchMCQConfig : ruleMatchMCQConfig EOF ;
    public final void entryRuleMatchMCQConfig() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:397:1: ( ruleMatchMCQConfig EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:398:1: ruleMatchMCQConfig EOF
            {
             before(grammarAccess.getMatchMCQConfigRule()); 
            pushFollow(FOLLOW_ruleMatchMCQConfig_in_entryRuleMatchMCQConfig781);
            ruleMatchMCQConfig();

            state._fsp--;

             after(grammarAccess.getMatchMCQConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchMCQConfig788); 

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
    // $ANTLR end "entryRuleMatchMCQConfig"


    // $ANTLR start "ruleMatchMCQConfig"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:405:1: ruleMatchMCQConfig : ( ( rule__MatchMCQConfig__Group__0 ) ) ;
    public final void ruleMatchMCQConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:409:2: ( ( ( rule__MatchMCQConfig__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:410:1: ( ( rule__MatchMCQConfig__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:410:1: ( ( rule__MatchMCQConfig__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:411:1: ( rule__MatchMCQConfig__Group__0 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:412:1: ( rule__MatchMCQConfig__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:412:2: rule__MatchMCQConfig__Group__0
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__0_in_ruleMatchMCQConfig814);
            rule__MatchMCQConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchMCQConfig"


    // $ANTLR start "entryRuleEvent"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:424:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:425:1: ( ruleEvent EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:426:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent841);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent848); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:433:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:437:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:438:1: ( ( rule__Event__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:438:1: ( ( rule__Event__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:439:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:440:1: ( rule__Event__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:440:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent874);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:452:1: entryRuleTrueFalse : ruleTrueFalse EOF ;
    public final void entryRuleTrueFalse() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:453:1: ( ruleTrueFalse EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:454:1: ruleTrueFalse EOF
            {
             before(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse901);
            ruleTrueFalse();

            state._fsp--;

             after(grammarAccess.getTrueFalseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueFalse908); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:461:1: ruleTrueFalse : ( ( rule__TrueFalse__Group__0 ) ) ;
    public final void ruleTrueFalse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:465:2: ( ( ( rule__TrueFalse__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:466:1: ( ( rule__TrueFalse__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:466:1: ( ( rule__TrueFalse__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:467:1: ( rule__TrueFalse__Group__0 )
            {
             before(grammarAccess.getTrueFalseAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:468:1: ( rule__TrueFalse__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:468:2: rule__TrueFalse__Group__0
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__0_in_ruleTrueFalse934);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:480:1: entryRuleChemEquation : ruleChemEquation EOF ;
    public final void entryRuleChemEquation() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:481:1: ( ruleChemEquation EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:482:1: ruleChemEquation EOF
            {
             before(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_ruleChemEquation_in_entryRuleChemEquation961);
            ruleChemEquation();

            state._fsp--;

             after(grammarAccess.getChemEquationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemEquation968); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:489:1: ruleChemEquation : ( ( rule__ChemEquation__Group__0 ) ) ;
    public final void ruleChemEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:493:2: ( ( ( rule__ChemEquation__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:494:1: ( ( rule__ChemEquation__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:494:1: ( ( rule__ChemEquation__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:495:1: ( rule__ChemEquation__Group__0 )
            {
             before(grammarAccess.getChemEquationAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:496:1: ( rule__ChemEquation__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:496:2: rule__ChemEquation__Group__0
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__0_in_ruleChemEquation994);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:508:1: entryRuleChemCompound : ruleChemCompound EOF ;
    public final void entryRuleChemCompound() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:509:1: ( ruleChemCompound EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:510:1: ruleChemCompound EOF
            {
             before(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_ruleChemCompound_in_entryRuleChemCompound1021);
            ruleChemCompound();

            state._fsp--;

             after(grammarAccess.getChemCompoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChemCompound1028); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:517:1: ruleChemCompound : ( ( rule__ChemCompound__Group__0 ) ) ;
    public final void ruleChemCompound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:521:2: ( ( ( rule__ChemCompound__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:522:1: ( ( rule__ChemCompound__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:522:1: ( ( rule__ChemCompound__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:523:1: ( rule__ChemCompound__Group__0 )
            {
             before(grammarAccess.getChemCompoundAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:524:1: ( rule__ChemCompound__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:524:2: rule__ChemCompound__Group__0
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__0_in_ruleChemCompound1054);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:536:1: entryRuleSpellbee : ruleSpellbee EOF ;
    public final void entryRuleSpellbee() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:537:1: ( ruleSpellbee EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:538:1: ruleSpellbee EOF
            {
             before(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_ruleSpellbee_in_entryRuleSpellbee1081);
            ruleSpellbee();

            state._fsp--;

             after(grammarAccess.getSpellbeeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpellbee1088); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:545:1: ruleSpellbee : ( ( rule__Spellbee__Group__0 ) ) ;
    public final void ruleSpellbee() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:549:2: ( ( ( rule__Spellbee__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:550:1: ( ( rule__Spellbee__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:550:1: ( ( rule__Spellbee__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:551:1: ( rule__Spellbee__Group__0 )
            {
             before(grammarAccess.getSpellbeeAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:552:1: ( rule__Spellbee__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:552:2: rule__Spellbee__Group__0
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__0_in_ruleSpellbee1114);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:564:1: entryRuleImageLabel : ruleImageLabel EOF ;
    public final void entryRuleImageLabel() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:565:1: ( ruleImageLabel EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:566:1: ruleImageLabel EOF
            {
             before(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_ruleImageLabel_in_entryRuleImageLabel1141);
            ruleImageLabel();

            state._fsp--;

             after(grammarAccess.getImageLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageLabel1148); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:573:1: ruleImageLabel : ( ( rule__ImageLabel__Group__0 ) ) ;
    public final void ruleImageLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:577:2: ( ( ( rule__ImageLabel__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:578:1: ( ( rule__ImageLabel__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:578:1: ( ( rule__ImageLabel__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:579:1: ( rule__ImageLabel__Group__0 )
            {
             before(grammarAccess.getImageLabelAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:580:1: ( rule__ImageLabel__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:580:2: rule__ImageLabel__Group__0
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__0_in_ruleImageLabel1174);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:592:1: entryRuleHotSpot : ruleHotSpot EOF ;
    public final void entryRuleHotSpot() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:593:1: ( ruleHotSpot EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:594:1: ruleHotSpot EOF
            {
             before(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_ruleHotSpot_in_entryRuleHotSpot1201);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getHotSpotRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHotSpot1208); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:601:1: ruleHotSpot : ( ( rule__HotSpot__Group__0 ) ) ;
    public final void ruleHotSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:605:2: ( ( ( rule__HotSpot__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:606:1: ( ( rule__HotSpot__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:606:1: ( ( rule__HotSpot__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:607:1: ( rule__HotSpot__Group__0 )
            {
             before(grammarAccess.getHotSpotAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:608:1: ( rule__HotSpot__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:608:2: rule__HotSpot__Group__0
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__0_in_ruleHotSpot1234);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:620:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:621:1: ( ruleEquation EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:622:1: ruleEquation EOF
            {
             before(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation1261);
            ruleEquation();

            state._fsp--;

             after(grammarAccess.getEquationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation1268); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:629:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:633:2: ( ( ( rule__Equation__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:634:1: ( ( rule__Equation__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:634:1: ( ( rule__Equation__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:635:1: ( rule__Equation__Group__0 )
            {
             before(grammarAccess.getEquationAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:636:1: ( rule__Equation__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:636:2: rule__Equation__Group__0
            {
            pushFollow(FOLLOW_rule__Equation__Group__0_in_ruleEquation1294);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:648:1: entryRuleEqSymbol : ruleEqSymbol EOF ;
    public final void entryRuleEqSymbol() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:649:1: ( ruleEqSymbol EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:650:1: ruleEqSymbol EOF
            {
             before(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol1321);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEqSymbolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqSymbol1328); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:657:1: ruleEqSymbol : ( ( rule__EqSymbol__Group__0 ) ) ;
    public final void ruleEqSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:661:2: ( ( ( rule__EqSymbol__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:662:1: ( ( rule__EqSymbol__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:662:1: ( ( rule__EqSymbol__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:663:1: ( rule__EqSymbol__Group__0 )
            {
             before(grammarAccess.getEqSymbolAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:664:1: ( rule__EqSymbol__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:664:2: rule__EqSymbol__Group__0
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__0_in_ruleEqSymbol1354);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:676:1: entryRuleRefToContext : ruleRefToContext EOF ;
    public final void entryRuleRefToContext() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:677:1: ( ruleRefToContext EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:678:1: ruleRefToContext EOF
            {
             before(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_ruleRefToContext_in_entryRuleRefToContext1381);
            ruleRefToContext();

            state._fsp--;

             after(grammarAccess.getRefToContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefToContext1388); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:685:1: ruleRefToContext : ( ( rule__RefToContext__Group__0 ) ) ;
    public final void ruleRefToContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:689:2: ( ( ( rule__RefToContext__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:690:1: ( ( rule__RefToContext__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:690:1: ( ( rule__RefToContext__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:691:1: ( rule__RefToContext__Group__0 )
            {
             before(grammarAccess.getRefToContextAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:692:1: ( rule__RefToContext__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:692:2: rule__RefToContext__Group__0
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__0_in_ruleRefToContext1414);
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


    // $ANTLR start "entryRuleMultiChoice"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:704:1: entryRuleMultiChoice : ruleMultiChoice EOF ;
    public final void entryRuleMultiChoice() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:705:1: ( ruleMultiChoice EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:706:1: ruleMultiChoice EOF
            {
             before(grammarAccess.getMultiChoiceRule()); 
            pushFollow(FOLLOW_ruleMultiChoice_in_entryRuleMultiChoice1441);
            ruleMultiChoice();

            state._fsp--;

             after(grammarAccess.getMultiChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiChoice1448); 

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
    // $ANTLR end "entryRuleMultiChoice"


    // $ANTLR start "ruleMultiChoice"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:713:1: ruleMultiChoice : ( ( rule__MultiChoice__Group__0 ) ) ;
    public final void ruleMultiChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:717:2: ( ( ( rule__MultiChoice__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:718:1: ( ( rule__MultiChoice__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:718:1: ( ( rule__MultiChoice__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:719:1: ( rule__MultiChoice__Group__0 )
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:720:1: ( rule__MultiChoice__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:720:2: rule__MultiChoice__Group__0
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__0_in_ruleMultiChoice1474);
            rule__MultiChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiChoice"


    // $ANTLR start "entryRuleOption"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:732:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:733:1: ( ruleOption EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:734:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption1501);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption1508); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:741:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:745:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:746:1: ( ( rule__Option__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:746:1: ( ( rule__Option__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:747:1: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:748:1: ( rule__Option__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:748:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_rule__Option__Group__0_in_ruleOption1534);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleCMap"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:760:1: entryRuleCMap : ruleCMap EOF ;
    public final void entryRuleCMap() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:761:1: ( ruleCMap EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:762:1: ruleCMap EOF
            {
             before(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_ruleCMap_in_entryRuleCMap1561);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getCMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCMap1568); 

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:769:1: ruleCMap : ( ( rule__CMap__Group__0 ) ) ;
    public final void ruleCMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:773:2: ( ( ( rule__CMap__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:774:1: ( ( rule__CMap__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:774:1: ( ( rule__CMap__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:775:1: ( rule__CMap__Group__0 )
            {
             before(grammarAccess.getCMapAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:776:1: ( rule__CMap__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:776:2: rule__CMap__Group__0
            {
            pushFollow(FOLLOW_rule__CMap__Group__0_in_ruleCMap1594);
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


    // $ANTLR start "entryRuleScript"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:788:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:789:1: ( ruleScript EOF )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:790:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript1621);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript1628); 

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:797:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:801:2: ( ( ( rule__Script__Group__0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:802:1: ( ( rule__Script__Group__0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:802:1: ( ( rule__Script__Group__0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:803:1: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:804:1: ( rule__Script__Group__0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:804:2: rule__Script__Group__0
            {
            pushFollow(FOLLOW_rule__Script__Group__0_in_ruleScript1654);
            rule__Script__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "rule__NotesElement__Alternatives_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:816:1: rule__NotesElement__Alternatives_0 : ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleSpellbee ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleRefToContext ) | ( ruleMultiChoice ) );
    public final void rule__NotesElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:820:1: ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleSpellbee ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleRefToContext ) | ( ruleMultiChoice ) )
            int alt1=16;
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
            case 31:
                {
                alt1=8;
                }
                break;
            case 32:
                {
                alt1=9;
                }
                break;
            case 33:
                {
                alt1=10;
                }
                break;
            case 35:
                {
                alt1=11;
                }
                break;
            case 36:
                {
                alt1=12;
                }
                break;
            case 37:
                {
                alt1=13;
                }
                break;
            case 40:
                {
                alt1=14;
                }
                break;
            case 42:
                {
                alt1=15;
                }
                break;
            case 44:
                {
                alt1=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:821:1: ( ruleWordMeaning )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:821:1: ( ruleWordMeaning )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:822:1: ruleWordMeaning
                    {
                     before(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleWordMeaning_in_rule__NotesElement__Alternatives_01690);
                    ruleWordMeaning();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:827:6: ( ruleQuestionAnswer )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:827:6: ( ruleQuestionAnswer )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:828:1: ruleQuestionAnswer
                    {
                     before(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleQuestionAnswer_in_rule__NotesElement__Alternatives_01707);
                    ruleQuestionAnswer();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:833:6: ( ruleFIB )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:833:6: ( ruleFIB )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:834:1: ruleFIB
                    {
                     before(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleFIB_in_rule__NotesElement__Alternatives_01724);
                    ruleFIB();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:839:6: ( ruleDefinition )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:839:6: ( ruleDefinition )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:840:1: ruleDefinition
                    {
                     before(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleDefinition_in_rule__NotesElement__Alternatives_01741);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:845:6: ( ruleCharacter )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:845:6: ( ruleCharacter )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:846:1: ruleCharacter
                    {
                     before(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleCharacter_in_rule__NotesElement__Alternatives_01758);
                    ruleCharacter();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:851:6: ( ruleTeacherNote )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:851:6: ( ruleTeacherNote )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:852:1: ruleTeacherNote
                    {
                     before(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleTeacherNote_in_rule__NotesElement__Alternatives_01775);
                    ruleTeacherNote();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:857:6: ( ruleMatching )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:857:6: ( ruleMatching )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:858:1: ruleMatching
                    {
                     before(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_ruleMatching_in_rule__NotesElement__Alternatives_01792);
                    ruleMatching();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:863:6: ( ruleEvent )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:863:6: ( ruleEvent )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:864:1: ruleEvent
                    {
                     before(grammarAccess.getNotesElementAccess().getEventParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_ruleEvent_in_rule__NotesElement__Alternatives_01809);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getEventParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:869:6: ( ruleTrueFalse )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:869:6: ( ruleTrueFalse )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:870:1: ruleTrueFalse
                    {
                     before(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_ruleTrueFalse_in_rule__NotesElement__Alternatives_01826);
                    ruleTrueFalse();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:875:6: ( ruleChemEquation )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:875:6: ( ruleChemEquation )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:876:1: ruleChemEquation
                    {
                     before(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_0_9()); 
                    pushFollow(FOLLOW_ruleChemEquation_in_rule__NotesElement__Alternatives_01843);
                    ruleChemEquation();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:881:6: ( ruleChemCompound )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:881:6: ( ruleChemCompound )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:882:1: ruleChemCompound
                    {
                     before(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_0_10()); 
                    pushFollow(FOLLOW_ruleChemCompound_in_rule__NotesElement__Alternatives_01860);
                    ruleChemCompound();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:887:6: ( ruleSpellbee )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:887:6: ( ruleSpellbee )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:888:1: ruleSpellbee
                    {
                     before(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_0_11()); 
                    pushFollow(FOLLOW_ruleSpellbee_in_rule__NotesElement__Alternatives_01877);
                    ruleSpellbee();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:893:6: ( ruleImageLabel )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:893:6: ( ruleImageLabel )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:894:1: ruleImageLabel
                    {
                     before(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_0_12()); 
                    pushFollow(FOLLOW_ruleImageLabel_in_rule__NotesElement__Alternatives_01894);
                    ruleImageLabel();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:899:6: ( ruleEquation )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:899:6: ( ruleEquation )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:900:1: ruleEquation
                    {
                     before(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_0_13()); 
                    pushFollow(FOLLOW_ruleEquation_in_rule__NotesElement__Alternatives_01911);
                    ruleEquation();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:905:6: ( ruleRefToContext )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:905:6: ( ruleRefToContext )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:906:1: ruleRefToContext
                    {
                     before(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_0_14()); 
                    pushFollow(FOLLOW_ruleRefToContext_in_rule__NotesElement__Alternatives_01928);
                    ruleRefToContext();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:911:6: ( ruleMultiChoice )
                    {
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:911:6: ( ruleMultiChoice )
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:912:1: ruleMultiChoice
                    {
                     before(grammarAccess.getNotesElementAccess().getMultiChoiceParserRuleCall_0_15()); 
                    pushFollow(FOLLOW_ruleMultiChoice_in_rule__NotesElement__Alternatives_01945);
                    ruleMultiChoice();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getMultiChoiceParserRuleCall_0_15()); 

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
    // $ANTLR end "rule__NotesElement__Alternatives_0"


    // $ANTLR start "rule__JoveNotes__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:924:1: rule__JoveNotes__Group__0 : rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1 ;
    public final void rule__JoveNotes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:928:1: ( rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:929:2: rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1
            {
            pushFollow(FOLLOW_rule__JoveNotes__Group__0__Impl_in_rule__JoveNotes__Group__01975);
            rule__JoveNotes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoveNotes__Group__1_in_rule__JoveNotes__Group__01978);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:936:1: rule__JoveNotes__Group__0__Impl : ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) ) ;
    public final void rule__JoveNotes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:940:1: ( ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:941:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:941:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:942:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:943:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:943:2: rule__JoveNotes__ProcessingHintsAssignment_0
            {
            pushFollow(FOLLOW_rule__JoveNotes__ProcessingHintsAssignment_0_in_rule__JoveNotes__Group__0__Impl2005);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:953:1: rule__JoveNotes__Group__1 : rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2 ;
    public final void rule__JoveNotes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:957:1: ( rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:958:2: rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2
            {
            pushFollow(FOLLOW_rule__JoveNotes__Group__1__Impl_in_rule__JoveNotes__Group__12035);
            rule__JoveNotes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoveNotes__Group__2_in_rule__JoveNotes__Group__12038);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:965:1: rule__JoveNotes__Group__1__Impl : ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) ) ;
    public final void rule__JoveNotes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:969:1: ( ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:970:1: ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:970:1: ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:971:1: ( rule__JoveNotes__ChapterDetailsAssignment_1 )
            {
             before(grammarAccess.getJoveNotesAccess().getChapterDetailsAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:972:1: ( rule__JoveNotes__ChapterDetailsAssignment_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:972:2: rule__JoveNotes__ChapterDetailsAssignment_1
            {
            pushFollow(FOLLOW_rule__JoveNotes__ChapterDetailsAssignment_1_in_rule__JoveNotes__Group__1__Impl2065);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:982:1: rule__JoveNotes__Group__2 : rule__JoveNotes__Group__2__Impl ;
    public final void rule__JoveNotes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:986:1: ( rule__JoveNotes__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:987:2: rule__JoveNotes__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JoveNotes__Group__2__Impl_in_rule__JoveNotes__Group__22095);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:993:1: rule__JoveNotes__Group__2__Impl : ( ( rule__JoveNotes__NotesElementsAssignment_2 )* ) ;
    public final void rule__JoveNotes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:997:1: ( ( ( rule__JoveNotes__NotesElementsAssignment_2 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:998:1: ( ( rule__JoveNotes__NotesElementsAssignment_2 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:998:1: ( ( rule__JoveNotes__NotesElementsAssignment_2 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:999:1: ( rule__JoveNotes__NotesElementsAssignment_2 )*
            {
             before(grammarAccess.getJoveNotesAccess().getNotesElementsAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1000:1: ( rule__JoveNotes__NotesElementsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=22)||(LA2_0>=31 && LA2_0<=33)||(LA2_0>=35 && LA2_0<=37)||LA2_0==40||LA2_0==42||LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1000:2: rule__JoveNotes__NotesElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__JoveNotes__NotesElementsAssignment_2_in_rule__JoveNotes__Group__2__Impl2122);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1016:1: rule__ProcessingHints__Group__0 : rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1 ;
    public final void rule__ProcessingHints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1020:1: ( rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1021:2: rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1
            {
            pushFollow(FOLLOW_rule__ProcessingHints__Group__0__Impl_in_rule__ProcessingHints__Group__02159);
            rule__ProcessingHints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessingHints__Group__1_in_rule__ProcessingHints__Group__02162);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1028:1: rule__ProcessingHints__Group__0__Impl : ( () ) ;
    public final void rule__ProcessingHints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1032:1: ( ( () ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1033:1: ( () )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1033:1: ( () )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1034:1: ()
            {
             before(grammarAccess.getProcessingHintsAccess().getProcessingHintsAction_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1035:1: ()
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1037:1: 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1047:1: rule__ProcessingHints__Group__1 : rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2 ;
    public final void rule__ProcessingHints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1051:1: ( rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1052:2: rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2
            {
            pushFollow(FOLLOW_rule__ProcessingHints__Group__1__Impl_in_rule__ProcessingHints__Group__12220);
            rule__ProcessingHints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessingHints__Group__2_in_rule__ProcessingHints__Group__12223);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1059:1: rule__ProcessingHints__Group__1__Impl : ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? ) ;
    public final void rule__ProcessingHints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1063:1: ( ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1064:1: ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1064:1: ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1065:1: ( rule__ProcessingHints__SkipGenerationAssignment_1 )?
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1066:1: ( rule__ProcessingHints__SkipGenerationAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==49) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1066:2: rule__ProcessingHints__SkipGenerationAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ProcessingHints__SkipGenerationAssignment_1_in_rule__ProcessingHints__Group__1__Impl2250);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1076:1: rule__ProcessingHints__Group__2 : rule__ProcessingHints__Group__2__Impl ;
    public final void rule__ProcessingHints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1080:1: ( rule__ProcessingHints__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1081:2: rule__ProcessingHints__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProcessingHints__Group__2__Impl_in_rule__ProcessingHints__Group__22281);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1087:1: rule__ProcessingHints__Group__2__Impl : ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? ) ;
    public final void rule__ProcessingHints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1091:1: ( ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1092:1: ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1092:1: ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1093:1: ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )?
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1094:1: ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1094:2: rule__ProcessingHints__SkipGenerationInProductionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ProcessingHints__SkipGenerationInProductionAssignment_2_in_rule__ProcessingHints__Group__2__Impl2308);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1110:1: rule__ChapterDetails__Group__0 : rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 ;
    public final void rule__ChapterDetails__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1114:1: ( rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1115:2: rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__0__Impl_in_rule__ChapterDetails__Group__02345);
            rule__ChapterDetails__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__1_in_rule__ChapterDetails__Group__02348);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1122:1: rule__ChapterDetails__Group__0__Impl : ( ( rule__ChapterDetails__TestPaperAssignment_0 )? ) ;
    public final void rule__ChapterDetails__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1126:1: ( ( ( rule__ChapterDetails__TestPaperAssignment_0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1127:1: ( ( rule__ChapterDetails__TestPaperAssignment_0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1127:1: ( ( rule__ChapterDetails__TestPaperAssignment_0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1128:1: ( rule__ChapterDetails__TestPaperAssignment_0 )?
            {
             before(grammarAccess.getChapterDetailsAccess().getTestPaperAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1129:1: ( rule__ChapterDetails__TestPaperAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==51) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1129:2: rule__ChapterDetails__TestPaperAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ChapterDetails__TestPaperAssignment_0_in_rule__ChapterDetails__Group__0__Impl2375);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1139:1: rule__ChapterDetails__Group__1 : rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 ;
    public final void rule__ChapterDetails__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1143:1: ( rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1144:2: rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__1__Impl_in_rule__ChapterDetails__Group__12406);
            rule__ChapterDetails__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__2_in_rule__ChapterDetails__Group__12409);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1151:1: rule__ChapterDetails__Group__1__Impl : ( 'subject' ) ;
    public final void rule__ChapterDetails__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1155:1: ( ( 'subject' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1156:1: ( 'subject' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1156:1: ( 'subject' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1157:1: 'subject'
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__ChapterDetails__Group__1__Impl2437); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1170:1: rule__ChapterDetails__Group__2 : rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 ;
    public final void rule__ChapterDetails__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1174:1: ( rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1175:2: rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__2__Impl_in_rule__ChapterDetails__Group__22468);
            rule__ChapterDetails__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__3_in_rule__ChapterDetails__Group__22471);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1182:1: rule__ChapterDetails__Group__2__Impl : ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) ;
    public final void rule__ChapterDetails__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1186:1: ( ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1187:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1187:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1188:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1189:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1189:2: rule__ChapterDetails__SubjectNameAssignment_2
            {
            pushFollow(FOLLOW_rule__ChapterDetails__SubjectNameAssignment_2_in_rule__ChapterDetails__Group__2__Impl2498);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1199:1: rule__ChapterDetails__Group__3 : rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 ;
    public final void rule__ChapterDetails__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1203:1: ( rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1204:2: rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__3__Impl_in_rule__ChapterDetails__Group__32528);
            rule__ChapterDetails__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__4_in_rule__ChapterDetails__Group__32531);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1211:1: rule__ChapterDetails__Group__3__Impl : ( 'chapterNumber' ) ;
    public final void rule__ChapterDetails__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1215:1: ( ( 'chapterNumber' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1216:1: ( 'chapterNumber' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1216:1: ( 'chapterNumber' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1217:1: 'chapterNumber'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__ChapterDetails__Group__3__Impl2559); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1230:1: rule__ChapterDetails__Group__4 : rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 ;
    public final void rule__ChapterDetails__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1234:1: ( rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1235:2: rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__4__Impl_in_rule__ChapterDetails__Group__42590);
            rule__ChapterDetails__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__5_in_rule__ChapterDetails__Group__42593);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1242:1: rule__ChapterDetails__Group__4__Impl : ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) ;
    public final void rule__ChapterDetails__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1246:1: ( ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1247:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1247:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1248:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1249:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1249:2: rule__ChapterDetails__ChapterNumberAssignment_4
            {
            pushFollow(FOLLOW_rule__ChapterDetails__ChapterNumberAssignment_4_in_rule__ChapterDetails__Group__4__Impl2620);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1259:1: rule__ChapterDetails__Group__5 : rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 ;
    public final void rule__ChapterDetails__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1263:1: ( rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1264:2: rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__5__Impl_in_rule__ChapterDetails__Group__52650);
            rule__ChapterDetails__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__6_in_rule__ChapterDetails__Group__52653);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1271:1: rule__ChapterDetails__Group__5__Impl : ( '.' ) ;
    public final void rule__ChapterDetails__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1275:1: ( ( '.' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1276:1: ( '.' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1276:1: ( '.' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1277:1: '.'
            {
             before(grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__ChapterDetails__Group__5__Impl2681); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1290:1: rule__ChapterDetails__Group__6 : rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 ;
    public final void rule__ChapterDetails__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1294:1: ( rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1295:2: rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__6__Impl_in_rule__ChapterDetails__Group__62712);
            rule__ChapterDetails__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__7_in_rule__ChapterDetails__Group__62715);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1302:1: rule__ChapterDetails__Group__6__Impl : ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) ;
    public final void rule__ChapterDetails__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1306:1: ( ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1307:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1307:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1308:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1309:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1309:2: rule__ChapterDetails__SubChapterNumberAssignment_6
            {
            pushFollow(FOLLOW_rule__ChapterDetails__SubChapterNumberAssignment_6_in_rule__ChapterDetails__Group__6__Impl2742);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1319:1: rule__ChapterDetails__Group__7 : rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 ;
    public final void rule__ChapterDetails__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1323:1: ( rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1324:2: rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__7__Impl_in_rule__ChapterDetails__Group__72772);
            rule__ChapterDetails__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__8_in_rule__ChapterDetails__Group__72775);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1331:1: rule__ChapterDetails__Group__7__Impl : ( 'chapterName' ) ;
    public final void rule__ChapterDetails__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1335:1: ( ( 'chapterName' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1336:1: ( 'chapterName' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1336:1: ( 'chapterName' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1337:1: 'chapterName'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__ChapterDetails__Group__7__Impl2803); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1350:1: rule__ChapterDetails__Group__8 : rule__ChapterDetails__Group__8__Impl rule__ChapterDetails__Group__9 ;
    public final void rule__ChapterDetails__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1354:1: ( rule__ChapterDetails__Group__8__Impl rule__ChapterDetails__Group__9 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1355:2: rule__ChapterDetails__Group__8__Impl rule__ChapterDetails__Group__9
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__8__Impl_in_rule__ChapterDetails__Group__82834);
            rule__ChapterDetails__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChapterDetails__Group__9_in_rule__ChapterDetails__Group__82837);
            rule__ChapterDetails__Group__9();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1362:1: rule__ChapterDetails__Group__8__Impl : ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) ;
    public final void rule__ChapterDetails__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1366:1: ( ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1367:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1367:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1368:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameAssignment_8()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1369:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1369:2: rule__ChapterDetails__ChapterNameAssignment_8
            {
            pushFollow(FOLLOW_rule__ChapterDetails__ChapterNameAssignment_8_in_rule__ChapterDetails__Group__8__Impl2864);
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


    // $ANTLR start "rule__ChapterDetails__Group__9"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1379:1: rule__ChapterDetails__Group__9 : rule__ChapterDetails__Group__9__Impl ;
    public final void rule__ChapterDetails__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1383:1: ( rule__ChapterDetails__Group__9__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1384:2: rule__ChapterDetails__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__ChapterDetails__Group__9__Impl_in_rule__ChapterDetails__Group__92894);
            rule__ChapterDetails__Group__9__Impl();

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
    // $ANTLR end "rule__ChapterDetails__Group__9"


    // $ANTLR start "rule__ChapterDetails__Group__9__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1390:1: rule__ChapterDetails__Group__9__Impl : ( ( rule__ChapterDetails__ScriptAssignment_9 )? ) ;
    public final void rule__ChapterDetails__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1394:1: ( ( ( rule__ChapterDetails__ScriptAssignment_9 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1395:1: ( ( rule__ChapterDetails__ScriptAssignment_9 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1395:1: ( ( rule__ChapterDetails__ScriptAssignment_9 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1396:1: ( rule__ChapterDetails__ScriptAssignment_9 )?
            {
             before(grammarAccess.getChapterDetailsAccess().getScriptAssignment_9()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1397:1: ( rule__ChapterDetails__ScriptAssignment_9 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==48) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1397:2: rule__ChapterDetails__ScriptAssignment_9
                    {
                    pushFollow(FOLLOW_rule__ChapterDetails__ScriptAssignment_9_in_rule__ChapterDetails__Group__9__Impl2921);
                    rule__ChapterDetails__ScriptAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterDetailsAccess().getScriptAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__Group__9__Impl"


    // $ANTLR start "rule__NotesElement__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1427:1: rule__NotesElement__Group__0 : rule__NotesElement__Group__0__Impl rule__NotesElement__Group__1 ;
    public final void rule__NotesElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1431:1: ( rule__NotesElement__Group__0__Impl rule__NotesElement__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1432:2: rule__NotesElement__Group__0__Impl rule__NotesElement__Group__1
            {
            pushFollow(FOLLOW_rule__NotesElement__Group__0__Impl_in_rule__NotesElement__Group__02972);
            rule__NotesElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotesElement__Group__1_in_rule__NotesElement__Group__02975);
            rule__NotesElement__Group__1();

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
    // $ANTLR end "rule__NotesElement__Group__0"


    // $ANTLR start "rule__NotesElement__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1439:1: rule__NotesElement__Group__0__Impl : ( ( rule__NotesElement__Alternatives_0 ) ) ;
    public final void rule__NotesElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1443:1: ( ( ( rule__NotesElement__Alternatives_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1444:1: ( ( rule__NotesElement__Alternatives_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1444:1: ( ( rule__NotesElement__Alternatives_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1445:1: ( rule__NotesElement__Alternatives_0 )
            {
             before(grammarAccess.getNotesElementAccess().getAlternatives_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1446:1: ( rule__NotesElement__Alternatives_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1446:2: rule__NotesElement__Alternatives_0
            {
            pushFollow(FOLLOW_rule__NotesElement__Alternatives_0_in_rule__NotesElement__Group__0__Impl3002);
            rule__NotesElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNotesElementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__Group__0__Impl"


    // $ANTLR start "rule__NotesElement__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1456:1: rule__NotesElement__Group__1 : rule__NotesElement__Group__1__Impl ;
    public final void rule__NotesElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1460:1: ( rule__NotesElement__Group__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1461:2: rule__NotesElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NotesElement__Group__1__Impl_in_rule__NotesElement__Group__13032);
            rule__NotesElement__Group__1__Impl();

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
    // $ANTLR end "rule__NotesElement__Group__1"


    // $ANTLR start "rule__NotesElement__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1467:1: rule__NotesElement__Group__1__Impl : ( ( rule__NotesElement__ScriptAssignment_1 )? ) ;
    public final void rule__NotesElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1471:1: ( ( ( rule__NotesElement__ScriptAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1472:1: ( ( rule__NotesElement__ScriptAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1472:1: ( ( rule__NotesElement__ScriptAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1473:1: ( rule__NotesElement__ScriptAssignment_1 )?
            {
             before(grammarAccess.getNotesElementAccess().getScriptAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1474:1: ( rule__NotesElement__ScriptAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==48) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1474:2: rule__NotesElement__ScriptAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NotesElement__ScriptAssignment_1_in_rule__NotesElement__Group__1__Impl3059);
                    rule__NotesElement__ScriptAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNotesElementAccess().getScriptAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__Group__1__Impl"


    // $ANTLR start "rule__WordMeaning__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1488:1: rule__WordMeaning__Group__0 : rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 ;
    public final void rule__WordMeaning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1492:1: ( rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1493:2: rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__0__Impl_in_rule__WordMeaning__Group__03094);
            rule__WordMeaning__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordMeaning__Group__1_in_rule__WordMeaning__Group__03097);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1500:1: rule__WordMeaning__Group__0__Impl : ( '@wm' ) ;
    public final void rule__WordMeaning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1504:1: ( ( '@wm' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1505:1: ( '@wm' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1505:1: ( '@wm' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1506:1: '@wm'
            {
             before(grammarAccess.getWordMeaningAccess().getWmKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__WordMeaning__Group__0__Impl3125); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1519:1: rule__WordMeaning__Group__1 : rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 ;
    public final void rule__WordMeaning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1523:1: ( rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1524:2: rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__1__Impl_in_rule__WordMeaning__Group__13156);
            rule__WordMeaning__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordMeaning__Group__2_in_rule__WordMeaning__Group__13159);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1531:1: rule__WordMeaning__Group__1__Impl : ( ( rule__WordMeaning__HideFromViewAssignment_1 )? ) ;
    public final void rule__WordMeaning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1535:1: ( ( ( rule__WordMeaning__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1536:1: ( ( rule__WordMeaning__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1536:1: ( ( rule__WordMeaning__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1537:1: ( rule__WordMeaning__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1538:1: ( rule__WordMeaning__HideFromViewAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==52) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1538:2: rule__WordMeaning__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__WordMeaning__HideFromViewAssignment_1_in_rule__WordMeaning__Group__1__Impl3186);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1548:1: rule__WordMeaning__Group__2 : rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3 ;
    public final void rule__WordMeaning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1552:1: ( rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1553:2: rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__2__Impl_in_rule__WordMeaning__Group__23217);
            rule__WordMeaning__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordMeaning__Group__3_in_rule__WordMeaning__Group__23220);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1560:1: rule__WordMeaning__Group__2__Impl : ( ( rule__WordMeaning__WordAssignment_2 ) ) ;
    public final void rule__WordMeaning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1564:1: ( ( ( rule__WordMeaning__WordAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1565:1: ( ( rule__WordMeaning__WordAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1565:1: ( ( rule__WordMeaning__WordAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1566:1: ( rule__WordMeaning__WordAssignment_2 )
            {
             before(grammarAccess.getWordMeaningAccess().getWordAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1567:1: ( rule__WordMeaning__WordAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1567:2: rule__WordMeaning__WordAssignment_2
            {
            pushFollow(FOLLOW_rule__WordMeaning__WordAssignment_2_in_rule__WordMeaning__Group__2__Impl3247);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1577:1: rule__WordMeaning__Group__3 : rule__WordMeaning__Group__3__Impl ;
    public final void rule__WordMeaning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1581:1: ( rule__WordMeaning__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1582:2: rule__WordMeaning__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WordMeaning__Group__3__Impl_in_rule__WordMeaning__Group__33277);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1588:1: rule__WordMeaning__Group__3__Impl : ( ( rule__WordMeaning__MeaningAssignment_3 ) ) ;
    public final void rule__WordMeaning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1592:1: ( ( ( rule__WordMeaning__MeaningAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1593:1: ( ( rule__WordMeaning__MeaningAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1593:1: ( ( rule__WordMeaning__MeaningAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1594:1: ( rule__WordMeaning__MeaningAssignment_3 )
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1595:1: ( rule__WordMeaning__MeaningAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1595:2: rule__WordMeaning__MeaningAssignment_3
            {
            pushFollow(FOLLOW_rule__WordMeaning__MeaningAssignment_3_in_rule__WordMeaning__Group__3__Impl3304);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1613:1: rule__QuestionAnswer__Group__0 : rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 ;
    public final void rule__QuestionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1617:1: ( rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1618:2: rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__0__Impl_in_rule__QuestionAnswer__Group__03342);
            rule__QuestionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__1_in_rule__QuestionAnswer__Group__03345);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1625:1: rule__QuestionAnswer__Group__0__Impl : ( '@qa' ) ;
    public final void rule__QuestionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1629:1: ( ( '@qa' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1630:1: ( '@qa' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1630:1: ( '@qa' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1631:1: '@qa'
            {
             before(grammarAccess.getQuestionAnswerAccess().getQaKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__QuestionAnswer__Group__0__Impl3373); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1644:1: rule__QuestionAnswer__Group__1 : rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 ;
    public final void rule__QuestionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1648:1: ( rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1649:2: rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__1__Impl_in_rule__QuestionAnswer__Group__13404);
            rule__QuestionAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__2_in_rule__QuestionAnswer__Group__13407);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1656:1: rule__QuestionAnswer__Group__1__Impl : ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? ) ;
    public final void rule__QuestionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1660:1: ( ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1661:1: ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1661:1: ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1662:1: ( rule__QuestionAnswer__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1663:1: ( rule__QuestionAnswer__HideFromViewAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==52) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1663:2: rule__QuestionAnswer__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__QuestionAnswer__HideFromViewAssignment_1_in_rule__QuestionAnswer__Group__1__Impl3434);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1673:1: rule__QuestionAnswer__Group__2 : rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 ;
    public final void rule__QuestionAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1677:1: ( rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1678:2: rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__2__Impl_in_rule__QuestionAnswer__Group__23465);
            rule__QuestionAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__3_in_rule__QuestionAnswer__Group__23468);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1685:1: rule__QuestionAnswer__Group__2__Impl : ( ( rule__QuestionAnswer__QuestionAssignment_2 ) ) ;
    public final void rule__QuestionAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1689:1: ( ( ( rule__QuestionAnswer__QuestionAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1690:1: ( ( rule__QuestionAnswer__QuestionAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1690:1: ( ( rule__QuestionAnswer__QuestionAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1691:1: ( rule__QuestionAnswer__QuestionAssignment_2 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1692:1: ( rule__QuestionAnswer__QuestionAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1692:2: rule__QuestionAnswer__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__QuestionAssignment_2_in_rule__QuestionAnswer__Group__2__Impl3495);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1702:1: rule__QuestionAnswer__Group__3 : rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4 ;
    public final void rule__QuestionAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1706:1: ( rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1707:2: rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__3__Impl_in_rule__QuestionAnswer__Group__33525);
            rule__QuestionAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionAnswer__Group__4_in_rule__QuestionAnswer__Group__33528);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1714:1: rule__QuestionAnswer__Group__3__Impl : ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) ) ;
    public final void rule__QuestionAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1718:1: ( ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1719:1: ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1719:1: ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1720:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1720:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1721:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1722:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1722:2: rule__QuestionAnswer__AnswerPartsAssignment_3
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__AnswerPartsAssignment_3_in_rule__QuestionAnswer__Group__3__Impl3557);
            rule__QuestionAnswer__AnswerPartsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1725:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1726:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )*
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1727:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1727:2: rule__QuestionAnswer__AnswerPartsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__QuestionAnswer__AnswerPartsAssignment_3_in_rule__QuestionAnswer__Group__3__Impl3569);
            	    rule__QuestionAnswer__AnswerPartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1738:1: rule__QuestionAnswer__Group__4 : rule__QuestionAnswer__Group__4__Impl ;
    public final void rule__QuestionAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1742:1: ( rule__QuestionAnswer__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1743:2: rule__QuestionAnswer__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__QuestionAnswer__Group__4__Impl_in_rule__QuestionAnswer__Group__43602);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1749:1: rule__QuestionAnswer__Group__4__Impl : ( ( rule__QuestionAnswer__CmapAssignment_4 )? ) ;
    public final void rule__QuestionAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1753:1: ( ( ( rule__QuestionAnswer__CmapAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1754:1: ( ( rule__QuestionAnswer__CmapAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1754:1: ( ( rule__QuestionAnswer__CmapAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1755:1: ( rule__QuestionAnswer__CmapAssignment_4 )?
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1756:1: ( rule__QuestionAnswer__CmapAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==47) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1756:2: rule__QuestionAnswer__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_rule__QuestionAnswer__CmapAssignment_4_in_rule__QuestionAnswer__Group__4__Impl3629);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1776:1: rule__FIB__Group__0 : rule__FIB__Group__0__Impl rule__FIB__Group__1 ;
    public final void rule__FIB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1780:1: ( rule__FIB__Group__0__Impl rule__FIB__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1781:2: rule__FIB__Group__0__Impl rule__FIB__Group__1
            {
            pushFollow(FOLLOW_rule__FIB__Group__0__Impl_in_rule__FIB__Group__03670);
            rule__FIB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FIB__Group__1_in_rule__FIB__Group__03673);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1788:1: rule__FIB__Group__0__Impl : ( '@fib' ) ;
    public final void rule__FIB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1792:1: ( ( '@fib' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1793:1: ( '@fib' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1793:1: ( '@fib' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1794:1: '@fib'
            {
             before(grammarAccess.getFIBAccess().getFibKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__FIB__Group__0__Impl3701); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1807:1: rule__FIB__Group__1 : rule__FIB__Group__1__Impl rule__FIB__Group__2 ;
    public final void rule__FIB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1811:1: ( rule__FIB__Group__1__Impl rule__FIB__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1812:2: rule__FIB__Group__1__Impl rule__FIB__Group__2
            {
            pushFollow(FOLLOW_rule__FIB__Group__1__Impl_in_rule__FIB__Group__13732);
            rule__FIB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FIB__Group__2_in_rule__FIB__Group__13735);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1819:1: rule__FIB__Group__1__Impl : ( ( rule__FIB__HideFromViewAssignment_1 )? ) ;
    public final void rule__FIB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1823:1: ( ( ( rule__FIB__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1824:1: ( ( rule__FIB__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1824:1: ( ( rule__FIB__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1825:1: ( rule__FIB__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getFIBAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1826:1: ( rule__FIB__HideFromViewAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==52) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1826:2: rule__FIB__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FIB__HideFromViewAssignment_1_in_rule__FIB__Group__1__Impl3762);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1836:1: rule__FIB__Group__2 : rule__FIB__Group__2__Impl rule__FIB__Group__3 ;
    public final void rule__FIB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1840:1: ( rule__FIB__Group__2__Impl rule__FIB__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1841:2: rule__FIB__Group__2__Impl rule__FIB__Group__3
            {
            pushFollow(FOLLOW_rule__FIB__Group__2__Impl_in_rule__FIB__Group__23793);
            rule__FIB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FIB__Group__3_in_rule__FIB__Group__23796);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1848:1: rule__FIB__Group__2__Impl : ( ( rule__FIB__QuestionAssignment_2 ) ) ;
    public final void rule__FIB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1852:1: ( ( ( rule__FIB__QuestionAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1853:1: ( ( rule__FIB__QuestionAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1853:1: ( ( rule__FIB__QuestionAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1854:1: ( rule__FIB__QuestionAssignment_2 )
            {
             before(grammarAccess.getFIBAccess().getQuestionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1855:1: ( rule__FIB__QuestionAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1855:2: rule__FIB__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__FIB__QuestionAssignment_2_in_rule__FIB__Group__2__Impl3823);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1865:1: rule__FIB__Group__3 : rule__FIB__Group__3__Impl ;
    public final void rule__FIB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1869:1: ( rule__FIB__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1870:2: rule__FIB__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FIB__Group__3__Impl_in_rule__FIB__Group__33853);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1876:1: rule__FIB__Group__3__Impl : ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) ) ;
    public final void rule__FIB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1880:1: ( ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1881:1: ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1881:1: ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1882:1: ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1882:1: ( ( rule__FIB__AnswersAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1883:1: ( rule__FIB__AnswersAssignment_3 )
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1884:1: ( rule__FIB__AnswersAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1884:2: rule__FIB__AnswersAssignment_3
            {
            pushFollow(FOLLOW_rule__FIB__AnswersAssignment_3_in_rule__FIB__Group__3__Impl3882);
            rule__FIB__AnswersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1887:1: ( ( rule__FIB__AnswersAssignment_3 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1888:1: ( rule__FIB__AnswersAssignment_3 )*
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1889:1: ( rule__FIB__AnswersAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1889:2: rule__FIB__AnswersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__FIB__AnswersAssignment_3_in_rule__FIB__Group__3__Impl3894);
            	    rule__FIB__AnswersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1908:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1912:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1913:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03935);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03938);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1920:1: rule__Definition__Group__0__Impl : ( '@definition' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1924:1: ( ( '@definition' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1925:1: ( '@definition' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1925:1: ( '@definition' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1926:1: '@definition'
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Definition__Group__0__Impl3966); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1939:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1943:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1944:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13997);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__14000);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1951:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__HideFromViewAssignment_1 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1955:1: ( ( ( rule__Definition__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1956:1: ( ( rule__Definition__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1956:1: ( ( rule__Definition__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1957:1: ( rule__Definition__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1958:1: ( rule__Definition__HideFromViewAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==52) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1958:2: rule__Definition__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Definition__HideFromViewAssignment_1_in_rule__Definition__Group__1__Impl4027);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1968:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1972:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1973:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__24058);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__24061);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1980:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__TermAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1984:1: ( ( ( rule__Definition__TermAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1985:1: ( ( rule__Definition__TermAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1985:1: ( ( rule__Definition__TermAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1986:1: ( rule__Definition__TermAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getTermAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1987:1: ( rule__Definition__TermAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1987:2: rule__Definition__TermAssignment_2
            {
            pushFollow(FOLLOW_rule__Definition__TermAssignment_2_in_rule__Definition__Group__2__Impl4088);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:1997:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2001:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2002:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__34118);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__34121);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2009:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__DefinitionAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2013:1: ( ( ( rule__Definition__DefinitionAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2014:1: ( ( rule__Definition__DefinitionAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2014:1: ( ( rule__Definition__DefinitionAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2015:1: ( rule__Definition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2016:1: ( rule__Definition__DefinitionAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2016:2: rule__Definition__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__Definition__DefinitionAssignment_3_in_rule__Definition__Group__3__Impl4148);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2026:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2030:1: ( rule__Definition__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2031:2: rule__Definition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__44178);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2037:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__CmapAssignment_4 )? ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2041:1: ( ( ( rule__Definition__CmapAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2042:1: ( ( rule__Definition__CmapAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2042:1: ( ( rule__Definition__CmapAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2043:1: ( rule__Definition__CmapAssignment_4 )?
            {
             before(grammarAccess.getDefinitionAccess().getCmapAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2044:1: ( rule__Definition__CmapAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2044:2: rule__Definition__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Definition__CmapAssignment_4_in_rule__Definition__Group__4__Impl4205);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2064:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2068:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2069:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__04246);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__1_in_rule__Character__Group__04249);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2076:1: rule__Character__Group__0__Impl : ( '@character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2080:1: ( ( '@character' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2081:1: ( '@character' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2081:1: ( '@character' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2082:1: '@character'
            {
             before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Character__Group__0__Impl4277); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2095:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2099:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2100:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__14308);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__2_in_rule__Character__Group__14311);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2107:1: rule__Character__Group__1__Impl : ( ( rule__Character__HideFromViewAssignment_1 )? ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2111:1: ( ( ( rule__Character__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2112:1: ( ( rule__Character__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2112:1: ( ( rule__Character__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2113:1: ( rule__Character__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2114:1: ( rule__Character__HideFromViewAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2114:2: rule__Character__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Character__HideFromViewAssignment_1_in_rule__Character__Group__1__Impl4338);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2124:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2128:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2129:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__24369);
            rule__Character__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__3_in_rule__Character__Group__24372);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2136:1: rule__Character__Group__2__Impl : ( ( rule__Character__CharacterAssignment_2 ) ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2140:1: ( ( ( rule__Character__CharacterAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2141:1: ( ( rule__Character__CharacterAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2141:1: ( ( rule__Character__CharacterAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2142:1: ( rule__Character__CharacterAssignment_2 )
            {
             before(grammarAccess.getCharacterAccess().getCharacterAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2143:1: ( rule__Character__CharacterAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2143:2: rule__Character__CharacterAssignment_2
            {
            pushFollow(FOLLOW_rule__Character__CharacterAssignment_2_in_rule__Character__Group__2__Impl4399);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2153:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2157:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2158:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__34429);
            rule__Character__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__4_in_rule__Character__Group__34432);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2165:1: rule__Character__Group__3__Impl : ( ( rule__Character__EstimateAssignment_3 ) ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2169:1: ( ( ( rule__Character__EstimateAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2170:1: ( ( rule__Character__EstimateAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2170:1: ( ( rule__Character__EstimateAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2171:1: ( rule__Character__EstimateAssignment_3 )
            {
             before(grammarAccess.getCharacterAccess().getEstimateAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2172:1: ( rule__Character__EstimateAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2172:2: rule__Character__EstimateAssignment_3
            {
            pushFollow(FOLLOW_rule__Character__EstimateAssignment_3_in_rule__Character__Group__3__Impl4459);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2182:1: rule__Character__Group__4 : rule__Character__Group__4__Impl ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2186:1: ( rule__Character__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2187:2: rule__Character__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__44489);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2193:1: rule__Character__Group__4__Impl : ( ( rule__Character__CmapAssignment_4 )? ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2197:1: ( ( ( rule__Character__CmapAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2198:1: ( ( rule__Character__CmapAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2198:1: ( ( rule__Character__CmapAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2199:1: ( rule__Character__CmapAssignment_4 )?
            {
             before(grammarAccess.getCharacterAccess().getCmapAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2200:1: ( rule__Character__CmapAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2200:2: rule__Character__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Character__CmapAssignment_4_in_rule__Character__Group__4__Impl4516);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2220:1: rule__TeacherNote__Group__0 : rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 ;
    public final void rule__TeacherNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2224:1: ( rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2225:2: rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__0__Impl_in_rule__TeacherNote__Group__04557);
            rule__TeacherNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__1_in_rule__TeacherNote__Group__04560);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2232:1: rule__TeacherNote__Group__0__Impl : ( '@tn' ) ;
    public final void rule__TeacherNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2236:1: ( ( '@tn' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2237:1: ( '@tn' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2237:1: ( '@tn' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2238:1: '@tn'
            {
             before(grammarAccess.getTeacherNoteAccess().getTnKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__TeacherNote__Group__0__Impl4588); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2251:1: rule__TeacherNote__Group__1 : rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 ;
    public final void rule__TeacherNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2255:1: ( rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2256:2: rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__1__Impl_in_rule__TeacherNote__Group__14619);
            rule__TeacherNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__2_in_rule__TeacherNote__Group__14622);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2263:1: rule__TeacherNote__Group__1__Impl : ( ( rule__TeacherNote__HideFromViewAssignment_1 )? ) ;
    public final void rule__TeacherNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2267:1: ( ( ( rule__TeacherNote__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2268:1: ( ( rule__TeacherNote__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2268:1: ( ( rule__TeacherNote__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2269:1: ( rule__TeacherNote__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2270:1: ( rule__TeacherNote__HideFromViewAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2270:2: rule__TeacherNote__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TeacherNote__HideFromViewAssignment_1_in_rule__TeacherNote__Group__1__Impl4649);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2280:1: rule__TeacherNote__Group__2 : rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3 ;
    public final void rule__TeacherNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2284:1: ( rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2285:2: rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__2__Impl_in_rule__TeacherNote__Group__24680);
            rule__TeacherNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__3_in_rule__TeacherNote__Group__24683);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2292:1: rule__TeacherNote__Group__2__Impl : ( ( rule__TeacherNote__CaptionAssignment_2 )? ) ;
    public final void rule__TeacherNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2296:1: ( ( ( rule__TeacherNote__CaptionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2297:1: ( ( rule__TeacherNote__CaptionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2297:1: ( ( rule__TeacherNote__CaptionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2298:1: ( rule__TeacherNote__CaptionAssignment_2 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getCaptionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2299:1: ( rule__TeacherNote__CaptionAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_STRING) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2299:2: rule__TeacherNote__CaptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TeacherNote__CaptionAssignment_2_in_rule__TeacherNote__Group__2__Impl4710);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2309:1: rule__TeacherNote__Group__3 : rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4 ;
    public final void rule__TeacherNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2313:1: ( rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2314:2: rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__3__Impl_in_rule__TeacherNote__Group__34741);
            rule__TeacherNote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TeacherNote__Group__4_in_rule__TeacherNote__Group__34744);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2321:1: rule__TeacherNote__Group__3__Impl : ( ( rule__TeacherNote__NoteAssignment_3 ) ) ;
    public final void rule__TeacherNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2325:1: ( ( ( rule__TeacherNote__NoteAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2326:1: ( ( rule__TeacherNote__NoteAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2326:1: ( ( rule__TeacherNote__NoteAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2327:1: ( rule__TeacherNote__NoteAssignment_3 )
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2328:1: ( rule__TeacherNote__NoteAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2328:2: rule__TeacherNote__NoteAssignment_3
            {
            pushFollow(FOLLOW_rule__TeacherNote__NoteAssignment_3_in_rule__TeacherNote__Group__3__Impl4771);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2338:1: rule__TeacherNote__Group__4 : rule__TeacherNote__Group__4__Impl ;
    public final void rule__TeacherNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2342:1: ( rule__TeacherNote__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2343:2: rule__TeacherNote__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TeacherNote__Group__4__Impl_in_rule__TeacherNote__Group__44801);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2349:1: rule__TeacherNote__Group__4__Impl : ( ( rule__TeacherNote__CmapAssignment_4 )? ) ;
    public final void rule__TeacherNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2353:1: ( ( ( rule__TeacherNote__CmapAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2354:1: ( ( rule__TeacherNote__CmapAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2354:1: ( ( rule__TeacherNote__CmapAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2355:1: ( rule__TeacherNote__CmapAssignment_4 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2356:1: ( rule__TeacherNote__CmapAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2356:2: rule__TeacherNote__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TeacherNote__CmapAssignment_4_in_rule__TeacherNote__Group__4__Impl4828);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2376:1: rule__Matching__Group__0 : rule__Matching__Group__0__Impl rule__Matching__Group__1 ;
    public final void rule__Matching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2380:1: ( rule__Matching__Group__0__Impl rule__Matching__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2381:2: rule__Matching__Group__0__Impl rule__Matching__Group__1
            {
            pushFollow(FOLLOW_rule__Matching__Group__0__Impl_in_rule__Matching__Group__04869);
            rule__Matching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__1_in_rule__Matching__Group__04872);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2388:1: rule__Matching__Group__0__Impl : ( '@match' ) ;
    public final void rule__Matching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2392:1: ( ( '@match' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2393:1: ( '@match' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2393:1: ( '@match' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2394:1: '@match'
            {
             before(grammarAccess.getMatchingAccess().getMatchKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Matching__Group__0__Impl4900); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2407:1: rule__Matching__Group__1 : rule__Matching__Group__1__Impl rule__Matching__Group__2 ;
    public final void rule__Matching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2411:1: ( rule__Matching__Group__1__Impl rule__Matching__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2412:2: rule__Matching__Group__1__Impl rule__Matching__Group__2
            {
            pushFollow(FOLLOW_rule__Matching__Group__1__Impl_in_rule__Matching__Group__14931);
            rule__Matching__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__2_in_rule__Matching__Group__14934);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2419:1: rule__Matching__Group__1__Impl : ( ( rule__Matching__HideFromViewAssignment_1 )? ) ;
    public final void rule__Matching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2423:1: ( ( ( rule__Matching__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2424:1: ( ( rule__Matching__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2424:1: ( ( rule__Matching__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2425:1: ( rule__Matching__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2426:1: ( rule__Matching__HideFromViewAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2426:2: rule__Matching__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Matching__HideFromViewAssignment_1_in_rule__Matching__Group__1__Impl4961);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2436:1: rule__Matching__Group__2 : rule__Matching__Group__2__Impl rule__Matching__Group__3 ;
    public final void rule__Matching__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2440:1: ( rule__Matching__Group__2__Impl rule__Matching__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2441:2: rule__Matching__Group__2__Impl rule__Matching__Group__3
            {
            pushFollow(FOLLOW_rule__Matching__Group__2__Impl_in_rule__Matching__Group__24992);
            rule__Matching__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__3_in_rule__Matching__Group__24995);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2448:1: rule__Matching__Group__2__Impl : ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? ) ;
    public final void rule__Matching__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2452:1: ( ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2453:1: ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2453:1: ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2454:1: ( rule__Matching__SkipReverseQuestionAssignment_2 )?
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2455:1: ( rule__Matching__SkipReverseQuestionAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2455:2: rule__Matching__SkipReverseQuestionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Matching__SkipReverseQuestionAssignment_2_in_rule__Matching__Group__2__Impl5022);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2465:1: rule__Matching__Group__3 : rule__Matching__Group__3__Impl rule__Matching__Group__4 ;
    public final void rule__Matching__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2469:1: ( rule__Matching__Group__3__Impl rule__Matching__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2470:2: rule__Matching__Group__3__Impl rule__Matching__Group__4
            {
            pushFollow(FOLLOW_rule__Matching__Group__3__Impl_in_rule__Matching__Group__35053);
            rule__Matching__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__4_in_rule__Matching__Group__35056);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2477:1: rule__Matching__Group__3__Impl : ( ( rule__Matching__QuestionAssignment_3 )? ) ;
    public final void rule__Matching__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2481:1: ( ( ( rule__Matching__QuestionAssignment_3 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2482:1: ( ( rule__Matching__QuestionAssignment_3 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2482:1: ( ( rule__Matching__QuestionAssignment_3 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2483:1: ( rule__Matching__QuestionAssignment_3 )?
            {
             before(grammarAccess.getMatchingAccess().getQuestionAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2484:1: ( rule__Matching__QuestionAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2484:2: rule__Matching__QuestionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Matching__QuestionAssignment_3_in_rule__Matching__Group__3__Impl5083);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2494:1: rule__Matching__Group__4 : rule__Matching__Group__4__Impl rule__Matching__Group__5 ;
    public final void rule__Matching__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2498:1: ( rule__Matching__Group__4__Impl rule__Matching__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2499:2: rule__Matching__Group__4__Impl rule__Matching__Group__5
            {
            pushFollow(FOLLOW_rule__Matching__Group__4__Impl_in_rule__Matching__Group__45114);
            rule__Matching__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__5_in_rule__Matching__Group__45117);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2506:1: rule__Matching__Group__4__Impl : ( '{' ) ;
    public final void rule__Matching__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2510:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2511:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2511:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2512:1: '{'
            {
             before(grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Matching__Group__4__Impl5145); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2525:1: rule__Matching__Group__5 : rule__Matching__Group__5__Impl rule__Matching__Group__6 ;
    public final void rule__Matching__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2529:1: ( rule__Matching__Group__5__Impl rule__Matching__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2530:2: rule__Matching__Group__5__Impl rule__Matching__Group__6
            {
            pushFollow(FOLLOW_rule__Matching__Group__5__Impl_in_rule__Matching__Group__55176);
            rule__Matching__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__6_in_rule__Matching__Group__55179);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2537:1: rule__Matching__Group__5__Impl : ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) ) ;
    public final void rule__Matching__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2541:1: ( ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2542:1: ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2542:1: ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2543:1: ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2543:1: ( ( rule__Matching__PairsAssignment_5 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2544:1: ( rule__Matching__PairsAssignment_5 )
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2545:1: ( rule__Matching__PairsAssignment_5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2545:2: rule__Matching__PairsAssignment_5
            {
            pushFollow(FOLLOW_rule__Matching__PairsAssignment_5_in_rule__Matching__Group__5__Impl5208);
            rule__Matching__PairsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2548:1: ( ( rule__Matching__PairsAssignment_5 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2549:1: ( rule__Matching__PairsAssignment_5 )*
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2550:1: ( rule__Matching__PairsAssignment_5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2550:2: rule__Matching__PairsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Matching__PairsAssignment_5_in_rule__Matching__Group__5__Impl5220);
            	    rule__Matching__PairsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2561:1: rule__Matching__Group__6 : rule__Matching__Group__6__Impl rule__Matching__Group__7 ;
    public final void rule__Matching__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2565:1: ( rule__Matching__Group__6__Impl rule__Matching__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2566:2: rule__Matching__Group__6__Impl rule__Matching__Group__7
            {
            pushFollow(FOLLOW_rule__Matching__Group__6__Impl_in_rule__Matching__Group__65253);
            rule__Matching__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matching__Group__7_in_rule__Matching__Group__65256);
            rule__Matching__Group__7();

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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2573:1: rule__Matching__Group__6__Impl : ( ( rule__Matching__McqConfigAssignment_6 )? ) ;
    public final void rule__Matching__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2577:1: ( ( ( rule__Matching__McqConfigAssignment_6 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2578:1: ( ( rule__Matching__McqConfigAssignment_6 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2578:1: ( ( rule__Matching__McqConfigAssignment_6 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2579:1: ( rule__Matching__McqConfigAssignment_6 )?
            {
             before(grammarAccess.getMatchingAccess().getMcqConfigAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2580:1: ( rule__Matching__McqConfigAssignment_6 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2580:2: rule__Matching__McqConfigAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Matching__McqConfigAssignment_6_in_rule__Matching__Group__6__Impl5283);
                    rule__Matching__McqConfigAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchingAccess().getMcqConfigAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Matching__Group__7"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2590:1: rule__Matching__Group__7 : rule__Matching__Group__7__Impl ;
    public final void rule__Matching__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2594:1: ( rule__Matching__Group__7__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2595:2: rule__Matching__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Matching__Group__7__Impl_in_rule__Matching__Group__75314);
            rule__Matching__Group__7__Impl();

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
    // $ANTLR end "rule__Matching__Group__7"


    // $ANTLR start "rule__Matching__Group__7__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2601:1: rule__Matching__Group__7__Impl : ( '}' ) ;
    public final void rule__Matching__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2605:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2606:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2606:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2607:1: '}'
            {
             before(grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__Matching__Group__7__Impl5342); 
             after(grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__Group__7__Impl"


    // $ANTLR start "rule__MatchPair__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2636:1: rule__MatchPair__Group__0 : rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 ;
    public final void rule__MatchPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2640:1: ( rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2641:2: rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__0__Impl_in_rule__MatchPair__Group__05389);
            rule__MatchPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchPair__Group__1_in_rule__MatchPair__Group__05392);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2648:1: rule__MatchPair__Group__0__Impl : ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) ;
    public final void rule__MatchPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2652:1: ( ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2653:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2653:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2654:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2655:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2655:2: rule__MatchPair__MatchQuestionAssignment_0
            {
            pushFollow(FOLLOW_rule__MatchPair__MatchQuestionAssignment_0_in_rule__MatchPair__Group__0__Impl5419);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2665:1: rule__MatchPair__Group__1 : rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 ;
    public final void rule__MatchPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2669:1: ( rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2670:2: rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__1__Impl_in_rule__MatchPair__Group__15449);
            rule__MatchPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchPair__Group__2_in_rule__MatchPair__Group__15452);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2677:1: rule__MatchPair__Group__1__Impl : ( '=' ) ;
    public final void rule__MatchPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2681:1: ( ( '=' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2682:1: ( '=' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2682:1: ( '=' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2683:1: '='
            {
             before(grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__MatchPair__Group__1__Impl5480); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2696:1: rule__MatchPair__Group__2 : rule__MatchPair__Group__2__Impl ;
    public final void rule__MatchPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2700:1: ( rule__MatchPair__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2701:2: rule__MatchPair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MatchPair__Group__2__Impl_in_rule__MatchPair__Group__25511);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2707:1: rule__MatchPair__Group__2__Impl : ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) ;
    public final void rule__MatchPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2711:1: ( ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2712:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2712:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2713:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2714:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2714:2: rule__MatchPair__MatchAnswerAssignment_2
            {
            pushFollow(FOLLOW_rule__MatchPair__MatchAnswerAssignment_2_in_rule__MatchPair__Group__2__Impl5538);
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


    // $ANTLR start "rule__MatchMCQConfig__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2730:1: rule__MatchMCQConfig__Group__0 : rule__MatchMCQConfig__Group__0__Impl rule__MatchMCQConfig__Group__1 ;
    public final void rule__MatchMCQConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2734:1: ( rule__MatchMCQConfig__Group__0__Impl rule__MatchMCQConfig__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2735:2: rule__MatchMCQConfig__Group__0__Impl rule__MatchMCQConfig__Group__1
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__0__Impl_in_rule__MatchMCQConfig__Group__05574);
            rule__MatchMCQConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__1_in_rule__MatchMCQConfig__Group__05577);
            rule__MatchMCQConfig__Group__1();

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
    // $ANTLR end "rule__MatchMCQConfig__Group__0"


    // $ANTLR start "rule__MatchMCQConfig__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2742:1: rule__MatchMCQConfig__Group__0__Impl : ( '@mcq_config' ) ;
    public final void rule__MatchMCQConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2746:1: ( ( '@mcq_config' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2747:1: ( '@mcq_config' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2747:1: ( '@mcq_config' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2748:1: '@mcq_config'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getMcq_configKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__MatchMCQConfig__Group__0__Impl5605); 
             after(grammarAccess.getMatchMCQConfigAccess().getMcq_configKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__0__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2761:1: rule__MatchMCQConfig__Group__1 : rule__MatchMCQConfig__Group__1__Impl rule__MatchMCQConfig__Group__2 ;
    public final void rule__MatchMCQConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2765:1: ( rule__MatchMCQConfig__Group__1__Impl rule__MatchMCQConfig__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2766:2: rule__MatchMCQConfig__Group__1__Impl rule__MatchMCQConfig__Group__2
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__1__Impl_in_rule__MatchMCQConfig__Group__15636);
            rule__MatchMCQConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__2_in_rule__MatchMCQConfig__Group__15639);
            rule__MatchMCQConfig__Group__2();

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
    // $ANTLR end "rule__MatchMCQConfig__Group__1"


    // $ANTLR start "rule__MatchMCQConfig__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2773:1: rule__MatchMCQConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__MatchMCQConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2777:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2778:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2778:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2779:1: '{'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__MatchMCQConfig__Group__1__Impl5667); 
             after(grammarAccess.getMatchMCQConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__1__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2792:1: rule__MatchMCQConfig__Group__2 : rule__MatchMCQConfig__Group__2__Impl rule__MatchMCQConfig__Group__3 ;
    public final void rule__MatchMCQConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2796:1: ( rule__MatchMCQConfig__Group__2__Impl rule__MatchMCQConfig__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2797:2: rule__MatchMCQConfig__Group__2__Impl rule__MatchMCQConfig__Group__3
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__2__Impl_in_rule__MatchMCQConfig__Group__25698);
            rule__MatchMCQConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__3_in_rule__MatchMCQConfig__Group__25701);
            rule__MatchMCQConfig__Group__3();

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
    // $ANTLR end "rule__MatchMCQConfig__Group__2"


    // $ANTLR start "rule__MatchMCQConfig__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2804:1: rule__MatchMCQConfig__Group__2__Impl : ( '@forwardCaption' ) ;
    public final void rule__MatchMCQConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2808:1: ( ( '@forwardCaption' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2809:1: ( '@forwardCaption' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2809:1: ( '@forwardCaption' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2810:1: '@forwardCaption'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__MatchMCQConfig__Group__2__Impl5729); 
             after(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__2__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2823:1: rule__MatchMCQConfig__Group__3 : rule__MatchMCQConfig__Group__3__Impl rule__MatchMCQConfig__Group__4 ;
    public final void rule__MatchMCQConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2827:1: ( rule__MatchMCQConfig__Group__3__Impl rule__MatchMCQConfig__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2828:2: rule__MatchMCQConfig__Group__3__Impl rule__MatchMCQConfig__Group__4
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__3__Impl_in_rule__MatchMCQConfig__Group__35760);
            rule__MatchMCQConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__4_in_rule__MatchMCQConfig__Group__35763);
            rule__MatchMCQConfig__Group__4();

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
    // $ANTLR end "rule__MatchMCQConfig__Group__3"


    // $ANTLR start "rule__MatchMCQConfig__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2835:1: rule__MatchMCQConfig__Group__3__Impl : ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) ) ;
    public final void rule__MatchMCQConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2839:1: ( ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2840:1: ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2840:1: ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2841:1: ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2842:1: ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2842:2: rule__MatchMCQConfig__ForwardCaptionAssignment_3
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__ForwardCaptionAssignment_3_in_rule__MatchMCQConfig__Group__3__Impl5790);
            rule__MatchMCQConfig__ForwardCaptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__3__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2852:1: rule__MatchMCQConfig__Group__4 : rule__MatchMCQConfig__Group__4__Impl rule__MatchMCQConfig__Group__5 ;
    public final void rule__MatchMCQConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2856:1: ( rule__MatchMCQConfig__Group__4__Impl rule__MatchMCQConfig__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2857:2: rule__MatchMCQConfig__Group__4__Impl rule__MatchMCQConfig__Group__5
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__4__Impl_in_rule__MatchMCQConfig__Group__45820);
            rule__MatchMCQConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__5_in_rule__MatchMCQConfig__Group__45823);
            rule__MatchMCQConfig__Group__5();

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
    // $ANTLR end "rule__MatchMCQConfig__Group__4"


    // $ANTLR start "rule__MatchMCQConfig__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2864:1: rule__MatchMCQConfig__Group__4__Impl : ( ( rule__MatchMCQConfig__Group_4__0 )? ) ;
    public final void rule__MatchMCQConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2868:1: ( ( ( rule__MatchMCQConfig__Group_4__0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2869:1: ( ( rule__MatchMCQConfig__Group_4__0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2869:1: ( ( rule__MatchMCQConfig__Group_4__0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2870:1: ( rule__MatchMCQConfig__Group_4__0 )?
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2871:1: ( rule__MatchMCQConfig__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2871:2: rule__MatchMCQConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MatchMCQConfig__Group_4__0_in_rule__MatchMCQConfig__Group__4__Impl5850);
                    rule__MatchMCQConfig__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchMCQConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__4__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2881:1: rule__MatchMCQConfig__Group__5 : rule__MatchMCQConfig__Group__5__Impl rule__MatchMCQConfig__Group__6 ;
    public final void rule__MatchMCQConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2885:1: ( rule__MatchMCQConfig__Group__5__Impl rule__MatchMCQConfig__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2886:2: rule__MatchMCQConfig__Group__5__Impl rule__MatchMCQConfig__Group__6
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__5__Impl_in_rule__MatchMCQConfig__Group__55881);
            rule__MatchMCQConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__6_in_rule__MatchMCQConfig__Group__55884);
            rule__MatchMCQConfig__Group__6();

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
    // $ANTLR end "rule__MatchMCQConfig__Group__5"


    // $ANTLR start "rule__MatchMCQConfig__Group__5__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2893:1: rule__MatchMCQConfig__Group__5__Impl : ( ( rule__MatchMCQConfig__Group_5__0 )? ) ;
    public final void rule__MatchMCQConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2897:1: ( ( ( rule__MatchMCQConfig__Group_5__0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2898:1: ( ( rule__MatchMCQConfig__Group_5__0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2898:1: ( ( rule__MatchMCQConfig__Group_5__0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2899:1: ( rule__MatchMCQConfig__Group_5__0 )?
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2900:1: ( rule__MatchMCQConfig__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2900:2: rule__MatchMCQConfig__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MatchMCQConfig__Group_5__0_in_rule__MatchMCQConfig__Group__5__Impl5911);
                    rule__MatchMCQConfig__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchMCQConfigAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__5__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2910:1: rule__MatchMCQConfig__Group__6 : rule__MatchMCQConfig__Group__6__Impl rule__MatchMCQConfig__Group__7 ;
    public final void rule__MatchMCQConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2914:1: ( rule__MatchMCQConfig__Group__6__Impl rule__MatchMCQConfig__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2915:2: rule__MatchMCQConfig__Group__6__Impl rule__MatchMCQConfig__Group__7
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__6__Impl_in_rule__MatchMCQConfig__Group__65942);
            rule__MatchMCQConfig__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__7_in_rule__MatchMCQConfig__Group__65945);
            rule__MatchMCQConfig__Group__7();

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
    // $ANTLR end "rule__MatchMCQConfig__Group__6"


    // $ANTLR start "rule__MatchMCQConfig__Group__6__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2922:1: rule__MatchMCQConfig__Group__6__Impl : ( ( rule__MatchMCQConfig__Group_6__0 )? ) ;
    public final void rule__MatchMCQConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2926:1: ( ( ( rule__MatchMCQConfig__Group_6__0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2927:1: ( ( rule__MatchMCQConfig__Group_6__0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2927:1: ( ( rule__MatchMCQConfig__Group_6__0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2928:1: ( rule__MatchMCQConfig__Group_6__0 )?
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2929:1: ( rule__MatchMCQConfig__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2929:2: rule__MatchMCQConfig__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MatchMCQConfig__Group_6__0_in_rule__MatchMCQConfig__Group__6__Impl5972);
                    rule__MatchMCQConfig__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchMCQConfigAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__6__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group__7"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2939:1: rule__MatchMCQConfig__Group__7 : rule__MatchMCQConfig__Group__7__Impl ;
    public final void rule__MatchMCQConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2943:1: ( rule__MatchMCQConfig__Group__7__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2944:2: rule__MatchMCQConfig__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group__7__Impl_in_rule__MatchMCQConfig__Group__76003);
            rule__MatchMCQConfig__Group__7__Impl();

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
    // $ANTLR end "rule__MatchMCQConfig__Group__7"


    // $ANTLR start "rule__MatchMCQConfig__Group__7__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2950:1: rule__MatchMCQConfig__Group__7__Impl : ( '}' ) ;
    public final void rule__MatchMCQConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2954:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2955:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2955:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2956:1: '}'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__MatchMCQConfig__Group__7__Impl6031); 
             after(grammarAccess.getMatchMCQConfigAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group__7__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_4__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2985:1: rule__MatchMCQConfig__Group_4__0 : rule__MatchMCQConfig__Group_4__0__Impl rule__MatchMCQConfig__Group_4__1 ;
    public final void rule__MatchMCQConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2989:1: ( rule__MatchMCQConfig__Group_4__0__Impl rule__MatchMCQConfig__Group_4__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2990:2: rule__MatchMCQConfig__Group_4__0__Impl rule__MatchMCQConfig__Group_4__1
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group_4__0__Impl_in_rule__MatchMCQConfig__Group_4__06078);
            rule__MatchMCQConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group_4__1_in_rule__MatchMCQConfig__Group_4__06081);
            rule__MatchMCQConfig__Group_4__1();

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
    // $ANTLR end "rule__MatchMCQConfig__Group_4__0"


    // $ANTLR start "rule__MatchMCQConfig__Group_4__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:2997:1: rule__MatchMCQConfig__Group_4__0__Impl : ( '@reverseCaption' ) ;
    public final void rule__MatchMCQConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3001:1: ( ( '@reverseCaption' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3002:1: ( '@reverseCaption' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3002:1: ( '@reverseCaption' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3003:1: '@reverseCaption'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__MatchMCQConfig__Group_4__0__Impl6109); 
             after(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_4__0__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_4__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3016:1: rule__MatchMCQConfig__Group_4__1 : rule__MatchMCQConfig__Group_4__1__Impl ;
    public final void rule__MatchMCQConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3020:1: ( rule__MatchMCQConfig__Group_4__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3021:2: rule__MatchMCQConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group_4__1__Impl_in_rule__MatchMCQConfig__Group_4__16140);
            rule__MatchMCQConfig__Group_4__1__Impl();

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
    // $ANTLR end "rule__MatchMCQConfig__Group_4__1"


    // $ANTLR start "rule__MatchMCQConfig__Group_4__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3027:1: rule__MatchMCQConfig__Group_4__1__Impl : ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) ) ;
    public final void rule__MatchMCQConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3031:1: ( ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3032:1: ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3032:1: ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3033:1: ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionAssignment_4_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3034:1: ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3034:2: rule__MatchMCQConfig__ReverseCaptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__ReverseCaptionAssignment_4_1_in_rule__MatchMCQConfig__Group_4__1__Impl6167);
            rule__MatchMCQConfig__ReverseCaptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_4__1__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_5__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3048:1: rule__MatchMCQConfig__Group_5__0 : rule__MatchMCQConfig__Group_5__0__Impl rule__MatchMCQConfig__Group_5__1 ;
    public final void rule__MatchMCQConfig__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3052:1: ( rule__MatchMCQConfig__Group_5__0__Impl rule__MatchMCQConfig__Group_5__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3053:2: rule__MatchMCQConfig__Group_5__0__Impl rule__MatchMCQConfig__Group_5__1
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group_5__0__Impl_in_rule__MatchMCQConfig__Group_5__06201);
            rule__MatchMCQConfig__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group_5__1_in_rule__MatchMCQConfig__Group_5__06204);
            rule__MatchMCQConfig__Group_5__1();

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
    // $ANTLR end "rule__MatchMCQConfig__Group_5__0"


    // $ANTLR start "rule__MatchMCQConfig__Group_5__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3060:1: rule__MatchMCQConfig__Group_5__0__Impl : ( '@numOptionsToShow' ) ;
    public final void rule__MatchMCQConfig__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3064:1: ( ( '@numOptionsToShow' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3065:1: ( '@numOptionsToShow' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3065:1: ( '@numOptionsToShow' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3066:1: '@numOptionsToShow'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowKeyword_5_0()); 
            match(input,29,FOLLOW_29_in_rule__MatchMCQConfig__Group_5__0__Impl6232); 
             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_5__0__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_5__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3079:1: rule__MatchMCQConfig__Group_5__1 : rule__MatchMCQConfig__Group_5__1__Impl ;
    public final void rule__MatchMCQConfig__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3083:1: ( rule__MatchMCQConfig__Group_5__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3084:2: rule__MatchMCQConfig__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group_5__1__Impl_in_rule__MatchMCQConfig__Group_5__16263);
            rule__MatchMCQConfig__Group_5__1__Impl();

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
    // $ANTLR end "rule__MatchMCQConfig__Group_5__1"


    // $ANTLR start "rule__MatchMCQConfig__Group_5__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3090:1: rule__MatchMCQConfig__Group_5__1__Impl : ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) ) ;
    public final void rule__MatchMCQConfig__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3094:1: ( ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3095:1: ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3095:1: ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3096:1: ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowAssignment_5_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3097:1: ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3097:2: rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1_in_rule__MatchMCQConfig__Group_5__1__Impl6290);
            rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_5__1__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_6__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3111:1: rule__MatchMCQConfig__Group_6__0 : rule__MatchMCQConfig__Group_6__0__Impl rule__MatchMCQConfig__Group_6__1 ;
    public final void rule__MatchMCQConfig__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3115:1: ( rule__MatchMCQConfig__Group_6__0__Impl rule__MatchMCQConfig__Group_6__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3116:2: rule__MatchMCQConfig__Group_6__0__Impl rule__MatchMCQConfig__Group_6__1
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group_6__0__Impl_in_rule__MatchMCQConfig__Group_6__06324);
            rule__MatchMCQConfig__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatchMCQConfig__Group_6__1_in_rule__MatchMCQConfig__Group_6__06327);
            rule__MatchMCQConfig__Group_6__1();

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
    // $ANTLR end "rule__MatchMCQConfig__Group_6__0"


    // $ANTLR start "rule__MatchMCQConfig__Group_6__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3123:1: rule__MatchMCQConfig__Group_6__0__Impl : ( '@numOptionsPerRow' ) ;
    public final void rule__MatchMCQConfig__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3127:1: ( ( '@numOptionsPerRow' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3128:1: ( '@numOptionsPerRow' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3128:1: ( '@numOptionsPerRow' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3129:1: '@numOptionsPerRow'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowKeyword_6_0()); 
            match(input,30,FOLLOW_30_in_rule__MatchMCQConfig__Group_6__0__Impl6355); 
             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_6__0__Impl"


    // $ANTLR start "rule__MatchMCQConfig__Group_6__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3142:1: rule__MatchMCQConfig__Group_6__1 : rule__MatchMCQConfig__Group_6__1__Impl ;
    public final void rule__MatchMCQConfig__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3146:1: ( rule__MatchMCQConfig__Group_6__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3147:2: rule__MatchMCQConfig__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__Group_6__1__Impl_in_rule__MatchMCQConfig__Group_6__16386);
            rule__MatchMCQConfig__Group_6__1__Impl();

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
    // $ANTLR end "rule__MatchMCQConfig__Group_6__1"


    // $ANTLR start "rule__MatchMCQConfig__Group_6__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3153:1: rule__MatchMCQConfig__Group_6__1__Impl : ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) ) ;
    public final void rule__MatchMCQConfig__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3157:1: ( ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3158:1: ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3158:1: ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3159:1: ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowAssignment_6_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3160:1: ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3160:2: rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1
            {
            pushFollow(FOLLOW_rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1_in_rule__MatchMCQConfig__Group_6__1__Impl6413);
            rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__Group_6__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3174:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3178:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3179:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__06447);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__06450);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3186:1: rule__Event__Group__0__Impl : ( '@event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3190:1: ( ( '@event' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3191:1: ( '@event' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3191:1: ( '@event' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3192:1: '@event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Event__Group__0__Impl6478); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3205:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3209:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3210:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__16509);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__16512);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3217:1: rule__Event__Group__1__Impl : ( ( rule__Event__HideFromViewAssignment_1 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3221:1: ( ( ( rule__Event__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3222:1: ( ( rule__Event__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3222:1: ( ( rule__Event__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3223:1: ( rule__Event__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getEventAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3224:1: ( rule__Event__HideFromViewAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3224:2: rule__Event__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Event__HideFromViewAssignment_1_in_rule__Event__Group__1__Impl6539);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3234:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3238:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3239:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__26570);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__3_in_rule__Event__Group__26573);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3246:1: rule__Event__Group__2__Impl : ( ( rule__Event__EventAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3250:1: ( ( ( rule__Event__EventAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3251:1: ( ( rule__Event__EventAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3251:1: ( ( rule__Event__EventAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3252:1: ( rule__Event__EventAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getEventAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3253:1: ( rule__Event__EventAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3253:2: rule__Event__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Event__EventAssignment_2_in_rule__Event__Group__2__Impl6600);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3263:1: rule__Event__Group__3 : rule__Event__Group__3__Impl ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3267:1: ( rule__Event__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3268:2: rule__Event__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__36630);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3274:1: rule__Event__Group__3__Impl : ( ( rule__Event__TimeAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3278:1: ( ( ( rule__Event__TimeAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3279:1: ( ( rule__Event__TimeAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3279:1: ( ( rule__Event__TimeAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3280:1: ( rule__Event__TimeAssignment_3 )
            {
             before(grammarAccess.getEventAccess().getTimeAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3281:1: ( rule__Event__TimeAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3281:2: rule__Event__TimeAssignment_3
            {
            pushFollow(FOLLOW_rule__Event__TimeAssignment_3_in_rule__Event__Group__3__Impl6657);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3299:1: rule__TrueFalse__Group__0 : rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 ;
    public final void rule__TrueFalse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3303:1: ( rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3304:2: rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__0__Impl_in_rule__TrueFalse__Group__06695);
            rule__TrueFalse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__1_in_rule__TrueFalse__Group__06698);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3311:1: rule__TrueFalse__Group__0__Impl : ( '@true_false' ) ;
    public final void rule__TrueFalse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3315:1: ( ( '@true_false' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3316:1: ( '@true_false' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3316:1: ( '@true_false' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3317:1: '@true_false'
            {
             before(grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__TrueFalse__Group__0__Impl6726); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3330:1: rule__TrueFalse__Group__1 : rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 ;
    public final void rule__TrueFalse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3334:1: ( rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3335:2: rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__1__Impl_in_rule__TrueFalse__Group__16757);
            rule__TrueFalse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__2_in_rule__TrueFalse__Group__16760);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3342:1: rule__TrueFalse__Group__1__Impl : ( ( rule__TrueFalse__HideFromViewAssignment_1 )? ) ;
    public final void rule__TrueFalse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3346:1: ( ( ( rule__TrueFalse__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3347:1: ( ( rule__TrueFalse__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3347:1: ( ( rule__TrueFalse__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3348:1: ( rule__TrueFalse__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3349:1: ( rule__TrueFalse__HideFromViewAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3349:2: rule__TrueFalse__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TrueFalse__HideFromViewAssignment_1_in_rule__TrueFalse__Group__1__Impl6787);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3359:1: rule__TrueFalse__Group__2 : rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 ;
    public final void rule__TrueFalse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3363:1: ( rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3364:2: rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__2__Impl_in_rule__TrueFalse__Group__26818);
            rule__TrueFalse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__3_in_rule__TrueFalse__Group__26821);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3371:1: rule__TrueFalse__Group__2__Impl : ( ( rule__TrueFalse__StatementAssignment_2 ) ) ;
    public final void rule__TrueFalse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3375:1: ( ( ( rule__TrueFalse__StatementAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3376:1: ( ( rule__TrueFalse__StatementAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3376:1: ( ( rule__TrueFalse__StatementAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3377:1: ( rule__TrueFalse__StatementAssignment_2 )
            {
             before(grammarAccess.getTrueFalseAccess().getStatementAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3378:1: ( rule__TrueFalse__StatementAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3378:2: rule__TrueFalse__StatementAssignment_2
            {
            pushFollow(FOLLOW_rule__TrueFalse__StatementAssignment_2_in_rule__TrueFalse__Group__2__Impl6848);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3388:1: rule__TrueFalse__Group__3 : rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4 ;
    public final void rule__TrueFalse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3392:1: ( rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3393:2: rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__3__Impl_in_rule__TrueFalse__Group__36878);
            rule__TrueFalse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrueFalse__Group__4_in_rule__TrueFalse__Group__36881);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3400:1: rule__TrueFalse__Group__3__Impl : ( ( rule__TrueFalse__TruthValueAssignment_3 ) ) ;
    public final void rule__TrueFalse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3404:1: ( ( ( rule__TrueFalse__TruthValueAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3405:1: ( ( rule__TrueFalse__TruthValueAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3405:1: ( ( rule__TrueFalse__TruthValueAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3406:1: ( rule__TrueFalse__TruthValueAssignment_3 )
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3407:1: ( rule__TrueFalse__TruthValueAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3407:2: rule__TrueFalse__TruthValueAssignment_3
            {
            pushFollow(FOLLOW_rule__TrueFalse__TruthValueAssignment_3_in_rule__TrueFalse__Group__3__Impl6908);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3417:1: rule__TrueFalse__Group__4 : rule__TrueFalse__Group__4__Impl ;
    public final void rule__TrueFalse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3421:1: ( rule__TrueFalse__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3422:2: rule__TrueFalse__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TrueFalse__Group__4__Impl_in_rule__TrueFalse__Group__46938);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3428:1: rule__TrueFalse__Group__4__Impl : ( ( rule__TrueFalse__JustificationAssignment_4 )? ) ;
    public final void rule__TrueFalse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3432:1: ( ( ( rule__TrueFalse__JustificationAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3433:1: ( ( rule__TrueFalse__JustificationAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3433:1: ( ( rule__TrueFalse__JustificationAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3434:1: ( rule__TrueFalse__JustificationAssignment_4 )?
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3435:1: ( rule__TrueFalse__JustificationAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3435:2: rule__TrueFalse__JustificationAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TrueFalse__JustificationAssignment_4_in_rule__TrueFalse__Group__4__Impl6965);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3455:1: rule__ChemEquation__Group__0 : rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 ;
    public final void rule__ChemEquation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3459:1: ( rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3460:2: rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__0__Impl_in_rule__ChemEquation__Group__07006);
            rule__ChemEquation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__1_in_rule__ChemEquation__Group__07009);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3467:1: rule__ChemEquation__Group__0__Impl : ( '@chem_equation' ) ;
    public final void rule__ChemEquation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3471:1: ( ( '@chem_equation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3472:1: ( '@chem_equation' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3472:1: ( '@chem_equation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3473:1: '@chem_equation'
            {
             before(grammarAccess.getChemEquationAccess().getChem_equationKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ChemEquation__Group__0__Impl7037); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3486:1: rule__ChemEquation__Group__1 : rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 ;
    public final void rule__ChemEquation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3490:1: ( rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3491:2: rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__1__Impl_in_rule__ChemEquation__Group__17068);
            rule__ChemEquation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__2_in_rule__ChemEquation__Group__17071);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3498:1: rule__ChemEquation__Group__1__Impl : ( ( rule__ChemEquation__HideFromViewAssignment_1 )? ) ;
    public final void rule__ChemEquation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3502:1: ( ( ( rule__ChemEquation__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3503:1: ( ( rule__ChemEquation__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3503:1: ( ( rule__ChemEquation__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3504:1: ( rule__ChemEquation__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3505:1: ( rule__ChemEquation__HideFromViewAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3505:2: rule__ChemEquation__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ChemEquation__HideFromViewAssignment_1_in_rule__ChemEquation__Group__1__Impl7098);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3515:1: rule__ChemEquation__Group__2 : rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 ;
    public final void rule__ChemEquation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3519:1: ( rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3520:2: rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__2__Impl_in_rule__ChemEquation__Group__27129);
            rule__ChemEquation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__3_in_rule__ChemEquation__Group__27132);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3527:1: rule__ChemEquation__Group__2__Impl : ( ( rule__ChemEquation__DescriptionAssignment_2 )? ) ;
    public final void rule__ChemEquation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3531:1: ( ( ( rule__ChemEquation__DescriptionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3532:1: ( ( rule__ChemEquation__DescriptionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3532:1: ( ( rule__ChemEquation__DescriptionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3533:1: ( rule__ChemEquation__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3534:1: ( rule__ChemEquation__DescriptionAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3534:2: rule__ChemEquation__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ChemEquation__DescriptionAssignment_2_in_rule__ChemEquation__Group__2__Impl7159);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3544:1: rule__ChemEquation__Group__3 : rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 ;
    public final void rule__ChemEquation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3548:1: ( rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3549:2: rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__3__Impl_in_rule__ChemEquation__Group__37190);
            rule__ChemEquation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__4_in_rule__ChemEquation__Group__37193);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3556:1: rule__ChemEquation__Group__3__Impl : ( '{' ) ;
    public final void rule__ChemEquation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3560:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3561:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3561:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3562:1: '{'
            {
             before(grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ChemEquation__Group__3__Impl7221); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3575:1: rule__ChemEquation__Group__4 : rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 ;
    public final void rule__ChemEquation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3579:1: ( rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3580:2: rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__4__Impl_in_rule__ChemEquation__Group__47252);
            rule__ChemEquation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__5_in_rule__ChemEquation__Group__47255);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3587:1: rule__ChemEquation__Group__4__Impl : ( ( rule__ChemEquation__ReactantsAssignment_4 ) ) ;
    public final void rule__ChemEquation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3591:1: ( ( ( rule__ChemEquation__ReactantsAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3592:1: ( ( rule__ChemEquation__ReactantsAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3592:1: ( ( rule__ChemEquation__ReactantsAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3593:1: ( rule__ChemEquation__ReactantsAssignment_4 )
            {
             before(grammarAccess.getChemEquationAccess().getReactantsAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3594:1: ( rule__ChemEquation__ReactantsAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3594:2: rule__ChemEquation__ReactantsAssignment_4
            {
            pushFollow(FOLLOW_rule__ChemEquation__ReactantsAssignment_4_in_rule__ChemEquation__Group__4__Impl7282);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3604:1: rule__ChemEquation__Group__5 : rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 ;
    public final void rule__ChemEquation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3608:1: ( rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3609:2: rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__5__Impl_in_rule__ChemEquation__Group__57312);
            rule__ChemEquation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__6_in_rule__ChemEquation__Group__57315);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3616:1: rule__ChemEquation__Group__5__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3620:1: ( ( '>' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3621:1: ( '>' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3621:1: ( '>' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3622:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__ChemEquation__Group__5__Impl7343); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3635:1: rule__ChemEquation__Group__6 : rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 ;
    public final void rule__ChemEquation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3639:1: ( rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3640:2: rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__6__Impl_in_rule__ChemEquation__Group__67374);
            rule__ChemEquation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__7_in_rule__ChemEquation__Group__67377);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3647:1: rule__ChemEquation__Group__6__Impl : ( ( rule__ChemEquation__ProducesAssignment_6 )? ) ;
    public final void rule__ChemEquation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3651:1: ( ( ( rule__ChemEquation__ProducesAssignment_6 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3652:1: ( ( rule__ChemEquation__ProducesAssignment_6 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3652:1: ( ( rule__ChemEquation__ProducesAssignment_6 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3653:1: ( rule__ChemEquation__ProducesAssignment_6 )?
            {
             before(grammarAccess.getChemEquationAccess().getProducesAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3654:1: ( rule__ChemEquation__ProducesAssignment_6 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3654:2: rule__ChemEquation__ProducesAssignment_6
                    {
                    pushFollow(FOLLOW_rule__ChemEquation__ProducesAssignment_6_in_rule__ChemEquation__Group__6__Impl7404);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3664:1: rule__ChemEquation__Group__7 : rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 ;
    public final void rule__ChemEquation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3668:1: ( rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3669:2: rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__7__Impl_in_rule__ChemEquation__Group__77435);
            rule__ChemEquation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__8_in_rule__ChemEquation__Group__77438);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3676:1: rule__ChemEquation__Group__7__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3680:1: ( ( '>' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3681:1: ( '>' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3681:1: ( '>' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3682:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__ChemEquation__Group__7__Impl7466); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3695:1: rule__ChemEquation__Group__8 : rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9 ;
    public final void rule__ChemEquation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3699:1: ( rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3700:2: rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__8__Impl_in_rule__ChemEquation__Group__87497);
            rule__ChemEquation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemEquation__Group__9_in_rule__ChemEquation__Group__87500);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3707:1: rule__ChemEquation__Group__8__Impl : ( ( rule__ChemEquation__ProductsAssignment_8 ) ) ;
    public final void rule__ChemEquation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3711:1: ( ( ( rule__ChemEquation__ProductsAssignment_8 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3712:1: ( ( rule__ChemEquation__ProductsAssignment_8 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3712:1: ( ( rule__ChemEquation__ProductsAssignment_8 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3713:1: ( rule__ChemEquation__ProductsAssignment_8 )
            {
             before(grammarAccess.getChemEquationAccess().getProductsAssignment_8()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3714:1: ( rule__ChemEquation__ProductsAssignment_8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3714:2: rule__ChemEquation__ProductsAssignment_8
            {
            pushFollow(FOLLOW_rule__ChemEquation__ProductsAssignment_8_in_rule__ChemEquation__Group__8__Impl7527);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3724:1: rule__ChemEquation__Group__9 : rule__ChemEquation__Group__9__Impl ;
    public final void rule__ChemEquation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3728:1: ( rule__ChemEquation__Group__9__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3729:2: rule__ChemEquation__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__ChemEquation__Group__9__Impl_in_rule__ChemEquation__Group__97557);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3735:1: rule__ChemEquation__Group__9__Impl : ( '}' ) ;
    public final void rule__ChemEquation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3739:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3740:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3740:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3741:1: '}'
            {
             before(grammarAccess.getChemEquationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_24_in_rule__ChemEquation__Group__9__Impl7585); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3774:1: rule__ChemCompound__Group__0 : rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 ;
    public final void rule__ChemCompound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3778:1: ( rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3779:2: rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__0__Impl_in_rule__ChemCompound__Group__07636);
            rule__ChemCompound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__1_in_rule__ChemCompound__Group__07639);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3786:1: rule__ChemCompound__Group__0__Impl : ( '@chem_compound' ) ;
    public final void rule__ChemCompound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3790:1: ( ( '@chem_compound' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3791:1: ( '@chem_compound' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3791:1: ( '@chem_compound' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3792:1: '@chem_compound'
            {
             before(grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ChemCompound__Group__0__Impl7667); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3805:1: rule__ChemCompound__Group__1 : rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 ;
    public final void rule__ChemCompound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3809:1: ( rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3810:2: rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__1__Impl_in_rule__ChemCompound__Group__17698);
            rule__ChemCompound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__2_in_rule__ChemCompound__Group__17701);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3817:1: rule__ChemCompound__Group__1__Impl : ( ( rule__ChemCompound__HideFromViewAssignment_1 )? ) ;
    public final void rule__ChemCompound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3821:1: ( ( ( rule__ChemCompound__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3822:1: ( ( rule__ChemCompound__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3822:1: ( ( rule__ChemCompound__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3823:1: ( rule__ChemCompound__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3824:1: ( rule__ChemCompound__HideFromViewAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3824:2: rule__ChemCompound__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ChemCompound__HideFromViewAssignment_1_in_rule__ChemCompound__Group__1__Impl7728);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3834:1: rule__ChemCompound__Group__2 : rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 ;
    public final void rule__ChemCompound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3838:1: ( rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3839:2: rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__2__Impl_in_rule__ChemCompound__Group__27759);
            rule__ChemCompound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__3_in_rule__ChemCompound__Group__27762);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3846:1: rule__ChemCompound__Group__2__Impl : ( ( rule__ChemCompound__SymbolAssignment_2 ) ) ;
    public final void rule__ChemCompound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3850:1: ( ( ( rule__ChemCompound__SymbolAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3851:1: ( ( rule__ChemCompound__SymbolAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3851:1: ( ( rule__ChemCompound__SymbolAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3852:1: ( rule__ChemCompound__SymbolAssignment_2 )
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3853:1: ( rule__ChemCompound__SymbolAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3853:2: rule__ChemCompound__SymbolAssignment_2
            {
            pushFollow(FOLLOW_rule__ChemCompound__SymbolAssignment_2_in_rule__ChemCompound__Group__2__Impl7789);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3863:1: rule__ChemCompound__Group__3 : rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4 ;
    public final void rule__ChemCompound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3867:1: ( rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3868:2: rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__3__Impl_in_rule__ChemCompound__Group__37819);
            rule__ChemCompound__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChemCompound__Group__4_in_rule__ChemCompound__Group__37822);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3875:1: rule__ChemCompound__Group__3__Impl : ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) ) ;
    public final void rule__ChemCompound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3879:1: ( ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3880:1: ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3880:1: ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3881:1: ( rule__ChemCompound__ChemicalNameAssignment_3 )
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameAssignment_3()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3882:1: ( rule__ChemCompound__ChemicalNameAssignment_3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3882:2: rule__ChemCompound__ChemicalNameAssignment_3
            {
            pushFollow(FOLLOW_rule__ChemCompound__ChemicalNameAssignment_3_in_rule__ChemCompound__Group__3__Impl7849);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3892:1: rule__ChemCompound__Group__4 : rule__ChemCompound__Group__4__Impl ;
    public final void rule__ChemCompound__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3896:1: ( rule__ChemCompound__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3897:2: rule__ChemCompound__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ChemCompound__Group__4__Impl_in_rule__ChemCompound__Group__47879);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3903:1: rule__ChemCompound__Group__4__Impl : ( ( rule__ChemCompound__CommonNameAssignment_4 )? ) ;
    public final void rule__ChemCompound__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3907:1: ( ( ( rule__ChemCompound__CommonNameAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3908:1: ( ( rule__ChemCompound__CommonNameAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3908:1: ( ( rule__ChemCompound__CommonNameAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3909:1: ( rule__ChemCompound__CommonNameAssignment_4 )?
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3910:1: ( rule__ChemCompound__CommonNameAssignment_4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3910:2: rule__ChemCompound__CommonNameAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ChemCompound__CommonNameAssignment_4_in_rule__ChemCompound__Group__4__Impl7906);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3930:1: rule__Spellbee__Group__0 : rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 ;
    public final void rule__Spellbee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3934:1: ( rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3935:2: rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__0__Impl_in_rule__Spellbee__Group__07947);
            rule__Spellbee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spellbee__Group__1_in_rule__Spellbee__Group__07950);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3942:1: rule__Spellbee__Group__0__Impl : ( '@spellbee' ) ;
    public final void rule__Spellbee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3946:1: ( ( '@spellbee' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3947:1: ( '@spellbee' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3947:1: ( '@spellbee' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3948:1: '@spellbee'
            {
             before(grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Spellbee__Group__0__Impl7978); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3961:1: rule__Spellbee__Group__1 : rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2 ;
    public final void rule__Spellbee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3965:1: ( rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3966:2: rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__1__Impl_in_rule__Spellbee__Group__18009);
            rule__Spellbee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spellbee__Group__2_in_rule__Spellbee__Group__18012);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3973:1: rule__Spellbee__Group__1__Impl : ( ( rule__Spellbee__HideFromViewAssignment_1 )? ) ;
    public final void rule__Spellbee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3977:1: ( ( ( rule__Spellbee__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3978:1: ( ( rule__Spellbee__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3978:1: ( ( rule__Spellbee__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3979:1: ( rule__Spellbee__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3980:1: ( rule__Spellbee__HideFromViewAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3980:2: rule__Spellbee__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Spellbee__HideFromViewAssignment_1_in_rule__Spellbee__Group__1__Impl8039);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3990:1: rule__Spellbee__Group__2 : rule__Spellbee__Group__2__Impl ;
    public final void rule__Spellbee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3994:1: ( rule__Spellbee__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:3995:2: rule__Spellbee__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Spellbee__Group__2__Impl_in_rule__Spellbee__Group__28070);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4001:1: rule__Spellbee__Group__2__Impl : ( ( rule__Spellbee__WordAssignment_2 ) ) ;
    public final void rule__Spellbee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4005:1: ( ( ( rule__Spellbee__WordAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4006:1: ( ( rule__Spellbee__WordAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4006:1: ( ( rule__Spellbee__WordAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4007:1: ( rule__Spellbee__WordAssignment_2 )
            {
             before(grammarAccess.getSpellbeeAccess().getWordAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4008:1: ( rule__Spellbee__WordAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4008:2: rule__Spellbee__WordAssignment_2
            {
            pushFollow(FOLLOW_rule__Spellbee__WordAssignment_2_in_rule__Spellbee__Group__2__Impl8097);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4024:1: rule__ImageLabel__Group__0 : rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 ;
    public final void rule__ImageLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4028:1: ( rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4029:2: rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__0__Impl_in_rule__ImageLabel__Group__08133);
            rule__ImageLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__1_in_rule__ImageLabel__Group__08136);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4036:1: rule__ImageLabel__Group__0__Impl : ( '@image_label' ) ;
    public final void rule__ImageLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4040:1: ( ( '@image_label' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4041:1: ( '@image_label' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4041:1: ( '@image_label' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4042:1: '@image_label'
            {
             before(grammarAccess.getImageLabelAccess().getImage_labelKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ImageLabel__Group__0__Impl8164); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4055:1: rule__ImageLabel__Group__1 : rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 ;
    public final void rule__ImageLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4059:1: ( rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4060:2: rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__1__Impl_in_rule__ImageLabel__Group__18195);
            rule__ImageLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__2_in_rule__ImageLabel__Group__18198);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4067:1: rule__ImageLabel__Group__1__Impl : ( ( rule__ImageLabel__HideFromViewAssignment_1 )? ) ;
    public final void rule__ImageLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4071:1: ( ( ( rule__ImageLabel__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4072:1: ( ( rule__ImageLabel__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4072:1: ( ( rule__ImageLabel__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4073:1: ( rule__ImageLabel__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4074:1: ( rule__ImageLabel__HideFromViewAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==52) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4074:2: rule__ImageLabel__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ImageLabel__HideFromViewAssignment_1_in_rule__ImageLabel__Group__1__Impl8225);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4084:1: rule__ImageLabel__Group__2 : rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 ;
    public final void rule__ImageLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4088:1: ( rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4089:2: rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__2__Impl_in_rule__ImageLabel__Group__28256);
            rule__ImageLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__3_in_rule__ImageLabel__Group__28259);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4096:1: rule__ImageLabel__Group__2__Impl : ( ( rule__ImageLabel__CaptionAssignment_2 )? ) ;
    public final void rule__ImageLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4100:1: ( ( ( rule__ImageLabel__CaptionAssignment_2 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4101:1: ( ( rule__ImageLabel__CaptionAssignment_2 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4101:1: ( ( rule__ImageLabel__CaptionAssignment_2 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4102:1: ( rule__ImageLabel__CaptionAssignment_2 )?
            {
             before(grammarAccess.getImageLabelAccess().getCaptionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4103:1: ( rule__ImageLabel__CaptionAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4103:2: rule__ImageLabel__CaptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ImageLabel__CaptionAssignment_2_in_rule__ImageLabel__Group__2__Impl8286);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4113:1: rule__ImageLabel__Group__3 : rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 ;
    public final void rule__ImageLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4117:1: ( rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4118:2: rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__3__Impl_in_rule__ImageLabel__Group__38317);
            rule__ImageLabel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__4_in_rule__ImageLabel__Group__38320);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4125:1: rule__ImageLabel__Group__3__Impl : ( '{' ) ;
    public final void rule__ImageLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4129:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4130:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4130:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4131:1: '{'
            {
             before(grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ImageLabel__Group__3__Impl8348); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4144:1: rule__ImageLabel__Group__4 : rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 ;
    public final void rule__ImageLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4148:1: ( rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4149:2: rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__4__Impl_in_rule__ImageLabel__Group__48379);
            rule__ImageLabel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__5_in_rule__ImageLabel__Group__48382);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4156:1: rule__ImageLabel__Group__4__Impl : ( 'imageName' ) ;
    public final void rule__ImageLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4160:1: ( ( 'imageName' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4161:1: ( 'imageName' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4161:1: ( 'imageName' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4162:1: 'imageName'
            {
             before(grammarAccess.getImageLabelAccess().getImageNameKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__ImageLabel__Group__4__Impl8410); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4175:1: rule__ImageLabel__Group__5 : rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 ;
    public final void rule__ImageLabel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4179:1: ( rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4180:2: rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__5__Impl_in_rule__ImageLabel__Group__58441);
            rule__ImageLabel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__6_in_rule__ImageLabel__Group__58444);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4187:1: rule__ImageLabel__Group__5__Impl : ( ( rule__ImageLabel__ImageNameAssignment_5 ) ) ;
    public final void rule__ImageLabel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4191:1: ( ( ( rule__ImageLabel__ImageNameAssignment_5 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4192:1: ( ( rule__ImageLabel__ImageNameAssignment_5 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4192:1: ( ( rule__ImageLabel__ImageNameAssignment_5 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4193:1: ( rule__ImageLabel__ImageNameAssignment_5 )
            {
             before(grammarAccess.getImageLabelAccess().getImageNameAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4194:1: ( rule__ImageLabel__ImageNameAssignment_5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4194:2: rule__ImageLabel__ImageNameAssignment_5
            {
            pushFollow(FOLLOW_rule__ImageLabel__ImageNameAssignment_5_in_rule__ImageLabel__Group__5__Impl8471);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4204:1: rule__ImageLabel__Group__6 : rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 ;
    public final void rule__ImageLabel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4208:1: ( rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4209:2: rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__6__Impl_in_rule__ImageLabel__Group__68501);
            rule__ImageLabel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__7_in_rule__ImageLabel__Group__68504);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4216:1: rule__ImageLabel__Group__6__Impl : ( ( rule__ImageLabel__HotspotsAssignment_6 ) ) ;
    public final void rule__ImageLabel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4220:1: ( ( ( rule__ImageLabel__HotspotsAssignment_6 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4221:1: ( ( rule__ImageLabel__HotspotsAssignment_6 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4221:1: ( ( rule__ImageLabel__HotspotsAssignment_6 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4222:1: ( rule__ImageLabel__HotspotsAssignment_6 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4223:1: ( rule__ImageLabel__HotspotsAssignment_6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4223:2: rule__ImageLabel__HotspotsAssignment_6
            {
            pushFollow(FOLLOW_rule__ImageLabel__HotspotsAssignment_6_in_rule__ImageLabel__Group__6__Impl8531);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4233:1: rule__ImageLabel__Group__7 : rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8 ;
    public final void rule__ImageLabel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4237:1: ( rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4238:2: rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__7__Impl_in_rule__ImageLabel__Group__78561);
            rule__ImageLabel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group__8_in_rule__ImageLabel__Group__78564);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4245:1: rule__ImageLabel__Group__7__Impl : ( ( rule__ImageLabel__Group_7__0 )* ) ;
    public final void rule__ImageLabel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4249:1: ( ( ( rule__ImageLabel__Group_7__0 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4250:1: ( ( rule__ImageLabel__Group_7__0 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4250:1: ( ( rule__ImageLabel__Group_7__0 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4251:1: ( rule__ImageLabel__Group_7__0 )*
            {
             before(grammarAccess.getImageLabelAccess().getGroup_7()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4252:1: ( rule__ImageLabel__Group_7__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==39) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4252:2: rule__ImageLabel__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__ImageLabel__Group_7__0_in_rule__ImageLabel__Group__7__Impl8591);
            	    rule__ImageLabel__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4262:1: rule__ImageLabel__Group__8 : rule__ImageLabel__Group__8__Impl ;
    public final void rule__ImageLabel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4266:1: ( rule__ImageLabel__Group__8__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4267:2: rule__ImageLabel__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group__8__Impl_in_rule__ImageLabel__Group__88622);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4273:1: rule__ImageLabel__Group__8__Impl : ( '}' ) ;
    public final void rule__ImageLabel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4277:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4278:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4278:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4279:1: '}'
            {
             before(grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__ImageLabel__Group__8__Impl8650); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4310:1: rule__ImageLabel__Group_7__0 : rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1 ;
    public final void rule__ImageLabel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4314:1: ( rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4315:2: rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group_7__0__Impl_in_rule__ImageLabel__Group_7__08699);
            rule__ImageLabel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageLabel__Group_7__1_in_rule__ImageLabel__Group_7__08702);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4322:1: rule__ImageLabel__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ImageLabel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4326:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4327:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4327:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4328:1: ','
            {
             before(grammarAccess.getImageLabelAccess().getCommaKeyword_7_0()); 
            match(input,39,FOLLOW_39_in_rule__ImageLabel__Group_7__0__Impl8730); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4341:1: rule__ImageLabel__Group_7__1 : rule__ImageLabel__Group_7__1__Impl ;
    public final void rule__ImageLabel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4345:1: ( rule__ImageLabel__Group_7__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4346:2: rule__ImageLabel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ImageLabel__Group_7__1__Impl_in_rule__ImageLabel__Group_7__18761);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4352:1: rule__ImageLabel__Group_7__1__Impl : ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) ) ;
    public final void rule__ImageLabel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4356:1: ( ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4357:1: ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4357:1: ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4358:1: ( rule__ImageLabel__HotspotsAssignment_7_1 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_7_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4359:1: ( rule__ImageLabel__HotspotsAssignment_7_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4359:2: rule__ImageLabel__HotspotsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__ImageLabel__HotspotsAssignment_7_1_in_rule__ImageLabel__Group_7__1__Impl8788);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4373:1: rule__HotSpot__Group__0 : rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 ;
    public final void rule__HotSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4377:1: ( rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4378:2: rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__0__Impl_in_rule__HotSpot__Group__08822);
            rule__HotSpot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__1_in_rule__HotSpot__Group__08825);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4385:1: rule__HotSpot__Group__0__Impl : ( ( rule__HotSpot__XAssignment_0 ) ) ;
    public final void rule__HotSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4389:1: ( ( ( rule__HotSpot__XAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4390:1: ( ( rule__HotSpot__XAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4390:1: ( ( rule__HotSpot__XAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4391:1: ( rule__HotSpot__XAssignment_0 )
            {
             before(grammarAccess.getHotSpotAccess().getXAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4392:1: ( rule__HotSpot__XAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4392:2: rule__HotSpot__XAssignment_0
            {
            pushFollow(FOLLOW_rule__HotSpot__XAssignment_0_in_rule__HotSpot__Group__0__Impl8852);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4402:1: rule__HotSpot__Group__1 : rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 ;
    public final void rule__HotSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4406:1: ( rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4407:2: rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__1__Impl_in_rule__HotSpot__Group__18882);
            rule__HotSpot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__2_in_rule__HotSpot__Group__18885);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4414:1: rule__HotSpot__Group__1__Impl : ( ',' ) ;
    public final void rule__HotSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4418:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4419:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4419:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4420:1: ','
            {
             before(grammarAccess.getHotSpotAccess().getCommaKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__HotSpot__Group__1__Impl8913); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4433:1: rule__HotSpot__Group__2 : rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 ;
    public final void rule__HotSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4437:1: ( rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4438:2: rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__2__Impl_in_rule__HotSpot__Group__28944);
            rule__HotSpot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__3_in_rule__HotSpot__Group__28947);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4445:1: rule__HotSpot__Group__2__Impl : ( ( rule__HotSpot__YAssignment_2 ) ) ;
    public final void rule__HotSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4449:1: ( ( ( rule__HotSpot__YAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4450:1: ( ( rule__HotSpot__YAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4450:1: ( ( rule__HotSpot__YAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4451:1: ( rule__HotSpot__YAssignment_2 )
            {
             before(grammarAccess.getHotSpotAccess().getYAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4452:1: ( rule__HotSpot__YAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4452:2: rule__HotSpot__YAssignment_2
            {
            pushFollow(FOLLOW_rule__HotSpot__YAssignment_2_in_rule__HotSpot__Group__2__Impl8974);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4462:1: rule__HotSpot__Group__3 : rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 ;
    public final void rule__HotSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4466:1: ( rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4467:2: rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__3__Impl_in_rule__HotSpot__Group__39004);
            rule__HotSpot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HotSpot__Group__4_in_rule__HotSpot__Group__39007);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4474:1: rule__HotSpot__Group__3__Impl : ( '=' ) ;
    public final void rule__HotSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4478:1: ( ( '=' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4479:1: ( '=' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4479:1: ( '=' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4480:1: '='
            {
             before(grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__HotSpot__Group__3__Impl9035); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4493:1: rule__HotSpot__Group__4 : rule__HotSpot__Group__4__Impl ;
    public final void rule__HotSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4497:1: ( rule__HotSpot__Group__4__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4498:2: rule__HotSpot__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HotSpot__Group__4__Impl_in_rule__HotSpot__Group__49066);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4504:1: rule__HotSpot__Group__4__Impl : ( ( rule__HotSpot__LabelAssignment_4 ) ) ;
    public final void rule__HotSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4508:1: ( ( ( rule__HotSpot__LabelAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4509:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4509:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4510:1: ( rule__HotSpot__LabelAssignment_4 )
            {
             before(grammarAccess.getHotSpotAccess().getLabelAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4511:1: ( rule__HotSpot__LabelAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4511:2: rule__HotSpot__LabelAssignment_4
            {
            pushFollow(FOLLOW_rule__HotSpot__LabelAssignment_4_in_rule__HotSpot__Group__4__Impl9093);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4531:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4535:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4536:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__09133);
            rule__Equation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__09136);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4543:1: rule__Equation__Group__0__Impl : ( '@equation' ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4547:1: ( ( '@equation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4548:1: ( '@equation' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4548:1: ( '@equation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4549:1: '@equation'
            {
             before(grammarAccess.getEquationAccess().getEquationKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Equation__Group__0__Impl9164); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4562:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4566:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4567:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__19195);
            rule__Equation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__19198);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4574:1: rule__Equation__Group__1__Impl : ( ( rule__Equation__HideFromViewAssignment_1 )? ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4578:1: ( ( ( rule__Equation__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4579:1: ( ( rule__Equation__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4579:1: ( ( rule__Equation__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4580:1: ( rule__Equation__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getEquationAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4581:1: ( rule__Equation__HideFromViewAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==52) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4581:2: rule__Equation__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Equation__HideFromViewAssignment_1_in_rule__Equation__Group__1__Impl9225);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4591:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl rule__Equation__Group__3 ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4595:1: ( rule__Equation__Group__2__Impl rule__Equation__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4596:2: rule__Equation__Group__2__Impl rule__Equation__Group__3
            {
            pushFollow(FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__29256);
            rule__Equation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__29259);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4603:1: rule__Equation__Group__2__Impl : ( ( rule__Equation__EquationAssignment_2 ) ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4607:1: ( ( ( rule__Equation__EquationAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4608:1: ( ( rule__Equation__EquationAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4608:1: ( ( rule__Equation__EquationAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4609:1: ( rule__Equation__EquationAssignment_2 )
            {
             before(grammarAccess.getEquationAccess().getEquationAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4610:1: ( rule__Equation__EquationAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4610:2: rule__Equation__EquationAssignment_2
            {
            pushFollow(FOLLOW_rule__Equation__EquationAssignment_2_in_rule__Equation__Group__2__Impl9286);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4620:1: rule__Equation__Group__3 : rule__Equation__Group__3__Impl rule__Equation__Group__4 ;
    public final void rule__Equation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4624:1: ( rule__Equation__Group__3__Impl rule__Equation__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4625:2: rule__Equation__Group__3__Impl rule__Equation__Group__4
            {
            pushFollow(FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__39316);
            rule__Equation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__39319);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4632:1: rule__Equation__Group__3__Impl : ( '{' ) ;
    public final void rule__Equation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4636:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4637:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4637:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4638:1: '{'
            {
             before(grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Equation__Group__3__Impl9347); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4651:1: rule__Equation__Group__4 : rule__Equation__Group__4__Impl rule__Equation__Group__5 ;
    public final void rule__Equation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4655:1: ( rule__Equation__Group__4__Impl rule__Equation__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4656:2: rule__Equation__Group__4__Impl rule__Equation__Group__5
            {
            pushFollow(FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__49378);
            rule__Equation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__5_in_rule__Equation__Group__49381);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4663:1: rule__Equation__Group__4__Impl : ( ( rule__Equation__DescriptionAssignment_4 )? ) ;
    public final void rule__Equation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4667:1: ( ( ( rule__Equation__DescriptionAssignment_4 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4668:1: ( ( rule__Equation__DescriptionAssignment_4 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4668:1: ( ( rule__Equation__DescriptionAssignment_4 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4669:1: ( rule__Equation__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getEquationAccess().getDescriptionAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4670:1: ( rule__Equation__DescriptionAssignment_4 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4670:2: rule__Equation__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Equation__DescriptionAssignment_4_in_rule__Equation__Group__4__Impl9408);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4680:1: rule__Equation__Group__5 : rule__Equation__Group__5__Impl rule__Equation__Group__6 ;
    public final void rule__Equation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4684:1: ( rule__Equation__Group__5__Impl rule__Equation__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4685:2: rule__Equation__Group__5__Impl rule__Equation__Group__6
            {
            pushFollow(FOLLOW_rule__Equation__Group__5__Impl_in_rule__Equation__Group__59439);
            rule__Equation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__6_in_rule__Equation__Group__59442);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4692:1: rule__Equation__Group__5__Impl : ( 'where' ) ;
    public final void rule__Equation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4696:1: ( ( 'where' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4697:1: ( 'where' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4697:1: ( 'where' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4698:1: 'where'
            {
             before(grammarAccess.getEquationAccess().getWhereKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Equation__Group__5__Impl9470); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4711:1: rule__Equation__Group__6 : rule__Equation__Group__6__Impl rule__Equation__Group__7 ;
    public final void rule__Equation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4715:1: ( rule__Equation__Group__6__Impl rule__Equation__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4716:2: rule__Equation__Group__6__Impl rule__Equation__Group__7
            {
            pushFollow(FOLLOW_rule__Equation__Group__6__Impl_in_rule__Equation__Group__69501);
            rule__Equation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__7_in_rule__Equation__Group__69504);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4723:1: rule__Equation__Group__6__Impl : ( ( rule__Equation__SymbolsAssignment_6 ) ) ;
    public final void rule__Equation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4727:1: ( ( ( rule__Equation__SymbolsAssignment_6 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4728:1: ( ( rule__Equation__SymbolsAssignment_6 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4728:1: ( ( rule__Equation__SymbolsAssignment_6 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4729:1: ( rule__Equation__SymbolsAssignment_6 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4730:1: ( rule__Equation__SymbolsAssignment_6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4730:2: rule__Equation__SymbolsAssignment_6
            {
            pushFollow(FOLLOW_rule__Equation__SymbolsAssignment_6_in_rule__Equation__Group__6__Impl9531);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4740:1: rule__Equation__Group__7 : rule__Equation__Group__7__Impl rule__Equation__Group__8 ;
    public final void rule__Equation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4744:1: ( rule__Equation__Group__7__Impl rule__Equation__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4745:2: rule__Equation__Group__7__Impl rule__Equation__Group__8
            {
            pushFollow(FOLLOW_rule__Equation__Group__7__Impl_in_rule__Equation__Group__79561);
            rule__Equation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group__8_in_rule__Equation__Group__79564);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4752:1: rule__Equation__Group__7__Impl : ( ( rule__Equation__Group_7__0 )* ) ;
    public final void rule__Equation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4756:1: ( ( ( rule__Equation__Group_7__0 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4757:1: ( ( rule__Equation__Group_7__0 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4757:1: ( ( rule__Equation__Group_7__0 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4758:1: ( rule__Equation__Group_7__0 )*
            {
             before(grammarAccess.getEquationAccess().getGroup_7()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4759:1: ( rule__Equation__Group_7__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==39) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4759:2: rule__Equation__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Equation__Group_7__0_in_rule__Equation__Group__7__Impl9591);
            	    rule__Equation__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4769:1: rule__Equation__Group__8 : rule__Equation__Group__8__Impl ;
    public final void rule__Equation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4773:1: ( rule__Equation__Group__8__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4774:2: rule__Equation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group__8__Impl_in_rule__Equation__Group__89622);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4780:1: rule__Equation__Group__8__Impl : ( '}' ) ;
    public final void rule__Equation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4784:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4785:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4785:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4786:1: '}'
            {
             before(grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__Equation__Group__8__Impl9650); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4817:1: rule__Equation__Group_7__0 : rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1 ;
    public final void rule__Equation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4821:1: ( rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4822:2: rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1
            {
            pushFollow(FOLLOW_rule__Equation__Group_7__0__Impl_in_rule__Equation__Group_7__09699);
            rule__Equation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equation__Group_7__1_in_rule__Equation__Group_7__09702);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4829:1: rule__Equation__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Equation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4833:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4834:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4834:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4835:1: ','
            {
             before(grammarAccess.getEquationAccess().getCommaKeyword_7_0()); 
            match(input,39,FOLLOW_39_in_rule__Equation__Group_7__0__Impl9730); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4848:1: rule__Equation__Group_7__1 : rule__Equation__Group_7__1__Impl ;
    public final void rule__Equation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4852:1: ( rule__Equation__Group_7__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4853:2: rule__Equation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Equation__Group_7__1__Impl_in_rule__Equation__Group_7__19761);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4859:1: rule__Equation__Group_7__1__Impl : ( ( rule__Equation__SymbolsAssignment_7_1 ) ) ;
    public final void rule__Equation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4863:1: ( ( ( rule__Equation__SymbolsAssignment_7_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4864:1: ( ( rule__Equation__SymbolsAssignment_7_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4864:1: ( ( rule__Equation__SymbolsAssignment_7_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4865:1: ( rule__Equation__SymbolsAssignment_7_1 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_7_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4866:1: ( rule__Equation__SymbolsAssignment_7_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4866:2: rule__Equation__SymbolsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Equation__SymbolsAssignment_7_1_in_rule__Equation__Group_7__1__Impl9788);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4880:1: rule__EqSymbol__Group__0 : rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 ;
    public final void rule__EqSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4884:1: ( rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4885:2: rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__0__Impl_in_rule__EqSymbol__Group__09822);
            rule__EqSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqSymbol__Group__1_in_rule__EqSymbol__Group__09825);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4892:1: rule__EqSymbol__Group__0__Impl : ( ( rule__EqSymbol__SymbolAssignment_0 ) ) ;
    public final void rule__EqSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4896:1: ( ( ( rule__EqSymbol__SymbolAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4897:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4897:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4898:1: ( rule__EqSymbol__SymbolAssignment_0 )
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4899:1: ( rule__EqSymbol__SymbolAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4899:2: rule__EqSymbol__SymbolAssignment_0
            {
            pushFollow(FOLLOW_rule__EqSymbol__SymbolAssignment_0_in_rule__EqSymbol__Group__0__Impl9852);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4909:1: rule__EqSymbol__Group__1 : rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 ;
    public final void rule__EqSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4913:1: ( rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4914:2: rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__1__Impl_in_rule__EqSymbol__Group__19882);
            rule__EqSymbol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqSymbol__Group__2_in_rule__EqSymbol__Group__19885);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4921:1: rule__EqSymbol__Group__1__Impl : ( '=' ) ;
    public final void rule__EqSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4925:1: ( ( '=' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4926:1: ( '=' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4926:1: ( '=' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4927:1: '='
            {
             before(grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__EqSymbol__Group__1__Impl9913); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4940:1: rule__EqSymbol__Group__2 : rule__EqSymbol__Group__2__Impl ;
    public final void rule__EqSymbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4944:1: ( rule__EqSymbol__Group__2__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4945:2: rule__EqSymbol__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EqSymbol__Group__2__Impl_in_rule__EqSymbol__Group__29944);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4951:1: rule__EqSymbol__Group__2__Impl : ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) ;
    public final void rule__EqSymbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4955:1: ( ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4956:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4956:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4957:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4958:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4958:2: rule__EqSymbol__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__EqSymbol__DescriptionAssignment_2_in_rule__EqSymbol__Group__2__Impl9971);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4974:1: rule__RefToContext__Group__0 : rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 ;
    public final void rule__RefToContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4978:1: ( rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4979:2: rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__0__Impl_in_rule__RefToContext__Group__010007);
            rule__RefToContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__1_in_rule__RefToContext__Group__010010);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4986:1: rule__RefToContext__Group__0__Impl : ( '@rtc' ) ;
    public final void rule__RefToContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4990:1: ( ( '@rtc' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4991:1: ( '@rtc' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4991:1: ( '@rtc' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:4992:1: '@rtc'
            {
             before(grammarAccess.getRefToContextAccess().getRtcKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__RefToContext__Group__0__Impl10038); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5005:1: rule__RefToContext__Group__1 : rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 ;
    public final void rule__RefToContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5009:1: ( rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5010:2: rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__1__Impl_in_rule__RefToContext__Group__110069);
            rule__RefToContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__2_in_rule__RefToContext__Group__110072);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5017:1: rule__RefToContext__Group__1__Impl : ( ( rule__RefToContext__HideFromViewAssignment_1 )? ) ;
    public final void rule__RefToContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5021:1: ( ( ( rule__RefToContext__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5022:1: ( ( rule__RefToContext__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5022:1: ( ( rule__RefToContext__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5023:1: ( rule__RefToContext__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5024:1: ( rule__RefToContext__HideFromViewAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==52) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5024:2: rule__RefToContext__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RefToContext__HideFromViewAssignment_1_in_rule__RefToContext__Group__1__Impl10099);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5034:1: rule__RefToContext__Group__2 : rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 ;
    public final void rule__RefToContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5038:1: ( rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5039:2: rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__2__Impl_in_rule__RefToContext__Group__210130);
            rule__RefToContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__3_in_rule__RefToContext__Group__210133);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5046:1: rule__RefToContext__Group__2__Impl : ( '{' ) ;
    public final void rule__RefToContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5050:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5051:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5051:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5052:1: '{'
            {
             before(grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__RefToContext__Group__2__Impl10161); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5065:1: rule__RefToContext__Group__3 : rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 ;
    public final void rule__RefToContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5069:1: ( rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5070:2: rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__3__Impl_in_rule__RefToContext__Group__310192);
            rule__RefToContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__4_in_rule__RefToContext__Group__310195);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5077:1: rule__RefToContext__Group__3__Impl : ( 'context' ) ;
    public final void rule__RefToContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5081:1: ( ( 'context' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5082:1: ( 'context' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5082:1: ( 'context' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5083:1: 'context'
            {
             before(grammarAccess.getRefToContextAccess().getContextKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__RefToContext__Group__3__Impl10223); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5096:1: rule__RefToContext__Group__4 : rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 ;
    public final void rule__RefToContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5100:1: ( rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5101:2: rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__4__Impl_in_rule__RefToContext__Group__410254);
            rule__RefToContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__5_in_rule__RefToContext__Group__410257);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5108:1: rule__RefToContext__Group__4__Impl : ( ( rule__RefToContext__ContextAssignment_4 ) ) ;
    public final void rule__RefToContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5112:1: ( ( ( rule__RefToContext__ContextAssignment_4 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5113:1: ( ( rule__RefToContext__ContextAssignment_4 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5113:1: ( ( rule__RefToContext__ContextAssignment_4 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5114:1: ( rule__RefToContext__ContextAssignment_4 )
            {
             before(grammarAccess.getRefToContextAccess().getContextAssignment_4()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5115:1: ( rule__RefToContext__ContextAssignment_4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5115:2: rule__RefToContext__ContextAssignment_4
            {
            pushFollow(FOLLOW_rule__RefToContext__ContextAssignment_4_in_rule__RefToContext__Group__4__Impl10284);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5125:1: rule__RefToContext__Group__5 : rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6 ;
    public final void rule__RefToContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5129:1: ( rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5130:2: rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__5__Impl_in_rule__RefToContext__Group__510314);
            rule__RefToContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefToContext__Group__6_in_rule__RefToContext__Group__510317);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5137:1: rule__RefToContext__Group__5__Impl : ( ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* ) ) ;
    public final void rule__RefToContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5141:1: ( ( ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5142:1: ( ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5142:1: ( ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5143:1: ( ( rule__RefToContext__QuestionsAssignment_5 ) ) ( ( rule__RefToContext__QuestionsAssignment_5 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5143:1: ( ( rule__RefToContext__QuestionsAssignment_5 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5144:1: ( rule__RefToContext__QuestionsAssignment_5 )
            {
             before(grammarAccess.getRefToContextAccess().getQuestionsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5145:1: ( rule__RefToContext__QuestionsAssignment_5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5145:2: rule__RefToContext__QuestionsAssignment_5
            {
            pushFollow(FOLLOW_rule__RefToContext__QuestionsAssignment_5_in_rule__RefToContext__Group__5__Impl10346);
            rule__RefToContext__QuestionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getQuestionsAssignment_5()); 

            }

            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5148:1: ( ( rule__RefToContext__QuestionsAssignment_5 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5149:1: ( rule__RefToContext__QuestionsAssignment_5 )*
            {
             before(grammarAccess.getRefToContextAccess().getQuestionsAssignment_5()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5150:1: ( rule__RefToContext__QuestionsAssignment_5 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==17) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5150:2: rule__RefToContext__QuestionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__RefToContext__QuestionsAssignment_5_in_rule__RefToContext__Group__5__Impl10358);
            	    rule__RefToContext__QuestionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5161:1: rule__RefToContext__Group__6 : rule__RefToContext__Group__6__Impl ;
    public final void rule__RefToContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5165:1: ( rule__RefToContext__Group__6__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5166:2: rule__RefToContext__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RefToContext__Group__6__Impl_in_rule__RefToContext__Group__610391);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5172:1: rule__RefToContext__Group__6__Impl : ( '}' ) ;
    public final void rule__RefToContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5176:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5177:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5177:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5178:1: '}'
            {
             before(grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__RefToContext__Group__6__Impl10419); 
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


    // $ANTLR start "rule__MultiChoice__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5205:1: rule__MultiChoice__Group__0 : rule__MultiChoice__Group__0__Impl rule__MultiChoice__Group__1 ;
    public final void rule__MultiChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5209:1: ( rule__MultiChoice__Group__0__Impl rule__MultiChoice__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5210:2: rule__MultiChoice__Group__0__Impl rule__MultiChoice__Group__1
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__0__Impl_in_rule__MultiChoice__Group__010464);
            rule__MultiChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__1_in_rule__MultiChoice__Group__010467);
            rule__MultiChoice__Group__1();

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
    // $ANTLR end "rule__MultiChoice__Group__0"


    // $ANTLR start "rule__MultiChoice__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5217:1: rule__MultiChoice__Group__0__Impl : ( '@multi_choice' ) ;
    public final void rule__MultiChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5221:1: ( ( '@multi_choice' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5222:1: ( '@multi_choice' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5222:1: ( '@multi_choice' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5223:1: '@multi_choice'
            {
             before(grammarAccess.getMultiChoiceAccess().getMulti_choiceKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__MultiChoice__Group__0__Impl10495); 
             after(grammarAccess.getMultiChoiceAccess().getMulti_choiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5236:1: rule__MultiChoice__Group__1 : rule__MultiChoice__Group__1__Impl rule__MultiChoice__Group__2 ;
    public final void rule__MultiChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5240:1: ( rule__MultiChoice__Group__1__Impl rule__MultiChoice__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5241:2: rule__MultiChoice__Group__1__Impl rule__MultiChoice__Group__2
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__1__Impl_in_rule__MultiChoice__Group__110526);
            rule__MultiChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__2_in_rule__MultiChoice__Group__110529);
            rule__MultiChoice__Group__2();

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
    // $ANTLR end "rule__MultiChoice__Group__1"


    // $ANTLR start "rule__MultiChoice__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5248:1: rule__MultiChoice__Group__1__Impl : ( ( rule__MultiChoice__HideFromViewAssignment_1 )? ) ;
    public final void rule__MultiChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5252:1: ( ( ( rule__MultiChoice__HideFromViewAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5253:1: ( ( rule__MultiChoice__HideFromViewAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5253:1: ( ( rule__MultiChoice__HideFromViewAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5254:1: ( rule__MultiChoice__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getHideFromViewAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5255:1: ( rule__MultiChoice__HideFromViewAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5255:2: rule__MultiChoice__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__MultiChoice__HideFromViewAssignment_1_in_rule__MultiChoice__Group__1__Impl10556);
                    rule__MultiChoice__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__1__Impl"


    // $ANTLR start "rule__MultiChoice__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5265:1: rule__MultiChoice__Group__2 : rule__MultiChoice__Group__2__Impl rule__MultiChoice__Group__3 ;
    public final void rule__MultiChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5269:1: ( rule__MultiChoice__Group__2__Impl rule__MultiChoice__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5270:2: rule__MultiChoice__Group__2__Impl rule__MultiChoice__Group__3
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__2__Impl_in_rule__MultiChoice__Group__210587);
            rule__MultiChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__3_in_rule__MultiChoice__Group__210590);
            rule__MultiChoice__Group__3();

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
    // $ANTLR end "rule__MultiChoice__Group__2"


    // $ANTLR start "rule__MultiChoice__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5277:1: rule__MultiChoice__Group__2__Impl : ( ( rule__MultiChoice__QuestionAssignment_2 ) ) ;
    public final void rule__MultiChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5281:1: ( ( ( rule__MultiChoice__QuestionAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5282:1: ( ( rule__MultiChoice__QuestionAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5282:1: ( ( rule__MultiChoice__QuestionAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5283:1: ( rule__MultiChoice__QuestionAssignment_2 )
            {
             before(grammarAccess.getMultiChoiceAccess().getQuestionAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5284:1: ( rule__MultiChoice__QuestionAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5284:2: rule__MultiChoice__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__MultiChoice__QuestionAssignment_2_in_rule__MultiChoice__Group__2__Impl10617);
            rule__MultiChoice__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getQuestionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__2__Impl"


    // $ANTLR start "rule__MultiChoice__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5294:1: rule__MultiChoice__Group__3 : rule__MultiChoice__Group__3__Impl rule__MultiChoice__Group__4 ;
    public final void rule__MultiChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5298:1: ( rule__MultiChoice__Group__3__Impl rule__MultiChoice__Group__4 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5299:2: rule__MultiChoice__Group__3__Impl rule__MultiChoice__Group__4
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__3__Impl_in_rule__MultiChoice__Group__310647);
            rule__MultiChoice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__4_in_rule__MultiChoice__Group__310650);
            rule__MultiChoice__Group__4();

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
    // $ANTLR end "rule__MultiChoice__Group__3"


    // $ANTLR start "rule__MultiChoice__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5306:1: rule__MultiChoice__Group__3__Impl : ( '{' ) ;
    public final void rule__MultiChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5310:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5311:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5311:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5312:1: '{'
            {
             before(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__MultiChoice__Group__3__Impl10678); 
             after(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__3__Impl"


    // $ANTLR start "rule__MultiChoice__Group__4"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5325:1: rule__MultiChoice__Group__4 : rule__MultiChoice__Group__4__Impl rule__MultiChoice__Group__5 ;
    public final void rule__MultiChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5329:1: ( rule__MultiChoice__Group__4__Impl rule__MultiChoice__Group__5 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5330:2: rule__MultiChoice__Group__4__Impl rule__MultiChoice__Group__5
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__4__Impl_in_rule__MultiChoice__Group__410709);
            rule__MultiChoice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__5_in_rule__MultiChoice__Group__410712);
            rule__MultiChoice__Group__5();

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
    // $ANTLR end "rule__MultiChoice__Group__4"


    // $ANTLR start "rule__MultiChoice__Group__4__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5337:1: rule__MultiChoice__Group__4__Impl : ( '@options' ) ;
    public final void rule__MultiChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5341:1: ( ( '@options' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5342:1: ( '@options' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5342:1: ( '@options' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5343:1: '@options'
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__MultiChoice__Group__4__Impl10740); 
             after(grammarAccess.getMultiChoiceAccess().getOptionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__4__Impl"


    // $ANTLR start "rule__MultiChoice__Group__5"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5356:1: rule__MultiChoice__Group__5 : rule__MultiChoice__Group__5__Impl rule__MultiChoice__Group__6 ;
    public final void rule__MultiChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5360:1: ( rule__MultiChoice__Group__5__Impl rule__MultiChoice__Group__6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5361:2: rule__MultiChoice__Group__5__Impl rule__MultiChoice__Group__6
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__5__Impl_in_rule__MultiChoice__Group__510771);
            rule__MultiChoice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__6_in_rule__MultiChoice__Group__510774);
            rule__MultiChoice__Group__6();

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
    // $ANTLR end "rule__MultiChoice__Group__5"


    // $ANTLR start "rule__MultiChoice__Group__5__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5368:1: rule__MultiChoice__Group__5__Impl : ( '{' ) ;
    public final void rule__MultiChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5372:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5373:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5373:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5374:1: '{'
            {
             before(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__MultiChoice__Group__5__Impl10802); 
             after(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__5__Impl"


    // $ANTLR start "rule__MultiChoice__Group__6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5387:1: rule__MultiChoice__Group__6 : rule__MultiChoice__Group__6__Impl rule__MultiChoice__Group__7 ;
    public final void rule__MultiChoice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5391:1: ( rule__MultiChoice__Group__6__Impl rule__MultiChoice__Group__7 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5392:2: rule__MultiChoice__Group__6__Impl rule__MultiChoice__Group__7
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__6__Impl_in_rule__MultiChoice__Group__610833);
            rule__MultiChoice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__7_in_rule__MultiChoice__Group__610836);
            rule__MultiChoice__Group__7();

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
    // $ANTLR end "rule__MultiChoice__Group__6"


    // $ANTLR start "rule__MultiChoice__Group__6__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5399:1: rule__MultiChoice__Group__6__Impl : ( ( rule__MultiChoice__OptionsAssignment_6 ) ) ;
    public final void rule__MultiChoice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5403:1: ( ( ( rule__MultiChoice__OptionsAssignment_6 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5404:1: ( ( rule__MultiChoice__OptionsAssignment_6 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5404:1: ( ( rule__MultiChoice__OptionsAssignment_6 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5405:1: ( rule__MultiChoice__OptionsAssignment_6 )
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_6()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5406:1: ( rule__MultiChoice__OptionsAssignment_6 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5406:2: rule__MultiChoice__OptionsAssignment_6
            {
            pushFollow(FOLLOW_rule__MultiChoice__OptionsAssignment_6_in_rule__MultiChoice__Group__6__Impl10863);
            rule__MultiChoice__OptionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__6__Impl"


    // $ANTLR start "rule__MultiChoice__Group__7"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5416:1: rule__MultiChoice__Group__7 : rule__MultiChoice__Group__7__Impl rule__MultiChoice__Group__8 ;
    public final void rule__MultiChoice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5420:1: ( rule__MultiChoice__Group__7__Impl rule__MultiChoice__Group__8 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5421:2: rule__MultiChoice__Group__7__Impl rule__MultiChoice__Group__8
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__7__Impl_in_rule__MultiChoice__Group__710893);
            rule__MultiChoice__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__8_in_rule__MultiChoice__Group__710896);
            rule__MultiChoice__Group__8();

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
    // $ANTLR end "rule__MultiChoice__Group__7"


    // $ANTLR start "rule__MultiChoice__Group__7__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5428:1: rule__MultiChoice__Group__7__Impl : ( ( rule__MultiChoice__Group_7__0 )* ) ;
    public final void rule__MultiChoice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5432:1: ( ( ( rule__MultiChoice__Group_7__0 )* ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5433:1: ( ( rule__MultiChoice__Group_7__0 )* )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5433:1: ( ( rule__MultiChoice__Group_7__0 )* )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5434:1: ( rule__MultiChoice__Group_7__0 )*
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_7()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5435:1: ( rule__MultiChoice__Group_7__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==39) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5435:2: rule__MultiChoice__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiChoice__Group_7__0_in_rule__MultiChoice__Group__7__Impl10923);
            	    rule__MultiChoice__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getMultiChoiceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__7__Impl"


    // $ANTLR start "rule__MultiChoice__Group__8"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5445:1: rule__MultiChoice__Group__8 : rule__MultiChoice__Group__8__Impl rule__MultiChoice__Group__9 ;
    public final void rule__MultiChoice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5449:1: ( rule__MultiChoice__Group__8__Impl rule__MultiChoice__Group__9 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5450:2: rule__MultiChoice__Group__8__Impl rule__MultiChoice__Group__9
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__8__Impl_in_rule__MultiChoice__Group__810954);
            rule__MultiChoice__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__9_in_rule__MultiChoice__Group__810957);
            rule__MultiChoice__Group__9();

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
    // $ANTLR end "rule__MultiChoice__Group__8"


    // $ANTLR start "rule__MultiChoice__Group__8__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5457:1: rule__MultiChoice__Group__8__Impl : ( '}' ) ;
    public final void rule__MultiChoice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5461:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5462:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5462:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5463:1: '}'
            {
             before(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__MultiChoice__Group__8__Impl10985); 
             after(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__8__Impl"


    // $ANTLR start "rule__MultiChoice__Group__9"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5476:1: rule__MultiChoice__Group__9 : rule__MultiChoice__Group__9__Impl rule__MultiChoice__Group__10 ;
    public final void rule__MultiChoice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5480:1: ( rule__MultiChoice__Group__9__Impl rule__MultiChoice__Group__10 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5481:2: rule__MultiChoice__Group__9__Impl rule__MultiChoice__Group__10
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__9__Impl_in_rule__MultiChoice__Group__911016);
            rule__MultiChoice__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__10_in_rule__MultiChoice__Group__911019);
            rule__MultiChoice__Group__10();

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
    // $ANTLR end "rule__MultiChoice__Group__9"


    // $ANTLR start "rule__MultiChoice__Group__9__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5488:1: rule__MultiChoice__Group__9__Impl : ( ( rule__MultiChoice__Group_9__0 )? ) ;
    public final void rule__MultiChoice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5492:1: ( ( ( rule__MultiChoice__Group_9__0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5493:1: ( ( rule__MultiChoice__Group_9__0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5493:1: ( ( rule__MultiChoice__Group_9__0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5494:1: ( rule__MultiChoice__Group_9__0 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_9()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5495:1: ( rule__MultiChoice__Group_9__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5495:2: rule__MultiChoice__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__MultiChoice__Group_9__0_in_rule__MultiChoice__Group__9__Impl11046);
                    rule__MultiChoice__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__9__Impl"


    // $ANTLR start "rule__MultiChoice__Group__10"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5505:1: rule__MultiChoice__Group__10 : rule__MultiChoice__Group__10__Impl rule__MultiChoice__Group__11 ;
    public final void rule__MultiChoice__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5509:1: ( rule__MultiChoice__Group__10__Impl rule__MultiChoice__Group__11 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5510:2: rule__MultiChoice__Group__10__Impl rule__MultiChoice__Group__11
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__10__Impl_in_rule__MultiChoice__Group__1011077);
            rule__MultiChoice__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__11_in_rule__MultiChoice__Group__1011080);
            rule__MultiChoice__Group__11();

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
    // $ANTLR end "rule__MultiChoice__Group__10"


    // $ANTLR start "rule__MultiChoice__Group__10__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5517:1: rule__MultiChoice__Group__10__Impl : ( ( rule__MultiChoice__Group_10__0 )? ) ;
    public final void rule__MultiChoice__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5521:1: ( ( ( rule__MultiChoice__Group_10__0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5522:1: ( ( rule__MultiChoice__Group_10__0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5522:1: ( ( rule__MultiChoice__Group_10__0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5523:1: ( rule__MultiChoice__Group_10__0 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_10()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5524:1: ( rule__MultiChoice__Group_10__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==30) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5524:2: rule__MultiChoice__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__MultiChoice__Group_10__0_in_rule__MultiChoice__Group__10__Impl11107);
                    rule__MultiChoice__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__10__Impl"


    // $ANTLR start "rule__MultiChoice__Group__11"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5534:1: rule__MultiChoice__Group__11 : rule__MultiChoice__Group__11__Impl rule__MultiChoice__Group__12 ;
    public final void rule__MultiChoice__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5538:1: ( rule__MultiChoice__Group__11__Impl rule__MultiChoice__Group__12 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5539:2: rule__MultiChoice__Group__11__Impl rule__MultiChoice__Group__12
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__11__Impl_in_rule__MultiChoice__Group__1111138);
            rule__MultiChoice__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group__12_in_rule__MultiChoice__Group__1111141);
            rule__MultiChoice__Group__12();

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
    // $ANTLR end "rule__MultiChoice__Group__11"


    // $ANTLR start "rule__MultiChoice__Group__11__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5546:1: rule__MultiChoice__Group__11__Impl : ( ( rule__MultiChoice__Group_11__0 )? ) ;
    public final void rule__MultiChoice__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5550:1: ( ( ( rule__MultiChoice__Group_11__0 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5551:1: ( ( rule__MultiChoice__Group_11__0 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5551:1: ( ( rule__MultiChoice__Group_11__0 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5552:1: ( rule__MultiChoice__Group_11__0 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_11()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5553:1: ( rule__MultiChoice__Group_11__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5553:2: rule__MultiChoice__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__MultiChoice__Group_11__0_in_rule__MultiChoice__Group__11__Impl11168);
                    rule__MultiChoice__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__11__Impl"


    // $ANTLR start "rule__MultiChoice__Group__12"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5563:1: rule__MultiChoice__Group__12 : rule__MultiChoice__Group__12__Impl ;
    public final void rule__MultiChoice__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5567:1: ( rule__MultiChoice__Group__12__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5568:2: rule__MultiChoice__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group__12__Impl_in_rule__MultiChoice__Group__1211199);
            rule__MultiChoice__Group__12__Impl();

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
    // $ANTLR end "rule__MultiChoice__Group__12"


    // $ANTLR start "rule__MultiChoice__Group__12__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5574:1: rule__MultiChoice__Group__12__Impl : ( '}' ) ;
    public final void rule__MultiChoice__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5578:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5579:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5579:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5580:1: '}'
            {
             before(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FOLLOW_24_in_rule__MultiChoice__Group__12__Impl11227); 
             after(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group__12__Impl"


    // $ANTLR start "rule__MultiChoice__Group_7__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5619:1: rule__MultiChoice__Group_7__0 : rule__MultiChoice__Group_7__0__Impl rule__MultiChoice__Group_7__1 ;
    public final void rule__MultiChoice__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5623:1: ( rule__MultiChoice__Group_7__0__Impl rule__MultiChoice__Group_7__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5624:2: rule__MultiChoice__Group_7__0__Impl rule__MultiChoice__Group_7__1
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group_7__0__Impl_in_rule__MultiChoice__Group_7__011284);
            rule__MultiChoice__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group_7__1_in_rule__MultiChoice__Group_7__011287);
            rule__MultiChoice__Group_7__1();

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
    // $ANTLR end "rule__MultiChoice__Group_7__0"


    // $ANTLR start "rule__MultiChoice__Group_7__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5631:1: rule__MultiChoice__Group_7__0__Impl : ( ',' ) ;
    public final void rule__MultiChoice__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5635:1: ( ( ',' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5636:1: ( ',' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5636:1: ( ',' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5637:1: ','
            {
             before(grammarAccess.getMultiChoiceAccess().getCommaKeyword_7_0()); 
            match(input,39,FOLLOW_39_in_rule__MultiChoice__Group_7__0__Impl11315); 
             after(grammarAccess.getMultiChoiceAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_7__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group_7__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5650:1: rule__MultiChoice__Group_7__1 : rule__MultiChoice__Group_7__1__Impl ;
    public final void rule__MultiChoice__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5654:1: ( rule__MultiChoice__Group_7__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5655:2: rule__MultiChoice__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group_7__1__Impl_in_rule__MultiChoice__Group_7__111346);
            rule__MultiChoice__Group_7__1__Impl();

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
    // $ANTLR end "rule__MultiChoice__Group_7__1"


    // $ANTLR start "rule__MultiChoice__Group_7__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5661:1: rule__MultiChoice__Group_7__1__Impl : ( ( rule__MultiChoice__OptionsAssignment_7_1 ) ) ;
    public final void rule__MultiChoice__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5665:1: ( ( ( rule__MultiChoice__OptionsAssignment_7_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5666:1: ( ( rule__MultiChoice__OptionsAssignment_7_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5666:1: ( ( rule__MultiChoice__OptionsAssignment_7_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5667:1: ( rule__MultiChoice__OptionsAssignment_7_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_7_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5668:1: ( rule__MultiChoice__OptionsAssignment_7_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5668:2: rule__MultiChoice__OptionsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__MultiChoice__OptionsAssignment_7_1_in_rule__MultiChoice__Group_7__1__Impl11373);
            rule__MultiChoice__OptionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_7__1__Impl"


    // $ANTLR start "rule__MultiChoice__Group_9__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5682:1: rule__MultiChoice__Group_9__0 : rule__MultiChoice__Group_9__0__Impl rule__MultiChoice__Group_9__1 ;
    public final void rule__MultiChoice__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5686:1: ( rule__MultiChoice__Group_9__0__Impl rule__MultiChoice__Group_9__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5687:2: rule__MultiChoice__Group_9__0__Impl rule__MultiChoice__Group_9__1
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group_9__0__Impl_in_rule__MultiChoice__Group_9__011407);
            rule__MultiChoice__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group_9__1_in_rule__MultiChoice__Group_9__011410);
            rule__MultiChoice__Group_9__1();

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
    // $ANTLR end "rule__MultiChoice__Group_9__0"


    // $ANTLR start "rule__MultiChoice__Group_9__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5694:1: rule__MultiChoice__Group_9__0__Impl : ( '@numOptionsToShow' ) ;
    public final void rule__MultiChoice__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5698:1: ( ( '@numOptionsToShow' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5699:1: ( '@numOptionsToShow' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5699:1: ( '@numOptionsToShow' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5700:1: '@numOptionsToShow'
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowKeyword_9_0()); 
            match(input,29,FOLLOW_29_in_rule__MultiChoice__Group_9__0__Impl11438); 
             after(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_9__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group_9__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5713:1: rule__MultiChoice__Group_9__1 : rule__MultiChoice__Group_9__1__Impl ;
    public final void rule__MultiChoice__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5717:1: ( rule__MultiChoice__Group_9__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5718:2: rule__MultiChoice__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group_9__1__Impl_in_rule__MultiChoice__Group_9__111469);
            rule__MultiChoice__Group_9__1__Impl();

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
    // $ANTLR end "rule__MultiChoice__Group_9__1"


    // $ANTLR start "rule__MultiChoice__Group_9__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5724:1: rule__MultiChoice__Group_9__1__Impl : ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) ) ;
    public final void rule__MultiChoice__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5728:1: ( ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5729:1: ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5729:1: ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5730:1: ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowAssignment_9_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5731:1: ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5731:2: rule__MultiChoice__NumOptionsToShowAssignment_9_1
            {
            pushFollow(FOLLOW_rule__MultiChoice__NumOptionsToShowAssignment_9_1_in_rule__MultiChoice__Group_9__1__Impl11496);
            rule__MultiChoice__NumOptionsToShowAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_9__1__Impl"


    // $ANTLR start "rule__MultiChoice__Group_10__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5745:1: rule__MultiChoice__Group_10__0 : rule__MultiChoice__Group_10__0__Impl rule__MultiChoice__Group_10__1 ;
    public final void rule__MultiChoice__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5749:1: ( rule__MultiChoice__Group_10__0__Impl rule__MultiChoice__Group_10__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5750:2: rule__MultiChoice__Group_10__0__Impl rule__MultiChoice__Group_10__1
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group_10__0__Impl_in_rule__MultiChoice__Group_10__011530);
            rule__MultiChoice__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group_10__1_in_rule__MultiChoice__Group_10__011533);
            rule__MultiChoice__Group_10__1();

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
    // $ANTLR end "rule__MultiChoice__Group_10__0"


    // $ANTLR start "rule__MultiChoice__Group_10__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5757:1: rule__MultiChoice__Group_10__0__Impl : ( '@numOptionsPerRow' ) ;
    public final void rule__MultiChoice__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5761:1: ( ( '@numOptionsPerRow' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5762:1: ( '@numOptionsPerRow' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5762:1: ( '@numOptionsPerRow' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5763:1: '@numOptionsPerRow'
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowKeyword_10_0()); 
            match(input,30,FOLLOW_30_in_rule__MultiChoice__Group_10__0__Impl11561); 
             after(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_10__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group_10__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5776:1: rule__MultiChoice__Group_10__1 : rule__MultiChoice__Group_10__1__Impl ;
    public final void rule__MultiChoice__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5780:1: ( rule__MultiChoice__Group_10__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5781:2: rule__MultiChoice__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group_10__1__Impl_in_rule__MultiChoice__Group_10__111592);
            rule__MultiChoice__Group_10__1__Impl();

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
    // $ANTLR end "rule__MultiChoice__Group_10__1"


    // $ANTLR start "rule__MultiChoice__Group_10__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5787:1: rule__MultiChoice__Group_10__1__Impl : ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) ) ;
    public final void rule__MultiChoice__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5791:1: ( ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5792:1: ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5792:1: ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5793:1: ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowAssignment_10_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5794:1: ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5794:2: rule__MultiChoice__NumOptionsPerRowAssignment_10_1
            {
            pushFollow(FOLLOW_rule__MultiChoice__NumOptionsPerRowAssignment_10_1_in_rule__MultiChoice__Group_10__1__Impl11619);
            rule__MultiChoice__NumOptionsPerRowAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_10__1__Impl"


    // $ANTLR start "rule__MultiChoice__Group_11__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5808:1: rule__MultiChoice__Group_11__0 : rule__MultiChoice__Group_11__0__Impl rule__MultiChoice__Group_11__1 ;
    public final void rule__MultiChoice__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5812:1: ( rule__MultiChoice__Group_11__0__Impl rule__MultiChoice__Group_11__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5813:2: rule__MultiChoice__Group_11__0__Impl rule__MultiChoice__Group_11__1
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group_11__0__Impl_in_rule__MultiChoice__Group_11__011653);
            rule__MultiChoice__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiChoice__Group_11__1_in_rule__MultiChoice__Group_11__011656);
            rule__MultiChoice__Group_11__1();

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
    // $ANTLR end "rule__MultiChoice__Group_11__0"


    // $ANTLR start "rule__MultiChoice__Group_11__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5820:1: rule__MultiChoice__Group_11__0__Impl : ( '@explanation' ) ;
    public final void rule__MultiChoice__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5824:1: ( ( '@explanation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5825:1: ( '@explanation' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5825:1: ( '@explanation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5826:1: '@explanation'
            {
             before(grammarAccess.getMultiChoiceAccess().getExplanationKeyword_11_0()); 
            match(input,46,FOLLOW_46_in_rule__MultiChoice__Group_11__0__Impl11684); 
             after(grammarAccess.getMultiChoiceAccess().getExplanationKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_11__0__Impl"


    // $ANTLR start "rule__MultiChoice__Group_11__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5839:1: rule__MultiChoice__Group_11__1 : rule__MultiChoice__Group_11__1__Impl ;
    public final void rule__MultiChoice__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5843:1: ( rule__MultiChoice__Group_11__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5844:2: rule__MultiChoice__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiChoice__Group_11__1__Impl_in_rule__MultiChoice__Group_11__111715);
            rule__MultiChoice__Group_11__1__Impl();

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
    // $ANTLR end "rule__MultiChoice__Group_11__1"


    // $ANTLR start "rule__MultiChoice__Group_11__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5850:1: rule__MultiChoice__Group_11__1__Impl : ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) ) ;
    public final void rule__MultiChoice__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5854:1: ( ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5855:1: ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5855:1: ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5856:1: ( rule__MultiChoice__ExplanationAssignment_11_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getExplanationAssignment_11_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5857:1: ( rule__MultiChoice__ExplanationAssignment_11_1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5857:2: rule__MultiChoice__ExplanationAssignment_11_1
            {
            pushFollow(FOLLOW_rule__MultiChoice__ExplanationAssignment_11_1_in_rule__MultiChoice__Group_11__1__Impl11742);
            rule__MultiChoice__ExplanationAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceAccess().getExplanationAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__Group_11__1__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5871:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5875:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5876:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__011776);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group__1_in_rule__Option__Group__011779);
            rule__Option__Group__1();

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
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5883:1: rule__Option__Group__0__Impl : ( ( rule__Option__OptionValueAssignment_0 ) ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5887:1: ( ( ( rule__Option__OptionValueAssignment_0 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5888:1: ( ( rule__Option__OptionValueAssignment_0 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5888:1: ( ( rule__Option__OptionValueAssignment_0 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5889:1: ( rule__Option__OptionValueAssignment_0 )
            {
             before(grammarAccess.getOptionAccess().getOptionValueAssignment_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5890:1: ( rule__Option__OptionValueAssignment_0 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5890:2: rule__Option__OptionValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Option__OptionValueAssignment_0_in_rule__Option__Group__0__Impl11806);
            rule__Option__OptionValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getOptionValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5900:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5904:1: ( rule__Option__Group__1__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5905:2: rule__Option__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__111836);
            rule__Option__Group__1__Impl();

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
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5911:1: rule__Option__Group__1__Impl : ( ( rule__Option__CorrectOptionAssignment_1 )? ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5915:1: ( ( ( rule__Option__CorrectOptionAssignment_1 )? ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5916:1: ( ( rule__Option__CorrectOptionAssignment_1 )? )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5916:1: ( ( rule__Option__CorrectOptionAssignment_1 )? )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5917:1: ( rule__Option__CorrectOptionAssignment_1 )?
            {
             before(grammarAccess.getOptionAccess().getCorrectOptionAssignment_1()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5918:1: ( rule__Option__CorrectOptionAssignment_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5918:2: rule__Option__CorrectOptionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Option__CorrectOptionAssignment_1_in_rule__Option__Group__1__Impl11863);
                    rule__Option__CorrectOptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getCorrectOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__CMap__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5932:1: rule__CMap__Group__0 : rule__CMap__Group__0__Impl rule__CMap__Group__1 ;
    public final void rule__CMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5936:1: ( rule__CMap__Group__0__Impl rule__CMap__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5937:2: rule__CMap__Group__0__Impl rule__CMap__Group__1
            {
            pushFollow(FOLLOW_rule__CMap__Group__0__Impl_in_rule__CMap__Group__011898);
            rule__CMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CMap__Group__1_in_rule__CMap__Group__011901);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5944:1: rule__CMap__Group__0__Impl : ( 'cmap' ) ;
    public final void rule__CMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5948:1: ( ( 'cmap' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5949:1: ( 'cmap' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5949:1: ( 'cmap' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5950:1: 'cmap'
            {
             before(grammarAccess.getCMapAccess().getCmapKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__CMap__Group__0__Impl11929); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5963:1: rule__CMap__Group__1 : rule__CMap__Group__1__Impl rule__CMap__Group__2 ;
    public final void rule__CMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5967:1: ( rule__CMap__Group__1__Impl rule__CMap__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5968:2: rule__CMap__Group__1__Impl rule__CMap__Group__2
            {
            pushFollow(FOLLOW_rule__CMap__Group__1__Impl_in_rule__CMap__Group__111960);
            rule__CMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CMap__Group__2_in_rule__CMap__Group__111963);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5975:1: rule__CMap__Group__1__Impl : ( '{' ) ;
    public final void rule__CMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5979:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5980:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5980:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5981:1: '{'
            {
             before(grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__CMap__Group__1__Impl11991); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5994:1: rule__CMap__Group__2 : rule__CMap__Group__2__Impl rule__CMap__Group__3 ;
    public final void rule__CMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5998:1: ( rule__CMap__Group__2__Impl rule__CMap__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:5999:2: rule__CMap__Group__2__Impl rule__CMap__Group__3
            {
            pushFollow(FOLLOW_rule__CMap__Group__2__Impl_in_rule__CMap__Group__212022);
            rule__CMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CMap__Group__3_in_rule__CMap__Group__212025);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6006:1: rule__CMap__Group__2__Impl : ( ( rule__CMap__ContentAssignment_2 ) ) ;
    public final void rule__CMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6010:1: ( ( ( rule__CMap__ContentAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6011:1: ( ( rule__CMap__ContentAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6011:1: ( ( rule__CMap__ContentAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6012:1: ( rule__CMap__ContentAssignment_2 )
            {
             before(grammarAccess.getCMapAccess().getContentAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6013:1: ( rule__CMap__ContentAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6013:2: rule__CMap__ContentAssignment_2
            {
            pushFollow(FOLLOW_rule__CMap__ContentAssignment_2_in_rule__CMap__Group__2__Impl12052);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6023:1: rule__CMap__Group__3 : rule__CMap__Group__3__Impl ;
    public final void rule__CMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6027:1: ( rule__CMap__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6028:2: rule__CMap__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CMap__Group__3__Impl_in_rule__CMap__Group__312082);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6034:1: rule__CMap__Group__3__Impl : ( '}' ) ;
    public final void rule__CMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6038:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6039:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6039:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6040:1: '}'
            {
             before(grammarAccess.getCMapAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__CMap__Group__3__Impl12110); 
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


    // $ANTLR start "rule__Script__Group__0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6061:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6065:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6066:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__012149);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__1_in_rule__Script__Group__012152);
            rule__Script__Group__1();

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
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6073:1: rule__Script__Group__0__Impl : ( 'script' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6077:1: ( ( 'script' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6078:1: ( 'script' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6078:1: ( 'script' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6079:1: 'script'
            {
             before(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Script__Group__0__Impl12180); 
             after(grammarAccess.getScriptAccess().getScriptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6092:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6096:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6097:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__112211);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__2_in_rule__Script__Group__112214);
            rule__Script__Group__2();

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
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6104:1: rule__Script__Group__1__Impl : ( '{' ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6108:1: ( ( '{' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6109:1: ( '{' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6109:1: ( '{' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6110:1: '{'
            {
             before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Script__Group__1__Impl12242); 
             after(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6123:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6127:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6128:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__212273);
            rule__Script__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__3_in_rule__Script__Group__212276);
            rule__Script__Group__3();

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
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6135:1: rule__Script__Group__2__Impl : ( ( rule__Script__ScriptBodyAssignment_2 ) ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6139:1: ( ( ( rule__Script__ScriptBodyAssignment_2 ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6140:1: ( ( rule__Script__ScriptBodyAssignment_2 ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6140:1: ( ( rule__Script__ScriptBodyAssignment_2 ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6141:1: ( rule__Script__ScriptBodyAssignment_2 )
            {
             before(grammarAccess.getScriptAccess().getScriptBodyAssignment_2()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6142:1: ( rule__Script__ScriptBodyAssignment_2 )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6142:2: rule__Script__ScriptBodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Script__ScriptBodyAssignment_2_in_rule__Script__Group__2__Impl12303);
            rule__Script__ScriptBodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getScriptBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__Script__Group__3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6152:1: rule__Script__Group__3 : rule__Script__Group__3__Impl ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6156:1: ( rule__Script__Group__3__Impl )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6157:2: rule__Script__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__312333);
            rule__Script__Group__3__Impl();

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
    // $ANTLR end "rule__Script__Group__3"


    // $ANTLR start "rule__Script__Group__3__Impl"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6163:1: rule__Script__Group__3__Impl : ( '}' ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6167:1: ( ( '}' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6168:1: ( '}' )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6168:1: ( '}' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6169:1: '}'
            {
             before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Script__Group__3__Impl12361); 
             after(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__3__Impl"


    // $ANTLR start "rule__JoveNotes__ProcessingHintsAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6191:1: rule__JoveNotes__ProcessingHintsAssignment_0 : ( ruleProcessingHints ) ;
    public final void rule__JoveNotes__ProcessingHintsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6195:1: ( ( ruleProcessingHints ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6196:1: ( ruleProcessingHints )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6196:1: ( ruleProcessingHints )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6197:1: ruleProcessingHints
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsProcessingHintsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProcessingHints_in_rule__JoveNotes__ProcessingHintsAssignment_012405);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6206:1: rule__JoveNotes__ChapterDetailsAssignment_1 : ( ruleChapterDetails ) ;
    public final void rule__JoveNotes__ChapterDetailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6210:1: ( ( ruleChapterDetails ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6211:1: ( ruleChapterDetails )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6211:1: ( ruleChapterDetails )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6212:1: ruleChapterDetails
            {
             before(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleChapterDetails_in_rule__JoveNotes__ChapterDetailsAssignment_112436);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6221:1: rule__JoveNotes__NotesElementsAssignment_2 : ( ruleNotesElement ) ;
    public final void rule__JoveNotes__NotesElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6225:1: ( ( ruleNotesElement ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6226:1: ( ruleNotesElement )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6226:1: ( ruleNotesElement )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6227:1: ruleNotesElement
            {
             before(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNotesElement_in_rule__JoveNotes__NotesElementsAssignment_212467);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6236:1: rule__ProcessingHints__SkipGenerationAssignment_1 : ( ( '@skip_generation' ) ) ;
    public final void rule__ProcessingHints__SkipGenerationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6240:1: ( ( ( '@skip_generation' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6241:1: ( ( '@skip_generation' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6241:1: ( ( '@skip_generation' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6242:1: ( '@skip_generation' )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6243:1: ( '@skip_generation' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6244:1: '@skip_generation'
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__ProcessingHints__SkipGenerationAssignment_112503); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6259:1: rule__ProcessingHints__SkipGenerationInProductionAssignment_2 : ( ( '@skip_generation_in_production' ) ) ;
    public final void rule__ProcessingHints__SkipGenerationInProductionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6263:1: ( ( ( '@skip_generation_in_production' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6264:1: ( ( '@skip_generation_in_production' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6264:1: ( ( '@skip_generation_in_production' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6265:1: ( '@skip_generation_in_production' )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6266:1: ( '@skip_generation_in_production' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6267:1: '@skip_generation_in_production'
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 
            match(input,50,FOLLOW_50_in_rule__ProcessingHints__SkipGenerationInProductionAssignment_212547); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6282:1: rule__ChapterDetails__TestPaperAssignment_0 : ( ( '@test_paper' ) ) ;
    public final void rule__ChapterDetails__TestPaperAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6286:1: ( ( ( '@test_paper' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6287:1: ( ( '@test_paper' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6287:1: ( ( '@test_paper' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6288:1: ( '@test_paper' )
            {
             before(grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6289:1: ( '@test_paper' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6290:1: '@test_paper'
            {
             before(grammarAccess.getChapterDetailsAccess().getTestPaperTest_paperKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__ChapterDetails__TestPaperAssignment_012591); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6305:1: rule__ChapterDetails__SubjectNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__SubjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6309:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6310:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6310:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6311:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChapterDetails__SubjectNameAssignment_212630); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6320:1: rule__ChapterDetails__ChapterNumberAssignment_4 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__ChapterNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6324:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6325:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6325:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6326:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ChapterDetails__ChapterNumberAssignment_412661); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6335:1: rule__ChapterDetails__SubChapterNumberAssignment_6 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__SubChapterNumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6339:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6340:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6340:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6341:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ChapterDetails__SubChapterNumberAssignment_612692); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6350:1: rule__ChapterDetails__ChapterNameAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__ChapterNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6354:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6355:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6355:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6356:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChapterDetails__ChapterNameAssignment_812723); 
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


    // $ANTLR start "rule__ChapterDetails__ScriptAssignment_9"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6365:1: rule__ChapterDetails__ScriptAssignment_9 : ( ruleScript ) ;
    public final void rule__ChapterDetails__ScriptAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6369:1: ( ( ruleScript ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6370:1: ( ruleScript )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6370:1: ( ruleScript )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6371:1: ruleScript
            {
             before(grammarAccess.getChapterDetailsAccess().getScriptScriptParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleScript_in_rule__ChapterDetails__ScriptAssignment_912754);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getChapterDetailsAccess().getScriptScriptParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__ScriptAssignment_9"


    // $ANTLR start "rule__NotesElement__ScriptAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6380:1: rule__NotesElement__ScriptAssignment_1 : ( ruleScript ) ;
    public final void rule__NotesElement__ScriptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6384:1: ( ( ruleScript ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6385:1: ( ruleScript )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6385:1: ( ruleScript )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6386:1: ruleScript
            {
             before(grammarAccess.getNotesElementAccess().getScriptScriptParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScript_in_rule__NotesElement__ScriptAssignment_112785);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getNotesElementAccess().getScriptScriptParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotesElement__ScriptAssignment_1"


    // $ANTLR start "rule__WordMeaning__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6395:1: rule__WordMeaning__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__WordMeaning__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6399:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6400:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6400:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6401:1: ( 'hide' )
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6402:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6403:1: 'hide'
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__WordMeaning__HideFromViewAssignment_112821); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6418:1: rule__WordMeaning__WordAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__WordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6422:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6423:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6423:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6424:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WordMeaning__WordAssignment_212860); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6433:1: rule__WordMeaning__MeaningAssignment_3 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__MeaningAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6437:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6438:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6438:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6439:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WordMeaning__MeaningAssignment_312891); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6448:1: rule__QuestionAnswer__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__QuestionAnswer__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6452:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6453:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6453:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6454:1: ( 'hide' )
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6455:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6456:1: 'hide'
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__QuestionAnswer__HideFromViewAssignment_112927); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6471:1: rule__QuestionAnswer__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6475:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6476:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6476:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6477:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QuestionAnswer__QuestionAssignment_212966); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6486:1: rule__QuestionAnswer__AnswerPartsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__AnswerPartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6490:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6491:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6491:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6492:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QuestionAnswer__AnswerPartsAssignment_312997); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6501:1: rule__QuestionAnswer__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__QuestionAnswer__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6505:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6506:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6506:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6507:1: ruleCMap
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__QuestionAnswer__CmapAssignment_413028);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6516:1: rule__FIB__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__FIB__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6520:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6521:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6521:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6522:1: ( 'hide' )
            {
             before(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6523:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6524:1: 'hide'
            {
             before(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__FIB__HideFromViewAssignment_113064); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6539:1: rule__FIB__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FIB__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6543:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6544:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6544:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6545:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FIB__QuestionAssignment_213103); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6554:1: rule__FIB__AnswersAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FIB__AnswersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6558:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6559:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6559:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6560:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FIB__AnswersAssignment_313134); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6569:1: rule__Definition__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Definition__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6573:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6574:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6574:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6575:1: ( 'hide' )
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6576:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6577:1: 'hide'
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__Definition__HideFromViewAssignment_113170); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6592:1: rule__Definition__TermAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Definition__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6596:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6597:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6597:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6598:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Definition__TermAssignment_213209); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6607:1: rule__Definition__DefinitionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Definition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6611:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6612:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6612:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6613:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Definition__DefinitionAssignment_313240); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6622:1: rule__Definition__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__Definition__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6626:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6627:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6627:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6628:1: ruleCMap
            {
             before(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__Definition__CmapAssignment_413271);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6637:1: rule__Character__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Character__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6641:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6642:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6642:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6643:1: ( 'hide' )
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6644:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6645:1: 'hide'
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__Character__HideFromViewAssignment_113307); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6660:1: rule__Character__CharacterAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Character__CharacterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6664:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6665:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6665:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6666:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Character__CharacterAssignment_213346); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6675:1: rule__Character__EstimateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Character__EstimateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6679:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6680:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6680:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6681:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Character__EstimateAssignment_313377); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6690:1: rule__Character__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__Character__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6694:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6695:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6695:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6696:1: ruleCMap
            {
             before(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__Character__CmapAssignment_413408);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6705:1: rule__TeacherNote__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__TeacherNote__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6709:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6710:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6710:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6711:1: ( 'hide' )
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6712:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6713:1: 'hide'
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__TeacherNote__HideFromViewAssignment_113444); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6728:1: rule__TeacherNote__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TeacherNote__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6732:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6733:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6733:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6734:1: RULE_STRING
            {
             before(grammarAccess.getTeacherNoteAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TeacherNote__CaptionAssignment_213483); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6743:1: rule__TeacherNote__NoteAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TeacherNote__NoteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6747:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6748:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6748:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6749:1: RULE_STRING
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TeacherNote__NoteAssignment_313514); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6758:1: rule__TeacherNote__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__TeacherNote__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6762:1: ( ( ruleCMap ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6763:1: ( ruleCMap )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6763:1: ( ruleCMap )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6764:1: ruleCMap
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCMap_in_rule__TeacherNote__CmapAssignment_413545);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6773:1: rule__Matching__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Matching__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6777:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6778:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6778:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6779:1: ( 'hide' )
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6780:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6781:1: 'hide'
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__Matching__HideFromViewAssignment_113581); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6796:1: rule__Matching__SkipReverseQuestionAssignment_2 : ( ( 'skip_reverse_question' ) ) ;
    public final void rule__Matching__SkipReverseQuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6800:1: ( ( ( 'skip_reverse_question' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6801:1: ( ( 'skip_reverse_question' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6801:1: ( ( 'skip_reverse_question' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6802:1: ( 'skip_reverse_question' )
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6803:1: ( 'skip_reverse_question' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6804:1: 'skip_reverse_question'
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 
            match(input,53,FOLLOW_53_in_rule__Matching__SkipReverseQuestionAssignment_213625); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6819:1: rule__Matching__QuestionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Matching__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6823:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6824:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6824:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6825:1: RULE_STRING
            {
             before(grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Matching__QuestionAssignment_313664); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6834:1: rule__Matching__PairsAssignment_5 : ( ruleMatchPair ) ;
    public final void rule__Matching__PairsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6838:1: ( ( ruleMatchPair ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6839:1: ( ruleMatchPair )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6839:1: ( ruleMatchPair )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6840:1: ruleMatchPair
            {
             before(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMatchPair_in_rule__Matching__PairsAssignment_513695);
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


    // $ANTLR start "rule__Matching__McqConfigAssignment_6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6849:1: rule__Matching__McqConfigAssignment_6 : ( ruleMatchMCQConfig ) ;
    public final void rule__Matching__McqConfigAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6853:1: ( ( ruleMatchMCQConfig ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6854:1: ( ruleMatchMCQConfig )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6854:1: ( ruleMatchMCQConfig )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6855:1: ruleMatchMCQConfig
            {
             before(grammarAccess.getMatchingAccess().getMcqConfigMatchMCQConfigParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMatchMCQConfig_in_rule__Matching__McqConfigAssignment_613726);
            ruleMatchMCQConfig();

            state._fsp--;

             after(grammarAccess.getMatchingAccess().getMcqConfigMatchMCQConfigParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matching__McqConfigAssignment_6"


    // $ANTLR start "rule__MatchPair__MatchQuestionAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6864:1: rule__MatchPair__MatchQuestionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchQuestionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6868:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6869:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6869:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6870:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatchPair__MatchQuestionAssignment_013757); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6879:1: rule__MatchPair__MatchAnswerAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchAnswerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6883:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6884:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6884:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6885:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatchPair__MatchAnswerAssignment_213788); 
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


    // $ANTLR start "rule__MatchMCQConfig__ForwardCaptionAssignment_3"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6894:1: rule__MatchMCQConfig__ForwardCaptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MatchMCQConfig__ForwardCaptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6898:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6899:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6899:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6900:1: RULE_STRING
            {
             before(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatchMCQConfig__ForwardCaptionAssignment_313819); 
             after(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__ForwardCaptionAssignment_3"


    // $ANTLR start "rule__MatchMCQConfig__ReverseCaptionAssignment_4_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6909:1: rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__MatchMCQConfig__ReverseCaptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6913:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6914:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6914:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6915:1: RULE_STRING
            {
             before(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatchMCQConfig__ReverseCaptionAssignment_4_113850); 
             after(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__ReverseCaptionAssignment_4_1"


    // $ANTLR start "rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6924:1: rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6928:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6929:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6929:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6930:1: RULE_INT
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MatchMCQConfig__NumOptionsToShowAssignment_5_113881); 
             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1"


    // $ANTLR start "rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6939:1: rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6943:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6944:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6944:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6945:1: RULE_INT
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_113912); 
             after(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1"


    // $ANTLR start "rule__Event__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6954:1: rule__Event__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Event__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6958:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6959:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6959:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6960:1: ( 'hide' )
            {
             before(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6961:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6962:1: 'hide'
            {
             before(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__Event__HideFromViewAssignment_113948); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6977:1: rule__Event__EventAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Event__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6981:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6982:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6982:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6983:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Event__EventAssignment_213987); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6992:1: rule__Event__TimeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Event__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6996:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6997:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6997:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:6998:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Event__TimeAssignment_314018); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7007:1: rule__TrueFalse__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__TrueFalse__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7011:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7012:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7012:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7013:1: ( 'hide' )
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7014:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7015:1: 'hide'
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__TrueFalse__HideFromViewAssignment_114054); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7030:1: rule__TrueFalse__StatementAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7034:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7035:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7035:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7036:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrueFalse__StatementAssignment_214093); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7045:1: rule__TrueFalse__TruthValueAssignment_3 : ( RULE_BOOL ) ;
    public final void rule__TrueFalse__TruthValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7049:1: ( ( RULE_BOOL ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7050:1: ( RULE_BOOL )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7050:1: ( RULE_BOOL )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7051:1: RULE_BOOL
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_3_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__TrueFalse__TruthValueAssignment_314124); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7060:1: rule__TrueFalse__JustificationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__JustificationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7064:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7065:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7065:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7066:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TrueFalse__JustificationAssignment_414155); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7075:1: rule__ChemEquation__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ChemEquation__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7079:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7080:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7080:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7081:1: ( 'hide' )
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7082:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7083:1: 'hide'
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__ChemEquation__HideFromViewAssignment_114191); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7098:1: rule__ChemEquation__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7102:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7103:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7103:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7104:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__DescriptionAssignment_214230); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7113:1: rule__ChemEquation__ReactantsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ReactantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7117:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7118:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7118:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7119:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__ReactantsAssignment_414261); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7128:1: rule__ChemEquation__ProducesAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProducesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7132:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7133:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7133:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7134:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__ProducesAssignment_614292); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7143:1: rule__ChemEquation__ProductsAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProductsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7147:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7148:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7148:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7149:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemEquation__ProductsAssignment_814323); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7158:1: rule__ChemCompound__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ChemCompound__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7162:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7163:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7163:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7164:1: ( 'hide' )
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7165:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7166:1: 'hide'
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__ChemCompound__HideFromViewAssignment_114359); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7181:1: rule__ChemCompound__SymbolAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7185:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7186:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7186:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7187:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemCompound__SymbolAssignment_214398); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7196:1: rule__ChemCompound__ChemicalNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__ChemicalNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7200:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7201:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7201:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7202:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemCompound__ChemicalNameAssignment_314429); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7211:1: rule__ChemCompound__CommonNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__CommonNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7215:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7216:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7216:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7217:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChemCompound__CommonNameAssignment_414460); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7226:1: rule__Spellbee__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Spellbee__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7230:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7231:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7231:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7232:1: ( 'hide' )
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7233:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7234:1: 'hide'
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__Spellbee__HideFromViewAssignment_114496); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7249:1: rule__Spellbee__WordAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Spellbee__WordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7253:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7254:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7254:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7255:1: RULE_STRING
            {
             before(grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Spellbee__WordAssignment_214535); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7264:1: rule__ImageLabel__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ImageLabel__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7268:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7269:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7269:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7270:1: ( 'hide' )
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7271:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7272:1: 'hide'
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__ImageLabel__HideFromViewAssignment_114571); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7287:1: rule__ImageLabel__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7291:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7292:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7292:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7293:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImageLabel__CaptionAssignment_214610); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7302:1: rule__ImageLabel__ImageNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__ImageNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7306:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7307:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7307:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7308:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImageLabel__ImageNameAssignment_514641); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7317:1: rule__ImageLabel__HotspotsAssignment_6 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7321:1: ( ( ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7322:1: ( ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7322:1: ( ruleHotSpot )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7323:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_614672);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7332:1: rule__ImageLabel__HotspotsAssignment_7_1 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7336:1: ( ( ruleHotSpot ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7337:1: ( ruleHotSpot )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7337:1: ( ruleHotSpot )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7338:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_7_114703);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7347:1: rule__HotSpot__XAssignment_0 : ( RULE_INT ) ;
    public final void rule__HotSpot__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7351:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7352:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7352:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7353:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__HotSpot__XAssignment_014734); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7362:1: rule__HotSpot__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__HotSpot__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7366:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7367:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7367:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7368:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__HotSpot__YAssignment_214765); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7377:1: rule__HotSpot__LabelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__HotSpot__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7381:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7382:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7382:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7383:1: RULE_STRING
            {
             before(grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HotSpot__LabelAssignment_414796); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7392:1: rule__Equation__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Equation__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7396:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7397:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7397:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7398:1: ( 'hide' )
            {
             before(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7399:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7400:1: 'hide'
            {
             before(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__Equation__HideFromViewAssignment_114832); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7415:1: rule__Equation__EquationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Equation__EquationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7419:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7420:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7420:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7421:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Equation__EquationAssignment_214871); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7430:1: rule__Equation__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Equation__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7434:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7435:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7435:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7436:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Equation__DescriptionAssignment_414902); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7445:1: rule__Equation__SymbolsAssignment_6 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7449:1: ( ( ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7450:1: ( ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7450:1: ( ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7451:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_614933);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7460:1: rule__Equation__SymbolsAssignment_7_1 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7464:1: ( ( ruleEqSymbol ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7465:1: ( ruleEqSymbol )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7465:1: ( ruleEqSymbol )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7466:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_7_114964);
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7475:1: rule__EqSymbol__SymbolAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__SymbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7479:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7480:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7480:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7481:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqSymbol__SymbolAssignment_014995); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7490:1: rule__EqSymbol__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7494:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7495:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7495:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7496:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EqSymbol__DescriptionAssignment_215026); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7505:1: rule__RefToContext__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__RefToContext__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7509:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7510:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7510:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7511:1: ( 'hide' )
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7512:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7513:1: 'hide'
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__RefToContext__HideFromViewAssignment_115062); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7528:1: rule__RefToContext__ContextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__RefToContext__ContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7532:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7533:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7533:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7534:1: RULE_STRING
            {
             before(grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RefToContext__ContextAssignment_415101); 
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
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7543:1: rule__RefToContext__QuestionsAssignment_5 : ( ruleQuestionAnswer ) ;
    public final void rule__RefToContext__QuestionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7547:1: ( ( ruleQuestionAnswer ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7548:1: ( ruleQuestionAnswer )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7548:1: ( ruleQuestionAnswer )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7549:1: ruleQuestionAnswer
            {
             before(grammarAccess.getRefToContextAccess().getQuestionsQuestionAnswerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQuestionAnswer_in_rule__RefToContext__QuestionsAssignment_515132);
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


    // $ANTLR start "rule__MultiChoice__HideFromViewAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7558:1: rule__MultiChoice__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__MultiChoice__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7562:1: ( ( ( 'hide' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7563:1: ( ( 'hide' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7563:1: ( ( 'hide' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7564:1: ( 'hide' )
            {
             before(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7565:1: ( 'hide' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7566:1: 'hide'
            {
             before(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__MultiChoice__HideFromViewAssignment_115168); 
             after(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__HideFromViewAssignment_1"


    // $ANTLR start "rule__MultiChoice__QuestionAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7581:1: rule__MultiChoice__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MultiChoice__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7585:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7586:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7586:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7587:1: RULE_STRING
            {
             before(grammarAccess.getMultiChoiceAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiChoice__QuestionAssignment_215207); 
             after(grammarAccess.getMultiChoiceAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__QuestionAssignment_2"


    // $ANTLR start "rule__MultiChoice__OptionsAssignment_6"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7596:1: rule__MultiChoice__OptionsAssignment_6 : ( ruleOption ) ;
    public final void rule__MultiChoice__OptionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7600:1: ( ( ruleOption ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7601:1: ( ruleOption )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7601:1: ( ruleOption )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7602:1: ruleOption
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__MultiChoice__OptionsAssignment_615238);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__OptionsAssignment_6"


    // $ANTLR start "rule__MultiChoice__OptionsAssignment_7_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7611:1: rule__MultiChoice__OptionsAssignment_7_1 : ( ruleOption ) ;
    public final void rule__MultiChoice__OptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7615:1: ( ( ruleOption ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7616:1: ( ruleOption )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7616:1: ( ruleOption )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7617:1: ruleOption
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__MultiChoice__OptionsAssignment_7_115269);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__OptionsAssignment_7_1"


    // $ANTLR start "rule__MultiChoice__NumOptionsToShowAssignment_9_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7626:1: rule__MultiChoice__NumOptionsToShowAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__MultiChoice__NumOptionsToShowAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7630:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7631:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7631:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7632:1: RULE_INT
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowINTTerminalRuleCall_9_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MultiChoice__NumOptionsToShowAssignment_9_115300); 
             after(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowINTTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__NumOptionsToShowAssignment_9_1"


    // $ANTLR start "rule__MultiChoice__NumOptionsPerRowAssignment_10_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7641:1: rule__MultiChoice__NumOptionsPerRowAssignment_10_1 : ( RULE_INT ) ;
    public final void rule__MultiChoice__NumOptionsPerRowAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7645:1: ( ( RULE_INT ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7646:1: ( RULE_INT )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7646:1: ( RULE_INT )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7647:1: RULE_INT
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowINTTerminalRuleCall_10_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MultiChoice__NumOptionsPerRowAssignment_10_115331); 
             after(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowINTTerminalRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__NumOptionsPerRowAssignment_10_1"


    // $ANTLR start "rule__MultiChoice__ExplanationAssignment_11_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7656:1: rule__MultiChoice__ExplanationAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__MultiChoice__ExplanationAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7660:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7661:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7661:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7662:1: RULE_STRING
            {
             before(grammarAccess.getMultiChoiceAccess().getExplanationSTRINGTerminalRuleCall_11_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiChoice__ExplanationAssignment_11_115362); 
             after(grammarAccess.getMultiChoiceAccess().getExplanationSTRINGTerminalRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoice__ExplanationAssignment_11_1"


    // $ANTLR start "rule__Option__OptionValueAssignment_0"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7671:1: rule__Option__OptionValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Option__OptionValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7675:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7676:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7676:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7677:1: RULE_STRING
            {
             before(grammarAccess.getOptionAccess().getOptionValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Option__OptionValueAssignment_015393); 
             after(grammarAccess.getOptionAccess().getOptionValueSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__OptionValueAssignment_0"


    // $ANTLR start "rule__Option__CorrectOptionAssignment_1"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7686:1: rule__Option__CorrectOptionAssignment_1 : ( ( 'correct' ) ) ;
    public final void rule__Option__CorrectOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7690:1: ( ( ( 'correct' ) ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7691:1: ( ( 'correct' ) )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7691:1: ( ( 'correct' ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7692:1: ( 'correct' )
            {
             before(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7693:1: ( 'correct' )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7694:1: 'correct'
            {
             before(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 
            match(input,54,FOLLOW_54_in_rule__Option__CorrectOptionAssignment_115429); 
             after(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 

            }

             after(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__CorrectOptionAssignment_1"


    // $ANTLR start "rule__CMap__ContentAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7709:1: rule__CMap__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CMap__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7713:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7714:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7714:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7715:1: RULE_STRING
            {
             before(grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CMap__ContentAssignment_215468); 
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


    // $ANTLR start "rule__Script__ScriptBodyAssignment_2"
    // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7724:1: rule__Script__ScriptBodyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Script__ScriptBodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7728:1: ( ( RULE_STRING ) )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7729:1: ( RULE_STRING )
            {
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7729:1: ( RULE_STRING )
            // ../com.sandy.xtext.jovenotes.ui/src-gen/com/sandy/xtext/ui/contentassist/antlr/internal/InternalJoveNotes.g:7730:1: RULE_STRING
            {
             before(grammarAccess.getScriptAccess().getScriptBodySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Script__ScriptBodyAssignment_215499); 
             after(grammarAccess.getScriptAccess().getScriptBodySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__ScriptBodyAssignment_2"

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
    public static final BitSet FOLLOW_rule__NotesElement__Group__0_in_ruleNotesElement274 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleMatchMCQConfig_in_entryRuleMatchMCQConfig781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchMCQConfig788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__0_in_ruleMatchMCQConfig814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_entryRuleTrueFalse901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueFalse908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__0_in_ruleTrueFalse934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_entryRuleChemEquation961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemEquation968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__0_in_ruleChemEquation994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_entryRuleChemCompound1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChemCompound1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__0_in_ruleChemCompound1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_entryRuleSpellbee1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpellbee1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__0_in_ruleSpellbee1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_entryRuleImageLabel1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageLabel1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__0_in_ruleImageLabel1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_entryRuleHotSpot1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHotSpot1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__0_in_ruleHotSpot1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0_in_ruleEquation1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_entryRuleEqSymbol1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqSymbol1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__0_in_ruleEqSymbol1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_entryRuleRefToContext1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefToContext1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__0_in_ruleRefToContext1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiChoice_in_entryRuleMultiChoice1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiChoice1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__0_in_ruleMultiChoice1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_entryRuleCMap1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCMap1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__0_in_ruleCMap1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0_in_ruleScript1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMeaning_in_rule__NotesElement__Alternatives_01690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_rule__NotesElement__Alternatives_01707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFIB_in_rule__NotesElement__Alternatives_01724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__NotesElement__Alternatives_01741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_rule__NotesElement__Alternatives_01758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeacherNote_in_rule__NotesElement__Alternatives_01775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatching_in_rule__NotesElement__Alternatives_01792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__NotesElement__Alternatives_01809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueFalse_in_rule__NotesElement__Alternatives_01826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemEquation_in_rule__NotesElement__Alternatives_01843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChemCompound_in_rule__NotesElement__Alternatives_01860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpellbee_in_rule__NotesElement__Alternatives_01877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageLabel_in_rule__NotesElement__Alternatives_01894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_rule__NotesElement__Alternatives_01911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefToContext_in_rule__NotesElement__Alternatives_01928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiChoice_in_rule__NotesElement__Alternatives_01945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__0__Impl_in_rule__JoveNotes__Group__01975 = new BitSet(new long[]{0x0008000000001000L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__1_in_rule__JoveNotes__Group__01978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__ProcessingHintsAssignment_0_in_rule__JoveNotes__Group__0__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__1__Impl_in_rule__JoveNotes__Group__12035 = new BitSet(new long[]{0x0000153B807F0000L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__2_in_rule__JoveNotes__Group__12038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__ChapterDetailsAssignment_1_in_rule__JoveNotes__Group__1__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__Group__2__Impl_in_rule__JoveNotes__Group__22095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoveNotes__NotesElementsAssignment_2_in_rule__JoveNotes__Group__2__Impl2122 = new BitSet(new long[]{0x0000153B807F0002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__0__Impl_in_rule__ProcessingHints__Group__02159 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__1_in_rule__ProcessingHints__Group__02162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__1__Impl_in_rule__ProcessingHints__Group__12220 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__2_in_rule__ProcessingHints__Group__12223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__SkipGenerationAssignment_1_in_rule__ProcessingHints__Group__1__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__Group__2__Impl_in_rule__ProcessingHints__Group__22281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingHints__SkipGenerationInProductionAssignment_2_in_rule__ProcessingHints__Group__2__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__0__Impl_in_rule__ChapterDetails__Group__02345 = new BitSet(new long[]{0x0008000000001000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__1_in_rule__ChapterDetails__Group__02348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__TestPaperAssignment_0_in_rule__ChapterDetails__Group__0__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__1__Impl_in_rule__ChapterDetails__Group__12406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__2_in_rule__ChapterDetails__Group__12409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ChapterDetails__Group__1__Impl2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__2__Impl_in_rule__ChapterDetails__Group__22468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__3_in_rule__ChapterDetails__Group__22471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__SubjectNameAssignment_2_in_rule__ChapterDetails__Group__2__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__3__Impl_in_rule__ChapterDetails__Group__32528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__4_in_rule__ChapterDetails__Group__32531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ChapterDetails__Group__3__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__4__Impl_in_rule__ChapterDetails__Group__42590 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__5_in_rule__ChapterDetails__Group__42593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__ChapterNumberAssignment_4_in_rule__ChapterDetails__Group__4__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__5__Impl_in_rule__ChapterDetails__Group__52650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__6_in_rule__ChapterDetails__Group__52653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ChapterDetails__Group__5__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__6__Impl_in_rule__ChapterDetails__Group__62712 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__7_in_rule__ChapterDetails__Group__62715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__SubChapterNumberAssignment_6_in_rule__ChapterDetails__Group__6__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__7__Impl_in_rule__ChapterDetails__Group__72772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__8_in_rule__ChapterDetails__Group__72775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ChapterDetails__Group__7__Impl2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__8__Impl_in_rule__ChapterDetails__Group__82834 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__9_in_rule__ChapterDetails__Group__82837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__ChapterNameAssignment_8_in_rule__ChapterDetails__Group__8__Impl2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__Group__9__Impl_in_rule__ChapterDetails__Group__92894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChapterDetails__ScriptAssignment_9_in_rule__ChapterDetails__Group__9__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotesElement__Group__0__Impl_in_rule__NotesElement__Group__02972 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__NotesElement__Group__1_in_rule__NotesElement__Group__02975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotesElement__Alternatives_0_in_rule__NotesElement__Group__0__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotesElement__Group__1__Impl_in_rule__NotesElement__Group__13032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotesElement__ScriptAssignment_1_in_rule__NotesElement__Group__1__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__0__Impl_in_rule__WordMeaning__Group__03094 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__1_in_rule__WordMeaning__Group__03097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WordMeaning__Group__0__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__1__Impl_in_rule__WordMeaning__Group__13156 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__2_in_rule__WordMeaning__Group__13159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__HideFromViewAssignment_1_in_rule__WordMeaning__Group__1__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__2__Impl_in_rule__WordMeaning__Group__23217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__3_in_rule__WordMeaning__Group__23220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__WordAssignment_2_in_rule__WordMeaning__Group__2__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__Group__3__Impl_in_rule__WordMeaning__Group__33277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMeaning__MeaningAssignment_3_in_rule__WordMeaning__Group__3__Impl3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__0__Impl_in_rule__QuestionAnswer__Group__03342 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__1_in_rule__QuestionAnswer__Group__03345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QuestionAnswer__Group__0__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__1__Impl_in_rule__QuestionAnswer__Group__13404 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__2_in_rule__QuestionAnswer__Group__13407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__HideFromViewAssignment_1_in_rule__QuestionAnswer__Group__1__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__2__Impl_in_rule__QuestionAnswer__Group__23465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__3_in_rule__QuestionAnswer__Group__23468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__QuestionAssignment_2_in_rule__QuestionAnswer__Group__2__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__3__Impl_in_rule__QuestionAnswer__Group__33525 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__4_in_rule__QuestionAnswer__Group__33528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__AnswerPartsAssignment_3_in_rule__QuestionAnswer__Group__3__Impl3557 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__AnswerPartsAssignment_3_in_rule__QuestionAnswer__Group__3__Impl3569 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__Group__4__Impl_in_rule__QuestionAnswer__Group__43602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionAnswer__CmapAssignment_4_in_rule__QuestionAnswer__Group__4__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__0__Impl_in_rule__FIB__Group__03670 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__FIB__Group__1_in_rule__FIB__Group__03673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FIB__Group__0__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__1__Impl_in_rule__FIB__Group__13732 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__FIB__Group__2_in_rule__FIB__Group__13735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__HideFromViewAssignment_1_in_rule__FIB__Group__1__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__2__Impl_in_rule__FIB__Group__23793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FIB__Group__3_in_rule__FIB__Group__23796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__QuestionAssignment_2_in_rule__FIB__Group__2__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__Group__3__Impl_in_rule__FIB__Group__33853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FIB__AnswersAssignment_3_in_rule__FIB__Group__3__Impl3882 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FIB__AnswersAssignment_3_in_rule__FIB__Group__3__Impl3894 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__03935 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__03938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__0__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__13997 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__14000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__HideFromViewAssignment_1_in_rule__Definition__Group__1__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__24058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__24061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__TermAssignment_2_in_rule__Definition__Group__2__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__34118 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__34121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__DefinitionAssignment_3_in_rule__Definition__Group__3__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__44178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__CmapAssignment_4_in_rule__Definition__Group__4__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__04246 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Character__Group__1_in_rule__Character__Group__04249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Character__Group__0__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__14308 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Character__Group__2_in_rule__Character__Group__14311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__HideFromViewAssignment_1_in_rule__Character__Group__1__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__24369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Character__Group__3_in_rule__Character__Group__24372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__CharacterAssignment_2_in_rule__Character__Group__2__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__34429 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Character__Group__4_in_rule__Character__Group__34432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__EstimateAssignment_3_in_rule__Character__Group__3__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__44489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__CmapAssignment_4_in_rule__Character__Group__4__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__0__Impl_in_rule__TeacherNote__Group__04557 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__1_in_rule__TeacherNote__Group__04560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TeacherNote__Group__0__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__1__Impl_in_rule__TeacherNote__Group__14619 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__2_in_rule__TeacherNote__Group__14622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__HideFromViewAssignment_1_in_rule__TeacherNote__Group__1__Impl4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__2__Impl_in_rule__TeacherNote__Group__24680 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__3_in_rule__TeacherNote__Group__24683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__CaptionAssignment_2_in_rule__TeacherNote__Group__2__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__3__Impl_in_rule__TeacherNote__Group__34741 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__4_in_rule__TeacherNote__Group__34744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__NoteAssignment_3_in_rule__TeacherNote__Group__3__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__Group__4__Impl_in_rule__TeacherNote__Group__44801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TeacherNote__CmapAssignment_4_in_rule__TeacherNote__Group__4__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__0__Impl_in_rule__Matching__Group__04869 = new BitSet(new long[]{0x0030000000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__1_in_rule__Matching__Group__04872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Matching__Group__0__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__1__Impl_in_rule__Matching__Group__14931 = new BitSet(new long[]{0x0030000000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__2_in_rule__Matching__Group__14934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__HideFromViewAssignment_1_in_rule__Matching__Group__1__Impl4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__2__Impl_in_rule__Matching__Group__24992 = new BitSet(new long[]{0x0030000000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__3_in_rule__Matching__Group__24995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__SkipReverseQuestionAssignment_2_in_rule__Matching__Group__2__Impl5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__3__Impl_in_rule__Matching__Group__35053 = new BitSet(new long[]{0x0030000000800010L});
    public static final BitSet FOLLOW_rule__Matching__Group__4_in_rule__Matching__Group__35056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__QuestionAssignment_3_in_rule__Matching__Group__3__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__4__Impl_in_rule__Matching__Group__45114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Matching__Group__5_in_rule__Matching__Group__45117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Matching__Group__4__Impl5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__5__Impl_in_rule__Matching__Group__55176 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rule__Matching__Group__6_in_rule__Matching__Group__55179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__PairsAssignment_5_in_rule__Matching__Group__5__Impl5208 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Matching__PairsAssignment_5_in_rule__Matching__Group__5__Impl5220 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Matching__Group__6__Impl_in_rule__Matching__Group__65253 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rule__Matching__Group__7_in_rule__Matching__Group__65256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__McqConfigAssignment_6_in_rule__Matching__Group__6__Impl5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matching__Group__7__Impl_in_rule__Matching__Group__75314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Matching__Group__7__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__0__Impl_in_rule__MatchPair__Group__05389 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__1_in_rule__MatchPair__Group__05392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__MatchQuestionAssignment_0_in_rule__MatchPair__Group__0__Impl5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__1__Impl_in_rule__MatchPair__Group__15449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__2_in_rule__MatchPair__Group__15452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MatchPair__Group__1__Impl5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__Group__2__Impl_in_rule__MatchPair__Group__25511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchPair__MatchAnswerAssignment_2_in_rule__MatchPair__Group__2__Impl5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__0__Impl_in_rule__MatchMCQConfig__Group__05574 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__1_in_rule__MatchMCQConfig__Group__05577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MatchMCQConfig__Group__0__Impl5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__1__Impl_in_rule__MatchMCQConfig__Group__15636 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__2_in_rule__MatchMCQConfig__Group__15639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MatchMCQConfig__Group__1__Impl5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__2__Impl_in_rule__MatchMCQConfig__Group__25698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__3_in_rule__MatchMCQConfig__Group__25701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MatchMCQConfig__Group__2__Impl5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__3__Impl_in_rule__MatchMCQConfig__Group__35760 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__4_in_rule__MatchMCQConfig__Group__35763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__ForwardCaptionAssignment_3_in_rule__MatchMCQConfig__Group__3__Impl5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__4__Impl_in_rule__MatchMCQConfig__Group__45820 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__5_in_rule__MatchMCQConfig__Group__45823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_4__0_in_rule__MatchMCQConfig__Group__4__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__5__Impl_in_rule__MatchMCQConfig__Group__55881 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__6_in_rule__MatchMCQConfig__Group__55884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_5__0_in_rule__MatchMCQConfig__Group__5__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__6__Impl_in_rule__MatchMCQConfig__Group__65942 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__7_in_rule__MatchMCQConfig__Group__65945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_6__0_in_rule__MatchMCQConfig__Group__6__Impl5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group__7__Impl_in_rule__MatchMCQConfig__Group__76003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MatchMCQConfig__Group__7__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_4__0__Impl_in_rule__MatchMCQConfig__Group_4__06078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_4__1_in_rule__MatchMCQConfig__Group_4__06081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MatchMCQConfig__Group_4__0__Impl6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_4__1__Impl_in_rule__MatchMCQConfig__Group_4__16140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__ReverseCaptionAssignment_4_1_in_rule__MatchMCQConfig__Group_4__1__Impl6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_5__0__Impl_in_rule__MatchMCQConfig__Group_5__06201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_5__1_in_rule__MatchMCQConfig__Group_5__06204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MatchMCQConfig__Group_5__0__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_5__1__Impl_in_rule__MatchMCQConfig__Group_5__16263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1_in_rule__MatchMCQConfig__Group_5__1__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_6__0__Impl_in_rule__MatchMCQConfig__Group_6__06324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_6__1_in_rule__MatchMCQConfig__Group_6__06327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MatchMCQConfig__Group_6__0__Impl6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__Group_6__1__Impl_in_rule__MatchMCQConfig__Group_6__16386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1_in_rule__MatchMCQConfig__Group_6__1__Impl6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__06447 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__06450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Event__Group__0__Impl6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__16509 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__16512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__HideFromViewAssignment_1_in_rule__Event__Group__1__Impl6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__26570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__3_in_rule__Event__Group__26573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventAssignment_2_in_rule__Event__Group__2__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__36630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__TimeAssignment_3_in_rule__Event__Group__3__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__0__Impl_in_rule__TrueFalse__Group__06695 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__1_in_rule__TrueFalse__Group__06698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TrueFalse__Group__0__Impl6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__1__Impl_in_rule__TrueFalse__Group__16757 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__2_in_rule__TrueFalse__Group__16760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__HideFromViewAssignment_1_in_rule__TrueFalse__Group__1__Impl6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__2__Impl_in_rule__TrueFalse__Group__26818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__3_in_rule__TrueFalse__Group__26821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__StatementAssignment_2_in_rule__TrueFalse__Group__2__Impl6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__3__Impl_in_rule__TrueFalse__Group__36878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__4_in_rule__TrueFalse__Group__36881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__TruthValueAssignment_3_in_rule__TrueFalse__Group__3__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__Group__4__Impl_in_rule__TrueFalse__Group__46938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrueFalse__JustificationAssignment_4_in_rule__TrueFalse__Group__4__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__0__Impl_in_rule__ChemEquation__Group__07006 = new BitSet(new long[]{0x0010000000800010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__1_in_rule__ChemEquation__Group__07009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ChemEquation__Group__0__Impl7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__1__Impl_in_rule__ChemEquation__Group__17068 = new BitSet(new long[]{0x0010000000800010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__2_in_rule__ChemEquation__Group__17071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__HideFromViewAssignment_1_in_rule__ChemEquation__Group__1__Impl7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__2__Impl_in_rule__ChemEquation__Group__27129 = new BitSet(new long[]{0x0010000000800010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__3_in_rule__ChemEquation__Group__27132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__DescriptionAssignment_2_in_rule__ChemEquation__Group__2__Impl7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__3__Impl_in_rule__ChemEquation__Group__37190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__4_in_rule__ChemEquation__Group__37193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ChemEquation__Group__3__Impl7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__4__Impl_in_rule__ChemEquation__Group__47252 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__5_in_rule__ChemEquation__Group__47255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__ReactantsAssignment_4_in_rule__ChemEquation__Group__4__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__5__Impl_in_rule__ChemEquation__Group__57312 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__6_in_rule__ChemEquation__Group__57315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ChemEquation__Group__5__Impl7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__6__Impl_in_rule__ChemEquation__Group__67374 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__7_in_rule__ChemEquation__Group__67377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__ProducesAssignment_6_in_rule__ChemEquation__Group__6__Impl7404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__7__Impl_in_rule__ChemEquation__Group__77435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__8_in_rule__ChemEquation__Group__77438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ChemEquation__Group__7__Impl7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__8__Impl_in_rule__ChemEquation__Group__87497 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__9_in_rule__ChemEquation__Group__87500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__ProductsAssignment_8_in_rule__ChemEquation__Group__8__Impl7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemEquation__Group__9__Impl_in_rule__ChemEquation__Group__97557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ChemEquation__Group__9__Impl7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__0__Impl_in_rule__ChemCompound__Group__07636 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__1_in_rule__ChemCompound__Group__07639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ChemCompound__Group__0__Impl7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__1__Impl_in_rule__ChemCompound__Group__17698 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__2_in_rule__ChemCompound__Group__17701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__HideFromViewAssignment_1_in_rule__ChemCompound__Group__1__Impl7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__2__Impl_in_rule__ChemCompound__Group__27759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__3_in_rule__ChemCompound__Group__27762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__SymbolAssignment_2_in_rule__ChemCompound__Group__2__Impl7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__3__Impl_in_rule__ChemCompound__Group__37819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__4_in_rule__ChemCompound__Group__37822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__ChemicalNameAssignment_3_in_rule__ChemCompound__Group__3__Impl7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__Group__4__Impl_in_rule__ChemCompound__Group__47879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChemCompound__CommonNameAssignment_4_in_rule__ChemCompound__Group__4__Impl7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__0__Impl_in_rule__Spellbee__Group__07947 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__1_in_rule__Spellbee__Group__07950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Spellbee__Group__0__Impl7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__1__Impl_in_rule__Spellbee__Group__18009 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__2_in_rule__Spellbee__Group__18012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__HideFromViewAssignment_1_in_rule__Spellbee__Group__1__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__Group__2__Impl_in_rule__Spellbee__Group__28070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spellbee__WordAssignment_2_in_rule__Spellbee__Group__2__Impl8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__0__Impl_in_rule__ImageLabel__Group__08133 = new BitSet(new long[]{0x0010000000800010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__1_in_rule__ImageLabel__Group__08136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ImageLabel__Group__0__Impl8164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__1__Impl_in_rule__ImageLabel__Group__18195 = new BitSet(new long[]{0x0010000000800010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__2_in_rule__ImageLabel__Group__18198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__HideFromViewAssignment_1_in_rule__ImageLabel__Group__1__Impl8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__2__Impl_in_rule__ImageLabel__Group__28256 = new BitSet(new long[]{0x0010000000800010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__3_in_rule__ImageLabel__Group__28259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__CaptionAssignment_2_in_rule__ImageLabel__Group__2__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__3__Impl_in_rule__ImageLabel__Group__38317 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__4_in_rule__ImageLabel__Group__38320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ImageLabel__Group__3__Impl8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__4__Impl_in_rule__ImageLabel__Group__48379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__5_in_rule__ImageLabel__Group__48382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ImageLabel__Group__4__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__5__Impl_in_rule__ImageLabel__Group__58441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__6_in_rule__ImageLabel__Group__58444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__ImageNameAssignment_5_in_rule__ImageLabel__Group__5__Impl8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__6__Impl_in_rule__ImageLabel__Group__68501 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__7_in_rule__ImageLabel__Group__68504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__HotspotsAssignment_6_in_rule__ImageLabel__Group__6__Impl8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__7__Impl_in_rule__ImageLabel__Group__78561 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__8_in_rule__ImageLabel__Group__78564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_7__0_in_rule__ImageLabel__Group__7__Impl8591 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group__8__Impl_in_rule__ImageLabel__Group__88622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ImageLabel__Group__8__Impl8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_7__0__Impl_in_rule__ImageLabel__Group_7__08699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_7__1_in_rule__ImageLabel__Group_7__08702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ImageLabel__Group_7__0__Impl8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__Group_7__1__Impl_in_rule__ImageLabel__Group_7__18761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageLabel__HotspotsAssignment_7_1_in_rule__ImageLabel__Group_7__1__Impl8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__0__Impl_in_rule__HotSpot__Group__08822 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__1_in_rule__HotSpot__Group__08825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__XAssignment_0_in_rule__HotSpot__Group__0__Impl8852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__1__Impl_in_rule__HotSpot__Group__18882 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__2_in_rule__HotSpot__Group__18885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__HotSpot__Group__1__Impl8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__2__Impl_in_rule__HotSpot__Group__28944 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__3_in_rule__HotSpot__Group__28947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__YAssignment_2_in_rule__HotSpot__Group__2__Impl8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__3__Impl_in_rule__HotSpot__Group__39004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__4_in_rule__HotSpot__Group__39007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__HotSpot__Group__3__Impl9035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__Group__4__Impl_in_rule__HotSpot__Group__49066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HotSpot__LabelAssignment_4_in_rule__HotSpot__Group__4__Impl9093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__09133 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__09136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Equation__Group__0__Impl9164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__19195 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__19198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__HideFromViewAssignment_1_in_rule__Equation__Group__1__Impl9225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__29256 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Equation__Group__3_in_rule__Equation__Group__29259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__EquationAssignment_2_in_rule__Equation__Group__2__Impl9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__3__Impl_in_rule__Equation__Group__39316 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__4_in_rule__Equation__Group__39319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Equation__Group__3__Impl9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__4__Impl_in_rule__Equation__Group__49378 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__5_in_rule__Equation__Group__49381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__DescriptionAssignment_4_in_rule__Equation__Group__4__Impl9408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__5__Impl_in_rule__Equation__Group__59439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group__6_in_rule__Equation__Group__59442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Equation__Group__5__Impl9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__6__Impl_in_rule__Equation__Group__69501 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_rule__Equation__Group__7_in_rule__Equation__Group__69504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__SymbolsAssignment_6_in_rule__Equation__Group__6__Impl9531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__7__Impl_in_rule__Equation__Group__79561 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_rule__Equation__Group__8_in_rule__Equation__Group__79564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_7__0_in_rule__Equation__Group__7__Impl9591 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group__8__Impl_in_rule__Equation__Group__89622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Equation__Group__8__Impl9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_7__0__Impl_in_rule__Equation__Group_7__09699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Equation__Group_7__1_in_rule__Equation__Group_7__09702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Equation__Group_7__0__Impl9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__Group_7__1__Impl_in_rule__Equation__Group_7__19761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equation__SymbolsAssignment_7_1_in_rule__Equation__Group_7__1__Impl9788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__0__Impl_in_rule__EqSymbol__Group__09822 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__1_in_rule__EqSymbol__Group__09825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__SymbolAssignment_0_in_rule__EqSymbol__Group__0__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__1__Impl_in_rule__EqSymbol__Group__19882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__2_in_rule__EqSymbol__Group__19885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EqSymbol__Group__1__Impl9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__Group__2__Impl_in_rule__EqSymbol__Group__29944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqSymbol__DescriptionAssignment_2_in_rule__EqSymbol__Group__2__Impl9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__0__Impl_in_rule__RefToContext__Group__010007 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__1_in_rule__RefToContext__Group__010010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__RefToContext__Group__0__Impl10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__1__Impl_in_rule__RefToContext__Group__110069 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__2_in_rule__RefToContext__Group__110072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__HideFromViewAssignment_1_in_rule__RefToContext__Group__1__Impl10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__2__Impl_in_rule__RefToContext__Group__210130 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__3_in_rule__RefToContext__Group__210133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RefToContext__Group__2__Impl10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__3__Impl_in_rule__RefToContext__Group__310192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__4_in_rule__RefToContext__Group__310195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__RefToContext__Group__3__Impl10223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__4__Impl_in_rule__RefToContext__Group__410254 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__5_in_rule__RefToContext__Group__410257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__ContextAssignment_4_in_rule__RefToContext__Group__4__Impl10284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__5__Impl_in_rule__RefToContext__Group__510314 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__6_in_rule__RefToContext__Group__510317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefToContext__QuestionsAssignment_5_in_rule__RefToContext__Group__5__Impl10346 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__RefToContext__QuestionsAssignment_5_in_rule__RefToContext__Group__5__Impl10358 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__RefToContext__Group__6__Impl_in_rule__RefToContext__Group__610391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RefToContext__Group__6__Impl10419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__0__Impl_in_rule__MultiChoice__Group__010464 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__1_in_rule__MultiChoice__Group__010467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MultiChoice__Group__0__Impl10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__1__Impl_in_rule__MultiChoice__Group__110526 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__2_in_rule__MultiChoice__Group__110529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__HideFromViewAssignment_1_in_rule__MultiChoice__Group__1__Impl10556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__2__Impl_in_rule__MultiChoice__Group__210587 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__3_in_rule__MultiChoice__Group__210590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__QuestionAssignment_2_in_rule__MultiChoice__Group__2__Impl10617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__3__Impl_in_rule__MultiChoice__Group__310647 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__4_in_rule__MultiChoice__Group__310650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MultiChoice__Group__3__Impl10678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__4__Impl_in_rule__MultiChoice__Group__410709 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__5_in_rule__MultiChoice__Group__410712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MultiChoice__Group__4__Impl10740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__5__Impl_in_rule__MultiChoice__Group__510771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__6_in_rule__MultiChoice__Group__510774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MultiChoice__Group__5__Impl10802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__6__Impl_in_rule__MultiChoice__Group__610833 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__7_in_rule__MultiChoice__Group__610836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__OptionsAssignment_6_in_rule__MultiChoice__Group__6__Impl10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__7__Impl_in_rule__MultiChoice__Group__710893 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__8_in_rule__MultiChoice__Group__710896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_7__0_in_rule__MultiChoice__Group__7__Impl10923 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__8__Impl_in_rule__MultiChoice__Group__810954 = new BitSet(new long[]{0x0000400061000000L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__9_in_rule__MultiChoice__Group__810957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MultiChoice__Group__8__Impl10985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__9__Impl_in_rule__MultiChoice__Group__911016 = new BitSet(new long[]{0x0000400061000000L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__10_in_rule__MultiChoice__Group__911019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_9__0_in_rule__MultiChoice__Group__9__Impl11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__10__Impl_in_rule__MultiChoice__Group__1011077 = new BitSet(new long[]{0x0000400061000000L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__11_in_rule__MultiChoice__Group__1011080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_10__0_in_rule__MultiChoice__Group__10__Impl11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__11__Impl_in_rule__MultiChoice__Group__1111138 = new BitSet(new long[]{0x0000400061000000L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__12_in_rule__MultiChoice__Group__1111141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_11__0_in_rule__MultiChoice__Group__11__Impl11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group__12__Impl_in_rule__MultiChoice__Group__1211199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MultiChoice__Group__12__Impl11227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_7__0__Impl_in_rule__MultiChoice__Group_7__011284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_7__1_in_rule__MultiChoice__Group_7__011287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MultiChoice__Group_7__0__Impl11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_7__1__Impl_in_rule__MultiChoice__Group_7__111346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__OptionsAssignment_7_1_in_rule__MultiChoice__Group_7__1__Impl11373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_9__0__Impl_in_rule__MultiChoice__Group_9__011407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_9__1_in_rule__MultiChoice__Group_9__011410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MultiChoice__Group_9__0__Impl11438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_9__1__Impl_in_rule__MultiChoice__Group_9__111469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__NumOptionsToShowAssignment_9_1_in_rule__MultiChoice__Group_9__1__Impl11496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_10__0__Impl_in_rule__MultiChoice__Group_10__011530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_10__1_in_rule__MultiChoice__Group_10__011533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MultiChoice__Group_10__0__Impl11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_10__1__Impl_in_rule__MultiChoice__Group_10__111592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__NumOptionsPerRowAssignment_10_1_in_rule__MultiChoice__Group_10__1__Impl11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_11__0__Impl_in_rule__MultiChoice__Group_11__011653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_11__1_in_rule__MultiChoice__Group_11__011656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MultiChoice__Group_11__0__Impl11684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__Group_11__1__Impl_in_rule__MultiChoice__Group_11__111715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiChoice__ExplanationAssignment_11_1_in_rule__MultiChoice__Group_11__1__Impl11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__011776 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__011779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__OptionValueAssignment_0_in_rule__Option__Group__0__Impl11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__111836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__CorrectOptionAssignment_1_in_rule__Option__Group__1__Impl11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__0__Impl_in_rule__CMap__Group__011898 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CMap__Group__1_in_rule__CMap__Group__011901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__CMap__Group__0__Impl11929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__1__Impl_in_rule__CMap__Group__111960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CMap__Group__2_in_rule__CMap__Group__111963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CMap__Group__1__Impl11991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__2__Impl_in_rule__CMap__Group__212022 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CMap__Group__3_in_rule__CMap__Group__212025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__ContentAssignment_2_in_rule__CMap__Group__2__Impl12052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CMap__Group__3__Impl_in_rule__CMap__Group__312082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CMap__Group__3__Impl12110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__012149 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Script__Group__1_in_rule__Script__Group__012152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Script__Group__0__Impl12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__112211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Script__Group__2_in_rule__Script__Group__112214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Script__Group__1__Impl12242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__212273 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Script__Group__3_in_rule__Script__Group__212276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__ScriptBodyAssignment_2_in_rule__Script__Group__2__Impl12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__312333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Script__Group__3__Impl12361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingHints_in_rule__JoveNotes__ProcessingHintsAssignment_012405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterDetails_in_rule__JoveNotes__ChapterDetailsAssignment_112436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotesElement_in_rule__JoveNotes__NotesElementsAssignment_212467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ProcessingHints__SkipGenerationAssignment_112503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ProcessingHints__SkipGenerationInProductionAssignment_212547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ChapterDetails__TestPaperAssignment_012591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChapterDetails__SubjectNameAssignment_212630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ChapterDetails__ChapterNumberAssignment_412661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ChapterDetails__SubChapterNumberAssignment_612692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChapterDetails__ChapterNameAssignment_812723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_rule__ChapterDetails__ScriptAssignment_912754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_rule__NotesElement__ScriptAssignment_112785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__WordMeaning__HideFromViewAssignment_112821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WordMeaning__WordAssignment_212860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WordMeaning__MeaningAssignment_312891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__QuestionAnswer__HideFromViewAssignment_112927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QuestionAnswer__QuestionAssignment_212966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QuestionAnswer__AnswerPartsAssignment_312997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__QuestionAnswer__CmapAssignment_413028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__FIB__HideFromViewAssignment_113064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FIB__QuestionAssignment_213103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FIB__AnswersAssignment_313134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Definition__HideFromViewAssignment_113170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Definition__TermAssignment_213209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Definition__DefinitionAssignment_313240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__Definition__CmapAssignment_413271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Character__HideFromViewAssignment_113307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Character__CharacterAssignment_213346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Character__EstimateAssignment_313377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__Character__CmapAssignment_413408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TeacherNote__HideFromViewAssignment_113444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TeacherNote__CaptionAssignment_213483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TeacherNote__NoteAssignment_313514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMap_in_rule__TeacherNote__CmapAssignment_413545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Matching__HideFromViewAssignment_113581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Matching__SkipReverseQuestionAssignment_213625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Matching__QuestionAssignment_313664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchPair_in_rule__Matching__PairsAssignment_513695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchMCQConfig_in_rule__Matching__McqConfigAssignment_613726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatchPair__MatchQuestionAssignment_013757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatchPair__MatchAnswerAssignment_213788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatchMCQConfig__ForwardCaptionAssignment_313819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatchMCQConfig__ReverseCaptionAssignment_4_113850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MatchMCQConfig__NumOptionsToShowAssignment_5_113881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_113912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Event__HideFromViewAssignment_113948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__EventAssignment_213987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__TimeAssignment_314018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TrueFalse__HideFromViewAssignment_114054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrueFalse__StatementAssignment_214093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__TrueFalse__TruthValueAssignment_314124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TrueFalse__JustificationAssignment_414155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ChemEquation__HideFromViewAssignment_114191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__DescriptionAssignment_214230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__ReactantsAssignment_414261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__ProducesAssignment_614292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemEquation__ProductsAssignment_814323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ChemCompound__HideFromViewAssignment_114359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemCompound__SymbolAssignment_214398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemCompound__ChemicalNameAssignment_314429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChemCompound__CommonNameAssignment_414460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Spellbee__HideFromViewAssignment_114496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Spellbee__WordAssignment_214535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ImageLabel__HideFromViewAssignment_114571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageLabel__CaptionAssignment_214610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageLabel__ImageNameAssignment_514641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_614672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHotSpot_in_rule__ImageLabel__HotspotsAssignment_7_114703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__HotSpot__XAssignment_014734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__HotSpot__YAssignment_214765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HotSpot__LabelAssignment_414796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Equation__HideFromViewAssignment_114832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Equation__EquationAssignment_214871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Equation__DescriptionAssignment_414902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_614933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqSymbol_in_rule__Equation__SymbolsAssignment_7_114964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqSymbol__SymbolAssignment_014995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EqSymbol__DescriptionAssignment_215026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__RefToContext__HideFromViewAssignment_115062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RefToContext__ContextAssignment_415101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionAnswer_in_rule__RefToContext__QuestionsAssignment_515132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MultiChoice__HideFromViewAssignment_115168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiChoice__QuestionAssignment_215207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__MultiChoice__OptionsAssignment_615238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__MultiChoice__OptionsAssignment_7_115269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MultiChoice__NumOptionsToShowAssignment_9_115300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MultiChoice__NumOptionsPerRowAssignment_10_115331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiChoice__ExplanationAssignment_11_115362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Option__OptionValueAssignment_015393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Option__CorrectOptionAssignment_115429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CMap__ContentAssignment_215468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Script__ScriptBodyAssignment_215499 = new BitSet(new long[]{0x0000000000000002L});

}