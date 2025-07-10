package model;

/*
 * TODO: Implement the MoveInstruction class.
 * move rd, rs - Move the value from rs to rd.
 * movi rd, imm - Move the immediate value imm to rd.
 */
public class MoveInstruction {

    public MoveInstruction(String text, String opcode, String rd, String rs, String rt, String imm, int address) {
        super(text, opcode, rd, rs, rt, imm, address);
    }

    /*
     * TODO: Implement the execute method.
     * This method will be called in the EX stage of the pipeline.
     * It should read the value from rs or imm and write it to rd.
     */
}
