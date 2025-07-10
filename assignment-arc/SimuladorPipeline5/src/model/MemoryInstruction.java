package model;

/*
 * TODO: Implement the MemoryInstruction class.
 * lw rd, imm(rs) - Load word from memory address calculated by rs + imm into rd.
 * sw rs, imm(rt) - Store word from rs into memory address calculated by rt + imm.
 */
public class MemoryInstruction extends Instruction {

    public MemoryInstruction(String text, String opcode, String rd, String rs, String rt, String imm, int address) {
        super(text, opcode, rd, rs, rt, imm, address);
    }

    /*
     * TODO: Implement the execute method.
     * This method will be called in the MEM stage of the pipeline.
     */

    /*
     * TODO: implement the calculateMemoryAddress method.
     * This method should calculate the memory address based on the opcode and the registers.
     */

    /* 
     * TODO: implement the executeLoad method.
     * This method should execute the load operation for lw instruction.
     */
 
    /* 
     * TODO: implement the executeStore method.
     * This method should execute the store operation for sw instruction.
     */
}