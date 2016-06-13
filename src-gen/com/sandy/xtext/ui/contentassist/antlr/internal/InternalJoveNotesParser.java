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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'subject'", "'chapterNumber'", "'.'", "'chapterName'", "'@wm'", "'@qa'", "'@fib'", "'@definition'", "'@character'", "'@tn'", "'@match'", "'{'", "'}'", "'='", "'@mcq_config'", "'@forwardCaption'", "'@reverseCaption'", "'@numOptionsToShow'", "'@numOptionsPerRow'", "'@event'", "'@true_false'", "'@chem_equation'", "'>'", "'@chem_compound'", "'@spellbee'", "'@image_label'", "'imageName'", "','", "'@equation'", "'where'", "'@rtc'", "'context'", "'@multi_choice'", "'@options'", "'@explanation'", "'@exercise'", "'marks'", "'hints'", "'answer'", "'@voice2text'", "'cmap'", "'script_expressions'", "'script'", "'@skip_generation'", "'@skip_generation_in_production'", "'@exercise_bank'", "'hide'", "'skip_reverse_question'", "'correct'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BOOL=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJoveNotesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJoveNotesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJoveNotesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJoveNotes.g"; }


     
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
    // InternalJoveNotes.g:60:1: entryRuleJoveNotes : ruleJoveNotes EOF ;
    public final void entryRuleJoveNotes() throws RecognitionException {
        try {
            // InternalJoveNotes.g:61:1: ( ruleJoveNotes EOF )
            // InternalJoveNotes.g:62:1: ruleJoveNotes EOF
            {
             before(grammarAccess.getJoveNotesRule()); 
            pushFollow(FOLLOW_1);
            ruleJoveNotes();

            state._fsp--;

             after(grammarAccess.getJoveNotesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:69:1: ruleJoveNotes : ( ( rule__JoveNotes__Group__0 ) ) ;
    public final void ruleJoveNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:73:2: ( ( ( rule__JoveNotes__Group__0 ) ) )
            // InternalJoveNotes.g:74:1: ( ( rule__JoveNotes__Group__0 ) )
            {
            // InternalJoveNotes.g:74:1: ( ( rule__JoveNotes__Group__0 ) )
            // InternalJoveNotes.g:75:1: ( rule__JoveNotes__Group__0 )
            {
             before(grammarAccess.getJoveNotesAccess().getGroup()); 
            // InternalJoveNotes.g:76:1: ( rule__JoveNotes__Group__0 )
            // InternalJoveNotes.g:76:2: rule__JoveNotes__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:88:1: entryRuleProcessingHints : ruleProcessingHints EOF ;
    public final void entryRuleProcessingHints() throws RecognitionException {
        try {
            // InternalJoveNotes.g:89:1: ( ruleProcessingHints EOF )
            // InternalJoveNotes.g:90:1: ruleProcessingHints EOF
            {
             before(grammarAccess.getProcessingHintsRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessingHints();

            state._fsp--;

             after(grammarAccess.getProcessingHintsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:97:1: ruleProcessingHints : ( ( rule__ProcessingHints__Group__0 ) ) ;
    public final void ruleProcessingHints() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:101:2: ( ( ( rule__ProcessingHints__Group__0 ) ) )
            // InternalJoveNotes.g:102:1: ( ( rule__ProcessingHints__Group__0 ) )
            {
            // InternalJoveNotes.g:102:1: ( ( rule__ProcessingHints__Group__0 ) )
            // InternalJoveNotes.g:103:1: ( rule__ProcessingHints__Group__0 )
            {
             before(grammarAccess.getProcessingHintsAccess().getGroup()); 
            // InternalJoveNotes.g:104:1: ( rule__ProcessingHints__Group__0 )
            // InternalJoveNotes.g:104:2: rule__ProcessingHints__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:116:1: entryRuleChapterDetails : ruleChapterDetails EOF ;
    public final void entryRuleChapterDetails() throws RecognitionException {
        try {
            // InternalJoveNotes.g:117:1: ( ruleChapterDetails EOF )
            // InternalJoveNotes.g:118:1: ruleChapterDetails EOF
            {
             before(grammarAccess.getChapterDetailsRule()); 
            pushFollow(FOLLOW_1);
            ruleChapterDetails();

            state._fsp--;

             after(grammarAccess.getChapterDetailsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:125:1: ruleChapterDetails : ( ( rule__ChapterDetails__Group__0 ) ) ;
    public final void ruleChapterDetails() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:129:2: ( ( ( rule__ChapterDetails__Group__0 ) ) )
            // InternalJoveNotes.g:130:1: ( ( rule__ChapterDetails__Group__0 ) )
            {
            // InternalJoveNotes.g:130:1: ( ( rule__ChapterDetails__Group__0 ) )
            // InternalJoveNotes.g:131:1: ( rule__ChapterDetails__Group__0 )
            {
             before(grammarAccess.getChapterDetailsAccess().getGroup()); 
            // InternalJoveNotes.g:132:1: ( rule__ChapterDetails__Group__0 )
            // InternalJoveNotes.g:132:2: rule__ChapterDetails__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:144:1: entryRuleNotesElement : ruleNotesElement EOF ;
    public final void entryRuleNotesElement() throws RecognitionException {
        try {
            // InternalJoveNotes.g:145:1: ( ruleNotesElement EOF )
            // InternalJoveNotes.g:146:1: ruleNotesElement EOF
            {
             before(grammarAccess.getNotesElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNotesElement();

            state._fsp--;

             after(grammarAccess.getNotesElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:153:1: ruleNotesElement : ( ( rule__NotesElement__Group__0 ) ) ;
    public final void ruleNotesElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:157:2: ( ( ( rule__NotesElement__Group__0 ) ) )
            // InternalJoveNotes.g:158:1: ( ( rule__NotesElement__Group__0 ) )
            {
            // InternalJoveNotes.g:158:1: ( ( rule__NotesElement__Group__0 ) )
            // InternalJoveNotes.g:159:1: ( rule__NotesElement__Group__0 )
            {
             before(grammarAccess.getNotesElementAccess().getGroup()); 
            // InternalJoveNotes.g:160:1: ( rule__NotesElement__Group__0 )
            // InternalJoveNotes.g:160:2: rule__NotesElement__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:172:1: entryRuleWordMeaning : ruleWordMeaning EOF ;
    public final void entryRuleWordMeaning() throws RecognitionException {
        try {
            // InternalJoveNotes.g:173:1: ( ruleWordMeaning EOF )
            // InternalJoveNotes.g:174:1: ruleWordMeaning EOF
            {
             before(grammarAccess.getWordMeaningRule()); 
            pushFollow(FOLLOW_1);
            ruleWordMeaning();

            state._fsp--;

             after(grammarAccess.getWordMeaningRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:181:1: ruleWordMeaning : ( ( rule__WordMeaning__Group__0 ) ) ;
    public final void ruleWordMeaning() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:185:2: ( ( ( rule__WordMeaning__Group__0 ) ) )
            // InternalJoveNotes.g:186:1: ( ( rule__WordMeaning__Group__0 ) )
            {
            // InternalJoveNotes.g:186:1: ( ( rule__WordMeaning__Group__0 ) )
            // InternalJoveNotes.g:187:1: ( rule__WordMeaning__Group__0 )
            {
             before(grammarAccess.getWordMeaningAccess().getGroup()); 
            // InternalJoveNotes.g:188:1: ( rule__WordMeaning__Group__0 )
            // InternalJoveNotes.g:188:2: rule__WordMeaning__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:200:1: entryRuleQuestionAnswer : ruleQuestionAnswer EOF ;
    public final void entryRuleQuestionAnswer() throws RecognitionException {
        try {
            // InternalJoveNotes.g:201:1: ( ruleQuestionAnswer EOF )
            // InternalJoveNotes.g:202:1: ruleQuestionAnswer EOF
            {
             before(grammarAccess.getQuestionAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:209:1: ruleQuestionAnswer : ( ( rule__QuestionAnswer__Group__0 ) ) ;
    public final void ruleQuestionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:213:2: ( ( ( rule__QuestionAnswer__Group__0 ) ) )
            // InternalJoveNotes.g:214:1: ( ( rule__QuestionAnswer__Group__0 ) )
            {
            // InternalJoveNotes.g:214:1: ( ( rule__QuestionAnswer__Group__0 ) )
            // InternalJoveNotes.g:215:1: ( rule__QuestionAnswer__Group__0 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getGroup()); 
            // InternalJoveNotes.g:216:1: ( rule__QuestionAnswer__Group__0 )
            // InternalJoveNotes.g:216:2: rule__QuestionAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:228:1: entryRuleFIB : ruleFIB EOF ;
    public final void entryRuleFIB() throws RecognitionException {
        try {
            // InternalJoveNotes.g:229:1: ( ruleFIB EOF )
            // InternalJoveNotes.g:230:1: ruleFIB EOF
            {
             before(grammarAccess.getFIBRule()); 
            pushFollow(FOLLOW_1);
            ruleFIB();

            state._fsp--;

             after(grammarAccess.getFIBRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:237:1: ruleFIB : ( ( rule__FIB__Group__0 ) ) ;
    public final void ruleFIB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:241:2: ( ( ( rule__FIB__Group__0 ) ) )
            // InternalJoveNotes.g:242:1: ( ( rule__FIB__Group__0 ) )
            {
            // InternalJoveNotes.g:242:1: ( ( rule__FIB__Group__0 ) )
            // InternalJoveNotes.g:243:1: ( rule__FIB__Group__0 )
            {
             before(grammarAccess.getFIBAccess().getGroup()); 
            // InternalJoveNotes.g:244:1: ( rule__FIB__Group__0 )
            // InternalJoveNotes.g:244:2: rule__FIB__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:256:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalJoveNotes.g:257:1: ( ruleDefinition EOF )
            // InternalJoveNotes.g:258:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:265:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:269:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalJoveNotes.g:270:1: ( ( rule__Definition__Group__0 ) )
            {
            // InternalJoveNotes.g:270:1: ( ( rule__Definition__Group__0 ) )
            // InternalJoveNotes.g:271:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalJoveNotes.g:272:1: ( rule__Definition__Group__0 )
            // InternalJoveNotes.g:272:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:284:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // InternalJoveNotes.g:285:1: ( ruleCharacter EOF )
            // InternalJoveNotes.g:286:1: ruleCharacter EOF
            {
             before(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getCharacterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:293:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:297:2: ( ( ( rule__Character__Group__0 ) ) )
            // InternalJoveNotes.g:298:1: ( ( rule__Character__Group__0 ) )
            {
            // InternalJoveNotes.g:298:1: ( ( rule__Character__Group__0 ) )
            // InternalJoveNotes.g:299:1: ( rule__Character__Group__0 )
            {
             before(grammarAccess.getCharacterAccess().getGroup()); 
            // InternalJoveNotes.g:300:1: ( rule__Character__Group__0 )
            // InternalJoveNotes.g:300:2: rule__Character__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:312:1: entryRuleTeacherNote : ruleTeacherNote EOF ;
    public final void entryRuleTeacherNote() throws RecognitionException {
        try {
            // InternalJoveNotes.g:313:1: ( ruleTeacherNote EOF )
            // InternalJoveNotes.g:314:1: ruleTeacherNote EOF
            {
             before(grammarAccess.getTeacherNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleTeacherNote();

            state._fsp--;

             after(grammarAccess.getTeacherNoteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:321:1: ruleTeacherNote : ( ( rule__TeacherNote__Group__0 ) ) ;
    public final void ruleTeacherNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:325:2: ( ( ( rule__TeacherNote__Group__0 ) ) )
            // InternalJoveNotes.g:326:1: ( ( rule__TeacherNote__Group__0 ) )
            {
            // InternalJoveNotes.g:326:1: ( ( rule__TeacherNote__Group__0 ) )
            // InternalJoveNotes.g:327:1: ( rule__TeacherNote__Group__0 )
            {
             before(grammarAccess.getTeacherNoteAccess().getGroup()); 
            // InternalJoveNotes.g:328:1: ( rule__TeacherNote__Group__0 )
            // InternalJoveNotes.g:328:2: rule__TeacherNote__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:340:1: entryRuleMatching : ruleMatching EOF ;
    public final void entryRuleMatching() throws RecognitionException {
        try {
            // InternalJoveNotes.g:341:1: ( ruleMatching EOF )
            // InternalJoveNotes.g:342:1: ruleMatching EOF
            {
             before(grammarAccess.getMatchingRule()); 
            pushFollow(FOLLOW_1);
            ruleMatching();

            state._fsp--;

             after(grammarAccess.getMatchingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:349:1: ruleMatching : ( ( rule__Matching__Group__0 ) ) ;
    public final void ruleMatching() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:353:2: ( ( ( rule__Matching__Group__0 ) ) )
            // InternalJoveNotes.g:354:1: ( ( rule__Matching__Group__0 ) )
            {
            // InternalJoveNotes.g:354:1: ( ( rule__Matching__Group__0 ) )
            // InternalJoveNotes.g:355:1: ( rule__Matching__Group__0 )
            {
             before(grammarAccess.getMatchingAccess().getGroup()); 
            // InternalJoveNotes.g:356:1: ( rule__Matching__Group__0 )
            // InternalJoveNotes.g:356:2: rule__Matching__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:368:1: entryRuleMatchPair : ruleMatchPair EOF ;
    public final void entryRuleMatchPair() throws RecognitionException {
        try {
            // InternalJoveNotes.g:369:1: ( ruleMatchPair EOF )
            // InternalJoveNotes.g:370:1: ruleMatchPair EOF
            {
             before(grammarAccess.getMatchPairRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchPair();

            state._fsp--;

             after(grammarAccess.getMatchPairRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:377:1: ruleMatchPair : ( ( rule__MatchPair__Group__0 ) ) ;
    public final void ruleMatchPair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:381:2: ( ( ( rule__MatchPair__Group__0 ) ) )
            // InternalJoveNotes.g:382:1: ( ( rule__MatchPair__Group__0 ) )
            {
            // InternalJoveNotes.g:382:1: ( ( rule__MatchPair__Group__0 ) )
            // InternalJoveNotes.g:383:1: ( rule__MatchPair__Group__0 )
            {
             before(grammarAccess.getMatchPairAccess().getGroup()); 
            // InternalJoveNotes.g:384:1: ( rule__MatchPair__Group__0 )
            // InternalJoveNotes.g:384:2: rule__MatchPair__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:396:1: entryRuleMatchMCQConfig : ruleMatchMCQConfig EOF ;
    public final void entryRuleMatchMCQConfig() throws RecognitionException {
        try {
            // InternalJoveNotes.g:397:1: ( ruleMatchMCQConfig EOF )
            // InternalJoveNotes.g:398:1: ruleMatchMCQConfig EOF
            {
             before(grammarAccess.getMatchMCQConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchMCQConfig();

            state._fsp--;

             after(grammarAccess.getMatchMCQConfigRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:405:1: ruleMatchMCQConfig : ( ( rule__MatchMCQConfig__Group__0 ) ) ;
    public final void ruleMatchMCQConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:409:2: ( ( ( rule__MatchMCQConfig__Group__0 ) ) )
            // InternalJoveNotes.g:410:1: ( ( rule__MatchMCQConfig__Group__0 ) )
            {
            // InternalJoveNotes.g:410:1: ( ( rule__MatchMCQConfig__Group__0 ) )
            // InternalJoveNotes.g:411:1: ( rule__MatchMCQConfig__Group__0 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup()); 
            // InternalJoveNotes.g:412:1: ( rule__MatchMCQConfig__Group__0 )
            // InternalJoveNotes.g:412:2: rule__MatchMCQConfig__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:424:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalJoveNotes.g:425:1: ( ruleEvent EOF )
            // InternalJoveNotes.g:426:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:433:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:437:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalJoveNotes.g:438:1: ( ( rule__Event__Group__0 ) )
            {
            // InternalJoveNotes.g:438:1: ( ( rule__Event__Group__0 ) )
            // InternalJoveNotes.g:439:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalJoveNotes.g:440:1: ( rule__Event__Group__0 )
            // InternalJoveNotes.g:440:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:452:1: entryRuleTrueFalse : ruleTrueFalse EOF ;
    public final void entryRuleTrueFalse() throws RecognitionException {
        try {
            // InternalJoveNotes.g:453:1: ( ruleTrueFalse EOF )
            // InternalJoveNotes.g:454:1: ruleTrueFalse EOF
            {
             before(grammarAccess.getTrueFalseRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueFalse();

            state._fsp--;

             after(grammarAccess.getTrueFalseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:461:1: ruleTrueFalse : ( ( rule__TrueFalse__Group__0 ) ) ;
    public final void ruleTrueFalse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:465:2: ( ( ( rule__TrueFalse__Group__0 ) ) )
            // InternalJoveNotes.g:466:1: ( ( rule__TrueFalse__Group__0 ) )
            {
            // InternalJoveNotes.g:466:1: ( ( rule__TrueFalse__Group__0 ) )
            // InternalJoveNotes.g:467:1: ( rule__TrueFalse__Group__0 )
            {
             before(grammarAccess.getTrueFalseAccess().getGroup()); 
            // InternalJoveNotes.g:468:1: ( rule__TrueFalse__Group__0 )
            // InternalJoveNotes.g:468:2: rule__TrueFalse__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:480:1: entryRuleChemEquation : ruleChemEquation EOF ;
    public final void entryRuleChemEquation() throws RecognitionException {
        try {
            // InternalJoveNotes.g:481:1: ( ruleChemEquation EOF )
            // InternalJoveNotes.g:482:1: ruleChemEquation EOF
            {
             before(grammarAccess.getChemEquationRule()); 
            pushFollow(FOLLOW_1);
            ruleChemEquation();

            state._fsp--;

             after(grammarAccess.getChemEquationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:489:1: ruleChemEquation : ( ( rule__ChemEquation__Group__0 ) ) ;
    public final void ruleChemEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:493:2: ( ( ( rule__ChemEquation__Group__0 ) ) )
            // InternalJoveNotes.g:494:1: ( ( rule__ChemEquation__Group__0 ) )
            {
            // InternalJoveNotes.g:494:1: ( ( rule__ChemEquation__Group__0 ) )
            // InternalJoveNotes.g:495:1: ( rule__ChemEquation__Group__0 )
            {
             before(grammarAccess.getChemEquationAccess().getGroup()); 
            // InternalJoveNotes.g:496:1: ( rule__ChemEquation__Group__0 )
            // InternalJoveNotes.g:496:2: rule__ChemEquation__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:508:1: entryRuleChemCompound : ruleChemCompound EOF ;
    public final void entryRuleChemCompound() throws RecognitionException {
        try {
            // InternalJoveNotes.g:509:1: ( ruleChemCompound EOF )
            // InternalJoveNotes.g:510:1: ruleChemCompound EOF
            {
             before(grammarAccess.getChemCompoundRule()); 
            pushFollow(FOLLOW_1);
            ruleChemCompound();

            state._fsp--;

             after(grammarAccess.getChemCompoundRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:517:1: ruleChemCompound : ( ( rule__ChemCompound__Group__0 ) ) ;
    public final void ruleChemCompound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:521:2: ( ( ( rule__ChemCompound__Group__0 ) ) )
            // InternalJoveNotes.g:522:1: ( ( rule__ChemCompound__Group__0 ) )
            {
            // InternalJoveNotes.g:522:1: ( ( rule__ChemCompound__Group__0 ) )
            // InternalJoveNotes.g:523:1: ( rule__ChemCompound__Group__0 )
            {
             before(grammarAccess.getChemCompoundAccess().getGroup()); 
            // InternalJoveNotes.g:524:1: ( rule__ChemCompound__Group__0 )
            // InternalJoveNotes.g:524:2: rule__ChemCompound__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:536:1: entryRuleSpellbee : ruleSpellbee EOF ;
    public final void entryRuleSpellbee() throws RecognitionException {
        try {
            // InternalJoveNotes.g:537:1: ( ruleSpellbee EOF )
            // InternalJoveNotes.g:538:1: ruleSpellbee EOF
            {
             before(grammarAccess.getSpellbeeRule()); 
            pushFollow(FOLLOW_1);
            ruleSpellbee();

            state._fsp--;

             after(grammarAccess.getSpellbeeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:545:1: ruleSpellbee : ( ( rule__Spellbee__Group__0 ) ) ;
    public final void ruleSpellbee() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:549:2: ( ( ( rule__Spellbee__Group__0 ) ) )
            // InternalJoveNotes.g:550:1: ( ( rule__Spellbee__Group__0 ) )
            {
            // InternalJoveNotes.g:550:1: ( ( rule__Spellbee__Group__0 ) )
            // InternalJoveNotes.g:551:1: ( rule__Spellbee__Group__0 )
            {
             before(grammarAccess.getSpellbeeAccess().getGroup()); 
            // InternalJoveNotes.g:552:1: ( rule__Spellbee__Group__0 )
            // InternalJoveNotes.g:552:2: rule__Spellbee__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:564:1: entryRuleImageLabel : ruleImageLabel EOF ;
    public final void entryRuleImageLabel() throws RecognitionException {
        try {
            // InternalJoveNotes.g:565:1: ( ruleImageLabel EOF )
            // InternalJoveNotes.g:566:1: ruleImageLabel EOF
            {
             before(grammarAccess.getImageLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleImageLabel();

            state._fsp--;

             after(grammarAccess.getImageLabelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:573:1: ruleImageLabel : ( ( rule__ImageLabel__Group__0 ) ) ;
    public final void ruleImageLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:577:2: ( ( ( rule__ImageLabel__Group__0 ) ) )
            // InternalJoveNotes.g:578:1: ( ( rule__ImageLabel__Group__0 ) )
            {
            // InternalJoveNotes.g:578:1: ( ( rule__ImageLabel__Group__0 ) )
            // InternalJoveNotes.g:579:1: ( rule__ImageLabel__Group__0 )
            {
             before(grammarAccess.getImageLabelAccess().getGroup()); 
            // InternalJoveNotes.g:580:1: ( rule__ImageLabel__Group__0 )
            // InternalJoveNotes.g:580:2: rule__ImageLabel__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:592:1: entryRuleHotSpot : ruleHotSpot EOF ;
    public final void entryRuleHotSpot() throws RecognitionException {
        try {
            // InternalJoveNotes.g:593:1: ( ruleHotSpot EOF )
            // InternalJoveNotes.g:594:1: ruleHotSpot EOF
            {
             before(grammarAccess.getHotSpotRule()); 
            pushFollow(FOLLOW_1);
            ruleHotSpot();

            state._fsp--;

             after(grammarAccess.getHotSpotRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:601:1: ruleHotSpot : ( ( rule__HotSpot__Group__0 ) ) ;
    public final void ruleHotSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:605:2: ( ( ( rule__HotSpot__Group__0 ) ) )
            // InternalJoveNotes.g:606:1: ( ( rule__HotSpot__Group__0 ) )
            {
            // InternalJoveNotes.g:606:1: ( ( rule__HotSpot__Group__0 ) )
            // InternalJoveNotes.g:607:1: ( rule__HotSpot__Group__0 )
            {
             before(grammarAccess.getHotSpotAccess().getGroup()); 
            // InternalJoveNotes.g:608:1: ( rule__HotSpot__Group__0 )
            // InternalJoveNotes.g:608:2: rule__HotSpot__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:620:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // InternalJoveNotes.g:621:1: ( ruleEquation EOF )
            // InternalJoveNotes.g:622:1: ruleEquation EOF
            {
             before(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            ruleEquation();

            state._fsp--;

             after(grammarAccess.getEquationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:629:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:633:2: ( ( ( rule__Equation__Group__0 ) ) )
            // InternalJoveNotes.g:634:1: ( ( rule__Equation__Group__0 ) )
            {
            // InternalJoveNotes.g:634:1: ( ( rule__Equation__Group__0 ) )
            // InternalJoveNotes.g:635:1: ( rule__Equation__Group__0 )
            {
             before(grammarAccess.getEquationAccess().getGroup()); 
            // InternalJoveNotes.g:636:1: ( rule__Equation__Group__0 )
            // InternalJoveNotes.g:636:2: rule__Equation__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:648:1: entryRuleEqSymbol : ruleEqSymbol EOF ;
    public final void entryRuleEqSymbol() throws RecognitionException {
        try {
            // InternalJoveNotes.g:649:1: ( ruleEqSymbol EOF )
            // InternalJoveNotes.g:650:1: ruleEqSymbol EOF
            {
             before(grammarAccess.getEqSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleEqSymbol();

            state._fsp--;

             after(grammarAccess.getEqSymbolRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:657:1: ruleEqSymbol : ( ( rule__EqSymbol__Group__0 ) ) ;
    public final void ruleEqSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:661:2: ( ( ( rule__EqSymbol__Group__0 ) ) )
            // InternalJoveNotes.g:662:1: ( ( rule__EqSymbol__Group__0 ) )
            {
            // InternalJoveNotes.g:662:1: ( ( rule__EqSymbol__Group__0 ) )
            // InternalJoveNotes.g:663:1: ( rule__EqSymbol__Group__0 )
            {
             before(grammarAccess.getEqSymbolAccess().getGroup()); 
            // InternalJoveNotes.g:664:1: ( rule__EqSymbol__Group__0 )
            // InternalJoveNotes.g:664:2: rule__EqSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:676:1: entryRuleRefToContext : ruleRefToContext EOF ;
    public final void entryRuleRefToContext() throws RecognitionException {
        try {
            // InternalJoveNotes.g:677:1: ( ruleRefToContext EOF )
            // InternalJoveNotes.g:678:1: ruleRefToContext EOF
            {
             before(grammarAccess.getRefToContextRule()); 
            pushFollow(FOLLOW_1);
            ruleRefToContext();

            state._fsp--;

             after(grammarAccess.getRefToContextRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:685:1: ruleRefToContext : ( ( rule__RefToContext__Group__0 ) ) ;
    public final void ruleRefToContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:689:2: ( ( ( rule__RefToContext__Group__0 ) ) )
            // InternalJoveNotes.g:690:1: ( ( rule__RefToContext__Group__0 ) )
            {
            // InternalJoveNotes.g:690:1: ( ( rule__RefToContext__Group__0 ) )
            // InternalJoveNotes.g:691:1: ( rule__RefToContext__Group__0 )
            {
             before(grammarAccess.getRefToContextAccess().getGroup()); 
            // InternalJoveNotes.g:692:1: ( rule__RefToContext__Group__0 )
            // InternalJoveNotes.g:692:2: rule__RefToContext__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleRTCElement"
    // InternalJoveNotes.g:704:1: entryRuleRTCElement : ruleRTCElement EOF ;
    public final void entryRuleRTCElement() throws RecognitionException {
        try {
            // InternalJoveNotes.g:705:1: ( ruleRTCElement EOF )
            // InternalJoveNotes.g:706:1: ruleRTCElement EOF
            {
             before(grammarAccess.getRTCElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRTCElement();

            state._fsp--;

             after(grammarAccess.getRTCElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRTCElement"


    // $ANTLR start "ruleRTCElement"
    // InternalJoveNotes.g:713:1: ruleRTCElement : ( ( rule__RTCElement__Alternatives ) ) ;
    public final void ruleRTCElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:717:2: ( ( ( rule__RTCElement__Alternatives ) ) )
            // InternalJoveNotes.g:718:1: ( ( rule__RTCElement__Alternatives ) )
            {
            // InternalJoveNotes.g:718:1: ( ( rule__RTCElement__Alternatives ) )
            // InternalJoveNotes.g:719:1: ( rule__RTCElement__Alternatives )
            {
             before(grammarAccess.getRTCElementAccess().getAlternatives()); 
            // InternalJoveNotes.g:720:1: ( rule__RTCElement__Alternatives )
            // InternalJoveNotes.g:720:2: rule__RTCElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RTCElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRTCElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRTCElement"


    // $ANTLR start "entryRuleMultiChoice"
    // InternalJoveNotes.g:732:1: entryRuleMultiChoice : ruleMultiChoice EOF ;
    public final void entryRuleMultiChoice() throws RecognitionException {
        try {
            // InternalJoveNotes.g:733:1: ( ruleMultiChoice EOF )
            // InternalJoveNotes.g:734:1: ruleMultiChoice EOF
            {
             before(grammarAccess.getMultiChoiceRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiChoice();

            state._fsp--;

             after(grammarAccess.getMultiChoiceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:741:1: ruleMultiChoice : ( ( rule__MultiChoice__Group__0 ) ) ;
    public final void ruleMultiChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:745:2: ( ( ( rule__MultiChoice__Group__0 ) ) )
            // InternalJoveNotes.g:746:1: ( ( rule__MultiChoice__Group__0 ) )
            {
            // InternalJoveNotes.g:746:1: ( ( rule__MultiChoice__Group__0 ) )
            // InternalJoveNotes.g:747:1: ( rule__MultiChoice__Group__0 )
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup()); 
            // InternalJoveNotes.g:748:1: ( rule__MultiChoice__Group__0 )
            // InternalJoveNotes.g:748:2: rule__MultiChoice__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleExercise"
    // InternalJoveNotes.g:760:1: entryRuleExercise : ruleExercise EOF ;
    public final void entryRuleExercise() throws RecognitionException {
        try {
            // InternalJoveNotes.g:761:1: ( ruleExercise EOF )
            // InternalJoveNotes.g:762:1: ruleExercise EOF
            {
             before(grammarAccess.getExerciseRule()); 
            pushFollow(FOLLOW_1);
            ruleExercise();

            state._fsp--;

             after(grammarAccess.getExerciseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExercise"


    // $ANTLR start "ruleExercise"
    // InternalJoveNotes.g:769:1: ruleExercise : ( ( rule__Exercise__Group__0 ) ) ;
    public final void ruleExercise() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:773:2: ( ( ( rule__Exercise__Group__0 ) ) )
            // InternalJoveNotes.g:774:1: ( ( rule__Exercise__Group__0 ) )
            {
            // InternalJoveNotes.g:774:1: ( ( rule__Exercise__Group__0 ) )
            // InternalJoveNotes.g:775:1: ( rule__Exercise__Group__0 )
            {
             before(grammarAccess.getExerciseAccess().getGroup()); 
            // InternalJoveNotes.g:776:1: ( rule__Exercise__Group__0 )
            // InternalJoveNotes.g:776:2: rule__Exercise__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExercise"


    // $ANTLR start "entryRuleVoiceToText"
    // InternalJoveNotes.g:788:1: entryRuleVoiceToText : ruleVoiceToText EOF ;
    public final void entryRuleVoiceToText() throws RecognitionException {
        try {
            // InternalJoveNotes.g:789:1: ( ruleVoiceToText EOF )
            // InternalJoveNotes.g:790:1: ruleVoiceToText EOF
            {
             before(grammarAccess.getVoiceToTextRule()); 
            pushFollow(FOLLOW_1);
            ruleVoiceToText();

            state._fsp--;

             after(grammarAccess.getVoiceToTextRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVoiceToText"


    // $ANTLR start "ruleVoiceToText"
    // InternalJoveNotes.g:797:1: ruleVoiceToText : ( ( rule__VoiceToText__Group__0 ) ) ;
    public final void ruleVoiceToText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:801:2: ( ( ( rule__VoiceToText__Group__0 ) ) )
            // InternalJoveNotes.g:802:1: ( ( rule__VoiceToText__Group__0 ) )
            {
            // InternalJoveNotes.g:802:1: ( ( rule__VoiceToText__Group__0 ) )
            // InternalJoveNotes.g:803:1: ( rule__VoiceToText__Group__0 )
            {
             before(grammarAccess.getVoiceToTextAccess().getGroup()); 
            // InternalJoveNotes.g:804:1: ( rule__VoiceToText__Group__0 )
            // InternalJoveNotes.g:804:2: rule__VoiceToText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVoiceToTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoiceToText"


    // $ANTLR start "entryRuleOption"
    // InternalJoveNotes.g:816:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalJoveNotes.g:817:1: ( ruleOption EOF )
            // InternalJoveNotes.g:818:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:825:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:829:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalJoveNotes.g:830:1: ( ( rule__Option__Group__0 ) )
            {
            // InternalJoveNotes.g:830:1: ( ( rule__Option__Group__0 ) )
            // InternalJoveNotes.g:831:1: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalJoveNotes.g:832:1: ( rule__Option__Group__0 )
            // InternalJoveNotes.g:832:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:844:1: entryRuleCMap : ruleCMap EOF ;
    public final void entryRuleCMap() throws RecognitionException {
        try {
            // InternalJoveNotes.g:845:1: ( ruleCMap EOF )
            // InternalJoveNotes.g:846:1: ruleCMap EOF
            {
             before(grammarAccess.getCMapRule()); 
            pushFollow(FOLLOW_1);
            ruleCMap();

            state._fsp--;

             after(grammarAccess.getCMapRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:853:1: ruleCMap : ( ( rule__CMap__Group__0 ) ) ;
    public final void ruleCMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:857:2: ( ( ( rule__CMap__Group__0 ) ) )
            // InternalJoveNotes.g:858:1: ( ( rule__CMap__Group__0 ) )
            {
            // InternalJoveNotes.g:858:1: ( ( rule__CMap__Group__0 ) )
            // InternalJoveNotes.g:859:1: ( rule__CMap__Group__0 )
            {
             before(grammarAccess.getCMapAccess().getGroup()); 
            // InternalJoveNotes.g:860:1: ( rule__CMap__Group__0 )
            // InternalJoveNotes.g:860:2: rule__CMap__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:872:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalJoveNotes.g:873:1: ( ruleScript EOF )
            // InternalJoveNotes.g:874:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalJoveNotes.g:881:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:885:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalJoveNotes.g:886:1: ( ( rule__Script__Group__0 ) )
            {
            // InternalJoveNotes.g:886:1: ( ( rule__Script__Group__0 ) )
            // InternalJoveNotes.g:887:1: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // InternalJoveNotes.g:888:1: ( rule__Script__Group__0 )
            // InternalJoveNotes.g:888:2: rule__Script__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleEvalVar"
    // InternalJoveNotes.g:900:1: entryRuleEvalVar : ruleEvalVar EOF ;
    public final void entryRuleEvalVar() throws RecognitionException {
        try {
            // InternalJoveNotes.g:901:1: ( ruleEvalVar EOF )
            // InternalJoveNotes.g:902:1: ruleEvalVar EOF
            {
             before(grammarAccess.getEvalVarRule()); 
            pushFollow(FOLLOW_1);
            ruleEvalVar();

            state._fsp--;

             after(grammarAccess.getEvalVarRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvalVar"


    // $ANTLR start "ruleEvalVar"
    // InternalJoveNotes.g:909:1: ruleEvalVar : ( ( rule__EvalVar__Group__0 ) ) ;
    public final void ruleEvalVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:913:2: ( ( ( rule__EvalVar__Group__0 ) ) )
            // InternalJoveNotes.g:914:1: ( ( rule__EvalVar__Group__0 ) )
            {
            // InternalJoveNotes.g:914:1: ( ( rule__EvalVar__Group__0 ) )
            // InternalJoveNotes.g:915:1: ( rule__EvalVar__Group__0 )
            {
             before(grammarAccess.getEvalVarAccess().getGroup()); 
            // InternalJoveNotes.g:916:1: ( rule__EvalVar__Group__0 )
            // InternalJoveNotes.g:916:2: rule__EvalVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvalVar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvalVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvalVar"


    // $ANTLR start "entryRuleScriptBody"
    // InternalJoveNotes.g:928:1: entryRuleScriptBody : ruleScriptBody EOF ;
    public final void entryRuleScriptBody() throws RecognitionException {
        try {
            // InternalJoveNotes.g:929:1: ( ruleScriptBody EOF )
            // InternalJoveNotes.g:930:1: ruleScriptBody EOF
            {
             before(grammarAccess.getScriptBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleScriptBody();

            state._fsp--;

             after(grammarAccess.getScriptBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScriptBody"


    // $ANTLR start "ruleScriptBody"
    // InternalJoveNotes.g:937:1: ruleScriptBody : ( ( rule__ScriptBody__Group__0 ) ) ;
    public final void ruleScriptBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:941:2: ( ( ( rule__ScriptBody__Group__0 ) ) )
            // InternalJoveNotes.g:942:1: ( ( rule__ScriptBody__Group__0 ) )
            {
            // InternalJoveNotes.g:942:1: ( ( rule__ScriptBody__Group__0 ) )
            // InternalJoveNotes.g:943:1: ( rule__ScriptBody__Group__0 )
            {
             before(grammarAccess.getScriptBodyAccess().getGroup()); 
            // InternalJoveNotes.g:944:1: ( rule__ScriptBody__Group__0 )
            // InternalJoveNotes.g:944:2: rule__ScriptBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScriptBody"


    // $ANTLR start "rule__NotesElement__Alternatives_0"
    // InternalJoveNotes.g:956:1: rule__NotesElement__Alternatives_0 : ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleSpellbee ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleRefToContext ) | ( ruleMultiChoice ) | ( ruleExercise ) | ( ruleVoiceToText ) );
    public final void rule__NotesElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:960:1: ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleSpellbee ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleRefToContext ) | ( ruleMultiChoice ) | ( ruleExercise ) | ( ruleVoiceToText ) )
            int alt1=18;
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
            case 47:
                {
                alt1=17;
                }
                break;
            case 51:
                {
                alt1=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJoveNotes.g:961:1: ( ruleWordMeaning )
                    {
                    // InternalJoveNotes.g:961:1: ( ruleWordMeaning )
                    // InternalJoveNotes.g:962:1: ruleWordMeaning
                    {
                     before(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWordMeaning();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getWordMeaningParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJoveNotes.g:967:6: ( ruleQuestionAnswer )
                    {
                    // InternalJoveNotes.g:967:6: ( ruleQuestionAnswer )
                    // InternalJoveNotes.g:968:1: ruleQuestionAnswer
                    {
                     before(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionAnswer();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getQuestionAnswerParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJoveNotes.g:973:6: ( ruleFIB )
                    {
                    // InternalJoveNotes.g:973:6: ( ruleFIB )
                    // InternalJoveNotes.g:974:1: ruleFIB
                    {
                     before(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFIB();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getFIBParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJoveNotes.g:979:6: ( ruleDefinition )
                    {
                    // InternalJoveNotes.g:979:6: ( ruleDefinition )
                    // InternalJoveNotes.g:980:1: ruleDefinition
                    {
                     before(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getDefinitionParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJoveNotes.g:985:6: ( ruleCharacter )
                    {
                    // InternalJoveNotes.g:985:6: ( ruleCharacter )
                    // InternalJoveNotes.g:986:1: ruleCharacter
                    {
                     before(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacter();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getCharacterParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJoveNotes.g:991:6: ( ruleTeacherNote )
                    {
                    // InternalJoveNotes.g:991:6: ( ruleTeacherNote )
                    // InternalJoveNotes.g:992:1: ruleTeacherNote
                    {
                     before(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTeacherNote();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getTeacherNoteParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJoveNotes.g:997:6: ( ruleMatching )
                    {
                    // InternalJoveNotes.g:997:6: ( ruleMatching )
                    // InternalJoveNotes.g:998:1: ruleMatching
                    {
                     before(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMatching();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getMatchingParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJoveNotes.g:1003:6: ( ruleEvent )
                    {
                    // InternalJoveNotes.g:1003:6: ( ruleEvent )
                    // InternalJoveNotes.g:1004:1: ruleEvent
                    {
                     before(grammarAccess.getNotesElementAccess().getEventParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getEventParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJoveNotes.g:1009:6: ( ruleTrueFalse )
                    {
                    // InternalJoveNotes.g:1009:6: ( ruleTrueFalse )
                    // InternalJoveNotes.g:1010:1: ruleTrueFalse
                    {
                     before(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueFalse();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getTrueFalseParserRuleCall_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJoveNotes.g:1015:6: ( ruleChemEquation )
                    {
                    // InternalJoveNotes.g:1015:6: ( ruleChemEquation )
                    // InternalJoveNotes.g:1016:1: ruleChemEquation
                    {
                     before(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_0_9()); 
                    pushFollow(FOLLOW_2);
                    ruleChemEquation();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getChemEquationParserRuleCall_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJoveNotes.g:1021:6: ( ruleChemCompound )
                    {
                    // InternalJoveNotes.g:1021:6: ( ruleChemCompound )
                    // InternalJoveNotes.g:1022:1: ruleChemCompound
                    {
                     before(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_0_10()); 
                    pushFollow(FOLLOW_2);
                    ruleChemCompound();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getChemCompoundParserRuleCall_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJoveNotes.g:1027:6: ( ruleSpellbee )
                    {
                    // InternalJoveNotes.g:1027:6: ( ruleSpellbee )
                    // InternalJoveNotes.g:1028:1: ruleSpellbee
                    {
                     before(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_0_11()); 
                    pushFollow(FOLLOW_2);
                    ruleSpellbee();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getSpellbeeParserRuleCall_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJoveNotes.g:1033:6: ( ruleImageLabel )
                    {
                    // InternalJoveNotes.g:1033:6: ( ruleImageLabel )
                    // InternalJoveNotes.g:1034:1: ruleImageLabel
                    {
                     before(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_0_12()); 
                    pushFollow(FOLLOW_2);
                    ruleImageLabel();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getImageLabelParserRuleCall_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJoveNotes.g:1039:6: ( ruleEquation )
                    {
                    // InternalJoveNotes.g:1039:6: ( ruleEquation )
                    // InternalJoveNotes.g:1040:1: ruleEquation
                    {
                     before(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_0_13()); 
                    pushFollow(FOLLOW_2);
                    ruleEquation();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getEquationParserRuleCall_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJoveNotes.g:1045:6: ( ruleRefToContext )
                    {
                    // InternalJoveNotes.g:1045:6: ( ruleRefToContext )
                    // InternalJoveNotes.g:1046:1: ruleRefToContext
                    {
                     before(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_0_14()); 
                    pushFollow(FOLLOW_2);
                    ruleRefToContext();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getRefToContextParserRuleCall_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJoveNotes.g:1051:6: ( ruleMultiChoice )
                    {
                    // InternalJoveNotes.g:1051:6: ( ruleMultiChoice )
                    // InternalJoveNotes.g:1052:1: ruleMultiChoice
                    {
                     before(grammarAccess.getNotesElementAccess().getMultiChoiceParserRuleCall_0_15()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiChoice();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getMultiChoiceParserRuleCall_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalJoveNotes.g:1057:6: ( ruleExercise )
                    {
                    // InternalJoveNotes.g:1057:6: ( ruleExercise )
                    // InternalJoveNotes.g:1058:1: ruleExercise
                    {
                     before(grammarAccess.getNotesElementAccess().getExerciseParserRuleCall_0_16()); 
                    pushFollow(FOLLOW_2);
                    ruleExercise();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getExerciseParserRuleCall_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalJoveNotes.g:1063:6: ( ruleVoiceToText )
                    {
                    // InternalJoveNotes.g:1063:6: ( ruleVoiceToText )
                    // InternalJoveNotes.g:1064:1: ruleVoiceToText
                    {
                     before(grammarAccess.getNotesElementAccess().getVoiceToTextParserRuleCall_0_17()); 
                    pushFollow(FOLLOW_2);
                    ruleVoiceToText();

                    state._fsp--;

                     after(grammarAccess.getNotesElementAccess().getVoiceToTextParserRuleCall_0_17()); 

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


    // $ANTLR start "rule__RTCElement__Alternatives"
    // InternalJoveNotes.g:1074:1: rule__RTCElement__Alternatives : ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleMultiChoice ) );
    public final void rule__RTCElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1078:1: ( ( ruleWordMeaning ) | ( ruleQuestionAnswer ) | ( ruleFIB ) | ( ruleDefinition ) | ( ruleCharacter ) | ( ruleTeacherNote ) | ( ruleMatching ) | ( ruleEvent ) | ( ruleTrueFalse ) | ( ruleChemEquation ) | ( ruleChemCompound ) | ( ruleImageLabel ) | ( ruleEquation ) | ( ruleMultiChoice ) )
            int alt2=14;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 31:
                {
                alt2=8;
                }
                break;
            case 32:
                {
                alt2=9;
                }
                break;
            case 33:
                {
                alt2=10;
                }
                break;
            case 35:
                {
                alt2=11;
                }
                break;
            case 37:
                {
                alt2=12;
                }
                break;
            case 40:
                {
                alt2=13;
                }
                break;
            case 44:
                {
                alt2=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJoveNotes.g:1079:1: ( ruleWordMeaning )
                    {
                    // InternalJoveNotes.g:1079:1: ( ruleWordMeaning )
                    // InternalJoveNotes.g:1080:1: ruleWordMeaning
                    {
                     before(grammarAccess.getRTCElementAccess().getWordMeaningParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWordMeaning();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getWordMeaningParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJoveNotes.g:1085:6: ( ruleQuestionAnswer )
                    {
                    // InternalJoveNotes.g:1085:6: ( ruleQuestionAnswer )
                    // InternalJoveNotes.g:1086:1: ruleQuestionAnswer
                    {
                     before(grammarAccess.getRTCElementAccess().getQuestionAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionAnswer();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getQuestionAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJoveNotes.g:1091:6: ( ruleFIB )
                    {
                    // InternalJoveNotes.g:1091:6: ( ruleFIB )
                    // InternalJoveNotes.g:1092:1: ruleFIB
                    {
                     before(grammarAccess.getRTCElementAccess().getFIBParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFIB();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getFIBParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJoveNotes.g:1097:6: ( ruleDefinition )
                    {
                    // InternalJoveNotes.g:1097:6: ( ruleDefinition )
                    // InternalJoveNotes.g:1098:1: ruleDefinition
                    {
                     before(grammarAccess.getRTCElementAccess().getDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJoveNotes.g:1103:6: ( ruleCharacter )
                    {
                    // InternalJoveNotes.g:1103:6: ( ruleCharacter )
                    // InternalJoveNotes.g:1104:1: ruleCharacter
                    {
                     before(grammarAccess.getRTCElementAccess().getCharacterParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacter();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getCharacterParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJoveNotes.g:1109:6: ( ruleTeacherNote )
                    {
                    // InternalJoveNotes.g:1109:6: ( ruleTeacherNote )
                    // InternalJoveNotes.g:1110:1: ruleTeacherNote
                    {
                     before(grammarAccess.getRTCElementAccess().getTeacherNoteParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTeacherNote();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getTeacherNoteParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJoveNotes.g:1115:6: ( ruleMatching )
                    {
                    // InternalJoveNotes.g:1115:6: ( ruleMatching )
                    // InternalJoveNotes.g:1116:1: ruleMatching
                    {
                     before(grammarAccess.getRTCElementAccess().getMatchingParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMatching();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getMatchingParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJoveNotes.g:1121:6: ( ruleEvent )
                    {
                    // InternalJoveNotes.g:1121:6: ( ruleEvent )
                    // InternalJoveNotes.g:1122:1: ruleEvent
                    {
                     before(grammarAccess.getRTCElementAccess().getEventParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getEventParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJoveNotes.g:1127:6: ( ruleTrueFalse )
                    {
                    // InternalJoveNotes.g:1127:6: ( ruleTrueFalse )
                    // InternalJoveNotes.g:1128:1: ruleTrueFalse
                    {
                     before(grammarAccess.getRTCElementAccess().getTrueFalseParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueFalse();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getTrueFalseParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJoveNotes.g:1133:6: ( ruleChemEquation )
                    {
                    // InternalJoveNotes.g:1133:6: ( ruleChemEquation )
                    // InternalJoveNotes.g:1134:1: ruleChemEquation
                    {
                     before(grammarAccess.getRTCElementAccess().getChemEquationParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleChemEquation();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getChemEquationParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJoveNotes.g:1139:6: ( ruleChemCompound )
                    {
                    // InternalJoveNotes.g:1139:6: ( ruleChemCompound )
                    // InternalJoveNotes.g:1140:1: ruleChemCompound
                    {
                     before(grammarAccess.getRTCElementAccess().getChemCompoundParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleChemCompound();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getChemCompoundParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJoveNotes.g:1145:6: ( ruleImageLabel )
                    {
                    // InternalJoveNotes.g:1145:6: ( ruleImageLabel )
                    // InternalJoveNotes.g:1146:1: ruleImageLabel
                    {
                     before(grammarAccess.getRTCElementAccess().getImageLabelParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleImageLabel();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getImageLabelParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJoveNotes.g:1151:6: ( ruleEquation )
                    {
                    // InternalJoveNotes.g:1151:6: ( ruleEquation )
                    // InternalJoveNotes.g:1152:1: ruleEquation
                    {
                     before(grammarAccess.getRTCElementAccess().getEquationParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleEquation();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getEquationParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJoveNotes.g:1157:6: ( ruleMultiChoice )
                    {
                    // InternalJoveNotes.g:1157:6: ( ruleMultiChoice )
                    // InternalJoveNotes.g:1158:1: ruleMultiChoice
                    {
                     before(grammarAccess.getRTCElementAccess().getMultiChoiceParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiChoice();

                    state._fsp--;

                     after(grammarAccess.getRTCElementAccess().getMultiChoiceParserRuleCall_13()); 

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
    // $ANTLR end "rule__RTCElement__Alternatives"


    // $ANTLR start "rule__JoveNotes__Group__0"
    // InternalJoveNotes.g:1170:1: rule__JoveNotes__Group__0 : rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1 ;
    public final void rule__JoveNotes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1174:1: ( rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1 )
            // InternalJoveNotes.g:1175:2: rule__JoveNotes__Group__0__Impl rule__JoveNotes__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JoveNotes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1182:1: rule__JoveNotes__Group__0__Impl : ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) ) ;
    public final void rule__JoveNotes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1186:1: ( ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) ) )
            // InternalJoveNotes.g:1187:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) )
            {
            // InternalJoveNotes.g:1187:1: ( ( rule__JoveNotes__ProcessingHintsAssignment_0 ) )
            // InternalJoveNotes.g:1188:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsAssignment_0()); 
            // InternalJoveNotes.g:1189:1: ( rule__JoveNotes__ProcessingHintsAssignment_0 )
            // InternalJoveNotes.g:1189:2: rule__JoveNotes__ProcessingHintsAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1199:1: rule__JoveNotes__Group__1 : rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2 ;
    public final void rule__JoveNotes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1203:1: ( rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2 )
            // InternalJoveNotes.g:1204:2: rule__JoveNotes__Group__1__Impl rule__JoveNotes__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__JoveNotes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1211:1: rule__JoveNotes__Group__1__Impl : ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) ) ;
    public final void rule__JoveNotes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1215:1: ( ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) ) )
            // InternalJoveNotes.g:1216:1: ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) )
            {
            // InternalJoveNotes.g:1216:1: ( ( rule__JoveNotes__ChapterDetailsAssignment_1 ) )
            // InternalJoveNotes.g:1217:1: ( rule__JoveNotes__ChapterDetailsAssignment_1 )
            {
             before(grammarAccess.getJoveNotesAccess().getChapterDetailsAssignment_1()); 
            // InternalJoveNotes.g:1218:1: ( rule__JoveNotes__ChapterDetailsAssignment_1 )
            // InternalJoveNotes.g:1218:2: rule__JoveNotes__ChapterDetailsAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1228:1: rule__JoveNotes__Group__2 : rule__JoveNotes__Group__2__Impl ;
    public final void rule__JoveNotes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1232:1: ( rule__JoveNotes__Group__2__Impl )
            // InternalJoveNotes.g:1233:2: rule__JoveNotes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1239:1: rule__JoveNotes__Group__2__Impl : ( ( rule__JoveNotes__NotesElementsAssignment_2 )* ) ;
    public final void rule__JoveNotes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1243:1: ( ( ( rule__JoveNotes__NotesElementsAssignment_2 )* ) )
            // InternalJoveNotes.g:1244:1: ( ( rule__JoveNotes__NotesElementsAssignment_2 )* )
            {
            // InternalJoveNotes.g:1244:1: ( ( rule__JoveNotes__NotesElementsAssignment_2 )* )
            // InternalJoveNotes.g:1245:1: ( rule__JoveNotes__NotesElementsAssignment_2 )*
            {
             before(grammarAccess.getJoveNotesAccess().getNotesElementsAssignment_2()); 
            // InternalJoveNotes.g:1246:1: ( rule__JoveNotes__NotesElementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=22)||(LA3_0>=31 && LA3_0<=33)||(LA3_0>=35 && LA3_0<=37)||LA3_0==40||LA3_0==42||LA3_0==44||LA3_0==47||LA3_0==51) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJoveNotes.g:1246:2: rule__JoveNotes__NotesElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
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


    // $ANTLR start "rule__ProcessingHints__Group__0"
    // InternalJoveNotes.g:1262:1: rule__ProcessingHints__Group__0 : rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1 ;
    public final void rule__ProcessingHints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1266:1: ( rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1 )
            // InternalJoveNotes.g:1267:2: rule__ProcessingHints__Group__0__Impl rule__ProcessingHints__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ProcessingHints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1274:1: rule__ProcessingHints__Group__0__Impl : ( () ) ;
    public final void rule__ProcessingHints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1278:1: ( ( () ) )
            // InternalJoveNotes.g:1279:1: ( () )
            {
            // InternalJoveNotes.g:1279:1: ( () )
            // InternalJoveNotes.g:1280:1: ()
            {
             before(grammarAccess.getProcessingHintsAccess().getProcessingHintsAction_0()); 
            // InternalJoveNotes.g:1281:1: ()
            // InternalJoveNotes.g:1283:1: 
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
    // InternalJoveNotes.g:1293:1: rule__ProcessingHints__Group__1 : rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2 ;
    public final void rule__ProcessingHints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1297:1: ( rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2 )
            // InternalJoveNotes.g:1298:2: rule__ProcessingHints__Group__1__Impl rule__ProcessingHints__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ProcessingHints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1305:1: rule__ProcessingHints__Group__1__Impl : ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? ) ;
    public final void rule__ProcessingHints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1309:1: ( ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? ) )
            // InternalJoveNotes.g:1310:1: ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? )
            {
            // InternalJoveNotes.g:1310:1: ( ( rule__ProcessingHints__SkipGenerationAssignment_1 )? )
            // InternalJoveNotes.g:1311:1: ( rule__ProcessingHints__SkipGenerationAssignment_1 )?
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationAssignment_1()); 
            // InternalJoveNotes.g:1312:1: ( rule__ProcessingHints__SkipGenerationAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==55) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJoveNotes.g:1312:2: rule__ProcessingHints__SkipGenerationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1322:1: rule__ProcessingHints__Group__2 : rule__ProcessingHints__Group__2__Impl ;
    public final void rule__ProcessingHints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1326:1: ( rule__ProcessingHints__Group__2__Impl )
            // InternalJoveNotes.g:1327:2: rule__ProcessingHints__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1333:1: rule__ProcessingHints__Group__2__Impl : ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? ) ;
    public final void rule__ProcessingHints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1337:1: ( ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? ) )
            // InternalJoveNotes.g:1338:1: ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? )
            {
            // InternalJoveNotes.g:1338:1: ( ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )? )
            // InternalJoveNotes.g:1339:1: ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )?
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionAssignment_2()); 
            // InternalJoveNotes.g:1340:1: ( rule__ProcessingHints__SkipGenerationInProductionAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==56) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJoveNotes.g:1340:2: rule__ProcessingHints__SkipGenerationInProductionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1356:1: rule__ChapterDetails__Group__0 : rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 ;
    public final void rule__ChapterDetails__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1360:1: ( rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1 )
            // InternalJoveNotes.g:1361:2: rule__ChapterDetails__Group__0__Impl rule__ChapterDetails__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ChapterDetails__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1368:1: rule__ChapterDetails__Group__0__Impl : ( ( rule__ChapterDetails__ExerciseBankAssignment_0 )? ) ;
    public final void rule__ChapterDetails__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1372:1: ( ( ( rule__ChapterDetails__ExerciseBankAssignment_0 )? ) )
            // InternalJoveNotes.g:1373:1: ( ( rule__ChapterDetails__ExerciseBankAssignment_0 )? )
            {
            // InternalJoveNotes.g:1373:1: ( ( rule__ChapterDetails__ExerciseBankAssignment_0 )? )
            // InternalJoveNotes.g:1374:1: ( rule__ChapterDetails__ExerciseBankAssignment_0 )?
            {
             before(grammarAccess.getChapterDetailsAccess().getExerciseBankAssignment_0()); 
            // InternalJoveNotes.g:1375:1: ( rule__ChapterDetails__ExerciseBankAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==57) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJoveNotes.g:1375:2: rule__ChapterDetails__ExerciseBankAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChapterDetails__ExerciseBankAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterDetailsAccess().getExerciseBankAssignment_0()); 

            }


            }

        }
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
    // InternalJoveNotes.g:1385:1: rule__ChapterDetails__Group__1 : rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 ;
    public final void rule__ChapterDetails__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1389:1: ( rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2 )
            // InternalJoveNotes.g:1390:2: rule__ChapterDetails__Group__1__Impl rule__ChapterDetails__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ChapterDetails__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1397:1: rule__ChapterDetails__Group__1__Impl : ( 'subject' ) ;
    public final void rule__ChapterDetails__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1401:1: ( ( 'subject' ) )
            // InternalJoveNotes.g:1402:1: ( 'subject' )
            {
            // InternalJoveNotes.g:1402:1: ( 'subject' )
            // InternalJoveNotes.g:1403:1: 'subject'
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalJoveNotes.g:1416:1: rule__ChapterDetails__Group__2 : rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 ;
    public final void rule__ChapterDetails__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1420:1: ( rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3 )
            // InternalJoveNotes.g:1421:2: rule__ChapterDetails__Group__2__Impl rule__ChapterDetails__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ChapterDetails__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1428:1: rule__ChapterDetails__Group__2__Impl : ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) ;
    public final void rule__ChapterDetails__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1432:1: ( ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) ) )
            // InternalJoveNotes.g:1433:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            {
            // InternalJoveNotes.g:1433:1: ( ( rule__ChapterDetails__SubjectNameAssignment_2 ) )
            // InternalJoveNotes.g:1434:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameAssignment_2()); 
            // InternalJoveNotes.g:1435:1: ( rule__ChapterDetails__SubjectNameAssignment_2 )
            // InternalJoveNotes.g:1435:2: rule__ChapterDetails__SubjectNameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1445:1: rule__ChapterDetails__Group__3 : rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 ;
    public final void rule__ChapterDetails__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1449:1: ( rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4 )
            // InternalJoveNotes.g:1450:2: rule__ChapterDetails__Group__3__Impl rule__ChapterDetails__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ChapterDetails__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1457:1: rule__ChapterDetails__Group__3__Impl : ( 'chapterNumber' ) ;
    public final void rule__ChapterDetails__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1461:1: ( ( 'chapterNumber' ) )
            // InternalJoveNotes.g:1462:1: ( 'chapterNumber' )
            {
            // InternalJoveNotes.g:1462:1: ( 'chapterNumber' )
            // InternalJoveNotes.g:1463:1: 'chapterNumber'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalJoveNotes.g:1476:1: rule__ChapterDetails__Group__4 : rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 ;
    public final void rule__ChapterDetails__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1480:1: ( rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5 )
            // InternalJoveNotes.g:1481:2: rule__ChapterDetails__Group__4__Impl rule__ChapterDetails__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ChapterDetails__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1488:1: rule__ChapterDetails__Group__4__Impl : ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) ;
    public final void rule__ChapterDetails__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1492:1: ( ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) ) )
            // InternalJoveNotes.g:1493:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            {
            // InternalJoveNotes.g:1493:1: ( ( rule__ChapterDetails__ChapterNumberAssignment_4 ) )
            // InternalJoveNotes.g:1494:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberAssignment_4()); 
            // InternalJoveNotes.g:1495:1: ( rule__ChapterDetails__ChapterNumberAssignment_4 )
            // InternalJoveNotes.g:1495:2: rule__ChapterDetails__ChapterNumberAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1505:1: rule__ChapterDetails__Group__5 : rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 ;
    public final void rule__ChapterDetails__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1509:1: ( rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6 )
            // InternalJoveNotes.g:1510:2: rule__ChapterDetails__Group__5__Impl rule__ChapterDetails__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ChapterDetails__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1517:1: rule__ChapterDetails__Group__5__Impl : ( '.' ) ;
    public final void rule__ChapterDetails__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1521:1: ( ( '.' ) )
            // InternalJoveNotes.g:1522:1: ( '.' )
            {
            // InternalJoveNotes.g:1522:1: ( '.' )
            // InternalJoveNotes.g:1523:1: '.'
            {
             before(grammarAccess.getChapterDetailsAccess().getFullStopKeyword_5()); 
            match(input,14,FOLLOW_2); 
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
    // InternalJoveNotes.g:1536:1: rule__ChapterDetails__Group__6 : rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 ;
    public final void rule__ChapterDetails__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1540:1: ( rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7 )
            // InternalJoveNotes.g:1541:2: rule__ChapterDetails__Group__6__Impl rule__ChapterDetails__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__ChapterDetails__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1548:1: rule__ChapterDetails__Group__6__Impl : ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) ;
    public final void rule__ChapterDetails__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1552:1: ( ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) ) )
            // InternalJoveNotes.g:1553:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            {
            // InternalJoveNotes.g:1553:1: ( ( rule__ChapterDetails__SubChapterNumberAssignment_6 ) )
            // InternalJoveNotes.g:1554:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberAssignment_6()); 
            // InternalJoveNotes.g:1555:1: ( rule__ChapterDetails__SubChapterNumberAssignment_6 )
            // InternalJoveNotes.g:1555:2: rule__ChapterDetails__SubChapterNumberAssignment_6
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1565:1: rule__ChapterDetails__Group__7 : rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 ;
    public final void rule__ChapterDetails__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1569:1: ( rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8 )
            // InternalJoveNotes.g:1570:2: rule__ChapterDetails__Group__7__Impl rule__ChapterDetails__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__ChapterDetails__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1577:1: rule__ChapterDetails__Group__7__Impl : ( 'chapterName' ) ;
    public final void rule__ChapterDetails__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1581:1: ( ( 'chapterName' ) )
            // InternalJoveNotes.g:1582:1: ( 'chapterName' )
            {
            // InternalJoveNotes.g:1582:1: ( 'chapterName' )
            // InternalJoveNotes.g:1583:1: 'chapterName'
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameKeyword_7()); 
            match(input,15,FOLLOW_2); 
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
    // InternalJoveNotes.g:1596:1: rule__ChapterDetails__Group__8 : rule__ChapterDetails__Group__8__Impl rule__ChapterDetails__Group__9 ;
    public final void rule__ChapterDetails__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1600:1: ( rule__ChapterDetails__Group__8__Impl rule__ChapterDetails__Group__9 )
            // InternalJoveNotes.g:1601:2: rule__ChapterDetails__Group__8__Impl rule__ChapterDetails__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__ChapterDetails__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1608:1: rule__ChapterDetails__Group__8__Impl : ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) ;
    public final void rule__ChapterDetails__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1612:1: ( ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) ) )
            // InternalJoveNotes.g:1613:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            {
            // InternalJoveNotes.g:1613:1: ( ( rule__ChapterDetails__ChapterNameAssignment_8 ) )
            // InternalJoveNotes.g:1614:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameAssignment_8()); 
            // InternalJoveNotes.g:1615:1: ( rule__ChapterDetails__ChapterNameAssignment_8 )
            // InternalJoveNotes.g:1615:2: rule__ChapterDetails__ChapterNameAssignment_8
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1625:1: rule__ChapterDetails__Group__9 : rule__ChapterDetails__Group__9__Impl ;
    public final void rule__ChapterDetails__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1629:1: ( rule__ChapterDetails__Group__9__Impl )
            // InternalJoveNotes.g:1630:2: rule__ChapterDetails__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1636:1: rule__ChapterDetails__Group__9__Impl : ( ( rule__ChapterDetails__ScriptBodyAssignment_9 )? ) ;
    public final void rule__ChapterDetails__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1640:1: ( ( ( rule__ChapterDetails__ScriptBodyAssignment_9 )? ) )
            // InternalJoveNotes.g:1641:1: ( ( rule__ChapterDetails__ScriptBodyAssignment_9 )? )
            {
            // InternalJoveNotes.g:1641:1: ( ( rule__ChapterDetails__ScriptBodyAssignment_9 )? )
            // InternalJoveNotes.g:1642:1: ( rule__ChapterDetails__ScriptBodyAssignment_9 )?
            {
             before(grammarAccess.getChapterDetailsAccess().getScriptBodyAssignment_9()); 
            // InternalJoveNotes.g:1643:1: ( rule__ChapterDetails__ScriptBodyAssignment_9 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==54) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJoveNotes.g:1643:2: rule__ChapterDetails__ScriptBodyAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChapterDetails__ScriptBodyAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterDetailsAccess().getScriptBodyAssignment_9()); 

            }


            }

        }
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
    // InternalJoveNotes.g:1673:1: rule__NotesElement__Group__0 : rule__NotesElement__Group__0__Impl rule__NotesElement__Group__1 ;
    public final void rule__NotesElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1677:1: ( rule__NotesElement__Group__0__Impl rule__NotesElement__Group__1 )
            // InternalJoveNotes.g:1678:2: rule__NotesElement__Group__0__Impl rule__NotesElement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__NotesElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1685:1: rule__NotesElement__Group__0__Impl : ( ( rule__NotesElement__Alternatives_0 ) ) ;
    public final void rule__NotesElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1689:1: ( ( ( rule__NotesElement__Alternatives_0 ) ) )
            // InternalJoveNotes.g:1690:1: ( ( rule__NotesElement__Alternatives_0 ) )
            {
            // InternalJoveNotes.g:1690:1: ( ( rule__NotesElement__Alternatives_0 ) )
            // InternalJoveNotes.g:1691:1: ( rule__NotesElement__Alternatives_0 )
            {
             before(grammarAccess.getNotesElementAccess().getAlternatives_0()); 
            // InternalJoveNotes.g:1692:1: ( rule__NotesElement__Alternatives_0 )
            // InternalJoveNotes.g:1692:2: rule__NotesElement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1702:1: rule__NotesElement__Group__1 : rule__NotesElement__Group__1__Impl ;
    public final void rule__NotesElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1706:1: ( rule__NotesElement__Group__1__Impl )
            // InternalJoveNotes.g:1707:2: rule__NotesElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1713:1: rule__NotesElement__Group__1__Impl : ( ( rule__NotesElement__ScriptAssignment_1 )? ) ;
    public final void rule__NotesElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1717:1: ( ( ( rule__NotesElement__ScriptAssignment_1 )? ) )
            // InternalJoveNotes.g:1718:1: ( ( rule__NotesElement__ScriptAssignment_1 )? )
            {
            // InternalJoveNotes.g:1718:1: ( ( rule__NotesElement__ScriptAssignment_1 )? )
            // InternalJoveNotes.g:1719:1: ( rule__NotesElement__ScriptAssignment_1 )?
            {
             before(grammarAccess.getNotesElementAccess().getScriptAssignment_1()); 
            // InternalJoveNotes.g:1720:1: ( rule__NotesElement__ScriptAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==53) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJoveNotes.g:1720:2: rule__NotesElement__ScriptAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1734:1: rule__WordMeaning__Group__0 : rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 ;
    public final void rule__WordMeaning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1738:1: ( rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1 )
            // InternalJoveNotes.g:1739:2: rule__WordMeaning__Group__0__Impl rule__WordMeaning__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__WordMeaning__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1746:1: rule__WordMeaning__Group__0__Impl : ( '@wm' ) ;
    public final void rule__WordMeaning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1750:1: ( ( '@wm' ) )
            // InternalJoveNotes.g:1751:1: ( '@wm' )
            {
            // InternalJoveNotes.g:1751:1: ( '@wm' )
            // InternalJoveNotes.g:1752:1: '@wm'
            {
             before(grammarAccess.getWordMeaningAccess().getWmKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalJoveNotes.g:1765:1: rule__WordMeaning__Group__1 : rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 ;
    public final void rule__WordMeaning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1769:1: ( rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2 )
            // InternalJoveNotes.g:1770:2: rule__WordMeaning__Group__1__Impl rule__WordMeaning__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__WordMeaning__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1777:1: rule__WordMeaning__Group__1__Impl : ( ( rule__WordMeaning__HideFromViewAssignment_1 )? ) ;
    public final void rule__WordMeaning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1781:1: ( ( ( rule__WordMeaning__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:1782:1: ( ( rule__WordMeaning__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:1782:1: ( ( rule__WordMeaning__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:1783:1: ( rule__WordMeaning__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:1784:1: ( rule__WordMeaning__HideFromViewAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==58) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJoveNotes.g:1784:2: rule__WordMeaning__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1794:1: rule__WordMeaning__Group__2 : rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3 ;
    public final void rule__WordMeaning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1798:1: ( rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3 )
            // InternalJoveNotes.g:1799:2: rule__WordMeaning__Group__2__Impl rule__WordMeaning__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__WordMeaning__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1806:1: rule__WordMeaning__Group__2__Impl : ( ( rule__WordMeaning__WordAssignment_2 ) ) ;
    public final void rule__WordMeaning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1810:1: ( ( ( rule__WordMeaning__WordAssignment_2 ) ) )
            // InternalJoveNotes.g:1811:1: ( ( rule__WordMeaning__WordAssignment_2 ) )
            {
            // InternalJoveNotes.g:1811:1: ( ( rule__WordMeaning__WordAssignment_2 ) )
            // InternalJoveNotes.g:1812:1: ( rule__WordMeaning__WordAssignment_2 )
            {
             before(grammarAccess.getWordMeaningAccess().getWordAssignment_2()); 
            // InternalJoveNotes.g:1813:1: ( rule__WordMeaning__WordAssignment_2 )
            // InternalJoveNotes.g:1813:2: rule__WordMeaning__WordAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1823:1: rule__WordMeaning__Group__3 : rule__WordMeaning__Group__3__Impl ;
    public final void rule__WordMeaning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1827:1: ( rule__WordMeaning__Group__3__Impl )
            // InternalJoveNotes.g:1828:2: rule__WordMeaning__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1834:1: rule__WordMeaning__Group__3__Impl : ( ( rule__WordMeaning__MeaningAssignment_3 ) ) ;
    public final void rule__WordMeaning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1838:1: ( ( ( rule__WordMeaning__MeaningAssignment_3 ) ) )
            // InternalJoveNotes.g:1839:1: ( ( rule__WordMeaning__MeaningAssignment_3 ) )
            {
            // InternalJoveNotes.g:1839:1: ( ( rule__WordMeaning__MeaningAssignment_3 ) )
            // InternalJoveNotes.g:1840:1: ( rule__WordMeaning__MeaningAssignment_3 )
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningAssignment_3()); 
            // InternalJoveNotes.g:1841:1: ( rule__WordMeaning__MeaningAssignment_3 )
            // InternalJoveNotes.g:1841:2: rule__WordMeaning__MeaningAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1859:1: rule__QuestionAnswer__Group__0 : rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 ;
    public final void rule__QuestionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1863:1: ( rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1 )
            // InternalJoveNotes.g:1864:2: rule__QuestionAnswer__Group__0__Impl rule__QuestionAnswer__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__QuestionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1871:1: rule__QuestionAnswer__Group__0__Impl : ( '@qa' ) ;
    public final void rule__QuestionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1875:1: ( ( '@qa' ) )
            // InternalJoveNotes.g:1876:1: ( '@qa' )
            {
            // InternalJoveNotes.g:1876:1: ( '@qa' )
            // InternalJoveNotes.g:1877:1: '@qa'
            {
             before(grammarAccess.getQuestionAnswerAccess().getQaKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalJoveNotes.g:1890:1: rule__QuestionAnswer__Group__1 : rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 ;
    public final void rule__QuestionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1894:1: ( rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2 )
            // InternalJoveNotes.g:1895:2: rule__QuestionAnswer__Group__1__Impl rule__QuestionAnswer__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__QuestionAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1902:1: rule__QuestionAnswer__Group__1__Impl : ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? ) ;
    public final void rule__QuestionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1906:1: ( ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:1907:1: ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:1907:1: ( ( rule__QuestionAnswer__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:1908:1: ( rule__QuestionAnswer__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:1909:1: ( rule__QuestionAnswer__HideFromViewAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==58) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJoveNotes.g:1909:2: rule__QuestionAnswer__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1919:1: rule__QuestionAnswer__Group__2 : rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 ;
    public final void rule__QuestionAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1923:1: ( rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3 )
            // InternalJoveNotes.g:1924:2: rule__QuestionAnswer__Group__2__Impl rule__QuestionAnswer__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__QuestionAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1931:1: rule__QuestionAnswer__Group__2__Impl : ( ( rule__QuestionAnswer__QuestionAssignment_2 ) ) ;
    public final void rule__QuestionAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1935:1: ( ( ( rule__QuestionAnswer__QuestionAssignment_2 ) ) )
            // InternalJoveNotes.g:1936:1: ( ( rule__QuestionAnswer__QuestionAssignment_2 ) )
            {
            // InternalJoveNotes.g:1936:1: ( ( rule__QuestionAnswer__QuestionAssignment_2 ) )
            // InternalJoveNotes.g:1937:1: ( rule__QuestionAnswer__QuestionAssignment_2 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionAssignment_2()); 
            // InternalJoveNotes.g:1938:1: ( rule__QuestionAnswer__QuestionAssignment_2 )
            // InternalJoveNotes.g:1938:2: rule__QuestionAnswer__QuestionAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1948:1: rule__QuestionAnswer__Group__3 : rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4 ;
    public final void rule__QuestionAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1952:1: ( rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4 )
            // InternalJoveNotes.g:1953:2: rule__QuestionAnswer__Group__3__Impl rule__QuestionAnswer__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__QuestionAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1960:1: rule__QuestionAnswer__Group__3__Impl : ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) ) ;
    public final void rule__QuestionAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1964:1: ( ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) ) )
            // InternalJoveNotes.g:1965:1: ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) )
            {
            // InternalJoveNotes.g:1965:1: ( ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* ) )
            // InternalJoveNotes.g:1966:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) ) ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* )
            {
            // InternalJoveNotes.g:1966:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 ) )
            // InternalJoveNotes.g:1967:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 
            // InternalJoveNotes.g:1968:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )
            // InternalJoveNotes.g:1968:2: rule__QuestionAnswer__AnswerPartsAssignment_3
            {
            pushFollow(FOLLOW_16);
            rule__QuestionAnswer__AnswerPartsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 

            }

            // InternalJoveNotes.g:1971:1: ( ( rule__QuestionAnswer__AnswerPartsAssignment_3 )* )
            // InternalJoveNotes.g:1972:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )*
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsAssignment_3()); 
            // InternalJoveNotes.g:1973:1: ( rule__QuestionAnswer__AnswerPartsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJoveNotes.g:1973:2: rule__QuestionAnswer__AnswerPartsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QuestionAnswer__AnswerPartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalJoveNotes.g:1984:1: rule__QuestionAnswer__Group__4 : rule__QuestionAnswer__Group__4__Impl ;
    public final void rule__QuestionAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1988:1: ( rule__QuestionAnswer__Group__4__Impl )
            // InternalJoveNotes.g:1989:2: rule__QuestionAnswer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:1995:1: rule__QuestionAnswer__Group__4__Impl : ( ( rule__QuestionAnswer__CmapAssignment_4 )? ) ;
    public final void rule__QuestionAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:1999:1: ( ( ( rule__QuestionAnswer__CmapAssignment_4 )? ) )
            // InternalJoveNotes.g:2000:1: ( ( rule__QuestionAnswer__CmapAssignment_4 )? )
            {
            // InternalJoveNotes.g:2000:1: ( ( rule__QuestionAnswer__CmapAssignment_4 )? )
            // InternalJoveNotes.g:2001:1: ( rule__QuestionAnswer__CmapAssignment_4 )?
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapAssignment_4()); 
            // InternalJoveNotes.g:2002:1: ( rule__QuestionAnswer__CmapAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==52) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJoveNotes.g:2002:2: rule__QuestionAnswer__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2022:1: rule__FIB__Group__0 : rule__FIB__Group__0__Impl rule__FIB__Group__1 ;
    public final void rule__FIB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2026:1: ( rule__FIB__Group__0__Impl rule__FIB__Group__1 )
            // InternalJoveNotes.g:2027:2: rule__FIB__Group__0__Impl rule__FIB__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FIB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2034:1: rule__FIB__Group__0__Impl : ( '@fib' ) ;
    public final void rule__FIB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2038:1: ( ( '@fib' ) )
            // InternalJoveNotes.g:2039:1: ( '@fib' )
            {
            // InternalJoveNotes.g:2039:1: ( '@fib' )
            // InternalJoveNotes.g:2040:1: '@fib'
            {
             before(grammarAccess.getFIBAccess().getFibKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalJoveNotes.g:2053:1: rule__FIB__Group__1 : rule__FIB__Group__1__Impl rule__FIB__Group__2 ;
    public final void rule__FIB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2057:1: ( rule__FIB__Group__1__Impl rule__FIB__Group__2 )
            // InternalJoveNotes.g:2058:2: rule__FIB__Group__1__Impl rule__FIB__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__FIB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2065:1: rule__FIB__Group__1__Impl : ( ( rule__FIB__HideFromViewAssignment_1 )? ) ;
    public final void rule__FIB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2069:1: ( ( ( rule__FIB__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2070:1: ( ( rule__FIB__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2070:1: ( ( rule__FIB__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2071:1: ( rule__FIB__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getFIBAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2072:1: ( rule__FIB__HideFromViewAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==58) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJoveNotes.g:2072:2: rule__FIB__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2082:1: rule__FIB__Group__2 : rule__FIB__Group__2__Impl rule__FIB__Group__3 ;
    public final void rule__FIB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2086:1: ( rule__FIB__Group__2__Impl rule__FIB__Group__3 )
            // InternalJoveNotes.g:2087:2: rule__FIB__Group__2__Impl rule__FIB__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__FIB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2094:1: rule__FIB__Group__2__Impl : ( ( rule__FIB__QuestionAssignment_2 ) ) ;
    public final void rule__FIB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2098:1: ( ( ( rule__FIB__QuestionAssignment_2 ) ) )
            // InternalJoveNotes.g:2099:1: ( ( rule__FIB__QuestionAssignment_2 ) )
            {
            // InternalJoveNotes.g:2099:1: ( ( rule__FIB__QuestionAssignment_2 ) )
            // InternalJoveNotes.g:2100:1: ( rule__FIB__QuestionAssignment_2 )
            {
             before(grammarAccess.getFIBAccess().getQuestionAssignment_2()); 
            // InternalJoveNotes.g:2101:1: ( rule__FIB__QuestionAssignment_2 )
            // InternalJoveNotes.g:2101:2: rule__FIB__QuestionAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2111:1: rule__FIB__Group__3 : rule__FIB__Group__3__Impl ;
    public final void rule__FIB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2115:1: ( rule__FIB__Group__3__Impl )
            // InternalJoveNotes.g:2116:2: rule__FIB__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2122:1: rule__FIB__Group__3__Impl : ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) ) ;
    public final void rule__FIB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2126:1: ( ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) ) )
            // InternalJoveNotes.g:2127:1: ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) )
            {
            // InternalJoveNotes.g:2127:1: ( ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* ) )
            // InternalJoveNotes.g:2128:1: ( ( rule__FIB__AnswersAssignment_3 ) ) ( ( rule__FIB__AnswersAssignment_3 )* )
            {
            // InternalJoveNotes.g:2128:1: ( ( rule__FIB__AnswersAssignment_3 ) )
            // InternalJoveNotes.g:2129:1: ( rule__FIB__AnswersAssignment_3 )
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 
            // InternalJoveNotes.g:2130:1: ( rule__FIB__AnswersAssignment_3 )
            // InternalJoveNotes.g:2130:2: rule__FIB__AnswersAssignment_3
            {
            pushFollow(FOLLOW_16);
            rule__FIB__AnswersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 

            }

            // InternalJoveNotes.g:2133:1: ( ( rule__FIB__AnswersAssignment_3 )* )
            // InternalJoveNotes.g:2134:1: ( rule__FIB__AnswersAssignment_3 )*
            {
             before(grammarAccess.getFIBAccess().getAnswersAssignment_3()); 
            // InternalJoveNotes.g:2135:1: ( rule__FIB__AnswersAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJoveNotes.g:2135:2: rule__FIB__AnswersAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FIB__AnswersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalJoveNotes.g:2154:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2158:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalJoveNotes.g:2159:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2166:1: rule__Definition__Group__0__Impl : ( '@definition' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2170:1: ( ( '@definition' ) )
            // InternalJoveNotes.g:2171:1: ( '@definition' )
            {
            // InternalJoveNotes.g:2171:1: ( '@definition' )
            // InternalJoveNotes.g:2172:1: '@definition'
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalJoveNotes.g:2185:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2189:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalJoveNotes.g:2190:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2197:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__HideFromViewAssignment_1 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2201:1: ( ( ( rule__Definition__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2202:1: ( ( rule__Definition__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2202:1: ( ( rule__Definition__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2203:1: ( rule__Definition__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2204:1: ( rule__Definition__HideFromViewAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==58) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJoveNotes.g:2204:2: rule__Definition__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2214:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2218:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // InternalJoveNotes.g:2219:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2226:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__TermAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2230:1: ( ( ( rule__Definition__TermAssignment_2 ) ) )
            // InternalJoveNotes.g:2231:1: ( ( rule__Definition__TermAssignment_2 ) )
            {
            // InternalJoveNotes.g:2231:1: ( ( rule__Definition__TermAssignment_2 ) )
            // InternalJoveNotes.g:2232:1: ( rule__Definition__TermAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getTermAssignment_2()); 
            // InternalJoveNotes.g:2233:1: ( rule__Definition__TermAssignment_2 )
            // InternalJoveNotes.g:2233:2: rule__Definition__TermAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2243:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2247:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // InternalJoveNotes.g:2248:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2255:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__DefinitionAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2259:1: ( ( ( rule__Definition__DefinitionAssignment_3 ) ) )
            // InternalJoveNotes.g:2260:1: ( ( rule__Definition__DefinitionAssignment_3 ) )
            {
            // InternalJoveNotes.g:2260:1: ( ( rule__Definition__DefinitionAssignment_3 ) )
            // InternalJoveNotes.g:2261:1: ( rule__Definition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionAssignment_3()); 
            // InternalJoveNotes.g:2262:1: ( rule__Definition__DefinitionAssignment_3 )
            // InternalJoveNotes.g:2262:2: rule__Definition__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2272:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2276:1: ( rule__Definition__Group__4__Impl )
            // InternalJoveNotes.g:2277:2: rule__Definition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2283:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__CmapAssignment_4 )? ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2287:1: ( ( ( rule__Definition__CmapAssignment_4 )? ) )
            // InternalJoveNotes.g:2288:1: ( ( rule__Definition__CmapAssignment_4 )? )
            {
            // InternalJoveNotes.g:2288:1: ( ( rule__Definition__CmapAssignment_4 )? )
            // InternalJoveNotes.g:2289:1: ( rule__Definition__CmapAssignment_4 )?
            {
             before(grammarAccess.getDefinitionAccess().getCmapAssignment_4()); 
            // InternalJoveNotes.g:2290:1: ( rule__Definition__CmapAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJoveNotes.g:2290:2: rule__Definition__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2310:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2314:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // InternalJoveNotes.g:2315:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2322:1: rule__Character__Group__0__Impl : ( '@character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2326:1: ( ( '@character' ) )
            // InternalJoveNotes.g:2327:1: ( '@character' )
            {
            // InternalJoveNotes.g:2327:1: ( '@character' )
            // InternalJoveNotes.g:2328:1: '@character'
            {
             before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalJoveNotes.g:2341:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2345:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // InternalJoveNotes.g:2346:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2353:1: rule__Character__Group__1__Impl : ( ( rule__Character__HideFromViewAssignment_1 )? ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2357:1: ( ( ( rule__Character__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2358:1: ( ( rule__Character__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2358:1: ( ( rule__Character__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2359:1: ( rule__Character__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2360:1: ( rule__Character__HideFromViewAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==58) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJoveNotes.g:2360:2: rule__Character__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2370:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2374:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // InternalJoveNotes.g:2375:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Character__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2382:1: rule__Character__Group__2__Impl : ( ( rule__Character__CharacterAssignment_2 ) ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2386:1: ( ( ( rule__Character__CharacterAssignment_2 ) ) )
            // InternalJoveNotes.g:2387:1: ( ( rule__Character__CharacterAssignment_2 ) )
            {
            // InternalJoveNotes.g:2387:1: ( ( rule__Character__CharacterAssignment_2 ) )
            // InternalJoveNotes.g:2388:1: ( rule__Character__CharacterAssignment_2 )
            {
             before(grammarAccess.getCharacterAccess().getCharacterAssignment_2()); 
            // InternalJoveNotes.g:2389:1: ( rule__Character__CharacterAssignment_2 )
            // InternalJoveNotes.g:2389:2: rule__Character__CharacterAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2399:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2403:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // InternalJoveNotes.g:2404:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Character__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2411:1: rule__Character__Group__3__Impl : ( ( rule__Character__EstimateAssignment_3 ) ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2415:1: ( ( ( rule__Character__EstimateAssignment_3 ) ) )
            // InternalJoveNotes.g:2416:1: ( ( rule__Character__EstimateAssignment_3 ) )
            {
            // InternalJoveNotes.g:2416:1: ( ( rule__Character__EstimateAssignment_3 ) )
            // InternalJoveNotes.g:2417:1: ( rule__Character__EstimateAssignment_3 )
            {
             before(grammarAccess.getCharacterAccess().getEstimateAssignment_3()); 
            // InternalJoveNotes.g:2418:1: ( rule__Character__EstimateAssignment_3 )
            // InternalJoveNotes.g:2418:2: rule__Character__EstimateAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2428:1: rule__Character__Group__4 : rule__Character__Group__4__Impl ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2432:1: ( rule__Character__Group__4__Impl )
            // InternalJoveNotes.g:2433:2: rule__Character__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2439:1: rule__Character__Group__4__Impl : ( ( rule__Character__CmapAssignment_4 )? ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2443:1: ( ( ( rule__Character__CmapAssignment_4 )? ) )
            // InternalJoveNotes.g:2444:1: ( ( rule__Character__CmapAssignment_4 )? )
            {
            // InternalJoveNotes.g:2444:1: ( ( rule__Character__CmapAssignment_4 )? )
            // InternalJoveNotes.g:2445:1: ( rule__Character__CmapAssignment_4 )?
            {
             before(grammarAccess.getCharacterAccess().getCmapAssignment_4()); 
            // InternalJoveNotes.g:2446:1: ( rule__Character__CmapAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJoveNotes.g:2446:2: rule__Character__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2466:1: rule__TeacherNote__Group__0 : rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 ;
    public final void rule__TeacherNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2470:1: ( rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1 )
            // InternalJoveNotes.g:2471:2: rule__TeacherNote__Group__0__Impl rule__TeacherNote__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TeacherNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2478:1: rule__TeacherNote__Group__0__Impl : ( '@tn' ) ;
    public final void rule__TeacherNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2482:1: ( ( '@tn' ) )
            // InternalJoveNotes.g:2483:1: ( '@tn' )
            {
            // InternalJoveNotes.g:2483:1: ( '@tn' )
            // InternalJoveNotes.g:2484:1: '@tn'
            {
             before(grammarAccess.getTeacherNoteAccess().getTnKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalJoveNotes.g:2497:1: rule__TeacherNote__Group__1 : rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 ;
    public final void rule__TeacherNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2501:1: ( rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2 )
            // InternalJoveNotes.g:2502:2: rule__TeacherNote__Group__1__Impl rule__TeacherNote__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TeacherNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2509:1: rule__TeacherNote__Group__1__Impl : ( ( rule__TeacherNote__HideFromViewAssignment_1 )? ) ;
    public final void rule__TeacherNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2513:1: ( ( ( rule__TeacherNote__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2514:1: ( ( rule__TeacherNote__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2514:1: ( ( rule__TeacherNote__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2515:1: ( rule__TeacherNote__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2516:1: ( rule__TeacherNote__HideFromViewAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==58) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJoveNotes.g:2516:2: rule__TeacherNote__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2526:1: rule__TeacherNote__Group__2 : rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3 ;
    public final void rule__TeacherNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2530:1: ( rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3 )
            // InternalJoveNotes.g:2531:2: rule__TeacherNote__Group__2__Impl rule__TeacherNote__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TeacherNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2538:1: rule__TeacherNote__Group__2__Impl : ( ( rule__TeacherNote__CaptionAssignment_2 )? ) ;
    public final void rule__TeacherNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2542:1: ( ( ( rule__TeacherNote__CaptionAssignment_2 )? ) )
            // InternalJoveNotes.g:2543:1: ( ( rule__TeacherNote__CaptionAssignment_2 )? )
            {
            // InternalJoveNotes.g:2543:1: ( ( rule__TeacherNote__CaptionAssignment_2 )? )
            // InternalJoveNotes.g:2544:1: ( rule__TeacherNote__CaptionAssignment_2 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getCaptionAssignment_2()); 
            // InternalJoveNotes.g:2545:1: ( rule__TeacherNote__CaptionAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_STRING) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalJoveNotes.g:2545:2: rule__TeacherNote__CaptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2555:1: rule__TeacherNote__Group__3 : rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4 ;
    public final void rule__TeacherNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2559:1: ( rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4 )
            // InternalJoveNotes.g:2560:2: rule__TeacherNote__Group__3__Impl rule__TeacherNote__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__TeacherNote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2567:1: rule__TeacherNote__Group__3__Impl : ( ( rule__TeacherNote__NoteAssignment_3 ) ) ;
    public final void rule__TeacherNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2571:1: ( ( ( rule__TeacherNote__NoteAssignment_3 ) ) )
            // InternalJoveNotes.g:2572:1: ( ( rule__TeacherNote__NoteAssignment_3 ) )
            {
            // InternalJoveNotes.g:2572:1: ( ( rule__TeacherNote__NoteAssignment_3 ) )
            // InternalJoveNotes.g:2573:1: ( rule__TeacherNote__NoteAssignment_3 )
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteAssignment_3()); 
            // InternalJoveNotes.g:2574:1: ( rule__TeacherNote__NoteAssignment_3 )
            // InternalJoveNotes.g:2574:2: rule__TeacherNote__NoteAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2584:1: rule__TeacherNote__Group__4 : rule__TeacherNote__Group__4__Impl ;
    public final void rule__TeacherNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2588:1: ( rule__TeacherNote__Group__4__Impl )
            // InternalJoveNotes.g:2589:2: rule__TeacherNote__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2595:1: rule__TeacherNote__Group__4__Impl : ( ( rule__TeacherNote__CmapAssignment_4 )? ) ;
    public final void rule__TeacherNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2599:1: ( ( ( rule__TeacherNote__CmapAssignment_4 )? ) )
            // InternalJoveNotes.g:2600:1: ( ( rule__TeacherNote__CmapAssignment_4 )? )
            {
            // InternalJoveNotes.g:2600:1: ( ( rule__TeacherNote__CmapAssignment_4 )? )
            // InternalJoveNotes.g:2601:1: ( rule__TeacherNote__CmapAssignment_4 )?
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapAssignment_4()); 
            // InternalJoveNotes.g:2602:1: ( rule__TeacherNote__CmapAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJoveNotes.g:2602:2: rule__TeacherNote__CmapAssignment_4
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2622:1: rule__Matching__Group__0 : rule__Matching__Group__0__Impl rule__Matching__Group__1 ;
    public final void rule__Matching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2626:1: ( rule__Matching__Group__0__Impl rule__Matching__Group__1 )
            // InternalJoveNotes.g:2627:2: rule__Matching__Group__0__Impl rule__Matching__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Matching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2634:1: rule__Matching__Group__0__Impl : ( '@match' ) ;
    public final void rule__Matching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2638:1: ( ( '@match' ) )
            // InternalJoveNotes.g:2639:1: ( '@match' )
            {
            // InternalJoveNotes.g:2639:1: ( '@match' )
            // InternalJoveNotes.g:2640:1: '@match'
            {
             before(grammarAccess.getMatchingAccess().getMatchKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalJoveNotes.g:2653:1: rule__Matching__Group__1 : rule__Matching__Group__1__Impl rule__Matching__Group__2 ;
    public final void rule__Matching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2657:1: ( rule__Matching__Group__1__Impl rule__Matching__Group__2 )
            // InternalJoveNotes.g:2658:2: rule__Matching__Group__1__Impl rule__Matching__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Matching__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2665:1: rule__Matching__Group__1__Impl : ( ( rule__Matching__HideFromViewAssignment_1 )? ) ;
    public final void rule__Matching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2669:1: ( ( ( rule__Matching__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:2670:1: ( ( rule__Matching__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:2670:1: ( ( rule__Matching__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:2671:1: ( rule__Matching__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:2672:1: ( rule__Matching__HideFromViewAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJoveNotes.g:2672:2: rule__Matching__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2682:1: rule__Matching__Group__2 : rule__Matching__Group__2__Impl rule__Matching__Group__3 ;
    public final void rule__Matching__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2686:1: ( rule__Matching__Group__2__Impl rule__Matching__Group__3 )
            // InternalJoveNotes.g:2687:2: rule__Matching__Group__2__Impl rule__Matching__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Matching__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2694:1: rule__Matching__Group__2__Impl : ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? ) ;
    public final void rule__Matching__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2698:1: ( ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? ) )
            // InternalJoveNotes.g:2699:1: ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? )
            {
            // InternalJoveNotes.g:2699:1: ( ( rule__Matching__SkipReverseQuestionAssignment_2 )? )
            // InternalJoveNotes.g:2700:1: ( rule__Matching__SkipReverseQuestionAssignment_2 )?
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionAssignment_2()); 
            // InternalJoveNotes.g:2701:1: ( rule__Matching__SkipReverseQuestionAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==59) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJoveNotes.g:2701:2: rule__Matching__SkipReverseQuestionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2711:1: rule__Matching__Group__3 : rule__Matching__Group__3__Impl rule__Matching__Group__4 ;
    public final void rule__Matching__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2715:1: ( rule__Matching__Group__3__Impl rule__Matching__Group__4 )
            // InternalJoveNotes.g:2716:2: rule__Matching__Group__3__Impl rule__Matching__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Matching__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2723:1: rule__Matching__Group__3__Impl : ( ( rule__Matching__QuestionAssignment_3 )? ) ;
    public final void rule__Matching__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2727:1: ( ( ( rule__Matching__QuestionAssignment_3 )? ) )
            // InternalJoveNotes.g:2728:1: ( ( rule__Matching__QuestionAssignment_3 )? )
            {
            // InternalJoveNotes.g:2728:1: ( ( rule__Matching__QuestionAssignment_3 )? )
            // InternalJoveNotes.g:2729:1: ( rule__Matching__QuestionAssignment_3 )?
            {
             before(grammarAccess.getMatchingAccess().getQuestionAssignment_3()); 
            // InternalJoveNotes.g:2730:1: ( rule__Matching__QuestionAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJoveNotes.g:2730:2: rule__Matching__QuestionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2740:1: rule__Matching__Group__4 : rule__Matching__Group__4__Impl rule__Matching__Group__5 ;
    public final void rule__Matching__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2744:1: ( rule__Matching__Group__4__Impl rule__Matching__Group__5 )
            // InternalJoveNotes.g:2745:2: rule__Matching__Group__4__Impl rule__Matching__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Matching__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2752:1: rule__Matching__Group__4__Impl : ( '{' ) ;
    public final void rule__Matching__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2756:1: ( ( '{' ) )
            // InternalJoveNotes.g:2757:1: ( '{' )
            {
            // InternalJoveNotes.g:2757:1: ( '{' )
            // InternalJoveNotes.g:2758:1: '{'
            {
             before(grammarAccess.getMatchingAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:2771:1: rule__Matching__Group__5 : rule__Matching__Group__5__Impl rule__Matching__Group__6 ;
    public final void rule__Matching__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2775:1: ( rule__Matching__Group__5__Impl rule__Matching__Group__6 )
            // InternalJoveNotes.g:2776:2: rule__Matching__Group__5__Impl rule__Matching__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Matching__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2783:1: rule__Matching__Group__5__Impl : ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) ) ;
    public final void rule__Matching__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2787:1: ( ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) ) )
            // InternalJoveNotes.g:2788:1: ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) )
            {
            // InternalJoveNotes.g:2788:1: ( ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* ) )
            // InternalJoveNotes.g:2789:1: ( ( rule__Matching__PairsAssignment_5 ) ) ( ( rule__Matching__PairsAssignment_5 )* )
            {
            // InternalJoveNotes.g:2789:1: ( ( rule__Matching__PairsAssignment_5 ) )
            // InternalJoveNotes.g:2790:1: ( rule__Matching__PairsAssignment_5 )
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 
            // InternalJoveNotes.g:2791:1: ( rule__Matching__PairsAssignment_5 )
            // InternalJoveNotes.g:2791:2: rule__Matching__PairsAssignment_5
            {
            pushFollow(FOLLOW_16);
            rule__Matching__PairsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 

            }

            // InternalJoveNotes.g:2794:1: ( ( rule__Matching__PairsAssignment_5 )* )
            // InternalJoveNotes.g:2795:1: ( rule__Matching__PairsAssignment_5 )*
            {
             before(grammarAccess.getMatchingAccess().getPairsAssignment_5()); 
            // InternalJoveNotes.g:2796:1: ( rule__Matching__PairsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalJoveNotes.g:2796:2: rule__Matching__PairsAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Matching__PairsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalJoveNotes.g:2807:1: rule__Matching__Group__6 : rule__Matching__Group__6__Impl rule__Matching__Group__7 ;
    public final void rule__Matching__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2811:1: ( rule__Matching__Group__6__Impl rule__Matching__Group__7 )
            // InternalJoveNotes.g:2812:2: rule__Matching__Group__6__Impl rule__Matching__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Matching__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2819:1: rule__Matching__Group__6__Impl : ( ( rule__Matching__McqConfigAssignment_6 )? ) ;
    public final void rule__Matching__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2823:1: ( ( ( rule__Matching__McqConfigAssignment_6 )? ) )
            // InternalJoveNotes.g:2824:1: ( ( rule__Matching__McqConfigAssignment_6 )? )
            {
            // InternalJoveNotes.g:2824:1: ( ( rule__Matching__McqConfigAssignment_6 )? )
            // InternalJoveNotes.g:2825:1: ( rule__Matching__McqConfigAssignment_6 )?
            {
             before(grammarAccess.getMatchingAccess().getMcqConfigAssignment_6()); 
            // InternalJoveNotes.g:2826:1: ( rule__Matching__McqConfigAssignment_6 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJoveNotes.g:2826:2: rule__Matching__McqConfigAssignment_6
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2836:1: rule__Matching__Group__7 : rule__Matching__Group__7__Impl ;
    public final void rule__Matching__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2840:1: ( rule__Matching__Group__7__Impl )
            // InternalJoveNotes.g:2841:2: rule__Matching__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2847:1: rule__Matching__Group__7__Impl : ( '}' ) ;
    public final void rule__Matching__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2851:1: ( ( '}' ) )
            // InternalJoveNotes.g:2852:1: ( '}' )
            {
            // InternalJoveNotes.g:2852:1: ( '}' )
            // InternalJoveNotes.g:2853:1: '}'
            {
             before(grammarAccess.getMatchingAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJoveNotes.g:2882:1: rule__MatchPair__Group__0 : rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 ;
    public final void rule__MatchPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2886:1: ( rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1 )
            // InternalJoveNotes.g:2887:2: rule__MatchPair__Group__0__Impl rule__MatchPair__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MatchPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2894:1: rule__MatchPair__Group__0__Impl : ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) ;
    public final void rule__MatchPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2898:1: ( ( ( rule__MatchPair__MatchQuestionAssignment_0 ) ) )
            // InternalJoveNotes.g:2899:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            {
            // InternalJoveNotes.g:2899:1: ( ( rule__MatchPair__MatchQuestionAssignment_0 ) )
            // InternalJoveNotes.g:2900:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionAssignment_0()); 
            // InternalJoveNotes.g:2901:1: ( rule__MatchPair__MatchQuestionAssignment_0 )
            // InternalJoveNotes.g:2901:2: rule__MatchPair__MatchQuestionAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2911:1: rule__MatchPair__Group__1 : rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 ;
    public final void rule__MatchPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2915:1: ( rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2 )
            // InternalJoveNotes.g:2916:2: rule__MatchPair__Group__1__Impl rule__MatchPair__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MatchPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2923:1: rule__MatchPair__Group__1__Impl : ( '=' ) ;
    public final void rule__MatchPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2927:1: ( ( '=' ) )
            // InternalJoveNotes.g:2928:1: ( '=' )
            {
            // InternalJoveNotes.g:2928:1: ( '=' )
            // InternalJoveNotes.g:2929:1: '='
            {
             before(grammarAccess.getMatchPairAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalJoveNotes.g:2942:1: rule__MatchPair__Group__2 : rule__MatchPair__Group__2__Impl ;
    public final void rule__MatchPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2946:1: ( rule__MatchPair__Group__2__Impl )
            // InternalJoveNotes.g:2947:2: rule__MatchPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2953:1: rule__MatchPair__Group__2__Impl : ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) ;
    public final void rule__MatchPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2957:1: ( ( ( rule__MatchPair__MatchAnswerAssignment_2 ) ) )
            // InternalJoveNotes.g:2958:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            {
            // InternalJoveNotes.g:2958:1: ( ( rule__MatchPair__MatchAnswerAssignment_2 ) )
            // InternalJoveNotes.g:2959:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerAssignment_2()); 
            // InternalJoveNotes.g:2960:1: ( rule__MatchPair__MatchAnswerAssignment_2 )
            // InternalJoveNotes.g:2960:2: rule__MatchPair__MatchAnswerAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2976:1: rule__MatchMCQConfig__Group__0 : rule__MatchMCQConfig__Group__0__Impl rule__MatchMCQConfig__Group__1 ;
    public final void rule__MatchMCQConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2980:1: ( rule__MatchMCQConfig__Group__0__Impl rule__MatchMCQConfig__Group__1 )
            // InternalJoveNotes.g:2981:2: rule__MatchMCQConfig__Group__0__Impl rule__MatchMCQConfig__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MatchMCQConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:2988:1: rule__MatchMCQConfig__Group__0__Impl : ( '@mcq_config' ) ;
    public final void rule__MatchMCQConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:2992:1: ( ( '@mcq_config' ) )
            // InternalJoveNotes.g:2993:1: ( '@mcq_config' )
            {
            // InternalJoveNotes.g:2993:1: ( '@mcq_config' )
            // InternalJoveNotes.g:2994:1: '@mcq_config'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getMcq_configKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalJoveNotes.g:3007:1: rule__MatchMCQConfig__Group__1 : rule__MatchMCQConfig__Group__1__Impl rule__MatchMCQConfig__Group__2 ;
    public final void rule__MatchMCQConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3011:1: ( rule__MatchMCQConfig__Group__1__Impl rule__MatchMCQConfig__Group__2 )
            // InternalJoveNotes.g:3012:2: rule__MatchMCQConfig__Group__1__Impl rule__MatchMCQConfig__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MatchMCQConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3019:1: rule__MatchMCQConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__MatchMCQConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3023:1: ( ( '{' ) )
            // InternalJoveNotes.g:3024:1: ( '{' )
            {
            // InternalJoveNotes.g:3024:1: ( '{' )
            // InternalJoveNotes.g:3025:1: '{'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:3038:1: rule__MatchMCQConfig__Group__2 : rule__MatchMCQConfig__Group__2__Impl rule__MatchMCQConfig__Group__3 ;
    public final void rule__MatchMCQConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3042:1: ( rule__MatchMCQConfig__Group__2__Impl rule__MatchMCQConfig__Group__3 )
            // InternalJoveNotes.g:3043:2: rule__MatchMCQConfig__Group__2__Impl rule__MatchMCQConfig__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MatchMCQConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3050:1: rule__MatchMCQConfig__Group__2__Impl : ( '@forwardCaption' ) ;
    public final void rule__MatchMCQConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3054:1: ( ( '@forwardCaption' ) )
            // InternalJoveNotes.g:3055:1: ( '@forwardCaption' )
            {
            // InternalJoveNotes.g:3055:1: ( '@forwardCaption' )
            // InternalJoveNotes.g:3056:1: '@forwardCaption'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJoveNotes.g:3069:1: rule__MatchMCQConfig__Group__3 : rule__MatchMCQConfig__Group__3__Impl rule__MatchMCQConfig__Group__4 ;
    public final void rule__MatchMCQConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3073:1: ( rule__MatchMCQConfig__Group__3__Impl rule__MatchMCQConfig__Group__4 )
            // InternalJoveNotes.g:3074:2: rule__MatchMCQConfig__Group__3__Impl rule__MatchMCQConfig__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__MatchMCQConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3081:1: rule__MatchMCQConfig__Group__3__Impl : ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) ) ;
    public final void rule__MatchMCQConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3085:1: ( ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) ) )
            // InternalJoveNotes.g:3086:1: ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) )
            {
            // InternalJoveNotes.g:3086:1: ( ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 ) )
            // InternalJoveNotes.g:3087:1: ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionAssignment_3()); 
            // InternalJoveNotes.g:3088:1: ( rule__MatchMCQConfig__ForwardCaptionAssignment_3 )
            // InternalJoveNotes.g:3088:2: rule__MatchMCQConfig__ForwardCaptionAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3098:1: rule__MatchMCQConfig__Group__4 : rule__MatchMCQConfig__Group__4__Impl rule__MatchMCQConfig__Group__5 ;
    public final void rule__MatchMCQConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3102:1: ( rule__MatchMCQConfig__Group__4__Impl rule__MatchMCQConfig__Group__5 )
            // InternalJoveNotes.g:3103:2: rule__MatchMCQConfig__Group__4__Impl rule__MatchMCQConfig__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__MatchMCQConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3110:1: rule__MatchMCQConfig__Group__4__Impl : ( ( rule__MatchMCQConfig__Group_4__0 )? ) ;
    public final void rule__MatchMCQConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3114:1: ( ( ( rule__MatchMCQConfig__Group_4__0 )? ) )
            // InternalJoveNotes.g:3115:1: ( ( rule__MatchMCQConfig__Group_4__0 )? )
            {
            // InternalJoveNotes.g:3115:1: ( ( rule__MatchMCQConfig__Group_4__0 )? )
            // InternalJoveNotes.g:3116:1: ( rule__MatchMCQConfig__Group_4__0 )?
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup_4()); 
            // InternalJoveNotes.g:3117:1: ( rule__MatchMCQConfig__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJoveNotes.g:3117:2: rule__MatchMCQConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3127:1: rule__MatchMCQConfig__Group__5 : rule__MatchMCQConfig__Group__5__Impl rule__MatchMCQConfig__Group__6 ;
    public final void rule__MatchMCQConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3131:1: ( rule__MatchMCQConfig__Group__5__Impl rule__MatchMCQConfig__Group__6 )
            // InternalJoveNotes.g:3132:2: rule__MatchMCQConfig__Group__5__Impl rule__MatchMCQConfig__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__MatchMCQConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3139:1: rule__MatchMCQConfig__Group__5__Impl : ( ( rule__MatchMCQConfig__Group_5__0 )? ) ;
    public final void rule__MatchMCQConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3143:1: ( ( ( rule__MatchMCQConfig__Group_5__0 )? ) )
            // InternalJoveNotes.g:3144:1: ( ( rule__MatchMCQConfig__Group_5__0 )? )
            {
            // InternalJoveNotes.g:3144:1: ( ( rule__MatchMCQConfig__Group_5__0 )? )
            // InternalJoveNotes.g:3145:1: ( rule__MatchMCQConfig__Group_5__0 )?
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup_5()); 
            // InternalJoveNotes.g:3146:1: ( rule__MatchMCQConfig__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJoveNotes.g:3146:2: rule__MatchMCQConfig__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3156:1: rule__MatchMCQConfig__Group__6 : rule__MatchMCQConfig__Group__6__Impl rule__MatchMCQConfig__Group__7 ;
    public final void rule__MatchMCQConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3160:1: ( rule__MatchMCQConfig__Group__6__Impl rule__MatchMCQConfig__Group__7 )
            // InternalJoveNotes.g:3161:2: rule__MatchMCQConfig__Group__6__Impl rule__MatchMCQConfig__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__MatchMCQConfig__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3168:1: rule__MatchMCQConfig__Group__6__Impl : ( ( rule__MatchMCQConfig__Group_6__0 )? ) ;
    public final void rule__MatchMCQConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3172:1: ( ( ( rule__MatchMCQConfig__Group_6__0 )? ) )
            // InternalJoveNotes.g:3173:1: ( ( rule__MatchMCQConfig__Group_6__0 )? )
            {
            // InternalJoveNotes.g:3173:1: ( ( rule__MatchMCQConfig__Group_6__0 )? )
            // InternalJoveNotes.g:3174:1: ( rule__MatchMCQConfig__Group_6__0 )?
            {
             before(grammarAccess.getMatchMCQConfigAccess().getGroup_6()); 
            // InternalJoveNotes.g:3175:1: ( rule__MatchMCQConfig__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJoveNotes.g:3175:2: rule__MatchMCQConfig__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3185:1: rule__MatchMCQConfig__Group__7 : rule__MatchMCQConfig__Group__7__Impl ;
    public final void rule__MatchMCQConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3189:1: ( rule__MatchMCQConfig__Group__7__Impl )
            // InternalJoveNotes.g:3190:2: rule__MatchMCQConfig__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3196:1: rule__MatchMCQConfig__Group__7__Impl : ( '}' ) ;
    public final void rule__MatchMCQConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3200:1: ( ( '}' ) )
            // InternalJoveNotes.g:3201:1: ( '}' )
            {
            // InternalJoveNotes.g:3201:1: ( '}' )
            // InternalJoveNotes.g:3202:1: '}'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJoveNotes.g:3231:1: rule__MatchMCQConfig__Group_4__0 : rule__MatchMCQConfig__Group_4__0__Impl rule__MatchMCQConfig__Group_4__1 ;
    public final void rule__MatchMCQConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3235:1: ( rule__MatchMCQConfig__Group_4__0__Impl rule__MatchMCQConfig__Group_4__1 )
            // InternalJoveNotes.g:3236:2: rule__MatchMCQConfig__Group_4__0__Impl rule__MatchMCQConfig__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__MatchMCQConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3243:1: rule__MatchMCQConfig__Group_4__0__Impl : ( '@reverseCaption' ) ;
    public final void rule__MatchMCQConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3247:1: ( ( '@reverseCaption' ) )
            // InternalJoveNotes.g:3248:1: ( '@reverseCaption' )
            {
            // InternalJoveNotes.g:3248:1: ( '@reverseCaption' )
            // InternalJoveNotes.g:3249:1: '@reverseCaption'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJoveNotes.g:3262:1: rule__MatchMCQConfig__Group_4__1 : rule__MatchMCQConfig__Group_4__1__Impl ;
    public final void rule__MatchMCQConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3266:1: ( rule__MatchMCQConfig__Group_4__1__Impl )
            // InternalJoveNotes.g:3267:2: rule__MatchMCQConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3273:1: rule__MatchMCQConfig__Group_4__1__Impl : ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) ) ;
    public final void rule__MatchMCQConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3277:1: ( ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) ) )
            // InternalJoveNotes.g:3278:1: ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) )
            {
            // InternalJoveNotes.g:3278:1: ( ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 ) )
            // InternalJoveNotes.g:3279:1: ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionAssignment_4_1()); 
            // InternalJoveNotes.g:3280:1: ( rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 )
            // InternalJoveNotes.g:3280:2: rule__MatchMCQConfig__ReverseCaptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3294:1: rule__MatchMCQConfig__Group_5__0 : rule__MatchMCQConfig__Group_5__0__Impl rule__MatchMCQConfig__Group_5__1 ;
    public final void rule__MatchMCQConfig__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3298:1: ( rule__MatchMCQConfig__Group_5__0__Impl rule__MatchMCQConfig__Group_5__1 )
            // InternalJoveNotes.g:3299:2: rule__MatchMCQConfig__Group_5__0__Impl rule__MatchMCQConfig__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__MatchMCQConfig__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3306:1: rule__MatchMCQConfig__Group_5__0__Impl : ( '@numOptionsToShow' ) ;
    public final void rule__MatchMCQConfig__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3310:1: ( ( '@numOptionsToShow' ) )
            // InternalJoveNotes.g:3311:1: ( '@numOptionsToShow' )
            {
            // InternalJoveNotes.g:3311:1: ( '@numOptionsToShow' )
            // InternalJoveNotes.g:3312:1: '@numOptionsToShow'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalJoveNotes.g:3325:1: rule__MatchMCQConfig__Group_5__1 : rule__MatchMCQConfig__Group_5__1__Impl ;
    public final void rule__MatchMCQConfig__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3329:1: ( rule__MatchMCQConfig__Group_5__1__Impl )
            // InternalJoveNotes.g:3330:2: rule__MatchMCQConfig__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3336:1: rule__MatchMCQConfig__Group_5__1__Impl : ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) ) ;
    public final void rule__MatchMCQConfig__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3340:1: ( ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) ) )
            // InternalJoveNotes.g:3341:1: ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) )
            {
            // InternalJoveNotes.g:3341:1: ( ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 ) )
            // InternalJoveNotes.g:3342:1: ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowAssignment_5_1()); 
            // InternalJoveNotes.g:3343:1: ( rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 )
            // InternalJoveNotes.g:3343:2: rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3357:1: rule__MatchMCQConfig__Group_6__0 : rule__MatchMCQConfig__Group_6__0__Impl rule__MatchMCQConfig__Group_6__1 ;
    public final void rule__MatchMCQConfig__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3361:1: ( rule__MatchMCQConfig__Group_6__0__Impl rule__MatchMCQConfig__Group_6__1 )
            // InternalJoveNotes.g:3362:2: rule__MatchMCQConfig__Group_6__0__Impl rule__MatchMCQConfig__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__MatchMCQConfig__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3369:1: rule__MatchMCQConfig__Group_6__0__Impl : ( '@numOptionsPerRow' ) ;
    public final void rule__MatchMCQConfig__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3373:1: ( ( '@numOptionsPerRow' ) )
            // InternalJoveNotes.g:3374:1: ( '@numOptionsPerRow' )
            {
            // InternalJoveNotes.g:3374:1: ( '@numOptionsPerRow' )
            // InternalJoveNotes.g:3375:1: '@numOptionsPerRow'
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalJoveNotes.g:3388:1: rule__MatchMCQConfig__Group_6__1 : rule__MatchMCQConfig__Group_6__1__Impl ;
    public final void rule__MatchMCQConfig__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3392:1: ( rule__MatchMCQConfig__Group_6__1__Impl )
            // InternalJoveNotes.g:3393:2: rule__MatchMCQConfig__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3399:1: rule__MatchMCQConfig__Group_6__1__Impl : ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) ) ;
    public final void rule__MatchMCQConfig__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3403:1: ( ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) ) )
            // InternalJoveNotes.g:3404:1: ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) )
            {
            // InternalJoveNotes.g:3404:1: ( ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 ) )
            // InternalJoveNotes.g:3405:1: ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 )
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowAssignment_6_1()); 
            // InternalJoveNotes.g:3406:1: ( rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 )
            // InternalJoveNotes.g:3406:2: rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3420:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3424:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalJoveNotes.g:3425:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3432:1: rule__Event__Group__0__Impl : ( '@event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3436:1: ( ( '@event' ) )
            // InternalJoveNotes.g:3437:1: ( '@event' )
            {
            // InternalJoveNotes.g:3437:1: ( '@event' )
            // InternalJoveNotes.g:3438:1: '@event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalJoveNotes.g:3451:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3455:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalJoveNotes.g:3456:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3463:1: rule__Event__Group__1__Impl : ( ( rule__Event__HideFromViewAssignment_1 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3467:1: ( ( ( rule__Event__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:3468:1: ( ( rule__Event__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:3468:1: ( ( rule__Event__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:3469:1: ( rule__Event__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getEventAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:3470:1: ( rule__Event__HideFromViewAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==58) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJoveNotes.g:3470:2: rule__Event__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3480:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3484:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalJoveNotes.g:3485:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3492:1: rule__Event__Group__2__Impl : ( ( rule__Event__EventAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3496:1: ( ( ( rule__Event__EventAssignment_2 ) ) )
            // InternalJoveNotes.g:3497:1: ( ( rule__Event__EventAssignment_2 ) )
            {
            // InternalJoveNotes.g:3497:1: ( ( rule__Event__EventAssignment_2 ) )
            // InternalJoveNotes.g:3498:1: ( rule__Event__EventAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getEventAssignment_2()); 
            // InternalJoveNotes.g:3499:1: ( rule__Event__EventAssignment_2 )
            // InternalJoveNotes.g:3499:2: rule__Event__EventAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3509:1: rule__Event__Group__3 : rule__Event__Group__3__Impl ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3513:1: ( rule__Event__Group__3__Impl )
            // InternalJoveNotes.g:3514:2: rule__Event__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3520:1: rule__Event__Group__3__Impl : ( ( rule__Event__TimeAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3524:1: ( ( ( rule__Event__TimeAssignment_3 ) ) )
            // InternalJoveNotes.g:3525:1: ( ( rule__Event__TimeAssignment_3 ) )
            {
            // InternalJoveNotes.g:3525:1: ( ( rule__Event__TimeAssignment_3 ) )
            // InternalJoveNotes.g:3526:1: ( rule__Event__TimeAssignment_3 )
            {
             before(grammarAccess.getEventAccess().getTimeAssignment_3()); 
            // InternalJoveNotes.g:3527:1: ( rule__Event__TimeAssignment_3 )
            // InternalJoveNotes.g:3527:2: rule__Event__TimeAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3545:1: rule__TrueFalse__Group__0 : rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 ;
    public final void rule__TrueFalse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3549:1: ( rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1 )
            // InternalJoveNotes.g:3550:2: rule__TrueFalse__Group__0__Impl rule__TrueFalse__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TrueFalse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3557:1: rule__TrueFalse__Group__0__Impl : ( '@true_false' ) ;
    public final void rule__TrueFalse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3561:1: ( ( '@true_false' ) )
            // InternalJoveNotes.g:3562:1: ( '@true_false' )
            {
            // InternalJoveNotes.g:3562:1: ( '@true_false' )
            // InternalJoveNotes.g:3563:1: '@true_false'
            {
             before(grammarAccess.getTrueFalseAccess().getTrue_falseKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalJoveNotes.g:3576:1: rule__TrueFalse__Group__1 : rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 ;
    public final void rule__TrueFalse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3580:1: ( rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2 )
            // InternalJoveNotes.g:3581:2: rule__TrueFalse__Group__1__Impl rule__TrueFalse__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TrueFalse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3588:1: rule__TrueFalse__Group__1__Impl : ( ( rule__TrueFalse__HideFromViewAssignment_1 )? ) ;
    public final void rule__TrueFalse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3592:1: ( ( ( rule__TrueFalse__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:3593:1: ( ( rule__TrueFalse__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:3593:1: ( ( rule__TrueFalse__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:3594:1: ( rule__TrueFalse__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:3595:1: ( rule__TrueFalse__HideFromViewAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJoveNotes.g:3595:2: rule__TrueFalse__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3605:1: rule__TrueFalse__Group__2 : rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 ;
    public final void rule__TrueFalse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3609:1: ( rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3 )
            // InternalJoveNotes.g:3610:2: rule__TrueFalse__Group__2__Impl rule__TrueFalse__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__TrueFalse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3617:1: rule__TrueFalse__Group__2__Impl : ( ( rule__TrueFalse__StatementAssignment_2 ) ) ;
    public final void rule__TrueFalse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3621:1: ( ( ( rule__TrueFalse__StatementAssignment_2 ) ) )
            // InternalJoveNotes.g:3622:1: ( ( rule__TrueFalse__StatementAssignment_2 ) )
            {
            // InternalJoveNotes.g:3622:1: ( ( rule__TrueFalse__StatementAssignment_2 ) )
            // InternalJoveNotes.g:3623:1: ( rule__TrueFalse__StatementAssignment_2 )
            {
             before(grammarAccess.getTrueFalseAccess().getStatementAssignment_2()); 
            // InternalJoveNotes.g:3624:1: ( rule__TrueFalse__StatementAssignment_2 )
            // InternalJoveNotes.g:3624:2: rule__TrueFalse__StatementAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3634:1: rule__TrueFalse__Group__3 : rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4 ;
    public final void rule__TrueFalse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3638:1: ( rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4 )
            // InternalJoveNotes.g:3639:2: rule__TrueFalse__Group__3__Impl rule__TrueFalse__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__TrueFalse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3646:1: rule__TrueFalse__Group__3__Impl : ( ( rule__TrueFalse__TruthValueAssignment_3 ) ) ;
    public final void rule__TrueFalse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3650:1: ( ( ( rule__TrueFalse__TruthValueAssignment_3 ) ) )
            // InternalJoveNotes.g:3651:1: ( ( rule__TrueFalse__TruthValueAssignment_3 ) )
            {
            // InternalJoveNotes.g:3651:1: ( ( rule__TrueFalse__TruthValueAssignment_3 ) )
            // InternalJoveNotes.g:3652:1: ( rule__TrueFalse__TruthValueAssignment_3 )
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueAssignment_3()); 
            // InternalJoveNotes.g:3653:1: ( rule__TrueFalse__TruthValueAssignment_3 )
            // InternalJoveNotes.g:3653:2: rule__TrueFalse__TruthValueAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3663:1: rule__TrueFalse__Group__4 : rule__TrueFalse__Group__4__Impl ;
    public final void rule__TrueFalse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3667:1: ( rule__TrueFalse__Group__4__Impl )
            // InternalJoveNotes.g:3668:2: rule__TrueFalse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3674:1: rule__TrueFalse__Group__4__Impl : ( ( rule__TrueFalse__JustificationAssignment_4 )? ) ;
    public final void rule__TrueFalse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3678:1: ( ( ( rule__TrueFalse__JustificationAssignment_4 )? ) )
            // InternalJoveNotes.g:3679:1: ( ( rule__TrueFalse__JustificationAssignment_4 )? )
            {
            // InternalJoveNotes.g:3679:1: ( ( rule__TrueFalse__JustificationAssignment_4 )? )
            // InternalJoveNotes.g:3680:1: ( rule__TrueFalse__JustificationAssignment_4 )?
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationAssignment_4()); 
            // InternalJoveNotes.g:3681:1: ( rule__TrueFalse__JustificationAssignment_4 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJoveNotes.g:3681:2: rule__TrueFalse__JustificationAssignment_4
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3701:1: rule__ChemEquation__Group__0 : rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 ;
    public final void rule__ChemEquation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3705:1: ( rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1 )
            // InternalJoveNotes.g:3706:2: rule__ChemEquation__Group__0__Impl rule__ChemEquation__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ChemEquation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3713:1: rule__ChemEquation__Group__0__Impl : ( '@chem_equation' ) ;
    public final void rule__ChemEquation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3717:1: ( ( '@chem_equation' ) )
            // InternalJoveNotes.g:3718:1: ( '@chem_equation' )
            {
            // InternalJoveNotes.g:3718:1: ( '@chem_equation' )
            // InternalJoveNotes.g:3719:1: '@chem_equation'
            {
             before(grammarAccess.getChemEquationAccess().getChem_equationKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalJoveNotes.g:3732:1: rule__ChemEquation__Group__1 : rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 ;
    public final void rule__ChemEquation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3736:1: ( rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2 )
            // InternalJoveNotes.g:3737:2: rule__ChemEquation__Group__1__Impl rule__ChemEquation__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ChemEquation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3744:1: rule__ChemEquation__Group__1__Impl : ( ( rule__ChemEquation__HideFromViewAssignment_1 )? ) ;
    public final void rule__ChemEquation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3748:1: ( ( ( rule__ChemEquation__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:3749:1: ( ( rule__ChemEquation__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:3749:1: ( ( rule__ChemEquation__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:3750:1: ( rule__ChemEquation__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:3751:1: ( rule__ChemEquation__HideFromViewAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==58) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJoveNotes.g:3751:2: rule__ChemEquation__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3761:1: rule__ChemEquation__Group__2 : rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 ;
    public final void rule__ChemEquation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3765:1: ( rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3 )
            // InternalJoveNotes.g:3766:2: rule__ChemEquation__Group__2__Impl rule__ChemEquation__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ChemEquation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3773:1: rule__ChemEquation__Group__2__Impl : ( ( rule__ChemEquation__DescriptionAssignment_2 )? ) ;
    public final void rule__ChemEquation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3777:1: ( ( ( rule__ChemEquation__DescriptionAssignment_2 )? ) )
            // InternalJoveNotes.g:3778:1: ( ( rule__ChemEquation__DescriptionAssignment_2 )? )
            {
            // InternalJoveNotes.g:3778:1: ( ( rule__ChemEquation__DescriptionAssignment_2 )? )
            // InternalJoveNotes.g:3779:1: ( rule__ChemEquation__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionAssignment_2()); 
            // InternalJoveNotes.g:3780:1: ( rule__ChemEquation__DescriptionAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalJoveNotes.g:3780:2: rule__ChemEquation__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3790:1: rule__ChemEquation__Group__3 : rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 ;
    public final void rule__ChemEquation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3794:1: ( rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4 )
            // InternalJoveNotes.g:3795:2: rule__ChemEquation__Group__3__Impl rule__ChemEquation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ChemEquation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3802:1: rule__ChemEquation__Group__3__Impl : ( '{' ) ;
    public final void rule__ChemEquation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3806:1: ( ( '{' ) )
            // InternalJoveNotes.g:3807:1: ( '{' )
            {
            // InternalJoveNotes.g:3807:1: ( '{' )
            // InternalJoveNotes.g:3808:1: '{'
            {
             before(grammarAccess.getChemEquationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:3821:1: rule__ChemEquation__Group__4 : rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 ;
    public final void rule__ChemEquation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3825:1: ( rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5 )
            // InternalJoveNotes.g:3826:2: rule__ChemEquation__Group__4__Impl rule__ChemEquation__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ChemEquation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3833:1: rule__ChemEquation__Group__4__Impl : ( ( rule__ChemEquation__ReactantsAssignment_4 ) ) ;
    public final void rule__ChemEquation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3837:1: ( ( ( rule__ChemEquation__ReactantsAssignment_4 ) ) )
            // InternalJoveNotes.g:3838:1: ( ( rule__ChemEquation__ReactantsAssignment_4 ) )
            {
            // InternalJoveNotes.g:3838:1: ( ( rule__ChemEquation__ReactantsAssignment_4 ) )
            // InternalJoveNotes.g:3839:1: ( rule__ChemEquation__ReactantsAssignment_4 )
            {
             before(grammarAccess.getChemEquationAccess().getReactantsAssignment_4()); 
            // InternalJoveNotes.g:3840:1: ( rule__ChemEquation__ReactantsAssignment_4 )
            // InternalJoveNotes.g:3840:2: rule__ChemEquation__ReactantsAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3850:1: rule__ChemEquation__Group__5 : rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 ;
    public final void rule__ChemEquation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3854:1: ( rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6 )
            // InternalJoveNotes.g:3855:2: rule__ChemEquation__Group__5__Impl rule__ChemEquation__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__ChemEquation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3862:1: rule__ChemEquation__Group__5__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3866:1: ( ( '>' ) )
            // InternalJoveNotes.g:3867:1: ( '>' )
            {
            // InternalJoveNotes.g:3867:1: ( '>' )
            // InternalJoveNotes.g:3868:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalJoveNotes.g:3881:1: rule__ChemEquation__Group__6 : rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 ;
    public final void rule__ChemEquation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3885:1: ( rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7 )
            // InternalJoveNotes.g:3886:2: rule__ChemEquation__Group__6__Impl rule__ChemEquation__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__ChemEquation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3893:1: rule__ChemEquation__Group__6__Impl : ( ( rule__ChemEquation__ProducesAssignment_6 )? ) ;
    public final void rule__ChemEquation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3897:1: ( ( ( rule__ChemEquation__ProducesAssignment_6 )? ) )
            // InternalJoveNotes.g:3898:1: ( ( rule__ChemEquation__ProducesAssignment_6 )? )
            {
            // InternalJoveNotes.g:3898:1: ( ( rule__ChemEquation__ProducesAssignment_6 )? )
            // InternalJoveNotes.g:3899:1: ( rule__ChemEquation__ProducesAssignment_6 )?
            {
             before(grammarAccess.getChemEquationAccess().getProducesAssignment_6()); 
            // InternalJoveNotes.g:3900:1: ( rule__ChemEquation__ProducesAssignment_6 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJoveNotes.g:3900:2: rule__ChemEquation__ProducesAssignment_6
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3910:1: rule__ChemEquation__Group__7 : rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 ;
    public final void rule__ChemEquation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3914:1: ( rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8 )
            // InternalJoveNotes.g:3915:2: rule__ChemEquation__Group__7__Impl rule__ChemEquation__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__ChemEquation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3922:1: rule__ChemEquation__Group__7__Impl : ( '>' ) ;
    public final void rule__ChemEquation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3926:1: ( ( '>' ) )
            // InternalJoveNotes.g:3927:1: ( '>' )
            {
            // InternalJoveNotes.g:3927:1: ( '>' )
            // InternalJoveNotes.g:3928:1: '>'
            {
             before(grammarAccess.getChemEquationAccess().getGreaterThanSignKeyword_7()); 
            match(input,34,FOLLOW_2); 
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
    // InternalJoveNotes.g:3941:1: rule__ChemEquation__Group__8 : rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9 ;
    public final void rule__ChemEquation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3945:1: ( rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9 )
            // InternalJoveNotes.g:3946:2: rule__ChemEquation__Group__8__Impl rule__ChemEquation__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__ChemEquation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3953:1: rule__ChemEquation__Group__8__Impl : ( ( rule__ChemEquation__ProductsAssignment_8 ) ) ;
    public final void rule__ChemEquation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3957:1: ( ( ( rule__ChemEquation__ProductsAssignment_8 ) ) )
            // InternalJoveNotes.g:3958:1: ( ( rule__ChemEquation__ProductsAssignment_8 ) )
            {
            // InternalJoveNotes.g:3958:1: ( ( rule__ChemEquation__ProductsAssignment_8 ) )
            // InternalJoveNotes.g:3959:1: ( rule__ChemEquation__ProductsAssignment_8 )
            {
             before(grammarAccess.getChemEquationAccess().getProductsAssignment_8()); 
            // InternalJoveNotes.g:3960:1: ( rule__ChemEquation__ProductsAssignment_8 )
            // InternalJoveNotes.g:3960:2: rule__ChemEquation__ProductsAssignment_8
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3970:1: rule__ChemEquation__Group__9 : rule__ChemEquation__Group__9__Impl ;
    public final void rule__ChemEquation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3974:1: ( rule__ChemEquation__Group__9__Impl )
            // InternalJoveNotes.g:3975:2: rule__ChemEquation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:3981:1: rule__ChemEquation__Group__9__Impl : ( '}' ) ;
    public final void rule__ChemEquation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:3985:1: ( ( '}' ) )
            // InternalJoveNotes.g:3986:1: ( '}' )
            {
            // InternalJoveNotes.g:3986:1: ( '}' )
            // InternalJoveNotes.g:3987:1: '}'
            {
             before(grammarAccess.getChemEquationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJoveNotes.g:4020:1: rule__ChemCompound__Group__0 : rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 ;
    public final void rule__ChemCompound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4024:1: ( rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1 )
            // InternalJoveNotes.g:4025:2: rule__ChemCompound__Group__0__Impl rule__ChemCompound__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ChemCompound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4032:1: rule__ChemCompound__Group__0__Impl : ( '@chem_compound' ) ;
    public final void rule__ChemCompound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4036:1: ( ( '@chem_compound' ) )
            // InternalJoveNotes.g:4037:1: ( '@chem_compound' )
            {
            // InternalJoveNotes.g:4037:1: ( '@chem_compound' )
            // InternalJoveNotes.g:4038:1: '@chem_compound'
            {
             before(grammarAccess.getChemCompoundAccess().getChem_compoundKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJoveNotes.g:4051:1: rule__ChemCompound__Group__1 : rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 ;
    public final void rule__ChemCompound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4055:1: ( rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2 )
            // InternalJoveNotes.g:4056:2: rule__ChemCompound__Group__1__Impl rule__ChemCompound__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ChemCompound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4063:1: rule__ChemCompound__Group__1__Impl : ( ( rule__ChemCompound__HideFromViewAssignment_1 )? ) ;
    public final void rule__ChemCompound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4067:1: ( ( ( rule__ChemCompound__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:4068:1: ( ( rule__ChemCompound__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:4068:1: ( ( rule__ChemCompound__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:4069:1: ( rule__ChemCompound__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:4070:1: ( rule__ChemCompound__HideFromViewAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalJoveNotes.g:4070:2: rule__ChemCompound__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4080:1: rule__ChemCompound__Group__2 : rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 ;
    public final void rule__ChemCompound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4084:1: ( rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3 )
            // InternalJoveNotes.g:4085:2: rule__ChemCompound__Group__2__Impl rule__ChemCompound__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ChemCompound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4092:1: rule__ChemCompound__Group__2__Impl : ( ( rule__ChemCompound__SymbolAssignment_2 ) ) ;
    public final void rule__ChemCompound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4096:1: ( ( ( rule__ChemCompound__SymbolAssignment_2 ) ) )
            // InternalJoveNotes.g:4097:1: ( ( rule__ChemCompound__SymbolAssignment_2 ) )
            {
            // InternalJoveNotes.g:4097:1: ( ( rule__ChemCompound__SymbolAssignment_2 ) )
            // InternalJoveNotes.g:4098:1: ( rule__ChemCompound__SymbolAssignment_2 )
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolAssignment_2()); 
            // InternalJoveNotes.g:4099:1: ( rule__ChemCompound__SymbolAssignment_2 )
            // InternalJoveNotes.g:4099:2: rule__ChemCompound__SymbolAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4109:1: rule__ChemCompound__Group__3 : rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4 ;
    public final void rule__ChemCompound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4113:1: ( rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4 )
            // InternalJoveNotes.g:4114:2: rule__ChemCompound__Group__3__Impl rule__ChemCompound__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ChemCompound__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4121:1: rule__ChemCompound__Group__3__Impl : ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) ) ;
    public final void rule__ChemCompound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4125:1: ( ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) ) )
            // InternalJoveNotes.g:4126:1: ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) )
            {
            // InternalJoveNotes.g:4126:1: ( ( rule__ChemCompound__ChemicalNameAssignment_3 ) )
            // InternalJoveNotes.g:4127:1: ( rule__ChemCompound__ChemicalNameAssignment_3 )
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameAssignment_3()); 
            // InternalJoveNotes.g:4128:1: ( rule__ChemCompound__ChemicalNameAssignment_3 )
            // InternalJoveNotes.g:4128:2: rule__ChemCompound__ChemicalNameAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4138:1: rule__ChemCompound__Group__4 : rule__ChemCompound__Group__4__Impl ;
    public final void rule__ChemCompound__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4142:1: ( rule__ChemCompound__Group__4__Impl )
            // InternalJoveNotes.g:4143:2: rule__ChemCompound__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4149:1: rule__ChemCompound__Group__4__Impl : ( ( rule__ChemCompound__CommonNameAssignment_4 )? ) ;
    public final void rule__ChemCompound__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4153:1: ( ( ( rule__ChemCompound__CommonNameAssignment_4 )? ) )
            // InternalJoveNotes.g:4154:1: ( ( rule__ChemCompound__CommonNameAssignment_4 )? )
            {
            // InternalJoveNotes.g:4154:1: ( ( rule__ChemCompound__CommonNameAssignment_4 )? )
            // InternalJoveNotes.g:4155:1: ( rule__ChemCompound__CommonNameAssignment_4 )?
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameAssignment_4()); 
            // InternalJoveNotes.g:4156:1: ( rule__ChemCompound__CommonNameAssignment_4 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJoveNotes.g:4156:2: rule__ChemCompound__CommonNameAssignment_4
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4176:1: rule__Spellbee__Group__0 : rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 ;
    public final void rule__Spellbee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4180:1: ( rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1 )
            // InternalJoveNotes.g:4181:2: rule__Spellbee__Group__0__Impl rule__Spellbee__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Spellbee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4188:1: rule__Spellbee__Group__0__Impl : ( '@spellbee' ) ;
    public final void rule__Spellbee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4192:1: ( ( '@spellbee' ) )
            // InternalJoveNotes.g:4193:1: ( '@spellbee' )
            {
            // InternalJoveNotes.g:4193:1: ( '@spellbee' )
            // InternalJoveNotes.g:4194:1: '@spellbee'
            {
             before(grammarAccess.getSpellbeeAccess().getSpellbeeKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalJoveNotes.g:4207:1: rule__Spellbee__Group__1 : rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2 ;
    public final void rule__Spellbee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4211:1: ( rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2 )
            // InternalJoveNotes.g:4212:2: rule__Spellbee__Group__1__Impl rule__Spellbee__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Spellbee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4219:1: rule__Spellbee__Group__1__Impl : ( ( rule__Spellbee__HideFromViewAssignment_1 )? ) ;
    public final void rule__Spellbee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4223:1: ( ( ( rule__Spellbee__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:4224:1: ( ( rule__Spellbee__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:4224:1: ( ( rule__Spellbee__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:4225:1: ( rule__Spellbee__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:4226:1: ( rule__Spellbee__HideFromViewAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==58) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJoveNotes.g:4226:2: rule__Spellbee__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4236:1: rule__Spellbee__Group__2 : rule__Spellbee__Group__2__Impl ;
    public final void rule__Spellbee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4240:1: ( rule__Spellbee__Group__2__Impl )
            // InternalJoveNotes.g:4241:2: rule__Spellbee__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4247:1: rule__Spellbee__Group__2__Impl : ( ( rule__Spellbee__WordAssignment_2 ) ) ;
    public final void rule__Spellbee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4251:1: ( ( ( rule__Spellbee__WordAssignment_2 ) ) )
            // InternalJoveNotes.g:4252:1: ( ( rule__Spellbee__WordAssignment_2 ) )
            {
            // InternalJoveNotes.g:4252:1: ( ( rule__Spellbee__WordAssignment_2 ) )
            // InternalJoveNotes.g:4253:1: ( rule__Spellbee__WordAssignment_2 )
            {
             before(grammarAccess.getSpellbeeAccess().getWordAssignment_2()); 
            // InternalJoveNotes.g:4254:1: ( rule__Spellbee__WordAssignment_2 )
            // InternalJoveNotes.g:4254:2: rule__Spellbee__WordAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4270:1: rule__ImageLabel__Group__0 : rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 ;
    public final void rule__ImageLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4274:1: ( rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1 )
            // InternalJoveNotes.g:4275:2: rule__ImageLabel__Group__0__Impl rule__ImageLabel__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ImageLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4282:1: rule__ImageLabel__Group__0__Impl : ( '@image_label' ) ;
    public final void rule__ImageLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4286:1: ( ( '@image_label' ) )
            // InternalJoveNotes.g:4287:1: ( '@image_label' )
            {
            // InternalJoveNotes.g:4287:1: ( '@image_label' )
            // InternalJoveNotes.g:4288:1: '@image_label'
            {
             before(grammarAccess.getImageLabelAccess().getImage_labelKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalJoveNotes.g:4301:1: rule__ImageLabel__Group__1 : rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 ;
    public final void rule__ImageLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4305:1: ( rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2 )
            // InternalJoveNotes.g:4306:2: rule__ImageLabel__Group__1__Impl rule__ImageLabel__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ImageLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4313:1: rule__ImageLabel__Group__1__Impl : ( ( rule__ImageLabel__HideFromViewAssignment_1 )? ) ;
    public final void rule__ImageLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4317:1: ( ( ( rule__ImageLabel__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:4318:1: ( ( rule__ImageLabel__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:4318:1: ( ( rule__ImageLabel__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:4319:1: ( rule__ImageLabel__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:4320:1: ( rule__ImageLabel__HideFromViewAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==58) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJoveNotes.g:4320:2: rule__ImageLabel__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4330:1: rule__ImageLabel__Group__2 : rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 ;
    public final void rule__ImageLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4334:1: ( rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3 )
            // InternalJoveNotes.g:4335:2: rule__ImageLabel__Group__2__Impl rule__ImageLabel__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ImageLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4342:1: rule__ImageLabel__Group__2__Impl : ( ( rule__ImageLabel__CaptionAssignment_2 )? ) ;
    public final void rule__ImageLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4346:1: ( ( ( rule__ImageLabel__CaptionAssignment_2 )? ) )
            // InternalJoveNotes.g:4347:1: ( ( rule__ImageLabel__CaptionAssignment_2 )? )
            {
            // InternalJoveNotes.g:4347:1: ( ( rule__ImageLabel__CaptionAssignment_2 )? )
            // InternalJoveNotes.g:4348:1: ( rule__ImageLabel__CaptionAssignment_2 )?
            {
             before(grammarAccess.getImageLabelAccess().getCaptionAssignment_2()); 
            // InternalJoveNotes.g:4349:1: ( rule__ImageLabel__CaptionAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJoveNotes.g:4349:2: rule__ImageLabel__CaptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4359:1: rule__ImageLabel__Group__3 : rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 ;
    public final void rule__ImageLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4363:1: ( rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4 )
            // InternalJoveNotes.g:4364:2: rule__ImageLabel__Group__3__Impl rule__ImageLabel__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ImageLabel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4371:1: rule__ImageLabel__Group__3__Impl : ( '{' ) ;
    public final void rule__ImageLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4375:1: ( ( '{' ) )
            // InternalJoveNotes.g:4376:1: ( '{' )
            {
            // InternalJoveNotes.g:4376:1: ( '{' )
            // InternalJoveNotes.g:4377:1: '{'
            {
             before(grammarAccess.getImageLabelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:4390:1: rule__ImageLabel__Group__4 : rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 ;
    public final void rule__ImageLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4394:1: ( rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5 )
            // InternalJoveNotes.g:4395:2: rule__ImageLabel__Group__4__Impl rule__ImageLabel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ImageLabel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4402:1: rule__ImageLabel__Group__4__Impl : ( 'imageName' ) ;
    public final void rule__ImageLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4406:1: ( ( 'imageName' ) )
            // InternalJoveNotes.g:4407:1: ( 'imageName' )
            {
            // InternalJoveNotes.g:4407:1: ( 'imageName' )
            // InternalJoveNotes.g:4408:1: 'imageName'
            {
             before(grammarAccess.getImageLabelAccess().getImageNameKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalJoveNotes.g:4421:1: rule__ImageLabel__Group__5 : rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 ;
    public final void rule__ImageLabel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4425:1: ( rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6 )
            // InternalJoveNotes.g:4426:2: rule__ImageLabel__Group__5__Impl rule__ImageLabel__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ImageLabel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4433:1: rule__ImageLabel__Group__5__Impl : ( ( rule__ImageLabel__ImageNameAssignment_5 ) ) ;
    public final void rule__ImageLabel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4437:1: ( ( ( rule__ImageLabel__ImageNameAssignment_5 ) ) )
            // InternalJoveNotes.g:4438:1: ( ( rule__ImageLabel__ImageNameAssignment_5 ) )
            {
            // InternalJoveNotes.g:4438:1: ( ( rule__ImageLabel__ImageNameAssignment_5 ) )
            // InternalJoveNotes.g:4439:1: ( rule__ImageLabel__ImageNameAssignment_5 )
            {
             before(grammarAccess.getImageLabelAccess().getImageNameAssignment_5()); 
            // InternalJoveNotes.g:4440:1: ( rule__ImageLabel__ImageNameAssignment_5 )
            // InternalJoveNotes.g:4440:2: rule__ImageLabel__ImageNameAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4450:1: rule__ImageLabel__Group__6 : rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 ;
    public final void rule__ImageLabel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4454:1: ( rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7 )
            // InternalJoveNotes.g:4455:2: rule__ImageLabel__Group__6__Impl rule__ImageLabel__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__ImageLabel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4462:1: rule__ImageLabel__Group__6__Impl : ( ( rule__ImageLabel__HotspotsAssignment_6 ) ) ;
    public final void rule__ImageLabel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4466:1: ( ( ( rule__ImageLabel__HotspotsAssignment_6 ) ) )
            // InternalJoveNotes.g:4467:1: ( ( rule__ImageLabel__HotspotsAssignment_6 ) )
            {
            // InternalJoveNotes.g:4467:1: ( ( rule__ImageLabel__HotspotsAssignment_6 ) )
            // InternalJoveNotes.g:4468:1: ( rule__ImageLabel__HotspotsAssignment_6 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_6()); 
            // InternalJoveNotes.g:4469:1: ( rule__ImageLabel__HotspotsAssignment_6 )
            // InternalJoveNotes.g:4469:2: rule__ImageLabel__HotspotsAssignment_6
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4479:1: rule__ImageLabel__Group__7 : rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8 ;
    public final void rule__ImageLabel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4483:1: ( rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8 )
            // InternalJoveNotes.g:4484:2: rule__ImageLabel__Group__7__Impl rule__ImageLabel__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__ImageLabel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4491:1: rule__ImageLabel__Group__7__Impl : ( ( rule__ImageLabel__Group_7__0 )* ) ;
    public final void rule__ImageLabel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4495:1: ( ( ( rule__ImageLabel__Group_7__0 )* ) )
            // InternalJoveNotes.g:4496:1: ( ( rule__ImageLabel__Group_7__0 )* )
            {
            // InternalJoveNotes.g:4496:1: ( ( rule__ImageLabel__Group_7__0 )* )
            // InternalJoveNotes.g:4497:1: ( rule__ImageLabel__Group_7__0 )*
            {
             before(grammarAccess.getImageLabelAccess().getGroup_7()); 
            // InternalJoveNotes.g:4498:1: ( rule__ImageLabel__Group_7__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==39) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalJoveNotes.g:4498:2: rule__ImageLabel__Group_7__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ImageLabel__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalJoveNotes.g:4508:1: rule__ImageLabel__Group__8 : rule__ImageLabel__Group__8__Impl ;
    public final void rule__ImageLabel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4512:1: ( rule__ImageLabel__Group__8__Impl )
            // InternalJoveNotes.g:4513:2: rule__ImageLabel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4519:1: rule__ImageLabel__Group__8__Impl : ( '}' ) ;
    public final void rule__ImageLabel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4523:1: ( ( '}' ) )
            // InternalJoveNotes.g:4524:1: ( '}' )
            {
            // InternalJoveNotes.g:4524:1: ( '}' )
            // InternalJoveNotes.g:4525:1: '}'
            {
             before(grammarAccess.getImageLabelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJoveNotes.g:4556:1: rule__ImageLabel__Group_7__0 : rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1 ;
    public final void rule__ImageLabel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4560:1: ( rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1 )
            // InternalJoveNotes.g:4561:2: rule__ImageLabel__Group_7__0__Impl rule__ImageLabel__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__ImageLabel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4568:1: rule__ImageLabel__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ImageLabel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4572:1: ( ( ',' ) )
            // InternalJoveNotes.g:4573:1: ( ',' )
            {
            // InternalJoveNotes.g:4573:1: ( ',' )
            // InternalJoveNotes.g:4574:1: ','
            {
             before(grammarAccess.getImageLabelAccess().getCommaKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalJoveNotes.g:4587:1: rule__ImageLabel__Group_7__1 : rule__ImageLabel__Group_7__1__Impl ;
    public final void rule__ImageLabel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4591:1: ( rule__ImageLabel__Group_7__1__Impl )
            // InternalJoveNotes.g:4592:2: rule__ImageLabel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4598:1: rule__ImageLabel__Group_7__1__Impl : ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) ) ;
    public final void rule__ImageLabel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4602:1: ( ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) ) )
            // InternalJoveNotes.g:4603:1: ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) )
            {
            // InternalJoveNotes.g:4603:1: ( ( rule__ImageLabel__HotspotsAssignment_7_1 ) )
            // InternalJoveNotes.g:4604:1: ( rule__ImageLabel__HotspotsAssignment_7_1 )
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsAssignment_7_1()); 
            // InternalJoveNotes.g:4605:1: ( rule__ImageLabel__HotspotsAssignment_7_1 )
            // InternalJoveNotes.g:4605:2: rule__ImageLabel__HotspotsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4619:1: rule__HotSpot__Group__0 : rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 ;
    public final void rule__HotSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4623:1: ( rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1 )
            // InternalJoveNotes.g:4624:2: rule__HotSpot__Group__0__Impl rule__HotSpot__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__HotSpot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4631:1: rule__HotSpot__Group__0__Impl : ( ( rule__HotSpot__XAssignment_0 ) ) ;
    public final void rule__HotSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4635:1: ( ( ( rule__HotSpot__XAssignment_0 ) ) )
            // InternalJoveNotes.g:4636:1: ( ( rule__HotSpot__XAssignment_0 ) )
            {
            // InternalJoveNotes.g:4636:1: ( ( rule__HotSpot__XAssignment_0 ) )
            // InternalJoveNotes.g:4637:1: ( rule__HotSpot__XAssignment_0 )
            {
             before(grammarAccess.getHotSpotAccess().getXAssignment_0()); 
            // InternalJoveNotes.g:4638:1: ( rule__HotSpot__XAssignment_0 )
            // InternalJoveNotes.g:4638:2: rule__HotSpot__XAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4648:1: rule__HotSpot__Group__1 : rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 ;
    public final void rule__HotSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4652:1: ( rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2 )
            // InternalJoveNotes.g:4653:2: rule__HotSpot__Group__1__Impl rule__HotSpot__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__HotSpot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4660:1: rule__HotSpot__Group__1__Impl : ( ',' ) ;
    public final void rule__HotSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4664:1: ( ( ',' ) )
            // InternalJoveNotes.g:4665:1: ( ',' )
            {
            // InternalJoveNotes.g:4665:1: ( ',' )
            // InternalJoveNotes.g:4666:1: ','
            {
             before(grammarAccess.getHotSpotAccess().getCommaKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalJoveNotes.g:4679:1: rule__HotSpot__Group__2 : rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 ;
    public final void rule__HotSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4683:1: ( rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3 )
            // InternalJoveNotes.g:4684:2: rule__HotSpot__Group__2__Impl rule__HotSpot__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__HotSpot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4691:1: rule__HotSpot__Group__2__Impl : ( ( rule__HotSpot__YAssignment_2 ) ) ;
    public final void rule__HotSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4695:1: ( ( ( rule__HotSpot__YAssignment_2 ) ) )
            // InternalJoveNotes.g:4696:1: ( ( rule__HotSpot__YAssignment_2 ) )
            {
            // InternalJoveNotes.g:4696:1: ( ( rule__HotSpot__YAssignment_2 ) )
            // InternalJoveNotes.g:4697:1: ( rule__HotSpot__YAssignment_2 )
            {
             before(grammarAccess.getHotSpotAccess().getYAssignment_2()); 
            // InternalJoveNotes.g:4698:1: ( rule__HotSpot__YAssignment_2 )
            // InternalJoveNotes.g:4698:2: rule__HotSpot__YAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4708:1: rule__HotSpot__Group__3 : rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 ;
    public final void rule__HotSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4712:1: ( rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4 )
            // InternalJoveNotes.g:4713:2: rule__HotSpot__Group__3__Impl rule__HotSpot__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__HotSpot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4720:1: rule__HotSpot__Group__3__Impl : ( '=' ) ;
    public final void rule__HotSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4724:1: ( ( '=' ) )
            // InternalJoveNotes.g:4725:1: ( '=' )
            {
            // InternalJoveNotes.g:4725:1: ( '=' )
            // InternalJoveNotes.g:4726:1: '='
            {
             before(grammarAccess.getHotSpotAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalJoveNotes.g:4739:1: rule__HotSpot__Group__4 : rule__HotSpot__Group__4__Impl ;
    public final void rule__HotSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4743:1: ( rule__HotSpot__Group__4__Impl )
            // InternalJoveNotes.g:4744:2: rule__HotSpot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4750:1: rule__HotSpot__Group__4__Impl : ( ( rule__HotSpot__LabelAssignment_4 ) ) ;
    public final void rule__HotSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4754:1: ( ( ( rule__HotSpot__LabelAssignment_4 ) ) )
            // InternalJoveNotes.g:4755:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            {
            // InternalJoveNotes.g:4755:1: ( ( rule__HotSpot__LabelAssignment_4 ) )
            // InternalJoveNotes.g:4756:1: ( rule__HotSpot__LabelAssignment_4 )
            {
             before(grammarAccess.getHotSpotAccess().getLabelAssignment_4()); 
            // InternalJoveNotes.g:4757:1: ( rule__HotSpot__LabelAssignment_4 )
            // InternalJoveNotes.g:4757:2: rule__HotSpot__LabelAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4777:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4781:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // InternalJoveNotes.g:4782:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Equation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4789:1: rule__Equation__Group__0__Impl : ( '@equation' ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4793:1: ( ( '@equation' ) )
            // InternalJoveNotes.g:4794:1: ( '@equation' )
            {
            // InternalJoveNotes.g:4794:1: ( '@equation' )
            // InternalJoveNotes.g:4795:1: '@equation'
            {
             before(grammarAccess.getEquationAccess().getEquationKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalJoveNotes.g:4808:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4812:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // InternalJoveNotes.g:4813:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Equation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4820:1: rule__Equation__Group__1__Impl : ( ( rule__Equation__HideFromViewAssignment_1 )? ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4824:1: ( ( ( rule__Equation__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:4825:1: ( ( rule__Equation__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:4825:1: ( ( rule__Equation__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:4826:1: ( rule__Equation__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getEquationAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:4827:1: ( rule__Equation__HideFromViewAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==58) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJoveNotes.g:4827:2: rule__Equation__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4837:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl rule__Equation__Group__3 ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4841:1: ( rule__Equation__Group__2__Impl rule__Equation__Group__3 )
            // InternalJoveNotes.g:4842:2: rule__Equation__Group__2__Impl rule__Equation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Equation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4849:1: rule__Equation__Group__2__Impl : ( ( rule__Equation__EquationAssignment_2 ) ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4853:1: ( ( ( rule__Equation__EquationAssignment_2 ) ) )
            // InternalJoveNotes.g:4854:1: ( ( rule__Equation__EquationAssignment_2 ) )
            {
            // InternalJoveNotes.g:4854:1: ( ( rule__Equation__EquationAssignment_2 ) )
            // InternalJoveNotes.g:4855:1: ( rule__Equation__EquationAssignment_2 )
            {
             before(grammarAccess.getEquationAccess().getEquationAssignment_2()); 
            // InternalJoveNotes.g:4856:1: ( rule__Equation__EquationAssignment_2 )
            // InternalJoveNotes.g:4856:2: rule__Equation__EquationAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4866:1: rule__Equation__Group__3 : rule__Equation__Group__3__Impl rule__Equation__Group__4 ;
    public final void rule__Equation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4870:1: ( rule__Equation__Group__3__Impl rule__Equation__Group__4 )
            // InternalJoveNotes.g:4871:2: rule__Equation__Group__3__Impl rule__Equation__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Equation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4878:1: rule__Equation__Group__3__Impl : ( '{' ) ;
    public final void rule__Equation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4882:1: ( ( '{' ) )
            // InternalJoveNotes.g:4883:1: ( '{' )
            {
            // InternalJoveNotes.g:4883:1: ( '{' )
            // InternalJoveNotes.g:4884:1: '{'
            {
             before(grammarAccess.getEquationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:4897:1: rule__Equation__Group__4 : rule__Equation__Group__4__Impl rule__Equation__Group__5 ;
    public final void rule__Equation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4901:1: ( rule__Equation__Group__4__Impl rule__Equation__Group__5 )
            // InternalJoveNotes.g:4902:2: rule__Equation__Group__4__Impl rule__Equation__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Equation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4909:1: rule__Equation__Group__4__Impl : ( ( rule__Equation__DescriptionAssignment_4 )? ) ;
    public final void rule__Equation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4913:1: ( ( ( rule__Equation__DescriptionAssignment_4 )? ) )
            // InternalJoveNotes.g:4914:1: ( ( rule__Equation__DescriptionAssignment_4 )? )
            {
            // InternalJoveNotes.g:4914:1: ( ( rule__Equation__DescriptionAssignment_4 )? )
            // InternalJoveNotes.g:4915:1: ( rule__Equation__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getEquationAccess().getDescriptionAssignment_4()); 
            // InternalJoveNotes.g:4916:1: ( rule__Equation__DescriptionAssignment_4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJoveNotes.g:4916:2: rule__Equation__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4926:1: rule__Equation__Group__5 : rule__Equation__Group__5__Impl rule__Equation__Group__6 ;
    public final void rule__Equation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4930:1: ( rule__Equation__Group__5__Impl rule__Equation__Group__6 )
            // InternalJoveNotes.g:4931:2: rule__Equation__Group__5__Impl rule__Equation__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Equation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4938:1: rule__Equation__Group__5__Impl : ( 'where' ) ;
    public final void rule__Equation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4942:1: ( ( 'where' ) )
            // InternalJoveNotes.g:4943:1: ( 'where' )
            {
            // InternalJoveNotes.g:4943:1: ( 'where' )
            // InternalJoveNotes.g:4944:1: 'where'
            {
             before(grammarAccess.getEquationAccess().getWhereKeyword_5()); 
            match(input,41,FOLLOW_2); 
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
    // InternalJoveNotes.g:4957:1: rule__Equation__Group__6 : rule__Equation__Group__6__Impl rule__Equation__Group__7 ;
    public final void rule__Equation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4961:1: ( rule__Equation__Group__6__Impl rule__Equation__Group__7 )
            // InternalJoveNotes.g:4962:2: rule__Equation__Group__6__Impl rule__Equation__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Equation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4969:1: rule__Equation__Group__6__Impl : ( ( rule__Equation__SymbolsAssignment_6 ) ) ;
    public final void rule__Equation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4973:1: ( ( ( rule__Equation__SymbolsAssignment_6 ) ) )
            // InternalJoveNotes.g:4974:1: ( ( rule__Equation__SymbolsAssignment_6 ) )
            {
            // InternalJoveNotes.g:4974:1: ( ( rule__Equation__SymbolsAssignment_6 ) )
            // InternalJoveNotes.g:4975:1: ( rule__Equation__SymbolsAssignment_6 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_6()); 
            // InternalJoveNotes.g:4976:1: ( rule__Equation__SymbolsAssignment_6 )
            // InternalJoveNotes.g:4976:2: rule__Equation__SymbolsAssignment_6
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4986:1: rule__Equation__Group__7 : rule__Equation__Group__7__Impl rule__Equation__Group__8 ;
    public final void rule__Equation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:4990:1: ( rule__Equation__Group__7__Impl rule__Equation__Group__8 )
            // InternalJoveNotes.g:4991:2: rule__Equation__Group__7__Impl rule__Equation__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Equation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:4998:1: rule__Equation__Group__7__Impl : ( ( rule__Equation__Group_7__0 )* ) ;
    public final void rule__Equation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5002:1: ( ( ( rule__Equation__Group_7__0 )* ) )
            // InternalJoveNotes.g:5003:1: ( ( rule__Equation__Group_7__0 )* )
            {
            // InternalJoveNotes.g:5003:1: ( ( rule__Equation__Group_7__0 )* )
            // InternalJoveNotes.g:5004:1: ( rule__Equation__Group_7__0 )*
            {
             before(grammarAccess.getEquationAccess().getGroup_7()); 
            // InternalJoveNotes.g:5005:1: ( rule__Equation__Group_7__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==39) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalJoveNotes.g:5005:2: rule__Equation__Group_7__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Equation__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalJoveNotes.g:5015:1: rule__Equation__Group__8 : rule__Equation__Group__8__Impl ;
    public final void rule__Equation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5019:1: ( rule__Equation__Group__8__Impl )
            // InternalJoveNotes.g:5020:2: rule__Equation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5026:1: rule__Equation__Group__8__Impl : ( '}' ) ;
    public final void rule__Equation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5030:1: ( ( '}' ) )
            // InternalJoveNotes.g:5031:1: ( '}' )
            {
            // InternalJoveNotes.g:5031:1: ( '}' )
            // InternalJoveNotes.g:5032:1: '}'
            {
             before(grammarAccess.getEquationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJoveNotes.g:5063:1: rule__Equation__Group_7__0 : rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1 ;
    public final void rule__Equation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5067:1: ( rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1 )
            // InternalJoveNotes.g:5068:2: rule__Equation__Group_7__0__Impl rule__Equation__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Equation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5075:1: rule__Equation__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Equation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5079:1: ( ( ',' ) )
            // InternalJoveNotes.g:5080:1: ( ',' )
            {
            // InternalJoveNotes.g:5080:1: ( ',' )
            // InternalJoveNotes.g:5081:1: ','
            {
             before(grammarAccess.getEquationAccess().getCommaKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalJoveNotes.g:5094:1: rule__Equation__Group_7__1 : rule__Equation__Group_7__1__Impl ;
    public final void rule__Equation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5098:1: ( rule__Equation__Group_7__1__Impl )
            // InternalJoveNotes.g:5099:2: rule__Equation__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5105:1: rule__Equation__Group_7__1__Impl : ( ( rule__Equation__SymbolsAssignment_7_1 ) ) ;
    public final void rule__Equation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5109:1: ( ( ( rule__Equation__SymbolsAssignment_7_1 ) ) )
            // InternalJoveNotes.g:5110:1: ( ( rule__Equation__SymbolsAssignment_7_1 ) )
            {
            // InternalJoveNotes.g:5110:1: ( ( rule__Equation__SymbolsAssignment_7_1 ) )
            // InternalJoveNotes.g:5111:1: ( rule__Equation__SymbolsAssignment_7_1 )
            {
             before(grammarAccess.getEquationAccess().getSymbolsAssignment_7_1()); 
            // InternalJoveNotes.g:5112:1: ( rule__Equation__SymbolsAssignment_7_1 )
            // InternalJoveNotes.g:5112:2: rule__Equation__SymbolsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5126:1: rule__EqSymbol__Group__0 : rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 ;
    public final void rule__EqSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5130:1: ( rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1 )
            // InternalJoveNotes.g:5131:2: rule__EqSymbol__Group__0__Impl rule__EqSymbol__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EqSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5138:1: rule__EqSymbol__Group__0__Impl : ( ( rule__EqSymbol__SymbolAssignment_0 ) ) ;
    public final void rule__EqSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5142:1: ( ( ( rule__EqSymbol__SymbolAssignment_0 ) ) )
            // InternalJoveNotes.g:5143:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            {
            // InternalJoveNotes.g:5143:1: ( ( rule__EqSymbol__SymbolAssignment_0 ) )
            // InternalJoveNotes.g:5144:1: ( rule__EqSymbol__SymbolAssignment_0 )
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolAssignment_0()); 
            // InternalJoveNotes.g:5145:1: ( rule__EqSymbol__SymbolAssignment_0 )
            // InternalJoveNotes.g:5145:2: rule__EqSymbol__SymbolAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5155:1: rule__EqSymbol__Group__1 : rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 ;
    public final void rule__EqSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5159:1: ( rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2 )
            // InternalJoveNotes.g:5160:2: rule__EqSymbol__Group__1__Impl rule__EqSymbol__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EqSymbol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5167:1: rule__EqSymbol__Group__1__Impl : ( '=' ) ;
    public final void rule__EqSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5171:1: ( ( '=' ) )
            // InternalJoveNotes.g:5172:1: ( '=' )
            {
            // InternalJoveNotes.g:5172:1: ( '=' )
            // InternalJoveNotes.g:5173:1: '='
            {
             before(grammarAccess.getEqSymbolAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalJoveNotes.g:5186:1: rule__EqSymbol__Group__2 : rule__EqSymbol__Group__2__Impl ;
    public final void rule__EqSymbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5190:1: ( rule__EqSymbol__Group__2__Impl )
            // InternalJoveNotes.g:5191:2: rule__EqSymbol__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5197:1: rule__EqSymbol__Group__2__Impl : ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) ;
    public final void rule__EqSymbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5201:1: ( ( ( rule__EqSymbol__DescriptionAssignment_2 ) ) )
            // InternalJoveNotes.g:5202:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            {
            // InternalJoveNotes.g:5202:1: ( ( rule__EqSymbol__DescriptionAssignment_2 ) )
            // InternalJoveNotes.g:5203:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionAssignment_2()); 
            // InternalJoveNotes.g:5204:1: ( rule__EqSymbol__DescriptionAssignment_2 )
            // InternalJoveNotes.g:5204:2: rule__EqSymbol__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5220:1: rule__RefToContext__Group__0 : rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 ;
    public final void rule__RefToContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5224:1: ( rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1 )
            // InternalJoveNotes.g:5225:2: rule__RefToContext__Group__0__Impl rule__RefToContext__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__RefToContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5232:1: rule__RefToContext__Group__0__Impl : ( '@rtc' ) ;
    public final void rule__RefToContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5236:1: ( ( '@rtc' ) )
            // InternalJoveNotes.g:5237:1: ( '@rtc' )
            {
            // InternalJoveNotes.g:5237:1: ( '@rtc' )
            // InternalJoveNotes.g:5238:1: '@rtc'
            {
             before(grammarAccess.getRefToContextAccess().getRtcKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalJoveNotes.g:5251:1: rule__RefToContext__Group__1 : rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 ;
    public final void rule__RefToContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5255:1: ( rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2 )
            // InternalJoveNotes.g:5256:2: rule__RefToContext__Group__1__Impl rule__RefToContext__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__RefToContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5263:1: rule__RefToContext__Group__1__Impl : ( ( rule__RefToContext__HideFromViewAssignment_1 )? ) ;
    public final void rule__RefToContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5267:1: ( ( ( rule__RefToContext__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:5268:1: ( ( rule__RefToContext__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:5268:1: ( ( rule__RefToContext__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:5269:1: ( rule__RefToContext__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:5270:1: ( rule__RefToContext__HideFromViewAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJoveNotes.g:5270:2: rule__RefToContext__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5280:1: rule__RefToContext__Group__2 : rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 ;
    public final void rule__RefToContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5284:1: ( rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3 )
            // InternalJoveNotes.g:5285:2: rule__RefToContext__Group__2__Impl rule__RefToContext__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__RefToContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5292:1: rule__RefToContext__Group__2__Impl : ( '{' ) ;
    public final void rule__RefToContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5296:1: ( ( '{' ) )
            // InternalJoveNotes.g:5297:1: ( '{' )
            {
            // InternalJoveNotes.g:5297:1: ( '{' )
            // InternalJoveNotes.g:5298:1: '{'
            {
             before(grammarAccess.getRefToContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:5311:1: rule__RefToContext__Group__3 : rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 ;
    public final void rule__RefToContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5315:1: ( rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4 )
            // InternalJoveNotes.g:5316:2: rule__RefToContext__Group__3__Impl rule__RefToContext__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__RefToContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5323:1: rule__RefToContext__Group__3__Impl : ( 'context' ) ;
    public final void rule__RefToContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5327:1: ( ( 'context' ) )
            // InternalJoveNotes.g:5328:1: ( 'context' )
            {
            // InternalJoveNotes.g:5328:1: ( 'context' )
            // InternalJoveNotes.g:5329:1: 'context'
            {
             before(grammarAccess.getRefToContextAccess().getContextKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalJoveNotes.g:5342:1: rule__RefToContext__Group__4 : rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 ;
    public final void rule__RefToContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5346:1: ( rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5 )
            // InternalJoveNotes.g:5347:2: rule__RefToContext__Group__4__Impl rule__RefToContext__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__RefToContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5354:1: rule__RefToContext__Group__4__Impl : ( ( rule__RefToContext__ContextAssignment_4 ) ) ;
    public final void rule__RefToContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5358:1: ( ( ( rule__RefToContext__ContextAssignment_4 ) ) )
            // InternalJoveNotes.g:5359:1: ( ( rule__RefToContext__ContextAssignment_4 ) )
            {
            // InternalJoveNotes.g:5359:1: ( ( rule__RefToContext__ContextAssignment_4 ) )
            // InternalJoveNotes.g:5360:1: ( rule__RefToContext__ContextAssignment_4 )
            {
             before(grammarAccess.getRefToContextAccess().getContextAssignment_4()); 
            // InternalJoveNotes.g:5361:1: ( rule__RefToContext__ContextAssignment_4 )
            // InternalJoveNotes.g:5361:2: rule__RefToContext__ContextAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5371:1: rule__RefToContext__Group__5 : rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6 ;
    public final void rule__RefToContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5375:1: ( rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6 )
            // InternalJoveNotes.g:5376:2: rule__RefToContext__Group__5__Impl rule__RefToContext__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__RefToContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5383:1: rule__RefToContext__Group__5__Impl : ( ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* ) ) ;
    public final void rule__RefToContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5387:1: ( ( ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* ) ) )
            // InternalJoveNotes.g:5388:1: ( ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* ) )
            {
            // InternalJoveNotes.g:5388:1: ( ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* ) )
            // InternalJoveNotes.g:5389:1: ( ( rule__RefToContext__RtcElementAssignment_5 ) ) ( ( rule__RefToContext__RtcElementAssignment_5 )* )
            {
            // InternalJoveNotes.g:5389:1: ( ( rule__RefToContext__RtcElementAssignment_5 ) )
            // InternalJoveNotes.g:5390:1: ( rule__RefToContext__RtcElementAssignment_5 )
            {
             before(grammarAccess.getRefToContextAccess().getRtcElementAssignment_5()); 
            // InternalJoveNotes.g:5391:1: ( rule__RefToContext__RtcElementAssignment_5 )
            // InternalJoveNotes.g:5391:2: rule__RefToContext__RtcElementAssignment_5
            {
            pushFollow(FOLLOW_36);
            rule__RefToContext__RtcElementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRefToContextAccess().getRtcElementAssignment_5()); 

            }

            // InternalJoveNotes.g:5394:1: ( ( rule__RefToContext__RtcElementAssignment_5 )* )
            // InternalJoveNotes.g:5395:1: ( rule__RefToContext__RtcElementAssignment_5 )*
            {
             before(grammarAccess.getRefToContextAccess().getRtcElementAssignment_5()); 
            // InternalJoveNotes.g:5396:1: ( rule__RefToContext__RtcElementAssignment_5 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=16 && LA46_0<=22)||(LA46_0>=31 && LA46_0<=33)||LA46_0==35||LA46_0==37||LA46_0==40||LA46_0==44) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalJoveNotes.g:5396:2: rule__RefToContext__RtcElementAssignment_5
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__RefToContext__RtcElementAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getRefToContextAccess().getRtcElementAssignment_5()); 

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
    // InternalJoveNotes.g:5407:1: rule__RefToContext__Group__6 : rule__RefToContext__Group__6__Impl ;
    public final void rule__RefToContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5411:1: ( rule__RefToContext__Group__6__Impl )
            // InternalJoveNotes.g:5412:2: rule__RefToContext__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5418:1: rule__RefToContext__Group__6__Impl : ( '}' ) ;
    public final void rule__RefToContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5422:1: ( ( '}' ) )
            // InternalJoveNotes.g:5423:1: ( '}' )
            {
            // InternalJoveNotes.g:5423:1: ( '}' )
            // InternalJoveNotes.g:5424:1: '}'
            {
             before(grammarAccess.getRefToContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJoveNotes.g:5451:1: rule__MultiChoice__Group__0 : rule__MultiChoice__Group__0__Impl rule__MultiChoice__Group__1 ;
    public final void rule__MultiChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5455:1: ( rule__MultiChoice__Group__0__Impl rule__MultiChoice__Group__1 )
            // InternalJoveNotes.g:5456:2: rule__MultiChoice__Group__0__Impl rule__MultiChoice__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__MultiChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5463:1: rule__MultiChoice__Group__0__Impl : ( '@multi_choice' ) ;
    public final void rule__MultiChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5467:1: ( ( '@multi_choice' ) )
            // InternalJoveNotes.g:5468:1: ( '@multi_choice' )
            {
            // InternalJoveNotes.g:5468:1: ( '@multi_choice' )
            // InternalJoveNotes.g:5469:1: '@multi_choice'
            {
             before(grammarAccess.getMultiChoiceAccess().getMulti_choiceKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalJoveNotes.g:5482:1: rule__MultiChoice__Group__1 : rule__MultiChoice__Group__1__Impl rule__MultiChoice__Group__2 ;
    public final void rule__MultiChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5486:1: ( rule__MultiChoice__Group__1__Impl rule__MultiChoice__Group__2 )
            // InternalJoveNotes.g:5487:2: rule__MultiChoice__Group__1__Impl rule__MultiChoice__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MultiChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5494:1: rule__MultiChoice__Group__1__Impl : ( ( rule__MultiChoice__HideFromViewAssignment_1 )? ) ;
    public final void rule__MultiChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5498:1: ( ( ( rule__MultiChoice__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:5499:1: ( ( rule__MultiChoice__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:5499:1: ( ( rule__MultiChoice__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:5500:1: ( rule__MultiChoice__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:5501:1: ( rule__MultiChoice__HideFromViewAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJoveNotes.g:5501:2: rule__MultiChoice__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5511:1: rule__MultiChoice__Group__2 : rule__MultiChoice__Group__2__Impl rule__MultiChoice__Group__3 ;
    public final void rule__MultiChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5515:1: ( rule__MultiChoice__Group__2__Impl rule__MultiChoice__Group__3 )
            // InternalJoveNotes.g:5516:2: rule__MultiChoice__Group__2__Impl rule__MultiChoice__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__MultiChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5523:1: rule__MultiChoice__Group__2__Impl : ( ( rule__MultiChoice__QuestionAssignment_2 ) ) ;
    public final void rule__MultiChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5527:1: ( ( ( rule__MultiChoice__QuestionAssignment_2 ) ) )
            // InternalJoveNotes.g:5528:1: ( ( rule__MultiChoice__QuestionAssignment_2 ) )
            {
            // InternalJoveNotes.g:5528:1: ( ( rule__MultiChoice__QuestionAssignment_2 ) )
            // InternalJoveNotes.g:5529:1: ( rule__MultiChoice__QuestionAssignment_2 )
            {
             before(grammarAccess.getMultiChoiceAccess().getQuestionAssignment_2()); 
            // InternalJoveNotes.g:5530:1: ( rule__MultiChoice__QuestionAssignment_2 )
            // InternalJoveNotes.g:5530:2: rule__MultiChoice__QuestionAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5540:1: rule__MultiChoice__Group__3 : rule__MultiChoice__Group__3__Impl rule__MultiChoice__Group__4 ;
    public final void rule__MultiChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5544:1: ( rule__MultiChoice__Group__3__Impl rule__MultiChoice__Group__4 )
            // InternalJoveNotes.g:5545:2: rule__MultiChoice__Group__3__Impl rule__MultiChoice__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__MultiChoice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5552:1: rule__MultiChoice__Group__3__Impl : ( '{' ) ;
    public final void rule__MultiChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5556:1: ( ( '{' ) )
            // InternalJoveNotes.g:5557:1: ( '{' )
            {
            // InternalJoveNotes.g:5557:1: ( '{' )
            // InternalJoveNotes.g:5558:1: '{'
            {
             before(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:5571:1: rule__MultiChoice__Group__4 : rule__MultiChoice__Group__4__Impl rule__MultiChoice__Group__5 ;
    public final void rule__MultiChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5575:1: ( rule__MultiChoice__Group__4__Impl rule__MultiChoice__Group__5 )
            // InternalJoveNotes.g:5576:2: rule__MultiChoice__Group__4__Impl rule__MultiChoice__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__MultiChoice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5583:1: rule__MultiChoice__Group__4__Impl : ( '@options' ) ;
    public final void rule__MultiChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5587:1: ( ( '@options' ) )
            // InternalJoveNotes.g:5588:1: ( '@options' )
            {
            // InternalJoveNotes.g:5588:1: ( '@options' )
            // InternalJoveNotes.g:5589:1: '@options'
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsKeyword_4()); 
            match(input,45,FOLLOW_2); 
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
    // InternalJoveNotes.g:5602:1: rule__MultiChoice__Group__5 : rule__MultiChoice__Group__5__Impl rule__MultiChoice__Group__6 ;
    public final void rule__MultiChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5606:1: ( rule__MultiChoice__Group__5__Impl rule__MultiChoice__Group__6 )
            // InternalJoveNotes.g:5607:2: rule__MultiChoice__Group__5__Impl rule__MultiChoice__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5614:1: rule__MultiChoice__Group__5__Impl : ( '{' ) ;
    public final void rule__MultiChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5618:1: ( ( '{' ) )
            // InternalJoveNotes.g:5619:1: ( '{' )
            {
            // InternalJoveNotes.g:5619:1: ( '{' )
            // InternalJoveNotes.g:5620:1: '{'
            {
             before(grammarAccess.getMultiChoiceAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:5633:1: rule__MultiChoice__Group__6 : rule__MultiChoice__Group__6__Impl rule__MultiChoice__Group__7 ;
    public final void rule__MultiChoice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5637:1: ( rule__MultiChoice__Group__6__Impl rule__MultiChoice__Group__7 )
            // InternalJoveNotes.g:5638:2: rule__MultiChoice__Group__6__Impl rule__MultiChoice__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__MultiChoice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5645:1: rule__MultiChoice__Group__6__Impl : ( ( rule__MultiChoice__OptionsAssignment_6 ) ) ;
    public final void rule__MultiChoice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5649:1: ( ( ( rule__MultiChoice__OptionsAssignment_6 ) ) )
            // InternalJoveNotes.g:5650:1: ( ( rule__MultiChoice__OptionsAssignment_6 ) )
            {
            // InternalJoveNotes.g:5650:1: ( ( rule__MultiChoice__OptionsAssignment_6 ) )
            // InternalJoveNotes.g:5651:1: ( rule__MultiChoice__OptionsAssignment_6 )
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_6()); 
            // InternalJoveNotes.g:5652:1: ( rule__MultiChoice__OptionsAssignment_6 )
            // InternalJoveNotes.g:5652:2: rule__MultiChoice__OptionsAssignment_6
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5662:1: rule__MultiChoice__Group__7 : rule__MultiChoice__Group__7__Impl rule__MultiChoice__Group__8 ;
    public final void rule__MultiChoice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5666:1: ( rule__MultiChoice__Group__7__Impl rule__MultiChoice__Group__8 )
            // InternalJoveNotes.g:5667:2: rule__MultiChoice__Group__7__Impl rule__MultiChoice__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__MultiChoice__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5674:1: rule__MultiChoice__Group__7__Impl : ( ( rule__MultiChoice__Group_7__0 )* ) ;
    public final void rule__MultiChoice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5678:1: ( ( ( rule__MultiChoice__Group_7__0 )* ) )
            // InternalJoveNotes.g:5679:1: ( ( rule__MultiChoice__Group_7__0 )* )
            {
            // InternalJoveNotes.g:5679:1: ( ( rule__MultiChoice__Group_7__0 )* )
            // InternalJoveNotes.g:5680:1: ( rule__MultiChoice__Group_7__0 )*
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_7()); 
            // InternalJoveNotes.g:5681:1: ( rule__MultiChoice__Group_7__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==39) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalJoveNotes.g:5681:2: rule__MultiChoice__Group_7__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__MultiChoice__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalJoveNotes.g:5691:1: rule__MultiChoice__Group__8 : rule__MultiChoice__Group__8__Impl rule__MultiChoice__Group__9 ;
    public final void rule__MultiChoice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5695:1: ( rule__MultiChoice__Group__8__Impl rule__MultiChoice__Group__9 )
            // InternalJoveNotes.g:5696:2: rule__MultiChoice__Group__8__Impl rule__MultiChoice__Group__9
            {
            pushFollow(FOLLOW_38);
            rule__MultiChoice__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5703:1: rule__MultiChoice__Group__8__Impl : ( '}' ) ;
    public final void rule__MultiChoice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5707:1: ( ( '}' ) )
            // InternalJoveNotes.g:5708:1: ( '}' )
            {
            // InternalJoveNotes.g:5708:1: ( '}' )
            // InternalJoveNotes.g:5709:1: '}'
            {
             before(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJoveNotes.g:5722:1: rule__MultiChoice__Group__9 : rule__MultiChoice__Group__9__Impl rule__MultiChoice__Group__10 ;
    public final void rule__MultiChoice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5726:1: ( rule__MultiChoice__Group__9__Impl rule__MultiChoice__Group__10 )
            // InternalJoveNotes.g:5727:2: rule__MultiChoice__Group__9__Impl rule__MultiChoice__Group__10
            {
            pushFollow(FOLLOW_38);
            rule__MultiChoice__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5734:1: rule__MultiChoice__Group__9__Impl : ( ( rule__MultiChoice__Group_9__0 )? ) ;
    public final void rule__MultiChoice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5738:1: ( ( ( rule__MultiChoice__Group_9__0 )? ) )
            // InternalJoveNotes.g:5739:1: ( ( rule__MultiChoice__Group_9__0 )? )
            {
            // InternalJoveNotes.g:5739:1: ( ( rule__MultiChoice__Group_9__0 )? )
            // InternalJoveNotes.g:5740:1: ( rule__MultiChoice__Group_9__0 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_9()); 
            // InternalJoveNotes.g:5741:1: ( rule__MultiChoice__Group_9__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJoveNotes.g:5741:2: rule__MultiChoice__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5751:1: rule__MultiChoice__Group__10 : rule__MultiChoice__Group__10__Impl rule__MultiChoice__Group__11 ;
    public final void rule__MultiChoice__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5755:1: ( rule__MultiChoice__Group__10__Impl rule__MultiChoice__Group__11 )
            // InternalJoveNotes.g:5756:2: rule__MultiChoice__Group__10__Impl rule__MultiChoice__Group__11
            {
            pushFollow(FOLLOW_38);
            rule__MultiChoice__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5763:1: rule__MultiChoice__Group__10__Impl : ( ( rule__MultiChoice__Group_10__0 )? ) ;
    public final void rule__MultiChoice__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5767:1: ( ( ( rule__MultiChoice__Group_10__0 )? ) )
            // InternalJoveNotes.g:5768:1: ( ( rule__MultiChoice__Group_10__0 )? )
            {
            // InternalJoveNotes.g:5768:1: ( ( rule__MultiChoice__Group_10__0 )? )
            // InternalJoveNotes.g:5769:1: ( rule__MultiChoice__Group_10__0 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_10()); 
            // InternalJoveNotes.g:5770:1: ( rule__MultiChoice__Group_10__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalJoveNotes.g:5770:2: rule__MultiChoice__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5780:1: rule__MultiChoice__Group__11 : rule__MultiChoice__Group__11__Impl rule__MultiChoice__Group__12 ;
    public final void rule__MultiChoice__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5784:1: ( rule__MultiChoice__Group__11__Impl rule__MultiChoice__Group__12 )
            // InternalJoveNotes.g:5785:2: rule__MultiChoice__Group__11__Impl rule__MultiChoice__Group__12
            {
            pushFollow(FOLLOW_38);
            rule__MultiChoice__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5792:1: rule__MultiChoice__Group__11__Impl : ( ( rule__MultiChoice__Group_11__0 )? ) ;
    public final void rule__MultiChoice__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5796:1: ( ( ( rule__MultiChoice__Group_11__0 )? ) )
            // InternalJoveNotes.g:5797:1: ( ( rule__MultiChoice__Group_11__0 )? )
            {
            // InternalJoveNotes.g:5797:1: ( ( rule__MultiChoice__Group_11__0 )? )
            // InternalJoveNotes.g:5798:1: ( rule__MultiChoice__Group_11__0 )?
            {
             before(grammarAccess.getMultiChoiceAccess().getGroup_11()); 
            // InternalJoveNotes.g:5799:1: ( rule__MultiChoice__Group_11__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJoveNotes.g:5799:2: rule__MultiChoice__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5809:1: rule__MultiChoice__Group__12 : rule__MultiChoice__Group__12__Impl ;
    public final void rule__MultiChoice__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5813:1: ( rule__MultiChoice__Group__12__Impl )
            // InternalJoveNotes.g:5814:2: rule__MultiChoice__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5820:1: rule__MultiChoice__Group__12__Impl : ( '}' ) ;
    public final void rule__MultiChoice__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5824:1: ( ( '}' ) )
            // InternalJoveNotes.g:5825:1: ( '}' )
            {
            // InternalJoveNotes.g:5825:1: ( '}' )
            // InternalJoveNotes.g:5826:1: '}'
            {
             before(grammarAccess.getMultiChoiceAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJoveNotes.g:5865:1: rule__MultiChoice__Group_7__0 : rule__MultiChoice__Group_7__0__Impl rule__MultiChoice__Group_7__1 ;
    public final void rule__MultiChoice__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5869:1: ( rule__MultiChoice__Group_7__0__Impl rule__MultiChoice__Group_7__1 )
            // InternalJoveNotes.g:5870:2: rule__MultiChoice__Group_7__0__Impl rule__MultiChoice__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoice__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5877:1: rule__MultiChoice__Group_7__0__Impl : ( ',' ) ;
    public final void rule__MultiChoice__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5881:1: ( ( ',' ) )
            // InternalJoveNotes.g:5882:1: ( ',' )
            {
            // InternalJoveNotes.g:5882:1: ( ',' )
            // InternalJoveNotes.g:5883:1: ','
            {
             before(grammarAccess.getMultiChoiceAccess().getCommaKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalJoveNotes.g:5896:1: rule__MultiChoice__Group_7__1 : rule__MultiChoice__Group_7__1__Impl ;
    public final void rule__MultiChoice__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5900:1: ( rule__MultiChoice__Group_7__1__Impl )
            // InternalJoveNotes.g:5901:2: rule__MultiChoice__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5907:1: rule__MultiChoice__Group_7__1__Impl : ( ( rule__MultiChoice__OptionsAssignment_7_1 ) ) ;
    public final void rule__MultiChoice__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5911:1: ( ( ( rule__MultiChoice__OptionsAssignment_7_1 ) ) )
            // InternalJoveNotes.g:5912:1: ( ( rule__MultiChoice__OptionsAssignment_7_1 ) )
            {
            // InternalJoveNotes.g:5912:1: ( ( rule__MultiChoice__OptionsAssignment_7_1 ) )
            // InternalJoveNotes.g:5913:1: ( rule__MultiChoice__OptionsAssignment_7_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsAssignment_7_1()); 
            // InternalJoveNotes.g:5914:1: ( rule__MultiChoice__OptionsAssignment_7_1 )
            // InternalJoveNotes.g:5914:2: rule__MultiChoice__OptionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5928:1: rule__MultiChoice__Group_9__0 : rule__MultiChoice__Group_9__0__Impl rule__MultiChoice__Group_9__1 ;
    public final void rule__MultiChoice__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5932:1: ( rule__MultiChoice__Group_9__0__Impl rule__MultiChoice__Group_9__1 )
            // InternalJoveNotes.g:5933:2: rule__MultiChoice__Group_9__0__Impl rule__MultiChoice__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoice__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5940:1: rule__MultiChoice__Group_9__0__Impl : ( '@numOptionsToShow' ) ;
    public final void rule__MultiChoice__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5944:1: ( ( '@numOptionsToShow' ) )
            // InternalJoveNotes.g:5945:1: ( '@numOptionsToShow' )
            {
            // InternalJoveNotes.g:5945:1: ( '@numOptionsToShow' )
            // InternalJoveNotes.g:5946:1: '@numOptionsToShow'
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalJoveNotes.g:5959:1: rule__MultiChoice__Group_9__1 : rule__MultiChoice__Group_9__1__Impl ;
    public final void rule__MultiChoice__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5963:1: ( rule__MultiChoice__Group_9__1__Impl )
            // InternalJoveNotes.g:5964:2: rule__MultiChoice__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5970:1: rule__MultiChoice__Group_9__1__Impl : ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) ) ;
    public final void rule__MultiChoice__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5974:1: ( ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) ) )
            // InternalJoveNotes.g:5975:1: ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) )
            {
            // InternalJoveNotes.g:5975:1: ( ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 ) )
            // InternalJoveNotes.g:5976:1: ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowAssignment_9_1()); 
            // InternalJoveNotes.g:5977:1: ( rule__MultiChoice__NumOptionsToShowAssignment_9_1 )
            // InternalJoveNotes.g:5977:2: rule__MultiChoice__NumOptionsToShowAssignment_9_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:5991:1: rule__MultiChoice__Group_10__0 : rule__MultiChoice__Group_10__0__Impl rule__MultiChoice__Group_10__1 ;
    public final void rule__MultiChoice__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:5995:1: ( rule__MultiChoice__Group_10__0__Impl rule__MultiChoice__Group_10__1 )
            // InternalJoveNotes.g:5996:2: rule__MultiChoice__Group_10__0__Impl rule__MultiChoice__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__MultiChoice__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6003:1: rule__MultiChoice__Group_10__0__Impl : ( '@numOptionsPerRow' ) ;
    public final void rule__MultiChoice__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6007:1: ( ( '@numOptionsPerRow' ) )
            // InternalJoveNotes.g:6008:1: ( '@numOptionsPerRow' )
            {
            // InternalJoveNotes.g:6008:1: ( '@numOptionsPerRow' )
            // InternalJoveNotes.g:6009:1: '@numOptionsPerRow'
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalJoveNotes.g:6022:1: rule__MultiChoice__Group_10__1 : rule__MultiChoice__Group_10__1__Impl ;
    public final void rule__MultiChoice__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6026:1: ( rule__MultiChoice__Group_10__1__Impl )
            // InternalJoveNotes.g:6027:2: rule__MultiChoice__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6033:1: rule__MultiChoice__Group_10__1__Impl : ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) ) ;
    public final void rule__MultiChoice__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6037:1: ( ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) ) )
            // InternalJoveNotes.g:6038:1: ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) )
            {
            // InternalJoveNotes.g:6038:1: ( ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 ) )
            // InternalJoveNotes.g:6039:1: ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowAssignment_10_1()); 
            // InternalJoveNotes.g:6040:1: ( rule__MultiChoice__NumOptionsPerRowAssignment_10_1 )
            // InternalJoveNotes.g:6040:2: rule__MultiChoice__NumOptionsPerRowAssignment_10_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6054:1: rule__MultiChoice__Group_11__0 : rule__MultiChoice__Group_11__0__Impl rule__MultiChoice__Group_11__1 ;
    public final void rule__MultiChoice__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6058:1: ( rule__MultiChoice__Group_11__0__Impl rule__MultiChoice__Group_11__1 )
            // InternalJoveNotes.g:6059:2: rule__MultiChoice__Group_11__0__Impl rule__MultiChoice__Group_11__1
            {
            pushFollow(FOLLOW_7);
            rule__MultiChoice__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6066:1: rule__MultiChoice__Group_11__0__Impl : ( '@explanation' ) ;
    public final void rule__MultiChoice__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6070:1: ( ( '@explanation' ) )
            // InternalJoveNotes.g:6071:1: ( '@explanation' )
            {
            // InternalJoveNotes.g:6071:1: ( '@explanation' )
            // InternalJoveNotes.g:6072:1: '@explanation'
            {
             before(grammarAccess.getMultiChoiceAccess().getExplanationKeyword_11_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalJoveNotes.g:6085:1: rule__MultiChoice__Group_11__1 : rule__MultiChoice__Group_11__1__Impl ;
    public final void rule__MultiChoice__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6089:1: ( rule__MultiChoice__Group_11__1__Impl )
            // InternalJoveNotes.g:6090:2: rule__MultiChoice__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6096:1: rule__MultiChoice__Group_11__1__Impl : ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) ) ;
    public final void rule__MultiChoice__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6100:1: ( ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) ) )
            // InternalJoveNotes.g:6101:1: ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) )
            {
            // InternalJoveNotes.g:6101:1: ( ( rule__MultiChoice__ExplanationAssignment_11_1 ) )
            // InternalJoveNotes.g:6102:1: ( rule__MultiChoice__ExplanationAssignment_11_1 )
            {
             before(grammarAccess.getMultiChoiceAccess().getExplanationAssignment_11_1()); 
            // InternalJoveNotes.g:6103:1: ( rule__MultiChoice__ExplanationAssignment_11_1 )
            // InternalJoveNotes.g:6103:2: rule__MultiChoice__ExplanationAssignment_11_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Exercise__Group__0"
    // InternalJoveNotes.g:6117:1: rule__Exercise__Group__0 : rule__Exercise__Group__0__Impl rule__Exercise__Group__1 ;
    public final void rule__Exercise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6121:1: ( rule__Exercise__Group__0__Impl rule__Exercise__Group__1 )
            // InternalJoveNotes.g:6122:2: rule__Exercise__Group__0__Impl rule__Exercise__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Exercise__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__0"


    // $ANTLR start "rule__Exercise__Group__0__Impl"
    // InternalJoveNotes.g:6129:1: rule__Exercise__Group__0__Impl : ( '@exercise' ) ;
    public final void rule__Exercise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6133:1: ( ( '@exercise' ) )
            // InternalJoveNotes.g:6134:1: ( '@exercise' )
            {
            // InternalJoveNotes.g:6134:1: ( '@exercise' )
            // InternalJoveNotes.g:6135:1: '@exercise'
            {
             before(grammarAccess.getExerciseAccess().getExerciseKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getExerciseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__0__Impl"


    // $ANTLR start "rule__Exercise__Group__1"
    // InternalJoveNotes.g:6148:1: rule__Exercise__Group__1 : rule__Exercise__Group__1__Impl rule__Exercise__Group__2 ;
    public final void rule__Exercise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6152:1: ( rule__Exercise__Group__1__Impl rule__Exercise__Group__2 )
            // InternalJoveNotes.g:6153:2: rule__Exercise__Group__1__Impl rule__Exercise__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Exercise__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__1"


    // $ANTLR start "rule__Exercise__Group__1__Impl"
    // InternalJoveNotes.g:6160:1: rule__Exercise__Group__1__Impl : ( ( rule__Exercise__HideFromViewAssignment_1 )? ) ;
    public final void rule__Exercise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6164:1: ( ( ( rule__Exercise__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:6165:1: ( ( rule__Exercise__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:6165:1: ( ( rule__Exercise__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:6166:1: ( rule__Exercise__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getExerciseAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:6167:1: ( rule__Exercise__HideFromViewAssignment_1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==58) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalJoveNotes.g:6167:2: rule__Exercise__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__1__Impl"


    // $ANTLR start "rule__Exercise__Group__2"
    // InternalJoveNotes.g:6177:1: rule__Exercise__Group__2 : rule__Exercise__Group__2__Impl rule__Exercise__Group__3 ;
    public final void rule__Exercise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6181:1: ( rule__Exercise__Group__2__Impl rule__Exercise__Group__3 )
            // InternalJoveNotes.g:6182:2: rule__Exercise__Group__2__Impl rule__Exercise__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Exercise__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__2"


    // $ANTLR start "rule__Exercise__Group__2__Impl"
    // InternalJoveNotes.g:6189:1: rule__Exercise__Group__2__Impl : ( ( rule__Exercise__Group_2__0 ) ) ;
    public final void rule__Exercise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6193:1: ( ( ( rule__Exercise__Group_2__0 ) ) )
            // InternalJoveNotes.g:6194:1: ( ( rule__Exercise__Group_2__0 ) )
            {
            // InternalJoveNotes.g:6194:1: ( ( rule__Exercise__Group_2__0 ) )
            // InternalJoveNotes.g:6195:1: ( rule__Exercise__Group_2__0 )
            {
             before(grammarAccess.getExerciseAccess().getGroup_2()); 
            // InternalJoveNotes.g:6196:1: ( rule__Exercise__Group_2__0 )
            // InternalJoveNotes.g:6196:2: rule__Exercise__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__2__Impl"


    // $ANTLR start "rule__Exercise__Group__3"
    // InternalJoveNotes.g:6206:1: rule__Exercise__Group__3 : rule__Exercise__Group__3__Impl rule__Exercise__Group__4 ;
    public final void rule__Exercise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6210:1: ( rule__Exercise__Group__3__Impl rule__Exercise__Group__4 )
            // InternalJoveNotes.g:6211:2: rule__Exercise__Group__3__Impl rule__Exercise__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Exercise__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__3"


    // $ANTLR start "rule__Exercise__Group__3__Impl"
    // InternalJoveNotes.g:6218:1: rule__Exercise__Group__3__Impl : ( ( rule__Exercise__QuestionAssignment_3 ) ) ;
    public final void rule__Exercise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6222:1: ( ( ( rule__Exercise__QuestionAssignment_3 ) ) )
            // InternalJoveNotes.g:6223:1: ( ( rule__Exercise__QuestionAssignment_3 ) )
            {
            // InternalJoveNotes.g:6223:1: ( ( rule__Exercise__QuestionAssignment_3 ) )
            // InternalJoveNotes.g:6224:1: ( rule__Exercise__QuestionAssignment_3 )
            {
             before(grammarAccess.getExerciseAccess().getQuestionAssignment_3()); 
            // InternalJoveNotes.g:6225:1: ( rule__Exercise__QuestionAssignment_3 )
            // InternalJoveNotes.g:6225:2: rule__Exercise__QuestionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__QuestionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getQuestionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__3__Impl"


    // $ANTLR start "rule__Exercise__Group__4"
    // InternalJoveNotes.g:6235:1: rule__Exercise__Group__4 : rule__Exercise__Group__4__Impl rule__Exercise__Group__5 ;
    public final void rule__Exercise__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6239:1: ( rule__Exercise__Group__4__Impl rule__Exercise__Group__5 )
            // InternalJoveNotes.g:6240:2: rule__Exercise__Group__4__Impl rule__Exercise__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__Exercise__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__4"


    // $ANTLR start "rule__Exercise__Group__4__Impl"
    // InternalJoveNotes.g:6247:1: rule__Exercise__Group__4__Impl : ( ( rule__Exercise__Group_4__0 )? ) ;
    public final void rule__Exercise__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6251:1: ( ( ( rule__Exercise__Group_4__0 )? ) )
            // InternalJoveNotes.g:6252:1: ( ( rule__Exercise__Group_4__0 )? )
            {
            // InternalJoveNotes.g:6252:1: ( ( rule__Exercise__Group_4__0 )? )
            // InternalJoveNotes.g:6253:1: ( rule__Exercise__Group_4__0 )?
            {
             before(grammarAccess.getExerciseAccess().getGroup_4()); 
            // InternalJoveNotes.g:6254:1: ( rule__Exercise__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalJoveNotes.g:6254:2: rule__Exercise__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__4__Impl"


    // $ANTLR start "rule__Exercise__Group__5"
    // InternalJoveNotes.g:6264:1: rule__Exercise__Group__5 : rule__Exercise__Group__5__Impl ;
    public final void rule__Exercise__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6268:1: ( rule__Exercise__Group__5__Impl )
            // InternalJoveNotes.g:6269:2: rule__Exercise__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__5"


    // $ANTLR start "rule__Exercise__Group__5__Impl"
    // InternalJoveNotes.g:6275:1: rule__Exercise__Group__5__Impl : ( ( rule__Exercise__Group_5__0 ) ) ;
    public final void rule__Exercise__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6279:1: ( ( ( rule__Exercise__Group_5__0 ) ) )
            // InternalJoveNotes.g:6280:1: ( ( rule__Exercise__Group_5__0 ) )
            {
            // InternalJoveNotes.g:6280:1: ( ( rule__Exercise__Group_5__0 ) )
            // InternalJoveNotes.g:6281:1: ( rule__Exercise__Group_5__0 )
            {
             before(grammarAccess.getExerciseAccess().getGroup_5()); 
            // InternalJoveNotes.g:6282:1: ( rule__Exercise__Group_5__0 )
            // InternalJoveNotes.g:6282:2: rule__Exercise__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__5__Impl"


    // $ANTLR start "rule__Exercise__Group_2__0"
    // InternalJoveNotes.g:6304:1: rule__Exercise__Group_2__0 : rule__Exercise__Group_2__0__Impl rule__Exercise__Group_2__1 ;
    public final void rule__Exercise__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6308:1: ( rule__Exercise__Group_2__0__Impl rule__Exercise__Group_2__1 )
            // InternalJoveNotes.g:6309:2: rule__Exercise__Group_2__0__Impl rule__Exercise__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Exercise__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__0"


    // $ANTLR start "rule__Exercise__Group_2__0__Impl"
    // InternalJoveNotes.g:6316:1: rule__Exercise__Group_2__0__Impl : ( 'marks' ) ;
    public final void rule__Exercise__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6320:1: ( ( 'marks' ) )
            // InternalJoveNotes.g:6321:1: ( 'marks' )
            {
            // InternalJoveNotes.g:6321:1: ( 'marks' )
            // InternalJoveNotes.g:6322:1: 'marks'
            {
             before(grammarAccess.getExerciseAccess().getMarksKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getMarksKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__0__Impl"


    // $ANTLR start "rule__Exercise__Group_2__1"
    // InternalJoveNotes.g:6335:1: rule__Exercise__Group_2__1 : rule__Exercise__Group_2__1__Impl rule__Exercise__Group_2__2 ;
    public final void rule__Exercise__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6339:1: ( rule__Exercise__Group_2__1__Impl rule__Exercise__Group_2__2 )
            // InternalJoveNotes.g:6340:2: rule__Exercise__Group_2__1__Impl rule__Exercise__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Exercise__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__1"


    // $ANTLR start "rule__Exercise__Group_2__1__Impl"
    // InternalJoveNotes.g:6347:1: rule__Exercise__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Exercise__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6351:1: ( ( '=' ) )
            // InternalJoveNotes.g:6352:1: ( '=' )
            {
            // InternalJoveNotes.g:6352:1: ( '=' )
            // InternalJoveNotes.g:6353:1: '='
            {
             before(grammarAccess.getExerciseAccess().getEqualsSignKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__1__Impl"


    // $ANTLR start "rule__Exercise__Group_2__2"
    // InternalJoveNotes.g:6366:1: rule__Exercise__Group_2__2 : rule__Exercise__Group_2__2__Impl ;
    public final void rule__Exercise__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6370:1: ( rule__Exercise__Group_2__2__Impl )
            // InternalJoveNotes.g:6371:2: rule__Exercise__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__2"


    // $ANTLR start "rule__Exercise__Group_2__2__Impl"
    // InternalJoveNotes.g:6377:1: rule__Exercise__Group_2__2__Impl : ( ( rule__Exercise__MarksAssignment_2_2 ) ) ;
    public final void rule__Exercise__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6381:1: ( ( ( rule__Exercise__MarksAssignment_2_2 ) ) )
            // InternalJoveNotes.g:6382:1: ( ( rule__Exercise__MarksAssignment_2_2 ) )
            {
            // InternalJoveNotes.g:6382:1: ( ( rule__Exercise__MarksAssignment_2_2 ) )
            // InternalJoveNotes.g:6383:1: ( rule__Exercise__MarksAssignment_2_2 )
            {
             before(grammarAccess.getExerciseAccess().getMarksAssignment_2_2()); 
            // InternalJoveNotes.g:6384:1: ( rule__Exercise__MarksAssignment_2_2 )
            // InternalJoveNotes.g:6384:2: rule__Exercise__MarksAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__MarksAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getMarksAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_2__2__Impl"


    // $ANTLR start "rule__Exercise__Group_4__0"
    // InternalJoveNotes.g:6400:1: rule__Exercise__Group_4__0 : rule__Exercise__Group_4__0__Impl rule__Exercise__Group_4__1 ;
    public final void rule__Exercise__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6404:1: ( rule__Exercise__Group_4__0__Impl rule__Exercise__Group_4__1 )
            // InternalJoveNotes.g:6405:2: rule__Exercise__Group_4__0__Impl rule__Exercise__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Exercise__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__0"


    // $ANTLR start "rule__Exercise__Group_4__0__Impl"
    // InternalJoveNotes.g:6412:1: rule__Exercise__Group_4__0__Impl : ( 'hints' ) ;
    public final void rule__Exercise__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6416:1: ( ( 'hints' ) )
            // InternalJoveNotes.g:6417:1: ( 'hints' )
            {
            // InternalJoveNotes.g:6417:1: ( 'hints' )
            // InternalJoveNotes.g:6418:1: 'hints'
            {
             before(grammarAccess.getExerciseAccess().getHintsKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getHintsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__0__Impl"


    // $ANTLR start "rule__Exercise__Group_4__1"
    // InternalJoveNotes.g:6431:1: rule__Exercise__Group_4__1 : rule__Exercise__Group_4__1__Impl rule__Exercise__Group_4__2 ;
    public final void rule__Exercise__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6435:1: ( rule__Exercise__Group_4__1__Impl rule__Exercise__Group_4__2 )
            // InternalJoveNotes.g:6436:2: rule__Exercise__Group_4__1__Impl rule__Exercise__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Exercise__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__1"


    // $ANTLR start "rule__Exercise__Group_4__1__Impl"
    // InternalJoveNotes.g:6443:1: rule__Exercise__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Exercise__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6447:1: ( ( '{' ) )
            // InternalJoveNotes.g:6448:1: ( '{' )
            {
            // InternalJoveNotes.g:6448:1: ( '{' )
            // InternalJoveNotes.g:6449:1: '{'
            {
             before(grammarAccess.getExerciseAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__1__Impl"


    // $ANTLR start "rule__Exercise__Group_4__2"
    // InternalJoveNotes.g:6462:1: rule__Exercise__Group_4__2 : rule__Exercise__Group_4__2__Impl rule__Exercise__Group_4__3 ;
    public final void rule__Exercise__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6466:1: ( rule__Exercise__Group_4__2__Impl rule__Exercise__Group_4__3 )
            // InternalJoveNotes.g:6467:2: rule__Exercise__Group_4__2__Impl rule__Exercise__Group_4__3
            {
            pushFollow(FOLLOW_27);
            rule__Exercise__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__2"


    // $ANTLR start "rule__Exercise__Group_4__2__Impl"
    // InternalJoveNotes.g:6474:1: rule__Exercise__Group_4__2__Impl : ( ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* ) ) ;
    public final void rule__Exercise__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6478:1: ( ( ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* ) ) )
            // InternalJoveNotes.g:6479:1: ( ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* ) )
            {
            // InternalJoveNotes.g:6479:1: ( ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* ) )
            // InternalJoveNotes.g:6480:1: ( ( rule__Exercise__HintsAssignment_4_2 ) ) ( ( rule__Exercise__HintsAssignment_4_2 )* )
            {
            // InternalJoveNotes.g:6480:1: ( ( rule__Exercise__HintsAssignment_4_2 ) )
            // InternalJoveNotes.g:6481:1: ( rule__Exercise__HintsAssignment_4_2 )
            {
             before(grammarAccess.getExerciseAccess().getHintsAssignment_4_2()); 
            // InternalJoveNotes.g:6482:1: ( rule__Exercise__HintsAssignment_4_2 )
            // InternalJoveNotes.g:6482:2: rule__Exercise__HintsAssignment_4_2
            {
            pushFollow(FOLLOW_16);
            rule__Exercise__HintsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getHintsAssignment_4_2()); 

            }

            // InternalJoveNotes.g:6485:1: ( ( rule__Exercise__HintsAssignment_4_2 )* )
            // InternalJoveNotes.g:6486:1: ( rule__Exercise__HintsAssignment_4_2 )*
            {
             before(grammarAccess.getExerciseAccess().getHintsAssignment_4_2()); 
            // InternalJoveNotes.g:6487:1: ( rule__Exercise__HintsAssignment_4_2 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_STRING) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalJoveNotes.g:6487:2: rule__Exercise__HintsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Exercise__HintsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getExerciseAccess().getHintsAssignment_4_2()); 

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
    // $ANTLR end "rule__Exercise__Group_4__2__Impl"


    // $ANTLR start "rule__Exercise__Group_4__3"
    // InternalJoveNotes.g:6498:1: rule__Exercise__Group_4__3 : rule__Exercise__Group_4__3__Impl ;
    public final void rule__Exercise__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6502:1: ( rule__Exercise__Group_4__3__Impl )
            // InternalJoveNotes.g:6503:2: rule__Exercise__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__3"


    // $ANTLR start "rule__Exercise__Group_4__3__Impl"
    // InternalJoveNotes.g:6509:1: rule__Exercise__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Exercise__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6513:1: ( ( '}' ) )
            // InternalJoveNotes.g:6514:1: ( '}' )
            {
            // InternalJoveNotes.g:6514:1: ( '}' )
            // InternalJoveNotes.g:6515:1: '}'
            {
             before(grammarAccess.getExerciseAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_4__3__Impl"


    // $ANTLR start "rule__Exercise__Group_5__0"
    // InternalJoveNotes.g:6536:1: rule__Exercise__Group_5__0 : rule__Exercise__Group_5__0__Impl rule__Exercise__Group_5__1 ;
    public final void rule__Exercise__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6540:1: ( rule__Exercise__Group_5__0__Impl rule__Exercise__Group_5__1 )
            // InternalJoveNotes.g:6541:2: rule__Exercise__Group_5__0__Impl rule__Exercise__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Exercise__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_5__0"


    // $ANTLR start "rule__Exercise__Group_5__0__Impl"
    // InternalJoveNotes.g:6548:1: rule__Exercise__Group_5__0__Impl : ( 'answer' ) ;
    public final void rule__Exercise__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6552:1: ( ( 'answer' ) )
            // InternalJoveNotes.g:6553:1: ( 'answer' )
            {
            // InternalJoveNotes.g:6553:1: ( 'answer' )
            // InternalJoveNotes.g:6554:1: 'answer'
            {
             before(grammarAccess.getExerciseAccess().getAnswerKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getAnswerKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_5__0__Impl"


    // $ANTLR start "rule__Exercise__Group_5__1"
    // InternalJoveNotes.g:6567:1: rule__Exercise__Group_5__1 : rule__Exercise__Group_5__1__Impl ;
    public final void rule__Exercise__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6571:1: ( rule__Exercise__Group_5__1__Impl )
            // InternalJoveNotes.g:6572:2: rule__Exercise__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_5__1"


    // $ANTLR start "rule__Exercise__Group_5__1__Impl"
    // InternalJoveNotes.g:6578:1: rule__Exercise__Group_5__1__Impl : ( ( rule__Exercise__AnswerAssignment_5_1 ) ) ;
    public final void rule__Exercise__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6582:1: ( ( ( rule__Exercise__AnswerAssignment_5_1 ) ) )
            // InternalJoveNotes.g:6583:1: ( ( rule__Exercise__AnswerAssignment_5_1 ) )
            {
            // InternalJoveNotes.g:6583:1: ( ( rule__Exercise__AnswerAssignment_5_1 ) )
            // InternalJoveNotes.g:6584:1: ( rule__Exercise__AnswerAssignment_5_1 )
            {
             before(grammarAccess.getExerciseAccess().getAnswerAssignment_5_1()); 
            // InternalJoveNotes.g:6585:1: ( rule__Exercise__AnswerAssignment_5_1 )
            // InternalJoveNotes.g:6585:2: rule__Exercise__AnswerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__AnswerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getAnswerAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group_5__1__Impl"


    // $ANTLR start "rule__VoiceToText__Group__0"
    // InternalJoveNotes.g:6599:1: rule__VoiceToText__Group__0 : rule__VoiceToText__Group__0__Impl rule__VoiceToText__Group__1 ;
    public final void rule__VoiceToText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6603:1: ( rule__VoiceToText__Group__0__Impl rule__VoiceToText__Group__1 )
            // InternalJoveNotes.g:6604:2: rule__VoiceToText__Group__0__Impl rule__VoiceToText__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__VoiceToText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__0"


    // $ANTLR start "rule__VoiceToText__Group__0__Impl"
    // InternalJoveNotes.g:6611:1: rule__VoiceToText__Group__0__Impl : ( '@voice2text' ) ;
    public final void rule__VoiceToText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6615:1: ( ( '@voice2text' ) )
            // InternalJoveNotes.g:6616:1: ( '@voice2text' )
            {
            // InternalJoveNotes.g:6616:1: ( '@voice2text' )
            // InternalJoveNotes.g:6617:1: '@voice2text'
            {
             before(grammarAccess.getVoiceToTextAccess().getVoice2textKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getVoiceToTextAccess().getVoice2textKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__0__Impl"


    // $ANTLR start "rule__VoiceToText__Group__1"
    // InternalJoveNotes.g:6630:1: rule__VoiceToText__Group__1 : rule__VoiceToText__Group__1__Impl rule__VoiceToText__Group__2 ;
    public final void rule__VoiceToText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6634:1: ( rule__VoiceToText__Group__1__Impl rule__VoiceToText__Group__2 )
            // InternalJoveNotes.g:6635:2: rule__VoiceToText__Group__1__Impl rule__VoiceToText__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__VoiceToText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__1"


    // $ANTLR start "rule__VoiceToText__Group__1__Impl"
    // InternalJoveNotes.g:6642:1: rule__VoiceToText__Group__1__Impl : ( ( rule__VoiceToText__HideFromViewAssignment_1 )? ) ;
    public final void rule__VoiceToText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6646:1: ( ( ( rule__VoiceToText__HideFromViewAssignment_1 )? ) )
            // InternalJoveNotes.g:6647:1: ( ( rule__VoiceToText__HideFromViewAssignment_1 )? )
            {
            // InternalJoveNotes.g:6647:1: ( ( rule__VoiceToText__HideFromViewAssignment_1 )? )
            // InternalJoveNotes.g:6648:1: ( rule__VoiceToText__HideFromViewAssignment_1 )?
            {
             before(grammarAccess.getVoiceToTextAccess().getHideFromViewAssignment_1()); 
            // InternalJoveNotes.g:6649:1: ( rule__VoiceToText__HideFromViewAssignment_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==58) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalJoveNotes.g:6649:2: rule__VoiceToText__HideFromViewAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VoiceToText__HideFromViewAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVoiceToTextAccess().getHideFromViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__1__Impl"


    // $ANTLR start "rule__VoiceToText__Group__2"
    // InternalJoveNotes.g:6659:1: rule__VoiceToText__Group__2 : rule__VoiceToText__Group__2__Impl rule__VoiceToText__Group__3 ;
    public final void rule__VoiceToText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6663:1: ( rule__VoiceToText__Group__2__Impl rule__VoiceToText__Group__3 )
            // InternalJoveNotes.g:6664:2: rule__VoiceToText__Group__2__Impl rule__VoiceToText__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__VoiceToText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__2"


    // $ANTLR start "rule__VoiceToText__Group__2__Impl"
    // InternalJoveNotes.g:6671:1: rule__VoiceToText__Group__2__Impl : ( ( rule__VoiceToText__ClipNameAssignment_2 ) ) ;
    public final void rule__VoiceToText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6675:1: ( ( ( rule__VoiceToText__ClipNameAssignment_2 ) ) )
            // InternalJoveNotes.g:6676:1: ( ( rule__VoiceToText__ClipNameAssignment_2 ) )
            {
            // InternalJoveNotes.g:6676:1: ( ( rule__VoiceToText__ClipNameAssignment_2 ) )
            // InternalJoveNotes.g:6677:1: ( rule__VoiceToText__ClipNameAssignment_2 )
            {
             before(grammarAccess.getVoiceToTextAccess().getClipNameAssignment_2()); 
            // InternalJoveNotes.g:6678:1: ( rule__VoiceToText__ClipNameAssignment_2 )
            // InternalJoveNotes.g:6678:2: rule__VoiceToText__ClipNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VoiceToText__ClipNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVoiceToTextAccess().getClipNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__2__Impl"


    // $ANTLR start "rule__VoiceToText__Group__3"
    // InternalJoveNotes.g:6688:1: rule__VoiceToText__Group__3 : rule__VoiceToText__Group__3__Impl ;
    public final void rule__VoiceToText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6692:1: ( rule__VoiceToText__Group__3__Impl )
            // InternalJoveNotes.g:6693:2: rule__VoiceToText__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoiceToText__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__3"


    // $ANTLR start "rule__VoiceToText__Group__3__Impl"
    // InternalJoveNotes.g:6699:1: rule__VoiceToText__Group__3__Impl : ( ( rule__VoiceToText__TextAssignment_3 ) ) ;
    public final void rule__VoiceToText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6703:1: ( ( ( rule__VoiceToText__TextAssignment_3 ) ) )
            // InternalJoveNotes.g:6704:1: ( ( rule__VoiceToText__TextAssignment_3 ) )
            {
            // InternalJoveNotes.g:6704:1: ( ( rule__VoiceToText__TextAssignment_3 ) )
            // InternalJoveNotes.g:6705:1: ( rule__VoiceToText__TextAssignment_3 )
            {
             before(grammarAccess.getVoiceToTextAccess().getTextAssignment_3()); 
            // InternalJoveNotes.g:6706:1: ( rule__VoiceToText__TextAssignment_3 )
            // InternalJoveNotes.g:6706:2: rule__VoiceToText__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VoiceToText__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVoiceToTextAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__Group__3__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // InternalJoveNotes.g:6724:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6728:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalJoveNotes.g:6729:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6736:1: rule__Option__Group__0__Impl : ( ( rule__Option__OptionValueAssignment_0 ) ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6740:1: ( ( ( rule__Option__OptionValueAssignment_0 ) ) )
            // InternalJoveNotes.g:6741:1: ( ( rule__Option__OptionValueAssignment_0 ) )
            {
            // InternalJoveNotes.g:6741:1: ( ( rule__Option__OptionValueAssignment_0 ) )
            // InternalJoveNotes.g:6742:1: ( rule__Option__OptionValueAssignment_0 )
            {
             before(grammarAccess.getOptionAccess().getOptionValueAssignment_0()); 
            // InternalJoveNotes.g:6743:1: ( rule__Option__OptionValueAssignment_0 )
            // InternalJoveNotes.g:6743:2: rule__Option__OptionValueAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6753:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6757:1: ( rule__Option__Group__1__Impl )
            // InternalJoveNotes.g:6758:2: rule__Option__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6764:1: rule__Option__Group__1__Impl : ( ( rule__Option__CorrectOptionAssignment_1 )? ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6768:1: ( ( ( rule__Option__CorrectOptionAssignment_1 )? ) )
            // InternalJoveNotes.g:6769:1: ( ( rule__Option__CorrectOptionAssignment_1 )? )
            {
            // InternalJoveNotes.g:6769:1: ( ( rule__Option__CorrectOptionAssignment_1 )? )
            // InternalJoveNotes.g:6770:1: ( rule__Option__CorrectOptionAssignment_1 )?
            {
             before(grammarAccess.getOptionAccess().getCorrectOptionAssignment_1()); 
            // InternalJoveNotes.g:6771:1: ( rule__Option__CorrectOptionAssignment_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==60) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJoveNotes.g:6771:2: rule__Option__CorrectOptionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6785:1: rule__CMap__Group__0 : rule__CMap__Group__0__Impl rule__CMap__Group__1 ;
    public final void rule__CMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6789:1: ( rule__CMap__Group__0__Impl rule__CMap__Group__1 )
            // InternalJoveNotes.g:6790:2: rule__CMap__Group__0__Impl rule__CMap__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__CMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6797:1: rule__CMap__Group__0__Impl : ( 'cmap' ) ;
    public final void rule__CMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6801:1: ( ( 'cmap' ) )
            // InternalJoveNotes.g:6802:1: ( 'cmap' )
            {
            // InternalJoveNotes.g:6802:1: ( 'cmap' )
            // InternalJoveNotes.g:6803:1: 'cmap'
            {
             before(grammarAccess.getCMapAccess().getCmapKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalJoveNotes.g:6816:1: rule__CMap__Group__1 : rule__CMap__Group__1__Impl rule__CMap__Group__2 ;
    public final void rule__CMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6820:1: ( rule__CMap__Group__1__Impl rule__CMap__Group__2 )
            // InternalJoveNotes.g:6821:2: rule__CMap__Group__1__Impl rule__CMap__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6828:1: rule__CMap__Group__1__Impl : ( '{' ) ;
    public final void rule__CMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6832:1: ( ( '{' ) )
            // InternalJoveNotes.g:6833:1: ( '{' )
            {
            // InternalJoveNotes.g:6833:1: ( '{' )
            // InternalJoveNotes.g:6834:1: '{'
            {
             before(grammarAccess.getCMapAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:6847:1: rule__CMap__Group__2 : rule__CMap__Group__2__Impl rule__CMap__Group__3 ;
    public final void rule__CMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6851:1: ( rule__CMap__Group__2__Impl rule__CMap__Group__3 )
            // InternalJoveNotes.g:6852:2: rule__CMap__Group__2__Impl rule__CMap__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__CMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6859:1: rule__CMap__Group__2__Impl : ( ( rule__CMap__ContentAssignment_2 ) ) ;
    public final void rule__CMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6863:1: ( ( ( rule__CMap__ContentAssignment_2 ) ) )
            // InternalJoveNotes.g:6864:1: ( ( rule__CMap__ContentAssignment_2 ) )
            {
            // InternalJoveNotes.g:6864:1: ( ( rule__CMap__ContentAssignment_2 ) )
            // InternalJoveNotes.g:6865:1: ( rule__CMap__ContentAssignment_2 )
            {
             before(grammarAccess.getCMapAccess().getContentAssignment_2()); 
            // InternalJoveNotes.g:6866:1: ( rule__CMap__ContentAssignment_2 )
            // InternalJoveNotes.g:6866:2: rule__CMap__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6876:1: rule__CMap__Group__3 : rule__CMap__Group__3__Impl ;
    public final void rule__CMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6880:1: ( rule__CMap__Group__3__Impl )
            // InternalJoveNotes.g:6881:2: rule__CMap__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6887:1: rule__CMap__Group__3__Impl : ( '}' ) ;
    public final void rule__CMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6891:1: ( ( '}' ) )
            // InternalJoveNotes.g:6892:1: ( '}' )
            {
            // InternalJoveNotes.g:6892:1: ( '}' )
            // InternalJoveNotes.g:6893:1: '}'
            {
             before(grammarAccess.getCMapAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJoveNotes.g:6914:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6918:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalJoveNotes.g:6919:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6926:1: rule__Script__Group__0__Impl : ( 'script_expressions' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6930:1: ( ( 'script_expressions' ) )
            // InternalJoveNotes.g:6931:1: ( 'script_expressions' )
            {
            // InternalJoveNotes.g:6931:1: ( 'script_expressions' )
            // InternalJoveNotes.g:6932:1: 'script_expressions'
            {
             before(grammarAccess.getScriptAccess().getScript_expressionsKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getScript_expressionsKeyword_0()); 

            }


            }

        }
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
    // InternalJoveNotes.g:6945:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6949:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // InternalJoveNotes.g:6950:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6957:1: rule__Script__Group__1__Impl : ( '{' ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6961:1: ( ( '{' ) )
            // InternalJoveNotes.g:6962:1: ( '{' )
            {
            // InternalJoveNotes.g:6962:1: ( '{' )
            // InternalJoveNotes.g:6963:1: '{'
            {
             before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJoveNotes.g:6976:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6980:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // InternalJoveNotes.g:6981:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Script__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:6988:1: rule__Script__Group__2__Impl : ( ( rule__Script__EvalVarsAssignment_2 ) ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:6992:1: ( ( ( rule__Script__EvalVarsAssignment_2 ) ) )
            // InternalJoveNotes.g:6993:1: ( ( rule__Script__EvalVarsAssignment_2 ) )
            {
            // InternalJoveNotes.g:6993:1: ( ( rule__Script__EvalVarsAssignment_2 ) )
            // InternalJoveNotes.g:6994:1: ( rule__Script__EvalVarsAssignment_2 )
            {
             before(grammarAccess.getScriptAccess().getEvalVarsAssignment_2()); 
            // InternalJoveNotes.g:6995:1: ( rule__Script__EvalVarsAssignment_2 )
            // InternalJoveNotes.g:6995:2: rule__Script__EvalVarsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Script__EvalVarsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getEvalVarsAssignment_2()); 

            }


            }

        }
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
    // InternalJoveNotes.g:7005:1: rule__Script__Group__3 : rule__Script__Group__3__Impl rule__Script__Group__4 ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7009:1: ( rule__Script__Group__3__Impl rule__Script__Group__4 )
            // InternalJoveNotes.g:7010:2: rule__Script__Group__3__Impl rule__Script__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Script__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__4();

            state._fsp--;


            }

        }
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
    // InternalJoveNotes.g:7017:1: rule__Script__Group__3__Impl : ( ( rule__Script__Group_3__0 )* ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7021:1: ( ( ( rule__Script__Group_3__0 )* ) )
            // InternalJoveNotes.g:7022:1: ( ( rule__Script__Group_3__0 )* )
            {
            // InternalJoveNotes.g:7022:1: ( ( rule__Script__Group_3__0 )* )
            // InternalJoveNotes.g:7023:1: ( rule__Script__Group_3__0 )*
            {
             before(grammarAccess.getScriptAccess().getGroup_3()); 
            // InternalJoveNotes.g:7024:1: ( rule__Script__Group_3__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==39) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalJoveNotes.g:7024:2: rule__Script__Group_3__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Script__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Script__Group__4"
    // InternalJoveNotes.g:7034:1: rule__Script__Group__4 : rule__Script__Group__4__Impl rule__Script__Group__5 ;
    public final void rule__Script__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7038:1: ( rule__Script__Group__4__Impl rule__Script__Group__5 )
            // InternalJoveNotes.g:7039:2: rule__Script__Group__4__Impl rule__Script__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Script__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4"


    // $ANTLR start "rule__Script__Group__4__Impl"
    // InternalJoveNotes.g:7046:1: rule__Script__Group__4__Impl : ( '}' ) ;
    public final void rule__Script__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7050:1: ( ( '}' ) )
            // InternalJoveNotes.g:7051:1: ( '}' )
            {
            // InternalJoveNotes.g:7051:1: ( '}' )
            // InternalJoveNotes.g:7052:1: '}'
            {
             before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4__Impl"


    // $ANTLR start "rule__Script__Group__5"
    // InternalJoveNotes.g:7065:1: rule__Script__Group__5 : rule__Script__Group__5__Impl ;
    public final void rule__Script__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7069:1: ( rule__Script__Group__5__Impl )
            // InternalJoveNotes.g:7070:2: rule__Script__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5"


    // $ANTLR start "rule__Script__Group__5__Impl"
    // InternalJoveNotes.g:7076:1: rule__Script__Group__5__Impl : ( ( rule__Script__ScriptBodyAssignment_5 )? ) ;
    public final void rule__Script__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7080:1: ( ( ( rule__Script__ScriptBodyAssignment_5 )? ) )
            // InternalJoveNotes.g:7081:1: ( ( rule__Script__ScriptBodyAssignment_5 )? )
            {
            // InternalJoveNotes.g:7081:1: ( ( rule__Script__ScriptBodyAssignment_5 )? )
            // InternalJoveNotes.g:7082:1: ( rule__Script__ScriptBodyAssignment_5 )?
            {
             before(grammarAccess.getScriptAccess().getScriptBodyAssignment_5()); 
            // InternalJoveNotes.g:7083:1: ( rule__Script__ScriptBodyAssignment_5 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==54) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalJoveNotes.g:7083:2: rule__Script__ScriptBodyAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Script__ScriptBodyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScriptAccess().getScriptBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5__Impl"


    // $ANTLR start "rule__Script__Group_3__0"
    // InternalJoveNotes.g:7105:1: rule__Script__Group_3__0 : rule__Script__Group_3__0__Impl rule__Script__Group_3__1 ;
    public final void rule__Script__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7109:1: ( rule__Script__Group_3__0__Impl rule__Script__Group_3__1 )
            // InternalJoveNotes.g:7110:2: rule__Script__Group_3__0__Impl rule__Script__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Script__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__0"


    // $ANTLR start "rule__Script__Group_3__0__Impl"
    // InternalJoveNotes.g:7117:1: rule__Script__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Script__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7121:1: ( ( ',' ) )
            // InternalJoveNotes.g:7122:1: ( ',' )
            {
            // InternalJoveNotes.g:7122:1: ( ',' )
            // InternalJoveNotes.g:7123:1: ','
            {
             before(grammarAccess.getScriptAccess().getCommaKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__0__Impl"


    // $ANTLR start "rule__Script__Group_3__1"
    // InternalJoveNotes.g:7136:1: rule__Script__Group_3__1 : rule__Script__Group_3__1__Impl ;
    public final void rule__Script__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7140:1: ( rule__Script__Group_3__1__Impl )
            // InternalJoveNotes.g:7141:2: rule__Script__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__1"


    // $ANTLR start "rule__Script__Group_3__1__Impl"
    // InternalJoveNotes.g:7147:1: rule__Script__Group_3__1__Impl : ( ( rule__Script__EvalVarsAssignment_3_1 ) ) ;
    public final void rule__Script__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7151:1: ( ( ( rule__Script__EvalVarsAssignment_3_1 ) ) )
            // InternalJoveNotes.g:7152:1: ( ( rule__Script__EvalVarsAssignment_3_1 ) )
            {
            // InternalJoveNotes.g:7152:1: ( ( rule__Script__EvalVarsAssignment_3_1 ) )
            // InternalJoveNotes.g:7153:1: ( rule__Script__EvalVarsAssignment_3_1 )
            {
             before(grammarAccess.getScriptAccess().getEvalVarsAssignment_3_1()); 
            // InternalJoveNotes.g:7154:1: ( rule__Script__EvalVarsAssignment_3_1 )
            // InternalJoveNotes.g:7154:2: rule__Script__EvalVarsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Script__EvalVarsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getEvalVarsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__1__Impl"


    // $ANTLR start "rule__EvalVar__Group__0"
    // InternalJoveNotes.g:7168:1: rule__EvalVar__Group__0 : rule__EvalVar__Group__0__Impl rule__EvalVar__Group__1 ;
    public final void rule__EvalVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7172:1: ( rule__EvalVar__Group__0__Impl rule__EvalVar__Group__1 )
            // InternalJoveNotes.g:7173:2: rule__EvalVar__Group__0__Impl rule__EvalVar__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EvalVar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvalVar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__0"


    // $ANTLR start "rule__EvalVar__Group__0__Impl"
    // InternalJoveNotes.g:7180:1: rule__EvalVar__Group__0__Impl : ( ( rule__EvalVar__VarNameAssignment_0 ) ) ;
    public final void rule__EvalVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7184:1: ( ( ( rule__EvalVar__VarNameAssignment_0 ) ) )
            // InternalJoveNotes.g:7185:1: ( ( rule__EvalVar__VarNameAssignment_0 ) )
            {
            // InternalJoveNotes.g:7185:1: ( ( rule__EvalVar__VarNameAssignment_0 ) )
            // InternalJoveNotes.g:7186:1: ( rule__EvalVar__VarNameAssignment_0 )
            {
             before(grammarAccess.getEvalVarAccess().getVarNameAssignment_0()); 
            // InternalJoveNotes.g:7187:1: ( rule__EvalVar__VarNameAssignment_0 )
            // InternalJoveNotes.g:7187:2: rule__EvalVar__VarNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EvalVar__VarNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvalVarAccess().getVarNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__0__Impl"


    // $ANTLR start "rule__EvalVar__Group__1"
    // InternalJoveNotes.g:7197:1: rule__EvalVar__Group__1 : rule__EvalVar__Group__1__Impl rule__EvalVar__Group__2 ;
    public final void rule__EvalVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7201:1: ( rule__EvalVar__Group__1__Impl rule__EvalVar__Group__2 )
            // InternalJoveNotes.g:7202:2: rule__EvalVar__Group__1__Impl rule__EvalVar__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EvalVar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvalVar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__1"


    // $ANTLR start "rule__EvalVar__Group__1__Impl"
    // InternalJoveNotes.g:7209:1: rule__EvalVar__Group__1__Impl : ( '=' ) ;
    public final void rule__EvalVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7213:1: ( ( '=' ) )
            // InternalJoveNotes.g:7214:1: ( '=' )
            {
            // InternalJoveNotes.g:7214:1: ( '=' )
            // InternalJoveNotes.g:7215:1: '='
            {
             before(grammarAccess.getEvalVarAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvalVarAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__1__Impl"


    // $ANTLR start "rule__EvalVar__Group__2"
    // InternalJoveNotes.g:7228:1: rule__EvalVar__Group__2 : rule__EvalVar__Group__2__Impl ;
    public final void rule__EvalVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7232:1: ( rule__EvalVar__Group__2__Impl )
            // InternalJoveNotes.g:7233:2: rule__EvalVar__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvalVar__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__2"


    // $ANTLR start "rule__EvalVar__Group__2__Impl"
    // InternalJoveNotes.g:7239:1: rule__EvalVar__Group__2__Impl : ( ( rule__EvalVar__VarExpressionAssignment_2 ) ) ;
    public final void rule__EvalVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7243:1: ( ( ( rule__EvalVar__VarExpressionAssignment_2 ) ) )
            // InternalJoveNotes.g:7244:1: ( ( rule__EvalVar__VarExpressionAssignment_2 ) )
            {
            // InternalJoveNotes.g:7244:1: ( ( rule__EvalVar__VarExpressionAssignment_2 ) )
            // InternalJoveNotes.g:7245:1: ( rule__EvalVar__VarExpressionAssignment_2 )
            {
             before(grammarAccess.getEvalVarAccess().getVarExpressionAssignment_2()); 
            // InternalJoveNotes.g:7246:1: ( rule__EvalVar__VarExpressionAssignment_2 )
            // InternalJoveNotes.g:7246:2: rule__EvalVar__VarExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvalVar__VarExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvalVarAccess().getVarExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__Group__2__Impl"


    // $ANTLR start "rule__ScriptBody__Group__0"
    // InternalJoveNotes.g:7262:1: rule__ScriptBody__Group__0 : rule__ScriptBody__Group__0__Impl rule__ScriptBody__Group__1 ;
    public final void rule__ScriptBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7266:1: ( rule__ScriptBody__Group__0__Impl rule__ScriptBody__Group__1 )
            // InternalJoveNotes.g:7267:2: rule__ScriptBody__Group__0__Impl rule__ScriptBody__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ScriptBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__0"


    // $ANTLR start "rule__ScriptBody__Group__0__Impl"
    // InternalJoveNotes.g:7274:1: rule__ScriptBody__Group__0__Impl : ( 'script' ) ;
    public final void rule__ScriptBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7278:1: ( ( 'script' ) )
            // InternalJoveNotes.g:7279:1: ( 'script' )
            {
            // InternalJoveNotes.g:7279:1: ( 'script' )
            // InternalJoveNotes.g:7280:1: 'script'
            {
             before(grammarAccess.getScriptBodyAccess().getScriptKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getScriptBodyAccess().getScriptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__0__Impl"


    // $ANTLR start "rule__ScriptBody__Group__1"
    // InternalJoveNotes.g:7293:1: rule__ScriptBody__Group__1 : rule__ScriptBody__Group__1__Impl rule__ScriptBody__Group__2 ;
    public final void rule__ScriptBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7297:1: ( rule__ScriptBody__Group__1__Impl rule__ScriptBody__Group__2 )
            // InternalJoveNotes.g:7298:2: rule__ScriptBody__Group__1__Impl rule__ScriptBody__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ScriptBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__1"


    // $ANTLR start "rule__ScriptBody__Group__1__Impl"
    // InternalJoveNotes.g:7305:1: rule__ScriptBody__Group__1__Impl : ( '{' ) ;
    public final void rule__ScriptBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7309:1: ( ( '{' ) )
            // InternalJoveNotes.g:7310:1: ( '{' )
            {
            // InternalJoveNotes.g:7310:1: ( '{' )
            // InternalJoveNotes.g:7311:1: '{'
            {
             before(grammarAccess.getScriptBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getScriptBodyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__1__Impl"


    // $ANTLR start "rule__ScriptBody__Group__2"
    // InternalJoveNotes.g:7324:1: rule__ScriptBody__Group__2 : rule__ScriptBody__Group__2__Impl rule__ScriptBody__Group__3 ;
    public final void rule__ScriptBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7328:1: ( rule__ScriptBody__Group__2__Impl rule__ScriptBody__Group__3 )
            // InternalJoveNotes.g:7329:2: rule__ScriptBody__Group__2__Impl rule__ScriptBody__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ScriptBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__2"


    // $ANTLR start "rule__ScriptBody__Group__2__Impl"
    // InternalJoveNotes.g:7336:1: rule__ScriptBody__Group__2__Impl : ( ( rule__ScriptBody__ScriptAssignment_2 ) ) ;
    public final void rule__ScriptBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7340:1: ( ( ( rule__ScriptBody__ScriptAssignment_2 ) ) )
            // InternalJoveNotes.g:7341:1: ( ( rule__ScriptBody__ScriptAssignment_2 ) )
            {
            // InternalJoveNotes.g:7341:1: ( ( rule__ScriptBody__ScriptAssignment_2 ) )
            // InternalJoveNotes.g:7342:1: ( rule__ScriptBody__ScriptAssignment_2 )
            {
             before(grammarAccess.getScriptBodyAccess().getScriptAssignment_2()); 
            // InternalJoveNotes.g:7343:1: ( rule__ScriptBody__ScriptAssignment_2 )
            // InternalJoveNotes.g:7343:2: rule__ScriptBody__ScriptAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScriptBody__ScriptAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScriptBodyAccess().getScriptAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__2__Impl"


    // $ANTLR start "rule__ScriptBody__Group__3"
    // InternalJoveNotes.g:7353:1: rule__ScriptBody__Group__3 : rule__ScriptBody__Group__3__Impl ;
    public final void rule__ScriptBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7357:1: ( rule__ScriptBody__Group__3__Impl )
            // InternalJoveNotes.g:7358:2: rule__ScriptBody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScriptBody__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__3"


    // $ANTLR start "rule__ScriptBody__Group__3__Impl"
    // InternalJoveNotes.g:7364:1: rule__ScriptBody__Group__3__Impl : ( '}' ) ;
    public final void rule__ScriptBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7368:1: ( ( '}' ) )
            // InternalJoveNotes.g:7369:1: ( '}' )
            {
            // InternalJoveNotes.g:7369:1: ( '}' )
            // InternalJoveNotes.g:7370:1: '}'
            {
             before(grammarAccess.getScriptBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getScriptBodyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__Group__3__Impl"


    // $ANTLR start "rule__JoveNotes__ProcessingHintsAssignment_0"
    // InternalJoveNotes.g:7392:1: rule__JoveNotes__ProcessingHintsAssignment_0 : ( ruleProcessingHints ) ;
    public final void rule__JoveNotes__ProcessingHintsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7396:1: ( ( ruleProcessingHints ) )
            // InternalJoveNotes.g:7397:1: ( ruleProcessingHints )
            {
            // InternalJoveNotes.g:7397:1: ( ruleProcessingHints )
            // InternalJoveNotes.g:7398:1: ruleProcessingHints
            {
             before(grammarAccess.getJoveNotesAccess().getProcessingHintsProcessingHintsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:7407:1: rule__JoveNotes__ChapterDetailsAssignment_1 : ( ruleChapterDetails ) ;
    public final void rule__JoveNotes__ChapterDetailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7411:1: ( ( ruleChapterDetails ) )
            // InternalJoveNotes.g:7412:1: ( ruleChapterDetails )
            {
            // InternalJoveNotes.g:7412:1: ( ruleChapterDetails )
            // InternalJoveNotes.g:7413:1: ruleChapterDetails
            {
             before(grammarAccess.getJoveNotesAccess().getChapterDetailsChapterDetailsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:7422:1: rule__JoveNotes__NotesElementsAssignment_2 : ( ruleNotesElement ) ;
    public final void rule__JoveNotes__NotesElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7426:1: ( ( ruleNotesElement ) )
            // InternalJoveNotes.g:7427:1: ( ruleNotesElement )
            {
            // InternalJoveNotes.g:7427:1: ( ruleNotesElement )
            // InternalJoveNotes.g:7428:1: ruleNotesElement
            {
             before(grammarAccess.getJoveNotesAccess().getNotesElementsNotesElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:7437:1: rule__ProcessingHints__SkipGenerationAssignment_1 : ( ( '@skip_generation' ) ) ;
    public final void rule__ProcessingHints__SkipGenerationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7441:1: ( ( ( '@skip_generation' ) ) )
            // InternalJoveNotes.g:7442:1: ( ( '@skip_generation' ) )
            {
            // InternalJoveNotes.g:7442:1: ( ( '@skip_generation' ) )
            // InternalJoveNotes.g:7443:1: ( '@skip_generation' )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 
            // InternalJoveNotes.g:7444:1: ( '@skip_generation' )
            // InternalJoveNotes.g:7445:1: '@skip_generation'
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationSkip_generationKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalJoveNotes.g:7460:1: rule__ProcessingHints__SkipGenerationInProductionAssignment_2 : ( ( '@skip_generation_in_production' ) ) ;
    public final void rule__ProcessingHints__SkipGenerationInProductionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7464:1: ( ( ( '@skip_generation_in_production' ) ) )
            // InternalJoveNotes.g:7465:1: ( ( '@skip_generation_in_production' ) )
            {
            // InternalJoveNotes.g:7465:1: ( ( '@skip_generation_in_production' ) )
            // InternalJoveNotes.g:7466:1: ( '@skip_generation_in_production' )
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 
            // InternalJoveNotes.g:7467:1: ( '@skip_generation_in_production' )
            // InternalJoveNotes.g:7468:1: '@skip_generation_in_production'
            {
             before(grammarAccess.getProcessingHintsAccess().getSkipGenerationInProductionSkip_generation_in_productionKeyword_2_0()); 
            match(input,56,FOLLOW_2); 
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


    // $ANTLR start "rule__ChapterDetails__ExerciseBankAssignment_0"
    // InternalJoveNotes.g:7483:1: rule__ChapterDetails__ExerciseBankAssignment_0 : ( ( '@exercise_bank' ) ) ;
    public final void rule__ChapterDetails__ExerciseBankAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7487:1: ( ( ( '@exercise_bank' ) ) )
            // InternalJoveNotes.g:7488:1: ( ( '@exercise_bank' ) )
            {
            // InternalJoveNotes.g:7488:1: ( ( '@exercise_bank' ) )
            // InternalJoveNotes.g:7489:1: ( '@exercise_bank' )
            {
             before(grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0()); 
            // InternalJoveNotes.g:7490:1: ( '@exercise_bank' )
            // InternalJoveNotes.g:7491:1: '@exercise_bank'
            {
             before(grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0()); 

            }

             after(grammarAccess.getChapterDetailsAccess().getExerciseBankExercise_bankKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__ExerciseBankAssignment_0"


    // $ANTLR start "rule__ChapterDetails__SubjectNameAssignment_2"
    // InternalJoveNotes.g:7506:1: rule__ChapterDetails__SubjectNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__SubjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7510:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7511:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7511:1: ( RULE_STRING )
            // InternalJoveNotes.g:7512:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getSubjectNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7521:1: rule__ChapterDetails__ChapterNumberAssignment_4 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__ChapterNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7525:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:7526:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:7526:1: ( RULE_INT )
            // InternalJoveNotes.g:7527:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNumberINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalJoveNotes.g:7536:1: rule__ChapterDetails__SubChapterNumberAssignment_6 : ( RULE_INT ) ;
    public final void rule__ChapterDetails__SubChapterNumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7540:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:7541:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:7541:1: ( RULE_INT )
            // InternalJoveNotes.g:7542:1: RULE_INT
            {
             before(grammarAccess.getChapterDetailsAccess().getSubChapterNumberINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalJoveNotes.g:7551:1: rule__ChapterDetails__ChapterNameAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ChapterDetails__ChapterNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7555:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7556:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7556:1: ( RULE_STRING )
            // InternalJoveNotes.g:7557:1: RULE_STRING
            {
             before(grammarAccess.getChapterDetailsAccess().getChapterNameSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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


    // $ANTLR start "rule__ChapterDetails__ScriptBodyAssignment_9"
    // InternalJoveNotes.g:7566:1: rule__ChapterDetails__ScriptBodyAssignment_9 : ( ruleScriptBody ) ;
    public final void rule__ChapterDetails__ScriptBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7570:1: ( ( ruleScriptBody ) )
            // InternalJoveNotes.g:7571:1: ( ruleScriptBody )
            {
            // InternalJoveNotes.g:7571:1: ( ruleScriptBody )
            // InternalJoveNotes.g:7572:1: ruleScriptBody
            {
             before(grammarAccess.getChapterDetailsAccess().getScriptBodyScriptBodyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleScriptBody();

            state._fsp--;

             after(grammarAccess.getChapterDetailsAccess().getScriptBodyScriptBodyParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChapterDetails__ScriptBodyAssignment_9"


    // $ANTLR start "rule__NotesElement__ScriptAssignment_1"
    // InternalJoveNotes.g:7581:1: rule__NotesElement__ScriptAssignment_1 : ( ruleScript ) ;
    public final void rule__NotesElement__ScriptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7585:1: ( ( ruleScript ) )
            // InternalJoveNotes.g:7586:1: ( ruleScript )
            {
            // InternalJoveNotes.g:7586:1: ( ruleScript )
            // InternalJoveNotes.g:7587:1: ruleScript
            {
             before(grammarAccess.getNotesElementAccess().getScriptScriptParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:7596:1: rule__WordMeaning__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__WordMeaning__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7600:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7601:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7601:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7602:1: ( 'hide' )
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7603:1: ( 'hide' )
            // InternalJoveNotes.g:7604:1: 'hide'
            {
             before(grammarAccess.getWordMeaningAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:7619:1: rule__WordMeaning__WordAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__WordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7623:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7624:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7624:1: ( RULE_STRING )
            // InternalJoveNotes.g:7625:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7634:1: rule__WordMeaning__MeaningAssignment_3 : ( RULE_STRING ) ;
    public final void rule__WordMeaning__MeaningAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7638:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7639:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7639:1: ( RULE_STRING )
            // InternalJoveNotes.g:7640:1: RULE_STRING
            {
             before(grammarAccess.getWordMeaningAccess().getMeaningSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7649:1: rule__QuestionAnswer__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__QuestionAnswer__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7653:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7654:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7654:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7655:1: ( 'hide' )
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7656:1: ( 'hide' )
            // InternalJoveNotes.g:7657:1: 'hide'
            {
             before(grammarAccess.getQuestionAnswerAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:7672:1: rule__QuestionAnswer__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7676:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7677:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7677:1: ( RULE_STRING )
            // InternalJoveNotes.g:7678:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7687:1: rule__QuestionAnswer__AnswerPartsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__QuestionAnswer__AnswerPartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7691:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7692:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7692:1: ( RULE_STRING )
            // InternalJoveNotes.g:7693:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAnswerAccess().getAnswerPartsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7702:1: rule__QuestionAnswer__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__QuestionAnswer__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7706:1: ( ( ruleCMap ) )
            // InternalJoveNotes.g:7707:1: ( ruleCMap )
            {
            // InternalJoveNotes.g:7707:1: ( ruleCMap )
            // InternalJoveNotes.g:7708:1: ruleCMap
            {
             before(grammarAccess.getQuestionAnswerAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:7717:1: rule__FIB__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__FIB__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7721:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7722:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7722:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7723:1: ( 'hide' )
            {
             before(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7724:1: ( 'hide' )
            // InternalJoveNotes.g:7725:1: 'hide'
            {
             before(grammarAccess.getFIBAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:7740:1: rule__FIB__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FIB__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7744:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7745:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7745:1: ( RULE_STRING )
            // InternalJoveNotes.g:7746:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7755:1: rule__FIB__AnswersAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FIB__AnswersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7759:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7760:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7760:1: ( RULE_STRING )
            // InternalJoveNotes.g:7761:1: RULE_STRING
            {
             before(grammarAccess.getFIBAccess().getAnswersSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7770:1: rule__Definition__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Definition__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7774:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7775:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7775:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7776:1: ( 'hide' )
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7777:1: ( 'hide' )
            // InternalJoveNotes.g:7778:1: 'hide'
            {
             before(grammarAccess.getDefinitionAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:7793:1: rule__Definition__TermAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Definition__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7797:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7798:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7798:1: ( RULE_STRING )
            // InternalJoveNotes.g:7799:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getTermSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7808:1: rule__Definition__DefinitionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Definition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7812:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7813:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7813:1: ( RULE_STRING )
            // InternalJoveNotes.g:7814:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getDefinitionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7823:1: rule__Definition__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__Definition__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7827:1: ( ( ruleCMap ) )
            // InternalJoveNotes.g:7828:1: ( ruleCMap )
            {
            // InternalJoveNotes.g:7828:1: ( ruleCMap )
            // InternalJoveNotes.g:7829:1: ruleCMap
            {
             before(grammarAccess.getDefinitionAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:7838:1: rule__Character__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Character__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7842:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7843:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7843:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7844:1: ( 'hide' )
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7845:1: ( 'hide' )
            // InternalJoveNotes.g:7846:1: 'hide'
            {
             before(grammarAccess.getCharacterAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:7861:1: rule__Character__CharacterAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Character__CharacterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7865:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7866:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7866:1: ( RULE_STRING )
            // InternalJoveNotes.g:7867:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getCharacterSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7876:1: rule__Character__EstimateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Character__EstimateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7880:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7881:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7881:1: ( RULE_STRING )
            // InternalJoveNotes.g:7882:1: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getEstimateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7891:1: rule__Character__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__Character__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7895:1: ( ( ruleCMap ) )
            // InternalJoveNotes.g:7896:1: ( ruleCMap )
            {
            // InternalJoveNotes.g:7896:1: ( ruleCMap )
            // InternalJoveNotes.g:7897:1: ruleCMap
            {
             before(grammarAccess.getCharacterAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:7906:1: rule__TeacherNote__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__TeacherNote__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7910:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7911:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7911:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7912:1: ( 'hide' )
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7913:1: ( 'hide' )
            // InternalJoveNotes.g:7914:1: 'hide'
            {
             before(grammarAccess.getTeacherNoteAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:7929:1: rule__TeacherNote__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TeacherNote__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7933:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7934:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7934:1: ( RULE_STRING )
            // InternalJoveNotes.g:7935:1: RULE_STRING
            {
             before(grammarAccess.getTeacherNoteAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7944:1: rule__TeacherNote__NoteAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TeacherNote__NoteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7948:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:7949:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:7949:1: ( RULE_STRING )
            // InternalJoveNotes.g:7950:1: RULE_STRING
            {
             before(grammarAccess.getTeacherNoteAccess().getNoteSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:7959:1: rule__TeacherNote__CmapAssignment_4 : ( ruleCMap ) ;
    public final void rule__TeacherNote__CmapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7963:1: ( ( ruleCMap ) )
            // InternalJoveNotes.g:7964:1: ( ruleCMap )
            {
            // InternalJoveNotes.g:7964:1: ( ruleCMap )
            // InternalJoveNotes.g:7965:1: ruleCMap
            {
             before(grammarAccess.getTeacherNoteAccess().getCmapCMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:7974:1: rule__Matching__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Matching__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:7978:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:7979:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:7979:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:7980:1: ( 'hide' )
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:7981:1: ( 'hide' )
            // InternalJoveNotes.g:7982:1: 'hide'
            {
             before(grammarAccess.getMatchingAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:7997:1: rule__Matching__SkipReverseQuestionAssignment_2 : ( ( 'skip_reverse_question' ) ) ;
    public final void rule__Matching__SkipReverseQuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8001:1: ( ( ( 'skip_reverse_question' ) ) )
            // InternalJoveNotes.g:8002:1: ( ( 'skip_reverse_question' ) )
            {
            // InternalJoveNotes.g:8002:1: ( ( 'skip_reverse_question' ) )
            // InternalJoveNotes.g:8003:1: ( 'skip_reverse_question' )
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 
            // InternalJoveNotes.g:8004:1: ( 'skip_reverse_question' )
            // InternalJoveNotes.g:8005:1: 'skip_reverse_question'
            {
             before(grammarAccess.getMatchingAccess().getSkipReverseQuestionSkip_reverse_questionKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalJoveNotes.g:8020:1: rule__Matching__QuestionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Matching__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8024:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8025:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8025:1: ( RULE_STRING )
            // InternalJoveNotes.g:8026:1: RULE_STRING
            {
             before(grammarAccess.getMatchingAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8035:1: rule__Matching__PairsAssignment_5 : ( ruleMatchPair ) ;
    public final void rule__Matching__PairsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8039:1: ( ( ruleMatchPair ) )
            // InternalJoveNotes.g:8040:1: ( ruleMatchPair )
            {
            // InternalJoveNotes.g:8040:1: ( ruleMatchPair )
            // InternalJoveNotes.g:8041:1: ruleMatchPair
            {
             before(grammarAccess.getMatchingAccess().getPairsMatchPairParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:8050:1: rule__Matching__McqConfigAssignment_6 : ( ruleMatchMCQConfig ) ;
    public final void rule__Matching__McqConfigAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8054:1: ( ( ruleMatchMCQConfig ) )
            // InternalJoveNotes.g:8055:1: ( ruleMatchMCQConfig )
            {
            // InternalJoveNotes.g:8055:1: ( ruleMatchMCQConfig )
            // InternalJoveNotes.g:8056:1: ruleMatchMCQConfig
            {
             before(grammarAccess.getMatchingAccess().getMcqConfigMatchMCQConfigParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:8065:1: rule__MatchPair__MatchQuestionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchQuestionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8069:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8070:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8070:1: ( RULE_STRING )
            // InternalJoveNotes.g:8071:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchQuestionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8080:1: rule__MatchPair__MatchAnswerAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MatchPair__MatchAnswerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8084:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8085:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8085:1: ( RULE_STRING )
            // InternalJoveNotes.g:8086:1: RULE_STRING
            {
             before(grammarAccess.getMatchPairAccess().getMatchAnswerSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8095:1: rule__MatchMCQConfig__ForwardCaptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MatchMCQConfig__ForwardCaptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8099:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8100:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8100:1: ( RULE_STRING )
            // InternalJoveNotes.g:8101:1: RULE_STRING
            {
             before(grammarAccess.getMatchMCQConfigAccess().getForwardCaptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8110:1: rule__MatchMCQConfig__ReverseCaptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__MatchMCQConfig__ReverseCaptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8114:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8115:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8115:1: ( RULE_STRING )
            // InternalJoveNotes.g:8116:1: RULE_STRING
            {
             before(grammarAccess.getMatchMCQConfigAccess().getReverseCaptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8125:1: rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__MatchMCQConfig__NumOptionsToShowAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8129:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8130:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8130:1: ( RULE_INT )
            // InternalJoveNotes.g:8131:1: RULE_INT
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsToShowINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalJoveNotes.g:8140:1: rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__MatchMCQConfig__NumOptionsPerRowAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8144:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8145:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8145:1: ( RULE_INT )
            // InternalJoveNotes.g:8146:1: RULE_INT
            {
             before(grammarAccess.getMatchMCQConfigAccess().getNumOptionsPerRowINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalJoveNotes.g:8155:1: rule__Event__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Event__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8159:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8160:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8160:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8161:1: ( 'hide' )
            {
             before(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8162:1: ( 'hide' )
            // InternalJoveNotes.g:8163:1: 'hide'
            {
             before(grammarAccess.getEventAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:8178:1: rule__Event__EventAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Event__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8182:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8183:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8183:1: ( RULE_STRING )
            // InternalJoveNotes.g:8184:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8193:1: rule__Event__TimeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Event__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8197:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8198:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8198:1: ( RULE_STRING )
            // InternalJoveNotes.g:8199:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getTimeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8208:1: rule__TrueFalse__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__TrueFalse__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8212:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8213:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8213:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8214:1: ( 'hide' )
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8215:1: ( 'hide' )
            // InternalJoveNotes.g:8216:1: 'hide'
            {
             before(grammarAccess.getTrueFalseAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:8231:1: rule__TrueFalse__StatementAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8235:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8236:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8236:1: ( RULE_STRING )
            // InternalJoveNotes.g:8237:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getStatementSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8246:1: rule__TrueFalse__TruthValueAssignment_3 : ( RULE_BOOL ) ;
    public final void rule__TrueFalse__TruthValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8250:1: ( ( RULE_BOOL ) )
            // InternalJoveNotes.g:8251:1: ( RULE_BOOL )
            {
            // InternalJoveNotes.g:8251:1: ( RULE_BOOL )
            // InternalJoveNotes.g:8252:1: RULE_BOOL
            {
             before(grammarAccess.getTrueFalseAccess().getTruthValueBOOLTerminalRuleCall_3_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
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
    // InternalJoveNotes.g:8261:1: rule__TrueFalse__JustificationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__TrueFalse__JustificationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8265:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8266:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8266:1: ( RULE_STRING )
            // InternalJoveNotes.g:8267:1: RULE_STRING
            {
             before(grammarAccess.getTrueFalseAccess().getJustificationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8276:1: rule__ChemEquation__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ChemEquation__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8280:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8281:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8281:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8282:1: ( 'hide' )
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8283:1: ( 'hide' )
            // InternalJoveNotes.g:8284:1: 'hide'
            {
             before(grammarAccess.getChemEquationAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:8299:1: rule__ChemEquation__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8303:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8304:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8304:1: ( RULE_STRING )
            // InternalJoveNotes.g:8305:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8314:1: rule__ChemEquation__ReactantsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ReactantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8318:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8319:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8319:1: ( RULE_STRING )
            // InternalJoveNotes.g:8320:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getReactantsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8329:1: rule__ChemEquation__ProducesAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProducesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8333:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8334:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8334:1: ( RULE_STRING )
            // InternalJoveNotes.g:8335:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProducesSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8344:1: rule__ChemEquation__ProductsAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ChemEquation__ProductsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8348:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8349:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8349:1: ( RULE_STRING )
            // InternalJoveNotes.g:8350:1: RULE_STRING
            {
             before(grammarAccess.getChemEquationAccess().getProductsSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8359:1: rule__ChemCompound__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ChemCompound__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8363:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8364:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8364:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8365:1: ( 'hide' )
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8366:1: ( 'hide' )
            // InternalJoveNotes.g:8367:1: 'hide'
            {
             before(grammarAccess.getChemCompoundAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:8382:1: rule__ChemCompound__SymbolAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8386:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8387:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8387:1: ( RULE_STRING )
            // InternalJoveNotes.g:8388:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getSymbolSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8397:1: rule__ChemCompound__ChemicalNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__ChemicalNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8401:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8402:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8402:1: ( RULE_STRING )
            // InternalJoveNotes.g:8403:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getChemicalNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8412:1: rule__ChemCompound__CommonNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ChemCompound__CommonNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8416:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8417:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8417:1: ( RULE_STRING )
            // InternalJoveNotes.g:8418:1: RULE_STRING
            {
             before(grammarAccess.getChemCompoundAccess().getCommonNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8427:1: rule__Spellbee__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Spellbee__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8431:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8432:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8432:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8433:1: ( 'hide' )
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8434:1: ( 'hide' )
            // InternalJoveNotes.g:8435:1: 'hide'
            {
             before(grammarAccess.getSpellbeeAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:8450:1: rule__Spellbee__WordAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Spellbee__WordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8454:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8455:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8455:1: ( RULE_STRING )
            // InternalJoveNotes.g:8456:1: RULE_STRING
            {
             before(grammarAccess.getSpellbeeAccess().getWordSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8465:1: rule__ImageLabel__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__ImageLabel__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8469:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8470:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8470:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8471:1: ( 'hide' )
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8472:1: ( 'hide' )
            // InternalJoveNotes.g:8473:1: 'hide'
            {
             before(grammarAccess.getImageLabelAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:8488:1: rule__ImageLabel__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8492:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8493:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8493:1: ( RULE_STRING )
            // InternalJoveNotes.g:8494:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8503:1: rule__ImageLabel__ImageNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ImageLabel__ImageNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8507:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8508:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8508:1: ( RULE_STRING )
            // InternalJoveNotes.g:8509:1: RULE_STRING
            {
             before(grammarAccess.getImageLabelAccess().getImageNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8518:1: rule__ImageLabel__HotspotsAssignment_6 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8522:1: ( ( ruleHotSpot ) )
            // InternalJoveNotes.g:8523:1: ( ruleHotSpot )
            {
            // InternalJoveNotes.g:8523:1: ( ruleHotSpot )
            // InternalJoveNotes.g:8524:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:8533:1: rule__ImageLabel__HotspotsAssignment_7_1 : ( ruleHotSpot ) ;
    public final void rule__ImageLabel__HotspotsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8537:1: ( ( ruleHotSpot ) )
            // InternalJoveNotes.g:8538:1: ( ruleHotSpot )
            {
            // InternalJoveNotes.g:8538:1: ( ruleHotSpot )
            // InternalJoveNotes.g:8539:1: ruleHotSpot
            {
             before(grammarAccess.getImageLabelAccess().getHotspotsHotSpotParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:8548:1: rule__HotSpot__XAssignment_0 : ( RULE_INT ) ;
    public final void rule__HotSpot__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8552:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8553:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8553:1: ( RULE_INT )
            // InternalJoveNotes.g:8554:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getXINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalJoveNotes.g:8563:1: rule__HotSpot__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__HotSpot__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8567:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8568:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8568:1: ( RULE_INT )
            // InternalJoveNotes.g:8569:1: RULE_INT
            {
             before(grammarAccess.getHotSpotAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalJoveNotes.g:8578:1: rule__HotSpot__LabelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__HotSpot__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8582:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8583:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8583:1: ( RULE_STRING )
            // InternalJoveNotes.g:8584:1: RULE_STRING
            {
             before(grammarAccess.getHotSpotAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8593:1: rule__Equation__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Equation__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8597:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8598:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8598:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8599:1: ( 'hide' )
            {
             before(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8600:1: ( 'hide' )
            // InternalJoveNotes.g:8601:1: 'hide'
            {
             before(grammarAccess.getEquationAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:8616:1: rule__Equation__EquationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Equation__EquationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8620:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8621:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8621:1: ( RULE_STRING )
            // InternalJoveNotes.g:8622:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getEquationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8631:1: rule__Equation__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Equation__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8635:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8636:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8636:1: ( RULE_STRING )
            // InternalJoveNotes.g:8637:1: RULE_STRING
            {
             before(grammarAccess.getEquationAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8646:1: rule__Equation__SymbolsAssignment_6 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8650:1: ( ( ruleEqSymbol ) )
            // InternalJoveNotes.g:8651:1: ( ruleEqSymbol )
            {
            // InternalJoveNotes.g:8651:1: ( ruleEqSymbol )
            // InternalJoveNotes.g:8652:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:8661:1: rule__Equation__SymbolsAssignment_7_1 : ( ruleEqSymbol ) ;
    public final void rule__Equation__SymbolsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8665:1: ( ( ruleEqSymbol ) )
            // InternalJoveNotes.g:8666:1: ( ruleEqSymbol )
            {
            // InternalJoveNotes.g:8666:1: ( ruleEqSymbol )
            // InternalJoveNotes.g:8667:1: ruleEqSymbol
            {
             before(grammarAccess.getEquationAccess().getSymbolsEqSymbolParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:8676:1: rule__EqSymbol__SymbolAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__SymbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8680:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8681:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8681:1: ( RULE_STRING )
            // InternalJoveNotes.g:8682:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getSymbolSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8691:1: rule__EqSymbol__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EqSymbol__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8695:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8696:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8696:1: ( RULE_STRING )
            // InternalJoveNotes.g:8697:1: RULE_STRING
            {
             before(grammarAccess.getEqSymbolAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8706:1: rule__RefToContext__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__RefToContext__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8710:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8711:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8711:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8712:1: ( 'hide' )
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8713:1: ( 'hide' )
            // InternalJoveNotes.g:8714:1: 'hide'
            {
             before(grammarAccess.getRefToContextAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:8729:1: rule__RefToContext__ContextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__RefToContext__ContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8733:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8734:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8734:1: ( RULE_STRING )
            // InternalJoveNotes.g:8735:1: RULE_STRING
            {
             before(grammarAccess.getRefToContextAccess().getContextSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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


    // $ANTLR start "rule__RefToContext__RtcElementAssignment_5"
    // InternalJoveNotes.g:8744:1: rule__RefToContext__RtcElementAssignment_5 : ( ruleRTCElement ) ;
    public final void rule__RefToContext__RtcElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8748:1: ( ( ruleRTCElement ) )
            // InternalJoveNotes.g:8749:1: ( ruleRTCElement )
            {
            // InternalJoveNotes.g:8749:1: ( ruleRTCElement )
            // InternalJoveNotes.g:8750:1: ruleRTCElement
            {
             before(grammarAccess.getRefToContextAccess().getRtcElementRTCElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRTCElement();

            state._fsp--;

             after(grammarAccess.getRefToContextAccess().getRtcElementRTCElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefToContext__RtcElementAssignment_5"


    // $ANTLR start "rule__MultiChoice__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8759:1: rule__MultiChoice__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__MultiChoice__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8763:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8764:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8764:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8765:1: ( 'hide' )
            {
             before(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8766:1: ( 'hide' )
            // InternalJoveNotes.g:8767:1: 'hide'
            {
             before(grammarAccess.getMultiChoiceAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJoveNotes.g:8782:1: rule__MultiChoice__QuestionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MultiChoice__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8786:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8787:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8787:1: ( RULE_STRING )
            // InternalJoveNotes.g:8788:1: RULE_STRING
            {
             before(grammarAccess.getMultiChoiceAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:8797:1: rule__MultiChoice__OptionsAssignment_6 : ( ruleOption ) ;
    public final void rule__MultiChoice__OptionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8801:1: ( ( ruleOption ) )
            // InternalJoveNotes.g:8802:1: ( ruleOption )
            {
            // InternalJoveNotes.g:8802:1: ( ruleOption )
            // InternalJoveNotes.g:8803:1: ruleOption
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:8812:1: rule__MultiChoice__OptionsAssignment_7_1 : ( ruleOption ) ;
    public final void rule__MultiChoice__OptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8816:1: ( ( ruleOption ) )
            // InternalJoveNotes.g:8817:1: ( ruleOption )
            {
            // InternalJoveNotes.g:8817:1: ( ruleOption )
            // InternalJoveNotes.g:8818:1: ruleOption
            {
             before(grammarAccess.getMultiChoiceAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalJoveNotes.g:8827:1: rule__MultiChoice__NumOptionsToShowAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__MultiChoice__NumOptionsToShowAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8831:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8832:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8832:1: ( RULE_INT )
            // InternalJoveNotes.g:8833:1: RULE_INT
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsToShowINTTerminalRuleCall_9_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalJoveNotes.g:8842:1: rule__MultiChoice__NumOptionsPerRowAssignment_10_1 : ( RULE_INT ) ;
    public final void rule__MultiChoice__NumOptionsPerRowAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8846:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8847:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8847:1: ( RULE_INT )
            // InternalJoveNotes.g:8848:1: RULE_INT
            {
             before(grammarAccess.getMultiChoiceAccess().getNumOptionsPerRowINTTerminalRuleCall_10_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalJoveNotes.g:8857:1: rule__MultiChoice__ExplanationAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__MultiChoice__ExplanationAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8861:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8862:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8862:1: ( RULE_STRING )
            // InternalJoveNotes.g:8863:1: RULE_STRING
            {
             before(grammarAccess.getMultiChoiceAccess().getExplanationSTRINGTerminalRuleCall_11_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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


    // $ANTLR start "rule__Exercise__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8872:1: rule__Exercise__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__Exercise__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8876:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8877:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8877:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8878:1: ( 'hide' )
            {
             before(grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8879:1: ( 'hide' )
            // InternalJoveNotes.g:8880:1: 'hide'
            {
             before(grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getExerciseAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__HideFromViewAssignment_1"


    // $ANTLR start "rule__Exercise__MarksAssignment_2_2"
    // InternalJoveNotes.g:8895:1: rule__Exercise__MarksAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__Exercise__MarksAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8899:1: ( ( RULE_INT ) )
            // InternalJoveNotes.g:8900:1: ( RULE_INT )
            {
            // InternalJoveNotes.g:8900:1: ( RULE_INT )
            // InternalJoveNotes.g:8901:1: RULE_INT
            {
             before(grammarAccess.getExerciseAccess().getMarksINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getMarksINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__MarksAssignment_2_2"


    // $ANTLR start "rule__Exercise__QuestionAssignment_3"
    // InternalJoveNotes.g:8910:1: rule__Exercise__QuestionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Exercise__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8914:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8915:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8915:1: ( RULE_STRING )
            // InternalJoveNotes.g:8916:1: RULE_STRING
            {
             before(grammarAccess.getExerciseAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__QuestionAssignment_3"


    // $ANTLR start "rule__Exercise__HintsAssignment_4_2"
    // InternalJoveNotes.g:8925:1: rule__Exercise__HintsAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Exercise__HintsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8929:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8930:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8930:1: ( RULE_STRING )
            // InternalJoveNotes.g:8931:1: RULE_STRING
            {
             before(grammarAccess.getExerciseAccess().getHintsSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getHintsSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__HintsAssignment_4_2"


    // $ANTLR start "rule__Exercise__AnswerAssignment_5_1"
    // InternalJoveNotes.g:8940:1: rule__Exercise__AnswerAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Exercise__AnswerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8944:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8945:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8945:1: ( RULE_STRING )
            // InternalJoveNotes.g:8946:1: RULE_STRING
            {
             before(grammarAccess.getExerciseAccess().getAnswerSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getAnswerSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__AnswerAssignment_5_1"


    // $ANTLR start "rule__VoiceToText__HideFromViewAssignment_1"
    // InternalJoveNotes.g:8955:1: rule__VoiceToText__HideFromViewAssignment_1 : ( ( 'hide' ) ) ;
    public final void rule__VoiceToText__HideFromViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8959:1: ( ( ( 'hide' ) ) )
            // InternalJoveNotes.g:8960:1: ( ( 'hide' ) )
            {
            // InternalJoveNotes.g:8960:1: ( ( 'hide' ) )
            // InternalJoveNotes.g:8961:1: ( 'hide' )
            {
             before(grammarAccess.getVoiceToTextAccess().getHideFromViewHideKeyword_1_0()); 
            // InternalJoveNotes.g:8962:1: ( 'hide' )
            // InternalJoveNotes.g:8963:1: 'hide'
            {
             before(grammarAccess.getVoiceToTextAccess().getHideFromViewHideKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getVoiceToTextAccess().getHideFromViewHideKeyword_1_0()); 

            }

             after(grammarAccess.getVoiceToTextAccess().getHideFromViewHideKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__HideFromViewAssignment_1"


    // $ANTLR start "rule__VoiceToText__ClipNameAssignment_2"
    // InternalJoveNotes.g:8978:1: rule__VoiceToText__ClipNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VoiceToText__ClipNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8982:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8983:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8983:1: ( RULE_STRING )
            // InternalJoveNotes.g:8984:1: RULE_STRING
            {
             before(grammarAccess.getVoiceToTextAccess().getClipNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVoiceToTextAccess().getClipNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__ClipNameAssignment_2"


    // $ANTLR start "rule__VoiceToText__TextAssignment_3"
    // InternalJoveNotes.g:8993:1: rule__VoiceToText__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__VoiceToText__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:8997:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:8998:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:8998:1: ( RULE_STRING )
            // InternalJoveNotes.g:8999:1: RULE_STRING
            {
             before(grammarAccess.getVoiceToTextAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVoiceToTextAccess().getTextSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceToText__TextAssignment_3"


    // $ANTLR start "rule__Option__OptionValueAssignment_0"
    // InternalJoveNotes.g:9008:1: rule__Option__OptionValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Option__OptionValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9012:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9013:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9013:1: ( RULE_STRING )
            // InternalJoveNotes.g:9014:1: RULE_STRING
            {
             before(grammarAccess.getOptionAccess().getOptionValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalJoveNotes.g:9023:1: rule__Option__CorrectOptionAssignment_1 : ( ( 'correct' ) ) ;
    public final void rule__Option__CorrectOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9027:1: ( ( ( 'correct' ) ) )
            // InternalJoveNotes.g:9028:1: ( ( 'correct' ) )
            {
            // InternalJoveNotes.g:9028:1: ( ( 'correct' ) )
            // InternalJoveNotes.g:9029:1: ( 'correct' )
            {
             before(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 
            // InternalJoveNotes.g:9030:1: ( 'correct' )
            // InternalJoveNotes.g:9031:1: 'correct'
            {
             before(grammarAccess.getOptionAccess().getCorrectOptionCorrectKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalJoveNotes.g:9046:1: rule__CMap__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CMap__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9050:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9051:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9051:1: ( RULE_STRING )
            // InternalJoveNotes.g:9052:1: RULE_STRING
            {
             before(grammarAccess.getCMapAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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


    // $ANTLR start "rule__Script__EvalVarsAssignment_2"
    // InternalJoveNotes.g:9061:1: rule__Script__EvalVarsAssignment_2 : ( ruleEvalVar ) ;
    public final void rule__Script__EvalVarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9065:1: ( ( ruleEvalVar ) )
            // InternalJoveNotes.g:9066:1: ( ruleEvalVar )
            {
            // InternalJoveNotes.g:9066:1: ( ruleEvalVar )
            // InternalJoveNotes.g:9067:1: ruleEvalVar
            {
             before(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvalVar();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__EvalVarsAssignment_2"


    // $ANTLR start "rule__Script__EvalVarsAssignment_3_1"
    // InternalJoveNotes.g:9076:1: rule__Script__EvalVarsAssignment_3_1 : ( ruleEvalVar ) ;
    public final void rule__Script__EvalVarsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9080:1: ( ( ruleEvalVar ) )
            // InternalJoveNotes.g:9081:1: ( ruleEvalVar )
            {
            // InternalJoveNotes.g:9081:1: ( ruleEvalVar )
            // InternalJoveNotes.g:9082:1: ruleEvalVar
            {
             before(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvalVar();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getEvalVarsEvalVarParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__EvalVarsAssignment_3_1"


    // $ANTLR start "rule__Script__ScriptBodyAssignment_5"
    // InternalJoveNotes.g:9091:1: rule__Script__ScriptBodyAssignment_5 : ( ruleScriptBody ) ;
    public final void rule__Script__ScriptBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9095:1: ( ( ruleScriptBody ) )
            // InternalJoveNotes.g:9096:1: ( ruleScriptBody )
            {
            // InternalJoveNotes.g:9096:1: ( ruleScriptBody )
            // InternalJoveNotes.g:9097:1: ruleScriptBody
            {
             before(grammarAccess.getScriptAccess().getScriptBodyScriptBodyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleScriptBody();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getScriptBodyScriptBodyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__ScriptBodyAssignment_5"


    // $ANTLR start "rule__EvalVar__VarNameAssignment_0"
    // InternalJoveNotes.g:9106:1: rule__EvalVar__VarNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EvalVar__VarNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9110:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9111:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9111:1: ( RULE_STRING )
            // InternalJoveNotes.g:9112:1: RULE_STRING
            {
             before(grammarAccess.getEvalVarAccess().getVarNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvalVarAccess().getVarNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__VarNameAssignment_0"


    // $ANTLR start "rule__EvalVar__VarExpressionAssignment_2"
    // InternalJoveNotes.g:9121:1: rule__EvalVar__VarExpressionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EvalVar__VarExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9125:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9126:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9126:1: ( RULE_STRING )
            // InternalJoveNotes.g:9127:1: RULE_STRING
            {
             before(grammarAccess.getEvalVarAccess().getVarExpressionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvalVarAccess().getVarExpressionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalVar__VarExpressionAssignment_2"


    // $ANTLR start "rule__ScriptBody__ScriptAssignment_2"
    // InternalJoveNotes.g:9136:1: rule__ScriptBody__ScriptAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ScriptBody__ScriptAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalJoveNotes.g:9140:1: ( ( RULE_STRING ) )
            // InternalJoveNotes.g:9141:1: ( RULE_STRING )
            {
            // InternalJoveNotes.g:9141:1: ( RULE_STRING )
            // InternalJoveNotes.g:9142:1: RULE_STRING
            {
             before(grammarAccess.getScriptBodyAccess().getScriptSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScriptBodyAccess().getScriptSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptBody__ScriptAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0200000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008953B807F0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008953B807F0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0C00000000800010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400000000800010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000112B807F0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000112B807F0002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400061000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0401000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L});

}