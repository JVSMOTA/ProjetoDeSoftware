package br.edu.ufcg.computacao.psoft.commerce.service.produto;

import br.edu.ufcg.computacao.psoft.commerce.dto.produto.ProdutoPatchCodigoBarrasDTO;
import br.edu.ufcg.computacao.psoft.commerce.model.Produto;
import br.edu.ufcg.computacao.psoft.commerce.repository.produto.ProdutoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoV1PatchCodigoBarrasService implements ProdutoPatchCodigoBarrasService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Produto patchCodigoBarras(Long id, ProdutoPatchCodigoBarrasDTO produtoPatchCodigoBarrasDTO) {
        Produto produtoEncontrado = produtoRepository.findById(id).get();
        produtoEncontrado.setCodigoBarras(produtoPatchCodigoBarrasDTO.getCodigoBarras());
        return produtoRepository.save(produtoEncontrado);
    }
}
