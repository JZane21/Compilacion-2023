package edu.upb.lp.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import edu.upb.lp.services.IAmGrootGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIAmGrootParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'WeAreGroot'", "'{'", "'}'", "'Leaf'", "'is'", "'Numboot'", "'Stroot'", "'Boolt'", "'->'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalIAmGrootParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIAmGrootParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIAmGrootParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIAmGroot.g"; }


    	private IAmGrootGrammarAccess grammarAccess;

    	public void setGrammarAccess(IAmGrootGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalIAmGroot.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalIAmGroot.g:54:1: ( ruleProgram EOF )
            // InternalIAmGroot.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalIAmGroot.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalIAmGroot.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalIAmGroot.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalIAmGroot.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalIAmGroot.g:69:3: ( rule__Program__Group__0 )
            // InternalIAmGroot.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleGroot"
    // InternalIAmGroot.g:78:1: entryRuleGroot : ruleGroot EOF ;
    public final void entryRuleGroot() throws RecognitionException {
        try {
            // InternalIAmGroot.g:79:1: ( ruleGroot EOF )
            // InternalIAmGroot.g:80:1: ruleGroot EOF
            {
             before(grammarAccess.getGrootRule()); 
            pushFollow(FOLLOW_1);
            ruleGroot();

            state._fsp--;

             after(grammarAccess.getGrootRule()); 
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
    // $ANTLR end "entryRuleGroot"


    // $ANTLR start "ruleGroot"
    // InternalIAmGroot.g:87:1: ruleGroot : ( ( rule__Groot__Group__0 ) ) ;
    public final void ruleGroot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:91:2: ( ( ( rule__Groot__Group__0 ) ) )
            // InternalIAmGroot.g:92:2: ( ( rule__Groot__Group__0 ) )
            {
            // InternalIAmGroot.g:92:2: ( ( rule__Groot__Group__0 ) )
            // InternalIAmGroot.g:93:3: ( rule__Groot__Group__0 )
            {
             before(grammarAccess.getGrootAccess().getGroup()); 
            // InternalIAmGroot.g:94:3: ( rule__Groot__Group__0 )
            // InternalIAmGroot.g:94:4: rule__Groot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Groot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroot"


    // $ANTLR start "entryRuleSentence"
    // InternalIAmGroot.g:103:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalIAmGroot.g:104:1: ( ruleSentence EOF )
            // InternalIAmGroot.g:105:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalIAmGroot.g:112:1: ruleSentence : ( ( rule__Sentence__Alternatives ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:116:2: ( ( ( rule__Sentence__Alternatives ) ) )
            // InternalIAmGroot.g:117:2: ( ( rule__Sentence__Alternatives ) )
            {
            // InternalIAmGroot.g:117:2: ( ( rule__Sentence__Alternatives ) )
            // InternalIAmGroot.g:118:3: ( rule__Sentence__Alternatives )
            {
             before(grammarAccess.getSentenceAccess().getAlternatives()); 
            // InternalIAmGroot.g:119:3: ( rule__Sentence__Alternatives )
            // InternalIAmGroot.g:119:4: rule__Sentence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleDeclaration"
    // InternalIAmGroot.g:128:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalIAmGroot.g:129:1: ( ruleDeclaration EOF )
            // InternalIAmGroot.g:130:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalIAmGroot.g:137:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:141:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalIAmGroot.g:142:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalIAmGroot.g:142:2: ( ( rule__Declaration__Group__0 ) )
            // InternalIAmGroot.g:143:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalIAmGroot.g:144:3: ( rule__Declaration__Group__0 )
            // InternalIAmGroot.g:144:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleGrootTypes"
    // InternalIAmGroot.g:153:1: entryRuleGrootTypes : ruleGrootTypes EOF ;
    public final void entryRuleGrootTypes() throws RecognitionException {
        try {
            // InternalIAmGroot.g:154:1: ( ruleGrootTypes EOF )
            // InternalIAmGroot.g:155:1: ruleGrootTypes EOF
            {
             before(grammarAccess.getGrootTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleGrootTypes();

            state._fsp--;

             after(grammarAccess.getGrootTypesRule()); 
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
    // $ANTLR end "entryRuleGrootTypes"


    // $ANTLR start "ruleGrootTypes"
    // InternalIAmGroot.g:162:1: ruleGrootTypes : ( ( rule__GrootTypes__Alternatives ) ) ;
    public final void ruleGrootTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:166:2: ( ( ( rule__GrootTypes__Alternatives ) ) )
            // InternalIAmGroot.g:167:2: ( ( rule__GrootTypes__Alternatives ) )
            {
            // InternalIAmGroot.g:167:2: ( ( rule__GrootTypes__Alternatives ) )
            // InternalIAmGroot.g:168:3: ( rule__GrootTypes__Alternatives )
            {
             before(grammarAccess.getGrootTypesAccess().getAlternatives()); 
            // InternalIAmGroot.g:169:3: ( rule__GrootTypes__Alternatives )
            // InternalIAmGroot.g:169:4: rule__GrootTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GrootTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGrootTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrootTypes"


    // $ANTLR start "entryRuleInitializationNum"
    // InternalIAmGroot.g:178:1: entryRuleInitializationNum : ruleInitializationNum EOF ;
    public final void entryRuleInitializationNum() throws RecognitionException {
        try {
            // InternalIAmGroot.g:179:1: ( ruleInitializationNum EOF )
            // InternalIAmGroot.g:180:1: ruleInitializationNum EOF
            {
             before(grammarAccess.getInitializationNumRule()); 
            pushFollow(FOLLOW_1);
            ruleInitializationNum();

            state._fsp--;

             after(grammarAccess.getInitializationNumRule()); 
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
    // $ANTLR end "entryRuleInitializationNum"


    // $ANTLR start "ruleInitializationNum"
    // InternalIAmGroot.g:187:1: ruleInitializationNum : ( ruleAssignationNum ) ;
    public final void ruleInitializationNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:191:2: ( ( ruleAssignationNum ) )
            // InternalIAmGroot.g:192:2: ( ruleAssignationNum )
            {
            // InternalIAmGroot.g:192:2: ( ruleAssignationNum )
            // InternalIAmGroot.g:193:3: ruleAssignationNum
            {
             before(grammarAccess.getInitializationNumAccess().getAssignationNumParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAssignationNum();

            state._fsp--;

             after(grammarAccess.getInitializationNumAccess().getAssignationNumParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitializationNum"


    // $ANTLR start "entryRuleInitializationStr"
    // InternalIAmGroot.g:203:1: entryRuleInitializationStr : ruleInitializationStr EOF ;
    public final void entryRuleInitializationStr() throws RecognitionException {
        try {
            // InternalIAmGroot.g:204:1: ( ruleInitializationStr EOF )
            // InternalIAmGroot.g:205:1: ruleInitializationStr EOF
            {
             before(grammarAccess.getInitializationStrRule()); 
            pushFollow(FOLLOW_1);
            ruleInitializationStr();

            state._fsp--;

             after(grammarAccess.getInitializationStrRule()); 
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
    // $ANTLR end "entryRuleInitializationStr"


    // $ANTLR start "ruleInitializationStr"
    // InternalIAmGroot.g:212:1: ruleInitializationStr : ( ruleAssignationStr ) ;
    public final void ruleInitializationStr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:216:2: ( ( ruleAssignationStr ) )
            // InternalIAmGroot.g:217:2: ( ruleAssignationStr )
            {
            // InternalIAmGroot.g:217:2: ( ruleAssignationStr )
            // InternalIAmGroot.g:218:3: ruleAssignationStr
            {
             before(grammarAccess.getInitializationStrAccess().getAssignationStrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAssignationStr();

            state._fsp--;

             after(grammarAccess.getInitializationStrAccess().getAssignationStrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitializationStr"


    // $ANTLR start "entryRuleInitializationBool"
    // InternalIAmGroot.g:228:1: entryRuleInitializationBool : ruleInitializationBool EOF ;
    public final void entryRuleInitializationBool() throws RecognitionException {
        try {
            // InternalIAmGroot.g:229:1: ( ruleInitializationBool EOF )
            // InternalIAmGroot.g:230:1: ruleInitializationBool EOF
            {
             before(grammarAccess.getInitializationBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleInitializationBool();

            state._fsp--;

             after(grammarAccess.getInitializationBoolRule()); 
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
    // $ANTLR end "entryRuleInitializationBool"


    // $ANTLR start "ruleInitializationBool"
    // InternalIAmGroot.g:237:1: ruleInitializationBool : ( ruleAssignationBool ) ;
    public final void ruleInitializationBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:241:2: ( ( ruleAssignationBool ) )
            // InternalIAmGroot.g:242:2: ( ruleAssignationBool )
            {
            // InternalIAmGroot.g:242:2: ( ruleAssignationBool )
            // InternalIAmGroot.g:243:3: ruleAssignationBool
            {
             before(grammarAccess.getInitializationBoolAccess().getAssignationBoolParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAssignationBool();

            state._fsp--;

             after(grammarAccess.getInitializationBoolAccess().getAssignationBoolParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitializationBool"


    // $ANTLR start "entryRuleAssignation"
    // InternalIAmGroot.g:253:1: entryRuleAssignation : ruleAssignation EOF ;
    public final void entryRuleAssignation() throws RecognitionException {
        try {
            // InternalIAmGroot.g:254:1: ( ruleAssignation EOF )
            // InternalIAmGroot.g:255:1: ruleAssignation EOF
            {
             before(grammarAccess.getAssignationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignation();

            state._fsp--;

             after(grammarAccess.getAssignationRule()); 
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
    // $ANTLR end "entryRuleAssignation"


    // $ANTLR start "ruleAssignation"
    // InternalIAmGroot.g:262:1: ruleAssignation : ( ( rule__Assignation__Group__0 ) ) ;
    public final void ruleAssignation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:266:2: ( ( ( rule__Assignation__Group__0 ) ) )
            // InternalIAmGroot.g:267:2: ( ( rule__Assignation__Group__0 ) )
            {
            // InternalIAmGroot.g:267:2: ( ( rule__Assignation__Group__0 ) )
            // InternalIAmGroot.g:268:3: ( rule__Assignation__Group__0 )
            {
             before(grammarAccess.getAssignationAccess().getGroup()); 
            // InternalIAmGroot.g:269:3: ( rule__Assignation__Group__0 )
            // InternalIAmGroot.g:269:4: rule__Assignation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignation"


    // $ANTLR start "entryRuleAssignationValue"
    // InternalIAmGroot.g:278:1: entryRuleAssignationValue : ruleAssignationValue EOF ;
    public final void entryRuleAssignationValue() throws RecognitionException {
        try {
            // InternalIAmGroot.g:279:1: ( ruleAssignationValue EOF )
            // InternalIAmGroot.g:280:1: ruleAssignationValue EOF
            {
             before(grammarAccess.getAssignationValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignationValue();

            state._fsp--;

             after(grammarAccess.getAssignationValueRule()); 
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
    // $ANTLR end "entryRuleAssignationValue"


    // $ANTLR start "ruleAssignationValue"
    // InternalIAmGroot.g:287:1: ruleAssignationValue : ( ( rule__AssignationValue__Alternatives ) ) ;
    public final void ruleAssignationValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:291:2: ( ( ( rule__AssignationValue__Alternatives ) ) )
            // InternalIAmGroot.g:292:2: ( ( rule__AssignationValue__Alternatives ) )
            {
            // InternalIAmGroot.g:292:2: ( ( rule__AssignationValue__Alternatives ) )
            // InternalIAmGroot.g:293:3: ( rule__AssignationValue__Alternatives )
            {
             before(grammarAccess.getAssignationValueAccess().getAlternatives()); 
            // InternalIAmGroot.g:294:3: ( rule__AssignationValue__Alternatives )
            // InternalIAmGroot.g:294:4: rule__AssignationValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssignationValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignationValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignationValue"


    // $ANTLR start "entryRuleAssignationNum"
    // InternalIAmGroot.g:303:1: entryRuleAssignationNum : ruleAssignationNum EOF ;
    public final void entryRuleAssignationNum() throws RecognitionException {
        try {
            // InternalIAmGroot.g:304:1: ( ruleAssignationNum EOF )
            // InternalIAmGroot.g:305:1: ruleAssignationNum EOF
            {
             before(grammarAccess.getAssignationNumRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignationNum();

            state._fsp--;

             after(grammarAccess.getAssignationNumRule()); 
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
    // $ANTLR end "entryRuleAssignationNum"


    // $ANTLR start "ruleAssignationNum"
    // InternalIAmGroot.g:312:1: ruleAssignationNum : ( ( rule__AssignationNum__Group__0 ) ) ;
    public final void ruleAssignationNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:316:2: ( ( ( rule__AssignationNum__Group__0 ) ) )
            // InternalIAmGroot.g:317:2: ( ( rule__AssignationNum__Group__0 ) )
            {
            // InternalIAmGroot.g:317:2: ( ( rule__AssignationNum__Group__0 ) )
            // InternalIAmGroot.g:318:3: ( rule__AssignationNum__Group__0 )
            {
             before(grammarAccess.getAssignationNumAccess().getGroup()); 
            // InternalIAmGroot.g:319:3: ( rule__AssignationNum__Group__0 )
            // InternalIAmGroot.g:319:4: rule__AssignationNum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignationNum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignationNumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignationNum"


    // $ANTLR start "entryRuleAssignationStr"
    // InternalIAmGroot.g:328:1: entryRuleAssignationStr : ruleAssignationStr EOF ;
    public final void entryRuleAssignationStr() throws RecognitionException {
        try {
            // InternalIAmGroot.g:329:1: ( ruleAssignationStr EOF )
            // InternalIAmGroot.g:330:1: ruleAssignationStr EOF
            {
             before(grammarAccess.getAssignationStrRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignationStr();

            state._fsp--;

             after(grammarAccess.getAssignationStrRule()); 
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
    // $ANTLR end "entryRuleAssignationStr"


    // $ANTLR start "ruleAssignationStr"
    // InternalIAmGroot.g:337:1: ruleAssignationStr : ( ( rule__AssignationStr__Group__0 ) ) ;
    public final void ruleAssignationStr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:341:2: ( ( ( rule__AssignationStr__Group__0 ) ) )
            // InternalIAmGroot.g:342:2: ( ( rule__AssignationStr__Group__0 ) )
            {
            // InternalIAmGroot.g:342:2: ( ( rule__AssignationStr__Group__0 ) )
            // InternalIAmGroot.g:343:3: ( rule__AssignationStr__Group__0 )
            {
             before(grammarAccess.getAssignationStrAccess().getGroup()); 
            // InternalIAmGroot.g:344:3: ( rule__AssignationStr__Group__0 )
            // InternalIAmGroot.g:344:4: rule__AssignationStr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignationStr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignationStrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignationStr"


    // $ANTLR start "entryRuleAssignationBool"
    // InternalIAmGroot.g:353:1: entryRuleAssignationBool : ruleAssignationBool EOF ;
    public final void entryRuleAssignationBool() throws RecognitionException {
        try {
            // InternalIAmGroot.g:354:1: ( ruleAssignationBool EOF )
            // InternalIAmGroot.g:355:1: ruleAssignationBool EOF
            {
             before(grammarAccess.getAssignationBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignationBool();

            state._fsp--;

             after(grammarAccess.getAssignationBoolRule()); 
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
    // $ANTLR end "entryRuleAssignationBool"


    // $ANTLR start "ruleAssignationBool"
    // InternalIAmGroot.g:362:1: ruleAssignationBool : ( ( rule__AssignationBool__Group__0 ) ) ;
    public final void ruleAssignationBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:366:2: ( ( ( rule__AssignationBool__Group__0 ) ) )
            // InternalIAmGroot.g:367:2: ( ( rule__AssignationBool__Group__0 ) )
            {
            // InternalIAmGroot.g:367:2: ( ( rule__AssignationBool__Group__0 ) )
            // InternalIAmGroot.g:368:3: ( rule__AssignationBool__Group__0 )
            {
             before(grammarAccess.getAssignationBoolAccess().getGroup()); 
            // InternalIAmGroot.g:369:3: ( rule__AssignationBool__Group__0 )
            // InternalIAmGroot.g:369:4: rule__AssignationBool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignationBool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignationBoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignationBool"


    // $ANTLR start "rule__Sentence__Alternatives"
    // InternalIAmGroot.g:377:1: rule__Sentence__Alternatives : ( ( ruleDeclaration ) | ( ruleAssignation ) );
    public final void rule__Sentence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:381:1: ( ( ruleDeclaration ) | ( ruleAssignation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==16) ) {
                    alt1=1;
                }
                else if ( (LA1_1==20) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalIAmGroot.g:382:2: ( ruleDeclaration )
                    {
                    // InternalIAmGroot.g:382:2: ( ruleDeclaration )
                    // InternalIAmGroot.g:383:3: ruleDeclaration
                    {
                     before(grammarAccess.getSentenceAccess().getDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentenceAccess().getDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIAmGroot.g:388:2: ( ruleAssignation )
                    {
                    // InternalIAmGroot.g:388:2: ( ruleAssignation )
                    // InternalIAmGroot.g:389:3: ruleAssignation
                    {
                     before(grammarAccess.getSentenceAccess().getAssignationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignation();

                    state._fsp--;

                     after(grammarAccess.getSentenceAccess().getAssignationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Sentence__Alternatives"


    // $ANTLR start "rule__GrootTypes__Alternatives"
    // InternalIAmGroot.g:398:1: rule__GrootTypes__Alternatives : ( ( ( rule__GrootTypes__Group_0__0 ) ) | ( ( rule__GrootTypes__Group_1__0 ) ) | ( ( rule__GrootTypes__Group_2__0 ) ) );
    public final void rule__GrootTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:402:1: ( ( ( rule__GrootTypes__Group_0__0 ) ) | ( ( rule__GrootTypes__Group_1__0 ) ) | ( ( rule__GrootTypes__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalIAmGroot.g:403:2: ( ( rule__GrootTypes__Group_0__0 ) )
                    {
                    // InternalIAmGroot.g:403:2: ( ( rule__GrootTypes__Group_0__0 ) )
                    // InternalIAmGroot.g:404:3: ( rule__GrootTypes__Group_0__0 )
                    {
                     before(grammarAccess.getGrootTypesAccess().getGroup_0()); 
                    // InternalIAmGroot.g:405:3: ( rule__GrootTypes__Group_0__0 )
                    // InternalIAmGroot.g:405:4: rule__GrootTypes__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrootTypes__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGrootTypesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIAmGroot.g:409:2: ( ( rule__GrootTypes__Group_1__0 ) )
                    {
                    // InternalIAmGroot.g:409:2: ( ( rule__GrootTypes__Group_1__0 ) )
                    // InternalIAmGroot.g:410:3: ( rule__GrootTypes__Group_1__0 )
                    {
                     before(grammarAccess.getGrootTypesAccess().getGroup_1()); 
                    // InternalIAmGroot.g:411:3: ( rule__GrootTypes__Group_1__0 )
                    // InternalIAmGroot.g:411:4: rule__GrootTypes__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrootTypes__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGrootTypesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIAmGroot.g:415:2: ( ( rule__GrootTypes__Group_2__0 ) )
                    {
                    // InternalIAmGroot.g:415:2: ( ( rule__GrootTypes__Group_2__0 ) )
                    // InternalIAmGroot.g:416:3: ( rule__GrootTypes__Group_2__0 )
                    {
                     before(grammarAccess.getGrootTypesAccess().getGroup_2()); 
                    // InternalIAmGroot.g:417:3: ( rule__GrootTypes__Group_2__0 )
                    // InternalIAmGroot.g:417:4: rule__GrootTypes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrootTypes__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGrootTypesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__GrootTypes__Alternatives"


    // $ANTLR start "rule__AssignationValue__Alternatives"
    // InternalIAmGroot.g:425:1: rule__AssignationValue__Alternatives : ( ( ruleAssignationNum ) | ( ruleAssignationStr ) | ( ruleAssignationBool ) );
    public final void rule__AssignationValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:429:1: ( ( ruleAssignationNum ) | ( ruleAssignationStr ) | ( ruleAssignationBool ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                switch ( input.LA(2) ) {
                case RULE_BOOLEAN:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_INT:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIAmGroot.g:430:2: ( ruleAssignationNum )
                    {
                    // InternalIAmGroot.g:430:2: ( ruleAssignationNum )
                    // InternalIAmGroot.g:431:3: ruleAssignationNum
                    {
                     before(grammarAccess.getAssignationValueAccess().getAssignationNumParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignationNum();

                    state._fsp--;

                     after(grammarAccess.getAssignationValueAccess().getAssignationNumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIAmGroot.g:436:2: ( ruleAssignationStr )
                    {
                    // InternalIAmGroot.g:436:2: ( ruleAssignationStr )
                    // InternalIAmGroot.g:437:3: ruleAssignationStr
                    {
                     before(grammarAccess.getAssignationValueAccess().getAssignationStrParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignationStr();

                    state._fsp--;

                     after(grammarAccess.getAssignationValueAccess().getAssignationStrParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIAmGroot.g:442:2: ( ruleAssignationBool )
                    {
                    // InternalIAmGroot.g:442:2: ( ruleAssignationBool )
                    // InternalIAmGroot.g:443:3: ruleAssignationBool
                    {
                     before(grammarAccess.getAssignationValueAccess().getAssignationBoolParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignationBool();

                    state._fsp--;

                     after(grammarAccess.getAssignationValueAccess().getAssignationBoolParserRuleCall_2()); 

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
    // $ANTLR end "rule__AssignationValue__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalIAmGroot.g:452:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:456:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalIAmGroot.g:457:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalIAmGroot.g:464:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:468:1: ( ( () ) )
            // InternalIAmGroot.g:469:1: ( () )
            {
            // InternalIAmGroot.g:469:1: ( () )
            // InternalIAmGroot.g:470:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalIAmGroot.g:471:2: ()
            // InternalIAmGroot.g:471:3: 
            {
            }

             after(grammarAccess.getProgramAccess().getProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalIAmGroot.g:479:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:483:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalIAmGroot.g:484:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalIAmGroot.g:491:1: rule__Program__Group__1__Impl : ( 'WeAreGroot' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:495:1: ( ( 'WeAreGroot' ) )
            // InternalIAmGroot.g:496:1: ( 'WeAreGroot' )
            {
            // InternalIAmGroot.g:496:1: ( 'WeAreGroot' )
            // InternalIAmGroot.g:497:2: 'WeAreGroot'
            {
             before(grammarAccess.getProgramAccess().getWeAreGrootKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getWeAreGrootKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalIAmGroot.g:506:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:510:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalIAmGroot.g:511:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalIAmGroot.g:518:1: rule__Program__Group__2__Impl : ( '{' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:522:1: ( ( '{' ) )
            // InternalIAmGroot.g:523:1: ( '{' )
            {
            // InternalIAmGroot.g:523:1: ( '{' )
            // InternalIAmGroot.g:524:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalIAmGroot.g:533:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:537:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalIAmGroot.g:538:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalIAmGroot.g:545:1: rule__Program__Group__3__Impl : ( ( rule__Program__GrootsAssignment_3 )* ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:549:1: ( ( ( rule__Program__GrootsAssignment_3 )* ) )
            // InternalIAmGroot.g:550:1: ( ( rule__Program__GrootsAssignment_3 )* )
            {
            // InternalIAmGroot.g:550:1: ( ( rule__Program__GrootsAssignment_3 )* )
            // InternalIAmGroot.g:551:2: ( rule__Program__GrootsAssignment_3 )*
            {
             before(grammarAccess.getProgramAccess().getGrootsAssignment_3()); 
            // InternalIAmGroot.g:552:2: ( rule__Program__GrootsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIAmGroot.g:552:3: rule__Program__GrootsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Program__GrootsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGrootsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalIAmGroot.g:560:1: rule__Program__Group__4 : rule__Program__Group__4__Impl ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:564:1: ( rule__Program__Group__4__Impl )
            // InternalIAmGroot.g:565:2: rule__Program__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalIAmGroot.g:571:1: rule__Program__Group__4__Impl : ( '}' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:575:1: ( ( '}' ) )
            // InternalIAmGroot.g:576:1: ( '}' )
            {
            // InternalIAmGroot.g:576:1: ( '}' )
            // InternalIAmGroot.g:577:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Groot__Group__0"
    // InternalIAmGroot.g:587:1: rule__Groot__Group__0 : rule__Groot__Group__0__Impl rule__Groot__Group__1 ;
    public final void rule__Groot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:591:1: ( rule__Groot__Group__0__Impl rule__Groot__Group__1 )
            // InternalIAmGroot.g:592:2: rule__Groot__Group__0__Impl rule__Groot__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Groot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Groot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Groot__Group__0"


    // $ANTLR start "rule__Groot__Group__0__Impl"
    // InternalIAmGroot.g:599:1: rule__Groot__Group__0__Impl : ( ruleSentence ) ;
    public final void rule__Groot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:603:1: ( ( ruleSentence ) )
            // InternalIAmGroot.g:604:1: ( ruleSentence )
            {
            // InternalIAmGroot.g:604:1: ( ruleSentence )
            // InternalIAmGroot.g:605:2: ruleSentence
            {
             before(grammarAccess.getGrootAccess().getSentenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getGrootAccess().getSentenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Groot__Group__0__Impl"


    // $ANTLR start "rule__Groot__Group__1"
    // InternalIAmGroot.g:614:1: rule__Groot__Group__1 : rule__Groot__Group__1__Impl ;
    public final void rule__Groot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:618:1: ( rule__Groot__Group__1__Impl )
            // InternalIAmGroot.g:619:2: rule__Groot__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Groot__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Groot__Group__1"


    // $ANTLR start "rule__Groot__Group__1__Impl"
    // InternalIAmGroot.g:625:1: rule__Groot__Group__1__Impl : ( 'Leaf' ) ;
    public final void rule__Groot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:629:1: ( ( 'Leaf' ) )
            // InternalIAmGroot.g:630:1: ( 'Leaf' )
            {
            // InternalIAmGroot.g:630:1: ( 'Leaf' )
            // InternalIAmGroot.g:631:2: 'Leaf'
            {
             before(grammarAccess.getGrootAccess().getLeafKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGrootAccess().getLeafKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Groot__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalIAmGroot.g:641:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:645:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalIAmGroot.g:646:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalIAmGroot.g:653:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__NameAssignment_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:657:1: ( ( ( rule__Declaration__NameAssignment_0 ) ) )
            // InternalIAmGroot.g:658:1: ( ( rule__Declaration__NameAssignment_0 ) )
            {
            // InternalIAmGroot.g:658:1: ( ( rule__Declaration__NameAssignment_0 ) )
            // InternalIAmGroot.g:659:2: ( rule__Declaration__NameAssignment_0 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_0()); 
            // InternalIAmGroot.g:660:2: ( rule__Declaration__NameAssignment_0 )
            // InternalIAmGroot.g:660:3: rule__Declaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalIAmGroot.g:668:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:672:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalIAmGroot.g:673:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalIAmGroot.g:680:1: rule__Declaration__Group__1__Impl : ( 'is' ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:684:1: ( ( 'is' ) )
            // InternalIAmGroot.g:685:1: ( 'is' )
            {
            // InternalIAmGroot.g:685:1: ( 'is' )
            // InternalIAmGroot.g:686:2: 'is'
            {
             before(grammarAccess.getDeclarationAccess().getIsKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // InternalIAmGroot.g:695:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:699:1: ( rule__Declaration__Group__2__Impl )
            // InternalIAmGroot.g:700:2: rule__Declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // InternalIAmGroot.g:706:1: rule__Declaration__Group__2__Impl : ( ( rule__Declaration__TypeAssignment_2 ) ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:710:1: ( ( ( rule__Declaration__TypeAssignment_2 ) ) )
            // InternalIAmGroot.g:711:1: ( ( rule__Declaration__TypeAssignment_2 ) )
            {
            // InternalIAmGroot.g:711:1: ( ( rule__Declaration__TypeAssignment_2 ) )
            // InternalIAmGroot.g:712:2: ( rule__Declaration__TypeAssignment_2 )
            {
             before(grammarAccess.getDeclarationAccess().getTypeAssignment_2()); 
            // InternalIAmGroot.g:713:2: ( rule__Declaration__TypeAssignment_2 )
            // InternalIAmGroot.g:713:3: rule__Declaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__GrootTypes__Group_0__0"
    // InternalIAmGroot.g:722:1: rule__GrootTypes__Group_0__0 : rule__GrootTypes__Group_0__0__Impl rule__GrootTypes__Group_0__1 ;
    public final void rule__GrootTypes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:726:1: ( rule__GrootTypes__Group_0__0__Impl rule__GrootTypes__Group_0__1 )
            // InternalIAmGroot.g:727:2: rule__GrootTypes__Group_0__0__Impl rule__GrootTypes__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__GrootTypes__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrootTypes__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_0__0"


    // $ANTLR start "rule__GrootTypes__Group_0__0__Impl"
    // InternalIAmGroot.g:734:1: rule__GrootTypes__Group_0__0__Impl : ( () ) ;
    public final void rule__GrootTypes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:738:1: ( ( () ) )
            // InternalIAmGroot.g:739:1: ( () )
            {
            // InternalIAmGroot.g:739:1: ( () )
            // InternalIAmGroot.g:740:2: ()
            {
             before(grammarAccess.getGrootTypesAccess().getGrootTypesAction_0_0()); 
            // InternalIAmGroot.g:741:2: ()
            // InternalIAmGroot.g:741:3: 
            {
            }

             after(grammarAccess.getGrootTypesAccess().getGrootTypesAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_0__0__Impl"


    // $ANTLR start "rule__GrootTypes__Group_0__1"
    // InternalIAmGroot.g:749:1: rule__GrootTypes__Group_0__1 : rule__GrootTypes__Group_0__1__Impl rule__GrootTypes__Group_0__2 ;
    public final void rule__GrootTypes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:753:1: ( rule__GrootTypes__Group_0__1__Impl rule__GrootTypes__Group_0__2 )
            // InternalIAmGroot.g:754:2: rule__GrootTypes__Group_0__1__Impl rule__GrootTypes__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__GrootTypes__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrootTypes__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_0__1"


    // $ANTLR start "rule__GrootTypes__Group_0__1__Impl"
    // InternalIAmGroot.g:761:1: rule__GrootTypes__Group_0__1__Impl : ( 'Numboot' ) ;
    public final void rule__GrootTypes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:765:1: ( ( 'Numboot' ) )
            // InternalIAmGroot.g:766:1: ( 'Numboot' )
            {
            // InternalIAmGroot.g:766:1: ( 'Numboot' )
            // InternalIAmGroot.g:767:2: 'Numboot'
            {
             before(grammarAccess.getGrootTypesAccess().getNumbootKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGrootTypesAccess().getNumbootKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_0__1__Impl"


    // $ANTLR start "rule__GrootTypes__Group_0__2"
    // InternalIAmGroot.g:776:1: rule__GrootTypes__Group_0__2 : rule__GrootTypes__Group_0__2__Impl ;
    public final void rule__GrootTypes__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:780:1: ( rule__GrootTypes__Group_0__2__Impl )
            // InternalIAmGroot.g:781:2: rule__GrootTypes__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrootTypes__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_0__2"


    // $ANTLR start "rule__GrootTypes__Group_0__2__Impl"
    // InternalIAmGroot.g:787:1: rule__GrootTypes__Group_0__2__Impl : ( ( rule__GrootTypes__ValueAssignment_0_2 )? ) ;
    public final void rule__GrootTypes__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:791:1: ( ( ( rule__GrootTypes__ValueAssignment_0_2 )? ) )
            // InternalIAmGroot.g:792:1: ( ( rule__GrootTypes__ValueAssignment_0_2 )? )
            {
            // InternalIAmGroot.g:792:1: ( ( rule__GrootTypes__ValueAssignment_0_2 )? )
            // InternalIAmGroot.g:793:2: ( rule__GrootTypes__ValueAssignment_0_2 )?
            {
             before(grammarAccess.getGrootTypesAccess().getValueAssignment_0_2()); 
            // InternalIAmGroot.g:794:2: ( rule__GrootTypes__ValueAssignment_0_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIAmGroot.g:794:3: rule__GrootTypes__ValueAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrootTypes__ValueAssignment_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrootTypesAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_0__2__Impl"


    // $ANTLR start "rule__GrootTypes__Group_1__0"
    // InternalIAmGroot.g:803:1: rule__GrootTypes__Group_1__0 : rule__GrootTypes__Group_1__0__Impl rule__GrootTypes__Group_1__1 ;
    public final void rule__GrootTypes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:807:1: ( rule__GrootTypes__Group_1__0__Impl rule__GrootTypes__Group_1__1 )
            // InternalIAmGroot.g:808:2: rule__GrootTypes__Group_1__0__Impl rule__GrootTypes__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__GrootTypes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrootTypes__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_1__0"


    // $ANTLR start "rule__GrootTypes__Group_1__0__Impl"
    // InternalIAmGroot.g:815:1: rule__GrootTypes__Group_1__0__Impl : ( () ) ;
    public final void rule__GrootTypes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:819:1: ( ( () ) )
            // InternalIAmGroot.g:820:1: ( () )
            {
            // InternalIAmGroot.g:820:1: ( () )
            // InternalIAmGroot.g:821:2: ()
            {
             before(grammarAccess.getGrootTypesAccess().getGrootTypesAction_1_0()); 
            // InternalIAmGroot.g:822:2: ()
            // InternalIAmGroot.g:822:3: 
            {
            }

             after(grammarAccess.getGrootTypesAccess().getGrootTypesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_1__0__Impl"


    // $ANTLR start "rule__GrootTypes__Group_1__1"
    // InternalIAmGroot.g:830:1: rule__GrootTypes__Group_1__1 : rule__GrootTypes__Group_1__1__Impl rule__GrootTypes__Group_1__2 ;
    public final void rule__GrootTypes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:834:1: ( rule__GrootTypes__Group_1__1__Impl rule__GrootTypes__Group_1__2 )
            // InternalIAmGroot.g:835:2: rule__GrootTypes__Group_1__1__Impl rule__GrootTypes__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__GrootTypes__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrootTypes__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_1__1"


    // $ANTLR start "rule__GrootTypes__Group_1__1__Impl"
    // InternalIAmGroot.g:842:1: rule__GrootTypes__Group_1__1__Impl : ( 'Stroot' ) ;
    public final void rule__GrootTypes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:846:1: ( ( 'Stroot' ) )
            // InternalIAmGroot.g:847:1: ( 'Stroot' )
            {
            // InternalIAmGroot.g:847:1: ( 'Stroot' )
            // InternalIAmGroot.g:848:2: 'Stroot'
            {
             before(grammarAccess.getGrootTypesAccess().getStrootKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGrootTypesAccess().getStrootKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_1__1__Impl"


    // $ANTLR start "rule__GrootTypes__Group_1__2"
    // InternalIAmGroot.g:857:1: rule__GrootTypes__Group_1__2 : rule__GrootTypes__Group_1__2__Impl ;
    public final void rule__GrootTypes__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:861:1: ( rule__GrootTypes__Group_1__2__Impl )
            // InternalIAmGroot.g:862:2: rule__GrootTypes__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrootTypes__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_1__2"


    // $ANTLR start "rule__GrootTypes__Group_1__2__Impl"
    // InternalIAmGroot.g:868:1: rule__GrootTypes__Group_1__2__Impl : ( ( rule__GrootTypes__ValueAssignment_1_2 )? ) ;
    public final void rule__GrootTypes__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:872:1: ( ( ( rule__GrootTypes__ValueAssignment_1_2 )? ) )
            // InternalIAmGroot.g:873:1: ( ( rule__GrootTypes__ValueAssignment_1_2 )? )
            {
            // InternalIAmGroot.g:873:1: ( ( rule__GrootTypes__ValueAssignment_1_2 )? )
            // InternalIAmGroot.g:874:2: ( rule__GrootTypes__ValueAssignment_1_2 )?
            {
             before(grammarAccess.getGrootTypesAccess().getValueAssignment_1_2()); 
            // InternalIAmGroot.g:875:2: ( rule__GrootTypes__ValueAssignment_1_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIAmGroot.g:875:3: rule__GrootTypes__ValueAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrootTypes__ValueAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrootTypesAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_1__2__Impl"


    // $ANTLR start "rule__GrootTypes__Group_2__0"
    // InternalIAmGroot.g:884:1: rule__GrootTypes__Group_2__0 : rule__GrootTypes__Group_2__0__Impl rule__GrootTypes__Group_2__1 ;
    public final void rule__GrootTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:888:1: ( rule__GrootTypes__Group_2__0__Impl rule__GrootTypes__Group_2__1 )
            // InternalIAmGroot.g:889:2: rule__GrootTypes__Group_2__0__Impl rule__GrootTypes__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__GrootTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrootTypes__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_2__0"


    // $ANTLR start "rule__GrootTypes__Group_2__0__Impl"
    // InternalIAmGroot.g:896:1: rule__GrootTypes__Group_2__0__Impl : ( () ) ;
    public final void rule__GrootTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:900:1: ( ( () ) )
            // InternalIAmGroot.g:901:1: ( () )
            {
            // InternalIAmGroot.g:901:1: ( () )
            // InternalIAmGroot.g:902:2: ()
            {
             before(grammarAccess.getGrootTypesAccess().getGrootTypesAction_2_0()); 
            // InternalIAmGroot.g:903:2: ()
            // InternalIAmGroot.g:903:3: 
            {
            }

             after(grammarAccess.getGrootTypesAccess().getGrootTypesAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_2__0__Impl"


    // $ANTLR start "rule__GrootTypes__Group_2__1"
    // InternalIAmGroot.g:911:1: rule__GrootTypes__Group_2__1 : rule__GrootTypes__Group_2__1__Impl rule__GrootTypes__Group_2__2 ;
    public final void rule__GrootTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:915:1: ( rule__GrootTypes__Group_2__1__Impl rule__GrootTypes__Group_2__2 )
            // InternalIAmGroot.g:916:2: rule__GrootTypes__Group_2__1__Impl rule__GrootTypes__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__GrootTypes__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrootTypes__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_2__1"


    // $ANTLR start "rule__GrootTypes__Group_2__1__Impl"
    // InternalIAmGroot.g:923:1: rule__GrootTypes__Group_2__1__Impl : ( 'Boolt' ) ;
    public final void rule__GrootTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:927:1: ( ( 'Boolt' ) )
            // InternalIAmGroot.g:928:1: ( 'Boolt' )
            {
            // InternalIAmGroot.g:928:1: ( 'Boolt' )
            // InternalIAmGroot.g:929:2: 'Boolt'
            {
             before(grammarAccess.getGrootTypesAccess().getBooltKeyword_2_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGrootTypesAccess().getBooltKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_2__1__Impl"


    // $ANTLR start "rule__GrootTypes__Group_2__2"
    // InternalIAmGroot.g:938:1: rule__GrootTypes__Group_2__2 : rule__GrootTypes__Group_2__2__Impl ;
    public final void rule__GrootTypes__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:942:1: ( rule__GrootTypes__Group_2__2__Impl )
            // InternalIAmGroot.g:943:2: rule__GrootTypes__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrootTypes__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_2__2"


    // $ANTLR start "rule__GrootTypes__Group_2__2__Impl"
    // InternalIAmGroot.g:949:1: rule__GrootTypes__Group_2__2__Impl : ( ( rule__GrootTypes__ValueAssignment_2_2 )? ) ;
    public final void rule__GrootTypes__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:953:1: ( ( ( rule__GrootTypes__ValueAssignment_2_2 )? ) )
            // InternalIAmGroot.g:954:1: ( ( rule__GrootTypes__ValueAssignment_2_2 )? )
            {
            // InternalIAmGroot.g:954:1: ( ( rule__GrootTypes__ValueAssignment_2_2 )? )
            // InternalIAmGroot.g:955:2: ( rule__GrootTypes__ValueAssignment_2_2 )?
            {
             before(grammarAccess.getGrootTypesAccess().getValueAssignment_2_2()); 
            // InternalIAmGroot.g:956:2: ( rule__GrootTypes__ValueAssignment_2_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIAmGroot.g:956:3: rule__GrootTypes__ValueAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrootTypes__ValueAssignment_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrootTypesAccess().getValueAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__Group_2__2__Impl"


    // $ANTLR start "rule__Assignation__Group__0"
    // InternalIAmGroot.g:965:1: rule__Assignation__Group__0 : rule__Assignation__Group__0__Impl rule__Assignation__Group__1 ;
    public final void rule__Assignation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:969:1: ( rule__Assignation__Group__0__Impl rule__Assignation__Group__1 )
            // InternalIAmGroot.g:970:2: rule__Assignation__Group__0__Impl rule__Assignation__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Assignation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__0"


    // $ANTLR start "rule__Assignation__Group__0__Impl"
    // InternalIAmGroot.g:977:1: rule__Assignation__Group__0__Impl : ( ( rule__Assignation__NameAssignment_0 ) ) ;
    public final void rule__Assignation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:981:1: ( ( ( rule__Assignation__NameAssignment_0 ) ) )
            // InternalIAmGroot.g:982:1: ( ( rule__Assignation__NameAssignment_0 ) )
            {
            // InternalIAmGroot.g:982:1: ( ( rule__Assignation__NameAssignment_0 ) )
            // InternalIAmGroot.g:983:2: ( rule__Assignation__NameAssignment_0 )
            {
             before(grammarAccess.getAssignationAccess().getNameAssignment_0()); 
            // InternalIAmGroot.g:984:2: ( rule__Assignation__NameAssignment_0 )
            // InternalIAmGroot.g:984:3: rule__Assignation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignation__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__0__Impl"


    // $ANTLR start "rule__Assignation__Group__1"
    // InternalIAmGroot.g:992:1: rule__Assignation__Group__1 : rule__Assignation__Group__1__Impl ;
    public final void rule__Assignation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:996:1: ( rule__Assignation__Group__1__Impl )
            // InternalIAmGroot.g:997:2: rule__Assignation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__1"


    // $ANTLR start "rule__Assignation__Group__1__Impl"
    // InternalIAmGroot.g:1003:1: rule__Assignation__Group__1__Impl : ( ( rule__Assignation__ValueAssignment_1 ) ) ;
    public final void rule__Assignation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1007:1: ( ( ( rule__Assignation__ValueAssignment_1 ) ) )
            // InternalIAmGroot.g:1008:1: ( ( rule__Assignation__ValueAssignment_1 ) )
            {
            // InternalIAmGroot.g:1008:1: ( ( rule__Assignation__ValueAssignment_1 ) )
            // InternalIAmGroot.g:1009:2: ( rule__Assignation__ValueAssignment_1 )
            {
             before(grammarAccess.getAssignationAccess().getValueAssignment_1()); 
            // InternalIAmGroot.g:1010:2: ( rule__Assignation__ValueAssignment_1 )
            // InternalIAmGroot.g:1010:3: rule__Assignation__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignation__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__Group__1__Impl"


    // $ANTLR start "rule__AssignationNum__Group__0"
    // InternalIAmGroot.g:1019:1: rule__AssignationNum__Group__0 : rule__AssignationNum__Group__0__Impl rule__AssignationNum__Group__1 ;
    public final void rule__AssignationNum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1023:1: ( rule__AssignationNum__Group__0__Impl rule__AssignationNum__Group__1 )
            // InternalIAmGroot.g:1024:2: rule__AssignationNum__Group__0__Impl rule__AssignationNum__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AssignationNum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignationNum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationNum__Group__0"


    // $ANTLR start "rule__AssignationNum__Group__0__Impl"
    // InternalIAmGroot.g:1031:1: rule__AssignationNum__Group__0__Impl : ( '->' ) ;
    public final void rule__AssignationNum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1035:1: ( ( '->' ) )
            // InternalIAmGroot.g:1036:1: ( '->' )
            {
            // InternalIAmGroot.g:1036:1: ( '->' )
            // InternalIAmGroot.g:1037:2: '->'
            {
             before(grammarAccess.getAssignationNumAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssignationNumAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationNum__Group__0__Impl"


    // $ANTLR start "rule__AssignationNum__Group__1"
    // InternalIAmGroot.g:1046:1: rule__AssignationNum__Group__1 : rule__AssignationNum__Group__1__Impl ;
    public final void rule__AssignationNum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1050:1: ( rule__AssignationNum__Group__1__Impl )
            // InternalIAmGroot.g:1051:2: rule__AssignationNum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignationNum__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationNum__Group__1"


    // $ANTLR start "rule__AssignationNum__Group__1__Impl"
    // InternalIAmGroot.g:1057:1: rule__AssignationNum__Group__1__Impl : ( ( rule__AssignationNum__NumberAssignment_1 ) ) ;
    public final void rule__AssignationNum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1061:1: ( ( ( rule__AssignationNum__NumberAssignment_1 ) ) )
            // InternalIAmGroot.g:1062:1: ( ( rule__AssignationNum__NumberAssignment_1 ) )
            {
            // InternalIAmGroot.g:1062:1: ( ( rule__AssignationNum__NumberAssignment_1 ) )
            // InternalIAmGroot.g:1063:2: ( rule__AssignationNum__NumberAssignment_1 )
            {
             before(grammarAccess.getAssignationNumAccess().getNumberAssignment_1()); 
            // InternalIAmGroot.g:1064:2: ( rule__AssignationNum__NumberAssignment_1 )
            // InternalIAmGroot.g:1064:3: rule__AssignationNum__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssignationNum__NumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignationNumAccess().getNumberAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationNum__Group__1__Impl"


    // $ANTLR start "rule__AssignationStr__Group__0"
    // InternalIAmGroot.g:1073:1: rule__AssignationStr__Group__0 : rule__AssignationStr__Group__0__Impl rule__AssignationStr__Group__1 ;
    public final void rule__AssignationStr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1077:1: ( rule__AssignationStr__Group__0__Impl rule__AssignationStr__Group__1 )
            // InternalIAmGroot.g:1078:2: rule__AssignationStr__Group__0__Impl rule__AssignationStr__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AssignationStr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignationStr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationStr__Group__0"


    // $ANTLR start "rule__AssignationStr__Group__0__Impl"
    // InternalIAmGroot.g:1085:1: rule__AssignationStr__Group__0__Impl : ( '->' ) ;
    public final void rule__AssignationStr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1089:1: ( ( '->' ) )
            // InternalIAmGroot.g:1090:1: ( '->' )
            {
            // InternalIAmGroot.g:1090:1: ( '->' )
            // InternalIAmGroot.g:1091:2: '->'
            {
             before(grammarAccess.getAssignationStrAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssignationStrAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationStr__Group__0__Impl"


    // $ANTLR start "rule__AssignationStr__Group__1"
    // InternalIAmGroot.g:1100:1: rule__AssignationStr__Group__1 : rule__AssignationStr__Group__1__Impl ;
    public final void rule__AssignationStr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1104:1: ( rule__AssignationStr__Group__1__Impl )
            // InternalIAmGroot.g:1105:2: rule__AssignationStr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignationStr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationStr__Group__1"


    // $ANTLR start "rule__AssignationStr__Group__1__Impl"
    // InternalIAmGroot.g:1111:1: rule__AssignationStr__Group__1__Impl : ( ( rule__AssignationStr__StringAssignment_1 ) ) ;
    public final void rule__AssignationStr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1115:1: ( ( ( rule__AssignationStr__StringAssignment_1 ) ) )
            // InternalIAmGroot.g:1116:1: ( ( rule__AssignationStr__StringAssignment_1 ) )
            {
            // InternalIAmGroot.g:1116:1: ( ( rule__AssignationStr__StringAssignment_1 ) )
            // InternalIAmGroot.g:1117:2: ( rule__AssignationStr__StringAssignment_1 )
            {
             before(grammarAccess.getAssignationStrAccess().getStringAssignment_1()); 
            // InternalIAmGroot.g:1118:2: ( rule__AssignationStr__StringAssignment_1 )
            // InternalIAmGroot.g:1118:3: rule__AssignationStr__StringAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssignationStr__StringAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignationStrAccess().getStringAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationStr__Group__1__Impl"


    // $ANTLR start "rule__AssignationBool__Group__0"
    // InternalIAmGroot.g:1127:1: rule__AssignationBool__Group__0 : rule__AssignationBool__Group__0__Impl rule__AssignationBool__Group__1 ;
    public final void rule__AssignationBool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1131:1: ( rule__AssignationBool__Group__0__Impl rule__AssignationBool__Group__1 )
            // InternalIAmGroot.g:1132:2: rule__AssignationBool__Group__0__Impl rule__AssignationBool__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AssignationBool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignationBool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationBool__Group__0"


    // $ANTLR start "rule__AssignationBool__Group__0__Impl"
    // InternalIAmGroot.g:1139:1: rule__AssignationBool__Group__0__Impl : ( '->' ) ;
    public final void rule__AssignationBool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1143:1: ( ( '->' ) )
            // InternalIAmGroot.g:1144:1: ( '->' )
            {
            // InternalIAmGroot.g:1144:1: ( '->' )
            // InternalIAmGroot.g:1145:2: '->'
            {
             before(grammarAccess.getAssignationBoolAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssignationBoolAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationBool__Group__0__Impl"


    // $ANTLR start "rule__AssignationBool__Group__1"
    // InternalIAmGroot.g:1154:1: rule__AssignationBool__Group__1 : rule__AssignationBool__Group__1__Impl ;
    public final void rule__AssignationBool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1158:1: ( rule__AssignationBool__Group__1__Impl )
            // InternalIAmGroot.g:1159:2: rule__AssignationBool__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignationBool__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationBool__Group__1"


    // $ANTLR start "rule__AssignationBool__Group__1__Impl"
    // InternalIAmGroot.g:1165:1: rule__AssignationBool__Group__1__Impl : ( ( rule__AssignationBool__BooleanAssignment_1 ) ) ;
    public final void rule__AssignationBool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1169:1: ( ( ( rule__AssignationBool__BooleanAssignment_1 ) ) )
            // InternalIAmGroot.g:1170:1: ( ( rule__AssignationBool__BooleanAssignment_1 ) )
            {
            // InternalIAmGroot.g:1170:1: ( ( rule__AssignationBool__BooleanAssignment_1 ) )
            // InternalIAmGroot.g:1171:2: ( rule__AssignationBool__BooleanAssignment_1 )
            {
             before(grammarAccess.getAssignationBoolAccess().getBooleanAssignment_1()); 
            // InternalIAmGroot.g:1172:2: ( rule__AssignationBool__BooleanAssignment_1 )
            // InternalIAmGroot.g:1172:3: rule__AssignationBool__BooleanAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssignationBool__BooleanAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignationBoolAccess().getBooleanAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationBool__Group__1__Impl"


    // $ANTLR start "rule__Program__GrootsAssignment_3"
    // InternalIAmGroot.g:1181:1: rule__Program__GrootsAssignment_3 : ( ruleGroot ) ;
    public final void rule__Program__GrootsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1185:1: ( ( ruleGroot ) )
            // InternalIAmGroot.g:1186:2: ( ruleGroot )
            {
            // InternalIAmGroot.g:1186:2: ( ruleGroot )
            // InternalIAmGroot.g:1187:3: ruleGroot
            {
             before(grammarAccess.getProgramAccess().getGrootsGrootParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGroot();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getGrootsGrootParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__GrootsAssignment_3"


    // $ANTLR start "rule__Declaration__NameAssignment_0"
    // InternalIAmGroot.g:1196:1: rule__Declaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1200:1: ( ( RULE_ID ) )
            // InternalIAmGroot.g:1201:2: ( RULE_ID )
            {
            // InternalIAmGroot.g:1201:2: ( RULE_ID )
            // InternalIAmGroot.g:1202:3: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__NameAssignment_0"


    // $ANTLR start "rule__Declaration__TypeAssignment_2"
    // InternalIAmGroot.g:1211:1: rule__Declaration__TypeAssignment_2 : ( ruleGrootTypes ) ;
    public final void rule__Declaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1215:1: ( ( ruleGrootTypes ) )
            // InternalIAmGroot.g:1216:2: ( ruleGrootTypes )
            {
            // InternalIAmGroot.g:1216:2: ( ruleGrootTypes )
            // InternalIAmGroot.g:1217:3: ruleGrootTypes
            {
             before(grammarAccess.getDeclarationAccess().getTypeGrootTypesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGrootTypes();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTypeGrootTypesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TypeAssignment_2"


    // $ANTLR start "rule__GrootTypes__ValueAssignment_0_2"
    // InternalIAmGroot.g:1226:1: rule__GrootTypes__ValueAssignment_0_2 : ( ruleInitializationNum ) ;
    public final void rule__GrootTypes__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1230:1: ( ( ruleInitializationNum ) )
            // InternalIAmGroot.g:1231:2: ( ruleInitializationNum )
            {
            // InternalIAmGroot.g:1231:2: ( ruleInitializationNum )
            // InternalIAmGroot.g:1232:3: ruleInitializationNum
            {
             before(grammarAccess.getGrootTypesAccess().getValueInitializationNumParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInitializationNum();

            state._fsp--;

             after(grammarAccess.getGrootTypesAccess().getValueInitializationNumParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__ValueAssignment_0_2"


    // $ANTLR start "rule__GrootTypes__ValueAssignment_1_2"
    // InternalIAmGroot.g:1241:1: rule__GrootTypes__ValueAssignment_1_2 : ( ruleInitializationStr ) ;
    public final void rule__GrootTypes__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1245:1: ( ( ruleInitializationStr ) )
            // InternalIAmGroot.g:1246:2: ( ruleInitializationStr )
            {
            // InternalIAmGroot.g:1246:2: ( ruleInitializationStr )
            // InternalIAmGroot.g:1247:3: ruleInitializationStr
            {
             before(grammarAccess.getGrootTypesAccess().getValueInitializationStrParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInitializationStr();

            state._fsp--;

             after(grammarAccess.getGrootTypesAccess().getValueInitializationStrParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__ValueAssignment_1_2"


    // $ANTLR start "rule__GrootTypes__ValueAssignment_2_2"
    // InternalIAmGroot.g:1256:1: rule__GrootTypes__ValueAssignment_2_2 : ( ruleInitializationBool ) ;
    public final void rule__GrootTypes__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1260:1: ( ( ruleInitializationBool ) )
            // InternalIAmGroot.g:1261:2: ( ruleInitializationBool )
            {
            // InternalIAmGroot.g:1261:2: ( ruleInitializationBool )
            // InternalIAmGroot.g:1262:3: ruleInitializationBool
            {
             before(grammarAccess.getGrootTypesAccess().getValueInitializationBoolParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInitializationBool();

            state._fsp--;

             after(grammarAccess.getGrootTypesAccess().getValueInitializationBoolParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrootTypes__ValueAssignment_2_2"


    // $ANTLR start "rule__Assignation__NameAssignment_0"
    // InternalIAmGroot.g:1271:1: rule__Assignation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1275:1: ( ( RULE_ID ) )
            // InternalIAmGroot.g:1276:2: ( RULE_ID )
            {
            // InternalIAmGroot.g:1276:2: ( RULE_ID )
            // InternalIAmGroot.g:1277:3: RULE_ID
            {
             before(grammarAccess.getAssignationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__NameAssignment_0"


    // $ANTLR start "rule__Assignation__ValueAssignment_1"
    // InternalIAmGroot.g:1286:1: rule__Assignation__ValueAssignment_1 : ( ruleAssignationValue ) ;
    public final void rule__Assignation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1290:1: ( ( ruleAssignationValue ) )
            // InternalIAmGroot.g:1291:2: ( ruleAssignationValue )
            {
            // InternalIAmGroot.g:1291:2: ( ruleAssignationValue )
            // InternalIAmGroot.g:1292:3: ruleAssignationValue
            {
             before(grammarAccess.getAssignationAccess().getValueAssignationValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignationValue();

            state._fsp--;

             after(grammarAccess.getAssignationAccess().getValueAssignationValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignation__ValueAssignment_1"


    // $ANTLR start "rule__AssignationNum__NumberAssignment_1"
    // InternalIAmGroot.g:1301:1: rule__AssignationNum__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__AssignationNum__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1305:1: ( ( RULE_INT ) )
            // InternalIAmGroot.g:1306:2: ( RULE_INT )
            {
            // InternalIAmGroot.g:1306:2: ( RULE_INT )
            // InternalIAmGroot.g:1307:3: RULE_INT
            {
             before(grammarAccess.getAssignationNumAccess().getNumberINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAssignationNumAccess().getNumberINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationNum__NumberAssignment_1"


    // $ANTLR start "rule__AssignationStr__StringAssignment_1"
    // InternalIAmGroot.g:1316:1: rule__AssignationStr__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AssignationStr__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1320:1: ( ( RULE_STRING ) )
            // InternalIAmGroot.g:1321:2: ( RULE_STRING )
            {
            // InternalIAmGroot.g:1321:2: ( RULE_STRING )
            // InternalIAmGroot.g:1322:3: RULE_STRING
            {
             before(grammarAccess.getAssignationStrAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssignationStrAccess().getStringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationStr__StringAssignment_1"


    // $ANTLR start "rule__AssignationBool__BooleanAssignment_1"
    // InternalIAmGroot.g:1331:1: rule__AssignationBool__BooleanAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__AssignationBool__BooleanAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIAmGroot.g:1335:1: ( ( RULE_BOOLEAN ) )
            // InternalIAmGroot.g:1336:2: ( RULE_BOOLEAN )
            {
            // InternalIAmGroot.g:1336:2: ( RULE_BOOLEAN )
            // InternalIAmGroot.g:1337:3: RULE_BOOLEAN
            {
             before(grammarAccess.getAssignationBoolAccess().getBooleanBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getAssignationBoolAccess().getBooleanBOOLEANTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignationBool__BooleanAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});

}